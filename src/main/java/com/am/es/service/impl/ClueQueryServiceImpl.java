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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class ClueQueryServiceImpl implements ClueQueryService {

    @Autowired
    private ClueInfoMapper clueInfoMapper;

    @Autowired
    private SearchClueQueryRepository searchClueQueryRepository;

    @Override
    public Boolean saveClueQuery(List<Integer> clueId) {
        Boolean flag = false;
        List<ClueQueryResponseModel> list = null;
        if (clueId.size() > 0) {
            list = clueInfoMapper.selectQueryClueInfo(clueId);
            if (list.size() > 0) {
                searchClueQueryRepository.saveAll(list);
            }
        }
        flag = true;
        return flag;
    }

    @Override
    public List<Integer> deleteClueQuery(List<Integer> list) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            try {
                ClueQueryResponseModel clueQueryResponseModel = new ClueQueryResponseModel();
                clueQueryResponseModel.setId(list.get(i));
                searchClueQueryRepository.delete(clueQueryResponseModel);
            } catch (Exception e) {
                res.add(list.get(i));
                e.printStackTrace();
            }
        }
//        //刪除所有数据
//        System.out.println("I'm clear all data");
//        searchClueQueryRepository.deleteAll();
        return res;
    }

    @Override
    public PageClueInfo getClueQueryList(Map<String, String> map) {
        PageClueInfo pages = new PageClueInfo();
        Integer currentPage = Integer.parseInt(map.get("currentPage"));
        Integer pageSize = Integer.parseInt(map.get("pageSize"));
        SearchConditionEncape searchConditionEncape = new SearchConditionEncape();
        NativeSearchQuery query = searchConditionEncape.queryConditions(map, (currentPage - 1), pageSize);
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

    @Override
    public Boolean saveBatchId(Integer batchId) {
        List<Integer> list = clueInfoMapper.selectByBatchId(batchId);
        return saveClueQuery(list);
    }

    @Override
    public PageClueInfo test() {
        PageClueInfo pages = new PageClueInfo();
        //同步数据库所有数据
        List<ClueQueryResponseModel> lists = clueInfoMapper.selectAll();
        System.out.println("this data length is:" + lists.size());
        searchClueQueryRepository.saveAll(lists);
        return pages;
    }
}
