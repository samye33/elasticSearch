package com.am.es.service;

import com.am.es.model.clue.ClueInfoVo;

import java.util.List;
import java.util.Map;

public interface ClueInfoService {

    void saveClueInfoList(List<Integer> clueInfoList);

    void deleteClueInfo(Integer id);

    List<ClueInfoVo> getClueInfoList(Map<String, ?> map, Integer currentPage, Integer pageSize);

    List<ClueInfoVo> queryAllClueInfoList();
}
