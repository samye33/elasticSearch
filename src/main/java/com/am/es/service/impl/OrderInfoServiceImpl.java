package com.am.es.service.impl;

import com.am.es.model.OrderInfoVo;
import com.am.es.orderdao.OrderInfoMapper;
import com.am.es.service.SearchOrderInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class OrderInfoServiceImpl {
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
}
