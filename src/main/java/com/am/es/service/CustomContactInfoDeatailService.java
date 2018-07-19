package com.am.es.service;

import com.am.es.model.clue.CustomContactInfoDetailVo;

import java.util.List;
import java.util.Map;

public interface CustomContactInfoDeatailService {
    void saveCustomContactInfoDeatailList(List<Integer> customerList);

    void deleteCustomContactInfoDetail(Integer id);

    List<CustomContactInfoDetailVo> getCustomContactInfoDetailList(Map<String, ?> map, Integer currentPage, Integer pageSize);
}
