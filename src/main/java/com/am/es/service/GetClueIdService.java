package com.am.es.service;

import java.util.List;

public interface GetClueIdService {
    List<Integer> getClueIdBycustomerId(List<Integer> customerId);

    Integer getClueIdByClueStatusId(Integer clueStatusId);

    Integer getClueIdByClueDescribeId(Integer clueDescribeId);
}
