package com.am.es.service.impl;

import com.am.es.dao.clue.ClueInfoMapper;
import com.am.es.model.ClueQueryResponseModel;
import com.am.es.model.PageClueInfo;
import com.am.es.service.ClueQueryService;
import com.am.es.service.search.SearchClueQueryRepository;
import com.am.es.utils.SearchConditionEncape;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
    public PageClueInfo getClueQueryList(Map<String, String> map) {
        PageClueInfo pages = new PageClueInfo();
        Integer currentPage = Integer.parseInt(map.get("currentPage"));
        Integer pageSize = Integer.parseInt(map.get("pageSize"));
        SearchConditionEncape searchConditionEncape = new SearchConditionEncape();
        NativeSearchQuery query = searchConditionEncape.queryCondition(map, (currentPage - 1), pageSize);
        Page<ClueQueryResponseModel> search = searchClueQueryRepository.search(query);
        List<ClueQueryResponseModel> list = search.getContent();
        pages.setTotal(search.getTotalElements());
        pages.setList(list);
        return pages;
    }

    @Override
    public PageClueInfo queryAllClueQueryList() {
        PageClueInfo pages = new PageClueInfo();
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        builder.must(QueryBuilders.matchAllQuery());
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        nativeSearchQueryBuilder.withQuery(builder);
        NativeSearchQuery query = nativeSearchQueryBuilder.build();
        Page<ClueQueryResponseModel> search = searchClueQueryRepository.search(query);
        List<ClueQueryResponseModel> list = search.getContent();
        pages.setTotal(search.getTotalElements());
        pages.setList(list);
        return pages;
    }
}
