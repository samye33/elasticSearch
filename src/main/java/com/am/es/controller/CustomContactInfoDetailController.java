package com.am.es.controller;

import com.am.es.model.clue.CustomContactInfoDetailVo;
import com.am.es.model.Result;
import com.am.es.service.CustomContactInfoDeatailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/es/customContactInfoDetail")
public class CustomContactInfoDetailController {
    private static final Logger logger = LoggerFactory.getLogger(CustomContactInfoDetailController.class);
    @Autowired
    private CustomContactInfoDeatailService customContactInfoDeatailService;

    @GetMapping("/save")
    public Result saveCustomContactInfoDetail(HttpServletRequest request, List<Integer> id) {
        Result ret = new Result();
        try {
            customContactInfoDeatailService.saveCustomContactInfoDeatailList(id);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }

    @GetMapping("/delete")
    public Result deleteCustomContactInfoDetail(HttpServletRequest request, Integer id) {
        Result ret = new Result();
        try {
            customContactInfoDeatailService.deleteCustomContactInfoDetail(id);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }

    @GetMapping("/searchCondition")
    public Result searchCustomContactInfoDetail(HttpServletRequest request, Map map, Integer currentPage, Integer pageSize) {
        Result ret = new Result();
        try {
            List<CustomContactInfoDetailVo> list = customContactInfoDeatailService.getCustomContactInfoDetailList(map, currentPage, pageSize);
            ret.setData(list);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }
}
