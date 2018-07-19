package com.am.es.service.search;

import com.am.es.model.ClueInfoVo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface SearchClueInfoRepository extends ElasticsearchRepository<ClueInfoVo, Integer> {

}
