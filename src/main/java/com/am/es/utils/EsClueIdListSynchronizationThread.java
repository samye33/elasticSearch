package com.am.es.utils;

import com.am.es.dao.clue.EsRecordIdMapper;
import com.am.es.service.ClueQueryService;
import com.am.es.service.GetClueIdService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EsClueIdListSynchronizationThread implements Runnable {

    private List<Integer> clueIdlist;

    private List<Integer> customIdList;

    private String form;

    private Integer type;

    private ClueQueryService clueQueryService;

    private EsRecordIdMapper esRecordIdMapper;

    private GetClueIdService getClueIdService;

    private Integer batchId;

    public EsClueIdListSynchronizationThread(List<Integer> clueIdlist, List<Integer> customIdList, Integer batchId, ClueQueryService clueQueryService, EsRecordIdMapper esRecordIdMapper, String form, Integer type, GetClueIdService getClueIdService) {
        this.clueIdlist = clueIdlist;
        this.clueQueryService = clueQueryService;
        this.esRecordIdMapper = esRecordIdMapper;
        this.form = form;
        this.type = type;
        this.customIdList = customIdList;
        this.getClueIdService = getClueIdService;
        this.batchId = batchId;
    }

    /**
     * @param [clueIdlist,customIdList,batchId]只能一个不为null
     * @author sam.ye
     * @desc 当clueIdList不为null时同步clueInfo，当customer不为null同步customInfo，当batch不为null时同步批次。type1为保存；-1位更新
     */
    @Override
    public void run() {
        Map map = new HashMap();
        map.put("form", form);
        map.put("type", type);
        if (type.equals(1)) {
            if (clueIdlist != null) {
                map.put("flag", 1);
                map.put("idList", clueIdlist);
                esRecordIdMapper.updateFlagByAll(map);
                Boolean flag = clueQueryService.saveClueQuery(clueIdlist);
                if (flag) {
                    esRecordIdMapper.deleteByIdTypeForm(map);
                } else {
                    map.put("flag", 0);
                    esRecordIdMapper.updateFlagByAll(map);
                }
            } else if (customIdList != null) {
                map.put("flag", 1);
                map.put("idList", customIdList);
                esRecordIdMapper.updateFlagByAll(map);
                clueIdlist = getClueIdService.getClueIdBycustomerId(customIdList);
                Boolean flag = clueQueryService.saveClueQuery(clueIdlist);
                if (flag) {
                    esRecordIdMapper.deleteByIdTypeForm(map);
                } else {
                    map.put("flag", 0);
                    esRecordIdMapper.updateFlagByAll(map);
                }
            } else {
                map.put("flag", 1);
                map.put("idList", customIdList);
                esRecordIdMapper.updateFlagByAll(map);
                Boolean flag = clueQueryService.saveBatchId(batchId);
                if (flag) {
                    esRecordIdMapper.deleteByIdTypeForm(map);
                } else {
                    map.put("flag", 0);
                    esRecordIdMapper.updateFlagByAll(map);
                }
            }
        } else {
            if (clueIdlist != null) {
                map.put("flag", 1);
                map.put("idList", clueIdlist);
                esRecordIdMapper.updateFlagByAll(map);
                List<Integer> res = clueQueryService.deleteClueQuery(clueIdlist);
                if (res.size() == 0) {
                    esRecordIdMapper.deleteByIdTypeForm(map);
                } else {
                    //將返回报错的id更新为0
                    map.put("flag", 0);
                    map.put("idList", res);
                    esRecordIdMapper.updateFlagByAll(map);
                    //删除成功的id
                    map.put("flag", 1);
                    map.put("idList", clueIdlist);
                    esRecordIdMapper.deleteByIdTypeForm(map);
                }
            } else {
                map.put("flag", 1);
                map.put("idList", customIdList);
                clueIdlist = getClueIdService.getClueIdBycustomerId(customIdList);
                clueQueryService.deleteClueQuery(clueIdlist);
                //由于触发器原因，就算删除报错也可以忽略掉，直接删除所有的id
                esRecordIdMapper.deleteByIdTypeForm(map);
            }
        }
    }
}
