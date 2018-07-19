package com.am.es.controller;

import com.am.es.model.Result;
import com.am.es.model.order.OrderProductVo;
import com.am.es.service.OrderProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/es/orderProduct")
public class OrderProductController {
    private static final Logger logger = LoggerFactory.getLogger(OrderProductController.class);

    @Autowired
    private OrderProductService orderProductService;

    @GetMapping("/save")
    public Result saveOrderProduct(HttpServletRequest request, HttpServletResponse response, List<Integer> id) {
        Result ret = new Result();
        try {
            orderProductService.saveOrderProduct(id);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }

    @GetMapping("/delete")
    public Result deleteOrderProduct(HttpServletRequest request, HttpServletResponse response, Integer id) {
        Result ret = new Result();
        try {
            orderProductService.deleteOrderProduct(id);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }

    @GetMapping("/searchCondition")
    public Result searchOrderProduct(HttpServletRequest request, HttpServletResponse response, Map map, Integer currentPage, Integer pageSize) {
        Result ret = new Result();
        try {

            List<OrderProductVo> list = orderProductService.getOrderProduct(map, currentPage, pageSize);
            ret.setData(list);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }
}
