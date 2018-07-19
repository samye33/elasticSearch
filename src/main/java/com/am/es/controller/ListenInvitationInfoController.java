package com.am.es.controller;

import com.am.es.model.clue.ListenInvitationInfoVo;
import com.am.es.model.Result;
import com.am.es.service.ListenInvitationInfoService;
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
@RequestMapping("/es/listenInvitationInfo")
public class ListenInvitationInfoController {
    private static final Logger logger = LoggerFactory.getLogger(ListenInvitationInfoController.class);

    @Autowired
    private ListenInvitationInfoService listenInvitationInfoService;

    @GetMapping("/save")
    public Result saveListenInvitationInfo(HttpServletRequest request, HttpServletResponse response, List<Integer> id) {
        Result ret = new Result();
        try {
            listenInvitationInfoService.saveListenInvitationInfoList(id);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }

    @GetMapping("/delete")
    public Result deleteListenInvitationInfo(HttpServletRequest request, HttpServletResponse response, Integer id) {
        Result ret = new Result();
        try {
            listenInvitationInfoService.deleteListenInvitationInfo(id);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }

    @GetMapping("/searchCondition")
    public Result searchListenInvitationInfo(HttpServletRequest request, HttpServletResponse response, Map map, Integer currentPage, Integer pageSize) {
        Result ret = new Result();
        try {

            List<ListenInvitationInfoVo> list = listenInvitationInfoService.getListenInvitationInfoList(map, currentPage, pageSize);
            ret.setData(list);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }
}
