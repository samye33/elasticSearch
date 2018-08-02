package com.am.es.service;

import com.am.es.model.PageClueInfo;

import java.util.Map;

public interface ClueQueryService {
    void saveClueQuery(Integer id);

    void deleteClueQuery(Integer id);

    PageClueInfo getClueQueryList(Map<String, ?> map);

    PageClueInfo queryAllClueQueryList();
}
