package com.am.es.service;

import com.am.es.model.clue.CustomInfoVo;

import java.util.List;
import java.util.Map;

public interface CustomInfoService {
    void saveCustomInfoList(List<Integer> customerList);

    void deleteCustomInfo(Integer id);

    List<CustomInfoVo> getCustomInfoList(Map<String, ?> map, Integer currentPage, Integer pageSize);
}
