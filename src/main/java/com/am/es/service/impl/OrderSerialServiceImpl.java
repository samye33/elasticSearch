package com.am.es.service.impl;

import com.am.es.model.order.OrderSerialVo;
import com.am.es.dao.order.OrderSerialMapper;
import com.am.es.service.search.SearchOrderSerialRepository;
import com.am.es.service.OrderSerialService;
import com.am.es.utils.SearchConditionEncape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class OrderSerialServiceImpl implements OrderSerialService {
    @Autowired
    private OrderSerialMapper orderSerialMapper;
    @Autowired
    private SearchOrderSerialRepository searchOrderSerialRepository;

    public void saveOrderSerialList(List<Integer> orderList) {
        //根据传入的list 用户id查询对应的list
        List<OrderSerialVo> list = orderSerialMapper.selectListByPrimaryKeyList(orderList);
        //将需要更改的查出来
        if (list.size() > 0) {
            searchOrderSerialRepository.saveAll(list);
        }
    }

    public void deleteOrderSerial(Integer id) {
        OrderSerialVo orderSerialVo = new OrderSerialVo();
        orderSerialVo.setId(id);
        searchOrderSerialRepository.delete(orderSerialVo);
    }

    public List<OrderSerialVo> getOrderSerialList(Map<String, ?> map, Integer currentPage, Integer pageSize) {
        List<OrderSerialVo> list = null;
        SearchConditionEncape searchConditionEncape = new SearchConditionEncape();
        NativeSearchQuery query = searchConditionEncape.queryCondition(map, currentPage, pageSize);
        list = searchOrderSerialRepository.search(query).getContent();
        return list;
    }
}
