package com.am.es.service;

import com.am.es.model.OrderSerialVo;

import java.util.List;
import java.util.Map;

public interface OrderSerialService {
    void saveOrderSerialList(List<Integer> orderList);

    void deleteOrderSerial(Integer id);

    List<OrderSerialVo> getOrderSerialList(Map<String, ?> map, Integer currentPage, Integer pageSize);
}
