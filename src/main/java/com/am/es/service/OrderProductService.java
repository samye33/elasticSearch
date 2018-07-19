package com.am.es.service;

import com.am.es.model.order.OrderProductVo;

import java.util.List;
import java.util.Map;

public interface OrderProductService {

    void saveOrderProduct(List<Integer> orderList);

    void deleteOrderProduct(Integer id);

    List<OrderProductVo> getOrderProduct(Map<String, ?> map, Integer currentPage, Integer pageSize);
}
