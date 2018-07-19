package com.am.es.service.search;

import com.am.es.model.clue.CustomContactsVo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface SearchCustomContactsRepository extends ElasticsearchRepository<CustomContactsVo, Integer> {

}