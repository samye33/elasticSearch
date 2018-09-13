package com.am.es.service.impl;

import com.am.es.dao.clue.ClueDescribeMapper;
import com.am.es.dao.clue.ClueInfoMapper;
import com.am.es.dao.clue.ClueStatusMapper;
import com.am.es.entity.clue.ClueInfo;
import com.am.es.service.GetClueIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetClueIdServiceImpl implements GetClueIdService {


    @Autowired
    private ClueInfoMapper clueInfoMapper;

    @Autowired
    private ClueStatusMapper clueStatusMapper;

    @Autowired
    private ClueDescribeMapper clueDescribeMapper;


    @Override
    public List<Integer> getClueIdBycustomerId(List<Integer> customId) {
        return clueInfoMapper.selectByCustomIdList(customId);
    }

    @Override
    public Integer getClueIdByClueStatusId(Integer clueStatusId) {
        return clueStatusMapper.selectByPrimaryKey(clueStatusId).getClueId();
    }

    @Override
    public Integer getClueIdByClueDescribeId(Integer clueDescribeId) {
        return clueDescribeMapper.selectByPrimaryKey(clueDescribeId).getClueId();
    }
}
