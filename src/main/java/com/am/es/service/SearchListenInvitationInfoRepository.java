package com.am.es.service;

import com.am.es.model.ListenInvitationInfoVo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface SearchListenInvitationInfoRepository extends ElasticsearchRepository<ListenInvitationInfoVo, Integer> {

}
