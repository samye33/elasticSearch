package com.am.es.service.impl;

import com.am.es.dao.order.OrderInfoMapper;
import com.am.es.model.order.OrderInfoVo;
import com.am.es.service.OrderInfoService;
import com.am.es.service.search.SearchOrderInfoRepository;
import com.am.es.utils.SearchConditionEncape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class OrderInfoServiceImpl implements OrderInfoService {
    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Autowired
    private SearchOrderInfoRepository searchOrderInfoRepository;

    public void saveOrderInfoList(List<Integer> orderList) {
        //根据传入的list 用户id查询对应的list
        List<OrderInfoVo> list = orderInfoMapper.selectListByPrimaryKeyList(orderList);
        //将需要更改的查出来
        searchOrderInfoRepository.saveAll(list);
    }

    public void deleteOrderInfo(Integer id) {
        OrderInfoVo orderInfoVo = new OrderInfoVo();
        orderInfoVo.setId(id);
        searchOrderInfoRepository.delete(orderInfoVo);
    }

    public List<OrderInfoVo> getOrderInfoList(Map<String, ?> map, Integer currentPage, Integer pageSize) {
        List<OrderInfoVo> list = null;
        SearchConditionEncape searchConditionEncape = new SearchConditionEncape();
        NativeSearchQuery query = searchConditionEncape.queryCondition(map, currentPage, pageSize);
        list = searchOrderInfoRepository.search(query).getContent();
        return list;
    }
}
