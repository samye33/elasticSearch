package com.am.es.service.search;

import com.am.es.model.ClueTurnRecordVo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface SearchClueTurnRecordRepository extends ElasticsearchRepository<ClueTurnRecordVo, Integer> {

}
