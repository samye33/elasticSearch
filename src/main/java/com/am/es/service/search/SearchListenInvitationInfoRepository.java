package com.am.es.service.search;

import com.am.es.model.clue.ListenInvitationInfoVo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface SearchListenInvitationInfoRepository extends ElasticsearchRepository<ListenInvitationInfoVo, Integer> {

}
