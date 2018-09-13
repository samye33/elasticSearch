package com.am.es.utils;

import com.am.es.dao.clue.EsRecordIdMapper;
import com.am.es.entity.clue.EsRecordId;
import com.am.es.service.ClueQueryService;
import com.am.es.service.GetClueIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

@Configuration
@EnableScheduling
public class Schedule {

    @Autowired
    private EsRecordIdMapper esRecordIdMapper;

    @Autowired
    private ClueQueryService clueQueryService;

    @Autowired
    private GetClueIdService getClueIdService;

    @Scheduled(cron = "0 0/1 * * * ?")
    public void scanTaskJob() {
        //定时查询clueInfo线索信息并进行同步es
        try {

            List<Integer> clueIdSaveList = esRecordIdMapper.selectByCondition("clueInfo", 1);
            if (clueIdSaveList.size() > 0) {
                ThreadPools.executorService.execute(new EsClueIdListSynchronizationThread(clueIdSaveList, null, null, clueQueryService, esRecordIdMapper, "clueInfo", 1, getClueIdService));
            }
            //定时查询customInfo线索信息并进行同步es
            List<Integer> customIdSaveList = esRecordIdMapper.selectByCondition("customInfo", 1);
            if (customIdSaveList.size() > 0) {
                ThreadPools.executorService.execute(new EsClueIdListSynchronizationThread(null, customIdSaveList, null, clueQueryService, esRecordIdMapper, "customInfo", 1, getClueIdService));
            }
            List<Integer> clueIdDeleteList = esRecordIdMapper.selectByCondition("clueInfo", -1);
            if (clueIdDeleteList.size() > 0) {
                ThreadPools.executorService.execute(new EsClueIdListSynchronizationThread(clueIdDeleteList, null, null, clueQueryService, esRecordIdMapper, "clueInfo", -1, getClueIdService));
            }
            List<Integer> customIdDeleteList = esRecordIdMapper.selectByCondition("customInfo", -1);
            if (customIdDeleteList.size() > 0) {
                ThreadPools.executorService.execute(new EsClueIdListSynchronizationThread(null, customIdDeleteList, null, clueQueryService, esRecordIdMapper, "customInfo", -1, getClueIdService));
            }
            List<Integer> batchIdDeleteList = esRecordIdMapper.selectByCondition("batch", 1);
            for (int i = 0; i < batchIdDeleteList.size(); i++) {
                ThreadPools.executorService.execute(new EsClueIdListSynchronizationThread(null, null, batchIdDeleteList.get(i), clueQueryService, esRecordIdMapper, "batch", 1, getClueIdService));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
