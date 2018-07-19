package com.am.es.service.search;

import com.am.es.model.order.OrderSerialVo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface SearchOrderSerialRepository extends ElasticsearchRepository<OrderSerialVo, Integer> {

}
