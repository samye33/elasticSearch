package com.am.es.service;

import com.am.es.model.ClueQueryResponseModel;

import java.util.List;
import java.util.Map;

public interface ClueQueryService {
    void saveClueQuery(Integer id);

    void deleteClueQuery(Integer id);

    List<ClueQueryResponseModel> getClueQueryList(Map<String, ?> map, Integer currentPage, Integer pageSize);

    List<ClueQueryResponseModel> queryAllClueQueryList();
}
