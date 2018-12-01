package com.am.es.service;

import com.alibaba.fastjson.JSONObject;
import com.am.es.model.PageClueInfo;

import java.util.List;
import java.util.Map;

public interface ClueQueryService {
    Boolean saveClueQuery(List<Integer> id);

    List<Integer> deleteClueQuery(List<Integer> id);

    PageClueInfo getClueQueryList(JSONObject json);

    PageClueInfo queryAllClueQueryList();

    Boolean saveBatchId(Integer batchId);

    PageClueInfo test();
}
