package com.am.es.service.impl;

import com.am.es.dao.clue.ClueInfoMapper;
import com.am.es.model.ClueQueryResponseModel;
import com.am.es.service.ClueQueryService;
import com.am.es.service.search.SearchClueQueryRepository;
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
public class ClueQueryServiceImpl implements ClueQueryService {

    @Autowired
    private ClueInfoMapper clueInfoMapper;

    @Autowired
    private SearchClueQueryRepository searchClueQueryRepository;

    @Override
    public void saveClueQuery(Integer clueId) {
        List<ClueQueryResponseModel> list = clueInfoMapper.selectQueryClueInfo(clueId);
        if (list.size() > 0) {
            searchClueQueryRepository.saveAll(list);
        }

    }

    @Override
    public void deleteClueQuery(Integer id) {
        ClueQueryResponseModel clueQueryResponseModel = new ClueQueryResponseModel();
        clueQueryResponseModel.setId(id);
        searchClueQueryRepository.delete(clueQueryResponseModel);
    }

    @Override
    public List<ClueQueryResponseModel> getClueQueryList(Map<String, ?> map, Integer currentPage, Integer pageSize) {
        List<ClueQueryResponseModel> list = null;
        SearchConditionEncape searchConditionEncape = new SearchConditionEncape();
        NativeSearchQuery query = searchConditionEncape.queryCondition(map, currentPage, pageSize);
        list = searchClueQueryRepository.search(query).getContent();
        return list;
    }

    @Override
    public List<ClueQueryResponseModel> queryAllClueQueryList() {
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        builder.must(QueryBuilders.matchAllQuery());
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        nativeSearchQueryBuilder.withQuery(builder);
        NativeSearchQuery query = nativeSearchQueryBuilder.build();
        List<ClueQueryResponseModel> list = searchClueQueryRepository.search(query).getContent();
        return list;
    }
}
