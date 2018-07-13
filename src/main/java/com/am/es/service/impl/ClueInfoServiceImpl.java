package com.am.es.service.impl;

import com.am.es.dao.ClueInfoMapper;
import com.am.es.model.ClueInfoVo;
import com.am.es.model.CustomInfoVo;
import com.am.es.service.SearchClueInfoRepository;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClueInfoServiceImpl {

    @Autowired
    private SearchClueInfoRepository searchClueInfoRepository;

    @Autowired
    private ClueInfoMapper clueInfoMapper;

    public void saveClueInfoList(List<Integer> clueInfoList) {
        //根据传入的list 用户id查询对应的list
        List<ClueInfoVo> list = clueInfoMapper.selectListByPrimaryKeyList(clueInfoList);
        //将需要更改的查出来
        searchClueInfoRepository.saveAll(list);
    }

    public List<ClueInfoVo> queryClueInfoList() {
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        builder.must(QueryBuilders.matchAllQuery());
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        nativeSearchQueryBuilder.withQuery(builder);
        NativeSearchQuery query = nativeSearchQueryBuilder.build();
        List<ClueInfoVo> list = searchClueInfoRepository.search(query).getContent();
        return list;
    }

}
