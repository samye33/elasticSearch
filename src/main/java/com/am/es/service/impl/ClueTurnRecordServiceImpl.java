package com.am.es.service.impl;

import com.am.es.dao.clue.ClueTurnRecordMapper;
import com.am.es.model.clue.ClueTurnRecordVo;
import com.am.es.service.search.SearchClueTurnRecordRepository;
import com.am.es.service.ClueTurnRecordService;
import com.am.es.utils.SearchConditionEncape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ClueTurnRecordServiceImpl implements ClueTurnRecordService{
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

    public void deleteClueTurnRecord(Integer id) {
        ClueTurnRecordVo clueTurnRecordVo = new ClueTurnRecordVo();
        clueTurnRecordVo.setId(id);
        searchClueTurnRecordRepository.delete(clueTurnRecordVo);
    }

    public List<ClueTurnRecordVo> getClueTurnRecordList(Map<String, ?> map, Integer currentPage, Integer pageSize) {
        List<ClueTurnRecordVo> list = null;
        SearchConditionEncape searchConditionEncape = new SearchConditionEncape();
        NativeSearchQuery query = searchConditionEncape.queryCondition(map, currentPage, pageSize);
        list = searchClueTurnRecordRepository.search(query).getContent();
        return list;
    }
}
