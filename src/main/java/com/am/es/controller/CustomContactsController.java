package com.am.es.controller;

import com.am.es.model.clue.CustomContactsVo;
import com.am.es.model.Result;
import com.am.es.service.CustomContactsService;
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
@RequestMapping("/es/customContacts")
public class CustomContactsController {
    private static final Logger logger = LoggerFactory.getLogger(CustomContactsController.class);
    @Autowired
    private CustomContactsService customContactsService;

    @GetMapping("/save")
    public Result saveCustomContacts(HttpServletRequest request, HttpServletResponse response, List<Integer> id) {
        Result ret = new Result();
        try {
            customContactsService.saveCustomContactsList(id);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }

    @GetMapping("/delete")
    public Result deleteCustomContacts(HttpServletRequest request, HttpServletResponse response, Integer id) {
        Result ret = new Result();
        try {
            customContactsService.deleteCustomContacts(id);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }

    @GetMapping("/searchCondition")
    public Result searchCustomContacts(HttpServletRequest request, HttpServletResponse response, Map map, Integer currentPage, Integer pageSize) {
        Result ret = new Result();
        try {
            List<CustomContactsVo> list = customContactsService.getCustomContactsList(map, currentPage, pageSize);
            ret.setData(list);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }
}
