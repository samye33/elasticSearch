package com.am.es.service;

import com.am.es.model.order.OrderInfoVo;

import java.util.List;
import java.util.Map;

public interface OrderInfoService {

    void saveOrderInfoList(List<Integer> orderList);

    void deleteOrderInfo(Integer id);

    List<OrderInfoVo> getOrderInfoList(Map<String, ?> map, Integer currentPage, Integer pageSize);
}
