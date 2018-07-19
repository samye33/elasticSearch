package com.am.es.controller;

import com.alibaba.fastjson.JSONObject;
import com.am.es.model.ClueInfoVo;
import com.am.es.model.Result;
import com.am.es.service.ClueInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/es/clue")
public class ClueController {
    private static final Logger logger = LoggerFactory.getLogger(ClueController.class);

    @Autowired
    private ClueInfoService clueInfoService;

    @GetMapping("/save")
    public Result saveClueInfo(HttpServletRequest request, HttpServletResponse response, List<Integer> id) {
        Result ret = new Result();
        try {
            clueInfoService.saveClueInfoList(id);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }

    @GetMapping("/delete")
    public Result deleteClueInfo(HttpServletRequest request, HttpServletResponse response, Integer id) {
        Result ret = new Result();
        try {
            clueInfoService.deleteClueInfo(id);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }

    @GetMapping("/searchCondition")
    public Result deleteClueInfo(HttpServletRequest request, HttpServletResponse response, Map map, Integer currentPage, Integer pageSize) {
        Result ret = new Result();
        try {

            List<ClueInfoVo> orderInfoList = clueInfoService.getOrderInfoList(map, currentPage, pageSize);
            ret.setData(orderInfoList);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }
}
