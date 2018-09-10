package com.am.es.service;

import com.am.es.model.PageClueInfo;

import java.util.List;
import java.util.Map;

public interface ClueQueryService {
    Boolean saveClueQuery(List<Integer> id);

    void deleteClueQuery(Integer id);

    PageClueInfo getClueQueryList(Map<String, String> map);

    PageClueInfo queryAllClueQueryList();

    Boolean saveBatchId(Integer batchId);
}
