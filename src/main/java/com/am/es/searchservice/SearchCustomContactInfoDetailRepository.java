package com.am.es.searchservice;

import com.am.es.model.CustomContactInfoDetailVo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface SearchCustomContactInfoDetailRepository extends ElasticsearchRepository<CustomContactInfoDetailVo, Integer> {

}
