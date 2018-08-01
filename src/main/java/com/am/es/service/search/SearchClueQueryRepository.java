package com.am.es.service.search;

import com.am.es.model.ClueQueryResponseModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface SearchClueQueryRepository extends ElasticsearchRepository<ClueQueryResponseModel, Integer> {

}
