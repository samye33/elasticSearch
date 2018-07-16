package com.am.es.service.impl;

import com.am.es.cluedao.ClueTurnRecordMapper;
import com.am.es.model.ClueTurnRecordVo;
import com.am.es.service.SearchClueTurnRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClueTurnRecordServiceImpl {
    @Autowired
    private ClueTurnRecordMapper clueTurnRecordMapper;

    @Autowired
    private SearchClueTurnRecordRepository searchClueTurnRecordRepository;

    public void saveClueTurnRecordList(List<Integer> clueInfoList) {
        //根据传入的list 用户id查询对应的list
        List<ClueTurnRecordVo> list = clueTurnRecordMapper.selectListByPrimaryKeyList(clueInfoList);
        //将需要更改的查出来
        searchClueTurnRecordRepository.saveAll(list);
    }

}
