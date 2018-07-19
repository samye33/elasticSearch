package com.am.es.service.search;

import com.am.es.model.OrderInfoVo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface SearchOrderInfoRepository extends ElasticsearchRepository<OrderInfoVo, Integer> {

}
