package com.am.es.controller;

import com.am.es.enums.HttpStatusCode;
import com.am.es.model.Result;
import com.am.es.model.clue.CustomContactInfoDetailVo;
import com.am.es.service.CustomContactInfoDeatailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/es/customContactInfoDetail")
public class CustomContactInfoDetailController {
    private static final Logger logger = LoggerFactory.getLogger(CustomContactInfoDetailController.class);
    @Autowired
    private CustomContactInfoDeatailService customContactInfoDeatailService;

    @PostMapping("/save")
    public Result saveCustomContactInfoDetail(HttpServletRequest request,  String ids) {
        Result ret = new Result();
        String[] id = ids.split(",");
        List<Integer> listId = new ArrayList<Integer>();
        try {
            for (int i = 0; i < id.length; i++) {
                listId.add(Integer.parseInt(id[i]));
            }
            customContactInfoDeatailService.saveCustomContactInfoDeatailList(listId);
            ret.setStatus(HttpStatusCode.CODE_SUCCESS.getValue());
            ret.setMessage(HttpStatusCode.CODE_SUCCESS.getDesc());
        } catch (Exception e) {
            ret.setStatus(HttpStatusCode.CODE_SERVER_INTERNAL_ERROR.getValue());
            ret.setMessage(HttpStatusCode.CODE_SERVER_INTERNAL_ERROR.getDesc());
            logger.error("", e);
        }
        return ret;
    }

    @GetMapping("/delete")
    public Result deleteCustomContactInfoDetail(HttpServletRequest request, Integer id) {
        Result ret = new Result();
        try {
            customContactInfoDeatailService.deleteCustomContactInfoDetail(id);
            ret.setStatus(HttpStatusCode.CODE_SUCCESS.getValue());
            ret.setMessage(HttpStatusCode.CODE_SUCCESS.getDesc());
        } catch (Exception e) {
            ret.setStatus(HttpStatusCode.CODE_SERVER_INTERNAL_ERROR.getValue());
            ret.setMessage(HttpStatusCode.CODE_SERVER_INTERNAL_ERROR.getDesc());
            logger.error("", e);
        }
        return ret;
    }

    @GetMapping("/searchCondition")
    public Result searchCustomContactInfoDetail(HttpServletRequest request, Map map, Integer currentPage, Integer pageSize) {
        Result ret = new Result();
        try {
            List<CustomContactInfoDetailVo> list = customContactInfoDeatailService.getCustomContactInfoDetailList(map, currentPage, pageSize);
            ret.setStatus(HttpStatusCode.CODE_SUCCESS.getValue());
            ret.setMessage(HttpStatusCode.CODE_SUCCESS.getDesc());
            ret.setData(list);
        } catch (Exception e) {
            ret.setStatus(HttpStatusCode.CODE_SERVER_INTERNAL_ERROR.getValue());
            ret.setMessage(HttpStatusCode.CODE_SERVER_INTERNAL_ERROR.getDesc());
            logger.error("", e);
        }
        return ret;
    }

    @GetMapping("/searchAll")
    public Result searchAll(HttpServletRequest request, HttpServletResponse response) {
        Result ret = new Result();
        try {
            List<CustomContactInfoDetailVo> list = customContactInfoDeatailService.queryAllCustomContactInfoDetail();
            ret.setStatus(HttpStatusCode.CODE_SUCCESS.getValue());
            ret.setMessage(HttpStatusCode.CODE_SUCCESS.getDesc());
            ret.setData(list);
        } catch (Exception e) {
            ret.setStatus(HttpStatusCode.CODE_SERVER_INTERNAL_ERROR.getValue());
            ret.setMessage(HttpStatusCode.CODE_SERVER_INTERNAL_ERROR.getDesc());
            logger.error("", e);
        }
        return ret;
    }
}
