package com.am.es.service.impl;

import com.am.es.dao.CustomInfoMapper;
import com.am.es.model.CustomInfoVo;
import com.am.es.service.SearchCustomInfoRepository;
import org.elasticsearch.index.query.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomInfoServiceImpl {

    @Autowired
    private SearchCustomInfoRepository searchCustomInfoRepository;

    @Autowired
    private CustomInfoMapper customInfoMapper;


    public void saveCustomInfoList(List<Integer> customerList) {
        //根据传入的list 用户id查询对应的list
        List<CustomInfoVo> list = customInfoMapper.selectListByPrimaryKeyList(customerList);
        //将需要更改的查出来
        searchCustomInfoRepository.saveAll(list);
    }

    public List<CustomInfoVo> queryCustomInfoList() {
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        builder.must(QueryBuilders.matchAllQuery());
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        nativeSearchQueryBuilder.withQuery(builder);
        NativeSearchQuery query = nativeSearchQueryBuilder.build();
        List<CustomInfoVo> list = searchCustomInfoRepository.search(query).getContent();
        return list;
    }

}
