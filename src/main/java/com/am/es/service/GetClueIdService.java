package com.am.es.service;

public interface GetClueIdService {
    Integer getClueIdBycustomerId(Integer customerId);

    Integer getClueIdByClueStatusId(Integer clueStatusId);

    Integer getClueIdByClueDescribeId(Integer clueDescribeId);
}
