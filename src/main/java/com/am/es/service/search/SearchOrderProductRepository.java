package com.am.es.service.search;

import com.am.es.model.order.OrderProductVo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface SearchOrderProductRepository extends ElasticsearchRepository<OrderProductVo, Integer> {

}
