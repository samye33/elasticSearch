package com.am.es.controller;

import com.am.es.model.OrderSerialVo;
import com.am.es.model.Result;
import com.am.es.service.OrderSerialService;
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
@RequestMapping("/es/orderSerial")
public class OrderSerialController {
    private static final Logger logger = LoggerFactory.getLogger(OrderSerialController.class);

    @Autowired
    private OrderSerialService orderSerialService;

    @GetMapping("/save")
    public Result saveOrderSerial(HttpServletRequest request, HttpServletResponse response, List<Integer> id) {
        Result ret = new Result();
        try {
            orderSerialService.saveOrderSerialList(id);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }

    @GetMapping("/delete")
    public Result deleteOrderSerial(HttpServletRequest request, HttpServletResponse response, Integer id) {
        Result ret = new Result();
        try {
            orderSerialService.deleteOrderSerial(id);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }

    @GetMapping("/searchCondition")
    public Result searchOrderSerial(HttpServletRequest request, HttpServletResponse response, Map map, Integer currentPage, Integer pageSize) {
        Result ret = new Result();
        try {

            List<OrderSerialVo> list = orderSerialService.getOrderSerialList(map, currentPage, pageSize);
            ret.setData(list);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }
}
