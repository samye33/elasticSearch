package com.am.es.controller;

import com.am.es.model.ClueInfoVo;
import com.am.es.model.ClueTurnRecordVo;
import com.am.es.model.Result;
import com.am.es.service.ClueTurnRecordService;
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
@RequestMapping("/es/clueTurnRecord")
public class ClueTurnRecordController {
    private static final Logger logger = LoggerFactory.getLogger(ClueTurnRecordController.class);

    @Autowired
    private ClueTurnRecordService clueTurnRecordService;

    @GetMapping("/save")
    public Result saveClueTurnRecord(HttpServletRequest request, HttpServletResponse response, List<Integer> id) {
        Result ret = new Result();
        try {
            clueTurnRecordService.saveClueTurnRecordList(id);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }

    @GetMapping("/delete")
    public Result deleteClueTurnRecord(HttpServletRequest request, HttpServletResponse response, Integer id) {
        Result ret = new Result();
        try {
            clueTurnRecordService.deleteClueTurnRecord(id);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }

    @GetMapping("/searchCondition")
    public Result searchClueTurnRecord(HttpServletRequest request, HttpServletResponse response, Map map, Integer currentPage, Integer pageSize) {
        Result ret = new Result();
        try {

            List<ClueTurnRecordVo> list = clueTurnRecordService.getClueTurnRecordList(map, currentPage, pageSize);
            ret.setData(list);
        } catch (Exception e) {
            logger.error("", e);
        }
        return ret;
    }
}
