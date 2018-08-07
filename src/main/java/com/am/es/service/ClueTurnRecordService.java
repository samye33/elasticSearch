package com.am.es.service;

import com.am.es.model.clue.ClueTurnRecordVo;

import java.util.List;
import java.util.Map;

public interface ClueTurnRecordService {
    void saveClueTurnRecordList(List<Integer> clueInfoList);

    void deleteClueTurnRecord(Integer id);

    List<ClueTurnRecordVo> getClueTurnRecordList(Map<String, String> map);

    List<ClueTurnRecordVo> queryAllClueTurnRecordList();
}
