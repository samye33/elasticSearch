package com.am.es.searchservice;

import com.am.es.model.CustomInfoVo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface SearchCustomInfoRepository extends ElasticsearchRepository<CustomInfoVo, Integer> {

}
