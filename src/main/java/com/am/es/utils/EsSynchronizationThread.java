package com.am.es.utils;

import com.am.es.dao.clue.EsRecordIdMapper;
import com.am.es.entity.clue.EsRecordId;
import com.am.es.entity.clue.EsRecordIdExample;
import com.am.es.service.ClueQueryService;
import com.am.es.service.GetClueIdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EsSynchronizationThread implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(EsSynchronizationThread.class);

    private EsRecordId esRecordId;

    private EsRecordIdMapper esRecordIdMapper;


    private ClueQueryService clueQueryService;

    private GetClueIdService getClueIdService;

    public EsSynchronizationThread(EsRecordId esRecordId, EsRecordIdMapper esRecordIdMapper, ClueQueryService clueQueryService, GetClueIdService getClueIdService) {
        this.esRecordId = esRecordId;
        this.esRecordIdMapper = esRecordIdMapper;
        this.clueQueryService = clueQueryService;
        this.getClueIdService = getClueIdService;
    }

    @Override
    public void run() {
        try {
            esRecordId.setFlag(1);
            LOGGER.info("更新该记录的id");
            esRecordIdMapper.updateFlagByAll(esRecordId);
            LOGGER.info("es同步数据库");
            Boolean flag = distinguishDB(esRecordId);
            if (flag) {
                LOGGER.info("删除该次操作");
                esRecordIdMapper.deleteByIdTypeForm(esRecordId);
            } else {
                esRecordId.setFlag(0);
                LOGGER.info("更新该记录的id");
                esRecordIdMapper.updateFlagByAll(esRecordId);
            }
        } catch (Exception e) {
            LOGGER.error("", e);
        }
    }

    private Boolean distinguishDB(EsRecordId esRecordId) {
        Boolean flag = false;
        switch (esRecordId.getForm()) {
            case "clueInfo":
                if (esRecordId.getType() == 1) {
                    clueQueryService.saveClueQuery(esRecordId.getId());
                } else if (esRecordId.getType() == -1) {
                    clueQueryService.deleteClueQuery(esRecordId.getId());
                }
                break;
            case "customInfo":
                Integer clueId = getClueIdService.getClueIdBycustomerId(esRecordId.getId());
                if (null == clueId) {
                    LOGGER.info("我要返回了");
                    return flag;
                }
                if (esRecordId.getType() == 1) {
                    clueQueryService.saveClueQuery(clueId);
                } else if (esRecordId.getType() == -1) {
                    clueQueryService.deleteClueQuery(clueId);
                }
                break;
        }
        flag = true;
        return flag;
    }
}
