package com.am.es.service.impl;

import com.am.es.dao.clue.ClueTurnRecordMapper;
import com.am.es.model.clue.ClueTurnRecordVo;
import com.am.es.service.ClueTurnRecordService;
import com.am.es.service.search.SearchClueTurnRecordRepository;
import com.am.es.utils.SearchConditionEncape;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ClueTurnRecordServiceImpl implements ClueTurnRecordService {
    @Autowired
    private ClueTurnRecordMapper clueTurnRecordMapper;

    @Autowired
    private SearchClueTurnRecordRepository searchClueTurnRecordRepository;

    public void saveClueTurnRecordList(List<Integer> clueInfoList) {
        //根据传入的list 用户id查询对应的list
        List<ClueTurnRecordVo> list = clueTurnRecordMapper.selectListByPrimaryKeyList(clueInfoList);
        //将需要更改的查出来
        if (list.size() > 0) {
            searchClueTurnRecordRepository.saveAll(list);
        }
    }

    public List<ClueTurnRecordVo> queryAllClueTurnRecordList() {
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        builder.must(QueryBuilders.matchAllQuery());
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        nativeSearchQueryBuilder.withQuery(builder);
        NativeSearchQuery query = nativeSearchQueryBuilder.build();
        List<ClueTurnRecordVo> list = searchClueTurnRecordRepository.search(query).getContent();
        return list;
    }

    public void deleteClueTurnRecord(Integer id) {
        ClueTurnRecordVo clueTurnRecordVo = new ClueTurnRecordVo();
        clueTurnRecordVo.setId(id);
        searchClueTurnRecordRepository.delete(clueTurnRecordVo);
    }

    public List<ClueTurnRecordVo> getClueTurnRecordList(Map<String, String> map) {
        List<ClueTurnRecordVo> list = null;
        SearchConditionEncape searchConditionEncape = new SearchConditionEncape();
        Integer currentPage = Integer.parseInt(map.get("currentPage"));
        Integer pageSize = Integer.parseInt(map.get("pageSize"));
        NativeSearchQuery query = searchConditionEncape.queryCondition(map, currentPage, pageSize);
        list = searchClueTurnRecordRepository.search(query).getContent();
        return list;
    }
}
