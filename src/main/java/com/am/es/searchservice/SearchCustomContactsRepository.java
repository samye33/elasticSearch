package com.am.es.searchservice;

import com.am.es.model.CustomContactsVo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface SearchCustomContactsRepository extends ElasticsearchRepository<CustomContactsVo, Integer> {

}
