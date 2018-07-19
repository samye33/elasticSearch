package com.am.es.service.impl;

import com.am.es.dao.clue.ClueInfoMapper;
import com.am.es.model.clue.ClueInfoVo;
import com.am.es.service.search.SearchClueInfoRepository;
import com.am.es.service.ClueInfoService;
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
public class ClueInfoServiceImpl implements ClueInfoService {

    @Autowired
    private SearchClueInfoRepository searchClueInfoRepository;

    @Autowired
    private ClueInfoMapper clueInfoMapper;

    public void saveClueInfoList(List<Integer> clueInfoList) {
        //根据传入的list 用户id查询对应的list
        List<ClueInfoVo> list = clueInfoMapper.selectListByPrimaryKeyList(clueInfoList);
        //将需要更改的查出来
        if (list.size() > 0) {
            searchClueInfoRepository.saveAll(list);
        }

    }

    public List<ClueInfoVo> queryAllClueInfoList() {
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        builder.must(QueryBuilders.matchAllQuery());
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        nativeSearchQueryBuilder.withQuery(builder);
        NativeSearchQuery query = nativeSearchQueryBuilder.build();
        List<ClueInfoVo> list = searchClueInfoRepository.search(query).getContent();
        return list;
    }

    public void deleteClueInfo(Integer id) {
        ClueInfoVo clueInfoVo = new ClueInfoVo();
        clueInfoVo.setId(id);
        searchClueInfoRepository.delete(clueInfoVo);
    }

    public List<ClueInfoVo> getClueInfoList(Map<String, ?> map, Integer currentPage, Integer pageSize) {
        List<ClueInfoVo> list = null;
        SearchConditionEncape searchConditionEncape = new SearchConditionEncape();
        NativeSearchQuery query = searchConditionEncape.queryCondition(map, currentPage, pageSize);
        list = searchClueInfoRepository.search(query).getContent();
        return list;
    }

}
