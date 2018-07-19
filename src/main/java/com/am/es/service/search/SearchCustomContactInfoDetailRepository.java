package com.am.es.service.search;

import com.am.es.model.clue.CustomContactInfoDetailVo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface SearchCustomContactInfoDetailRepository extends ElasticsearchRepository<CustomContactInfoDetailVo, Integer> {

}
