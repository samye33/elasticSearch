package com.am.es.service.impl;

import com.am.es.dao.clue.CustomContactsMapper;
import com.am.es.model.clue.CustomContactsVo;
import com.am.es.service.CustomContactsService;
import com.am.es.service.search.SearchCustomContactsRepository;
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
public class CustomContactsImpl implements CustomContactsService{

    @Autowired
    private SearchCustomContactsRepository searchCustomContactsRepository;

    @Autowired
    private CustomContactsMapper customContactsMapper;

    public void saveCustomContactsList(List<Integer> customerList) {
        //根据传入的list 用户id查询对应的list
        List<CustomContactsVo> list = customContactsMapper.selectListByPrimaryKeyList(customerList);
        //将需要更改的查出来
        if (list.size() > 0) {
            searchCustomContactsRepository.saveAll(list);
        }
    }

    public List<CustomContactsVo> queryAllCustomContactsList() {
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        builder.must(QueryBuilders.matchAllQuery());
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        nativeSearchQueryBuilder.withQuery(builder);
        NativeSearchQuery query = nativeSearchQueryBuilder.build();
        List<CustomContactsVo> list = searchCustomContactsRepository.search(query).getContent();
        return list;
    }

    public void deleteCustomContacts(Integer id) {
        CustomContactsVo customContactsVo = new CustomContactsVo();
        customContactsVo.setId(id);
        searchCustomContactsRepository.delete(customContactsVo);
    }

    public List<CustomContactsVo> getCustomContactsList(Map<String, ?> map, Integer currentPage, Integer pageSize) {
        List<CustomContactsVo> list = null;
        SearchConditionEncape searchConditionEncape = new SearchConditionEncape();
        NativeSearchQuery query = searchConditionEncape.queryCondition(map, currentPage, pageSize);
        list = searchCustomContactsRepository.search(query).getContent();
        return list;
    }
}
