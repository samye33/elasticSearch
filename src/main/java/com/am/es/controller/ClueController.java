package com.am.es.controller;

import com.am.es.enums.HttpStatusCode;
import com.am.es.model.ClueQueryResponseModel;
import com.am.es.model.PageClueInfo;
import com.am.es.model.Result;
import com.am.es.service.ClueQueryService;
import com.am.es.utils.SearchConditionEncape;
import com.sun.org.apache.regexp.internal.RE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/es/clue")
public class ClueController {
    private static final Logger logger = LoggerFactory.getLogger(ClueController.class);

    @Autowired
    private ClueQueryService clueInfoService;

    @PostMapping("/save")
    public Result saveClueInfo(HttpServletRequest request, HttpServletResponse response, String ids) {
        Result ret = new Result();
        String[] id = ids.split(",");
        List<Integer> listId = new ArrayList<Integer>();
        try {
            for (int i = 0; i < id.length; i++) {
                listId.add(Integer.parseInt(id[i]));
            }
            clueInfoService.saveClueQuery(listId);
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
    public Result deleteClueInfo(HttpServletRequest request, HttpServletResponse response, Integer id) {
        Result ret = new Result();
        try {
            List<Integer> list = new ArrayList<Integer>();
            list.add(id);
            clueInfoService.deleteClueQuery(list);
            ret.setStatus(HttpStatusCode.CODE_SUCCESS.getValue());
            ret.setMessage(HttpStatusCode.CODE_SUCCESS.getDesc());
        } catch (Exception e) {
            ret.setStatus(HttpStatusCode.CODE_SERVER_INTERNAL_ERROR.getValue());
            ret.setMessage(HttpStatusCode.CODE_SERVER_INTERNAL_ERROR.getDesc());
            logger.error("", e);
        }
        return ret;
    }

    @PostMapping("/searchCondition")
    public Result searchClueInfo(HttpServletRequest request, HttpServletResponse response, String parm) {
        Result ret = new Result();
        try {
            Map map = SearchConditionEncape.stringToMap(parm);
            System.out.println(map.toString());
            PageClueInfo page = clueInfoService.getClueQueryList(map);
            ret.setStatus(HttpStatusCode.CODE_SUCCESS.getValue());
            ret.setMessage(HttpStatusCode.CODE_SUCCESS.getDesc());
            ret.setData(page);
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
            PageClueInfo page = clueInfoService.queryAllClueQueryList();
            ret.setStatus(HttpStatusCode.CODE_SUCCESS.getValue());
            ret.setMessage(HttpStatusCode.CODE_SUCCESS.getDesc());
            ret.setData(page);
        } catch (Exception e) {
            ret.setStatus(HttpStatusCode.CODE_SERVER_INTERNAL_ERROR.getValue());
            ret.setMessage(HttpStatusCode.CODE_SERVER_INTERNAL_ERROR.getDesc());
            logger.error("", e);
        }
        return ret;
    }

    @GetMapping("/test")
    public Result test(HttpServletRequest request, HttpServletResponse response) {
        Result ret = new Result();
        try {
            PageClueInfo page = clueInfoService.test();
            ret.setData(page);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
}
