package com.am.es.service;

import com.am.es.model.ClueTurnRecordVo;

import java.util.List;
import java.util.Map;

public interface ClueTurnRecordService {
    void saveClueTurnRecordList(List<Integer> clueInfoList);

    void deleteClueTurnRecord(Integer id);

    List<ClueTurnRecordVo> getClueTurnRecordList(Map<String, ?> map, Integer currentPage, Integer pageSize);
}
