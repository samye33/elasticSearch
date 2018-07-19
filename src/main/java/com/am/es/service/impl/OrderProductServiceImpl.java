package com.am.es.service.impl;

import com.am.es.dao.order.OrderProductMapper;
import com.am.es.model.order.OrderProductVo;
import com.am.es.service.OrderProductService;
import com.am.es.service.search.SearchOrderProductRepository;
import com.am.es.utils.SearchConditionEncape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class OrderProductServiceImpl implements OrderProductService {
    @Autowired
    private OrderProductMapper orderProductMapper;

    @Autowired
    private SearchOrderProductRepository searchOrderProductRepository;

    @Override
    public void saveOrderProduct(List<Integer> orderList) {
        //根据传入的list 用户id查询对应的list
        List<OrderProductVo> list = orderProductMapper.selectListByPrimaryKeyList(orderList);
        //将需要更改的查出来
        if (list.size() > 0) {
            searchOrderProductRepository.saveAll(list);
        }
    }

    @Override
    public void deleteOrderProduct(Integer id) {
        OrderProductVo orderProductVo = new OrderProductVo();
        orderProductVo.setId(id);
        searchOrderProductRepository.delete(orderProductVo);
    }

    @Override
    public List<OrderProductVo> getOrderProduct(Map<String, ?> map, Integer currentPage, Integer pageSize) {
        List<OrderProductVo> list = null;
        SearchConditionEncape searchConditionEncape = new SearchConditionEncape();
        NativeSearchQuery query = searchConditionEncape.queryCondition(map, currentPage, pageSize);
        list = searchOrderProductRepository.search(query).getContent();
        return list;
    }
}
