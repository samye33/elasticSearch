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

//    @Scheduled(cron = "0/15 * * * * ?")
    public void scanTaskJob() {
        List<EsRecordId> esRecordIdList = esRecordIdMapper.selectAllLimit();
        for (int i = 0; i < esRecordIdList.size(); i++) {
            ThreadPools.executorService.execute(new EsSynchronizationThread(esRecordIdList.get(i), esRecordIdMapper, clueQueryService, getClueIdService));
        }
    }
}
