package com.am.es.service.impl;

import com.am.es.dao.clue.ListenInvitationInfoMapper;
import com.am.es.model.clue.ListenInvitationInfoVo;
import com.am.es.service.ListenInvitationInfoService;
import com.am.es.service.search.SearchListenInvitationInfoRepository;
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
public class ListenInvitationInfoServiceImpl implements ListenInvitationInfoService {
    @Autowired
    private SearchListenInvitationInfoRepository searchListenInvitationInfoRepository;

    @Autowired
    private ListenInvitationInfoMapper listenInvitationInfoMapper;

    public void saveListenInvitationInfoList(List<Integer> customerList) {
        //根据传入的list 用户id查询对应的list
        List<ListenInvitationInfoVo> list = listenInvitationInfoMapper.selectListByPrimaryKeyList(customerList);
        //将需要更改的查出来
        if (list.size() > 0) {
            searchListenInvitationInfoRepository.saveAll(list);
        }
    }

    public List<ListenInvitationInfoVo> queryAllListenInvitationInfoList() {
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        builder.must(QueryBuilders.matchAllQuery());
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        nativeSearchQueryBuilder.withQuery(builder);
        NativeSearchQuery query = nativeSearchQueryBuilder.build();
        List<ListenInvitationInfoVo> list = searchListenInvitationInfoRepository.search(query).getContent();
        return list;
    }

    public void deleteListenInvitationInfo(Integer id) {
        ListenInvitationInfoVo listenInvitationInfoVo = new ListenInvitationInfoVo();
        listenInvitationInfoVo.setId(id);
        searchListenInvitationInfoRepository.delete(listenInvitationInfoVo);
    }

    public List<ListenInvitationInfoVo> getListenInvitationInfoList(Map<String, ?> map, Integer currentPage, Integer pageSize) {
        List<ListenInvitationInfoVo> list = null;
        SearchConditionEncape searchConditionEncape = new SearchConditionEncape();
        NativeSearchQuery query = searchConditionEncape.queryCondition(map, currentPage, pageSize);
        list = searchListenInvitationInfoRepository.search(query).getContent();
        return list;
    }
}
