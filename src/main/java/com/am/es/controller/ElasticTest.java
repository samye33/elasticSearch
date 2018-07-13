package com.am.es.controller;

import com.am.es.entity.CustomContacts;
import com.am.es.entity.SysUsers;
import com.am.es.model.ClueInfoVo;
import com.am.es.model.CustomInfoVo;
import com.am.es.model.ElasticSearchResponse;
import com.am.es.service.impl.*;
import com.am.es.utils.EncapCommonUtils;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class ElasticTest {

    private static final Logger logger = LoggerFactory.getLogger(ElasticTest.class);

    @Autowired
    private ClueInfoServiceImpl clueInfoService;
    @Autowired
    private CustomInfoServiceImpl customInfoService;

    @Autowired
    private ClueTurnRecordServiceImpl clueTurnRecordService;

    @Autowired
    private ListenInvitationInfoServiceImpl listenInvitationInfoService;

    @Autowired
    private CustomContactsImpl customContactsImpl;

    @Autowired
    private CustomContactInfoDeatailImpl customContactInfoDeatail;


    @GetMapping("/add")
    public ElasticSearchResponse listDepartments(HttpServletRequest request, HttpServletResponse response) {
        ElasticSearchResponse res = new ElasticSearchResponse();
        long starttime = System.currentTimeMillis();
        try {
            List<Integer> clueTurnRecordList = new ArrayList<Integer>();
            clueTurnRecordList.add(33743662);
            clueTurnRecordList.add(33743663);
            clueTurnRecordService.saveClueTurnRecordList(clueTurnRecordList);
            List<Integer> listenList = new ArrayList<Integer>();
            listenList.add(290);
            listenList.add(293);
            listenInvitationInfoService.saveListenInvitationInfoList(listenList);
            List<Integer> contactsList = new ArrayList<Integer>();
            contactsList.add(87778);
            contactsList.add(87779);
            contactsList.add(87780);
            contactsList.add(87781);
            contactsList.add(87782);
            contactsList.add(87783);
            customContactsImpl.saveCustomContactsList(contactsList);
            List<Integer> contactInfoList = new ArrayList<Integer>();
            contactInfoList.add(11576779);
            contactInfoList.add(11576780);
            contactInfoList.add(11576781);
            contactInfoList.add(11576782);
            contactInfoList.add(11576783);
            contactInfoList.add(11576784);
            contactInfoList.add(11576785);
            contactInfoList.add(11576786);
            contactInfoList.add(11576787);
            contactInfoList.add(11576788);
            contactInfoList.add(11576789);
            contactInfoList.add(11576790);
            contactInfoList.add(11576791);
            customContactInfoDeatail.saveCustomContactInfoDeatailList(contactInfoList);
        } catch (Exception e) {
            logger.error("", e);
        }
        logger.info("查询消耗时间为:" + (System.currentTimeMillis() - starttime));
        return res;
    }

    @GetMapping("/search")
    public ElasticSearchResponse getList(HttpServletRequest request, HttpServletResponse response, String searchString) {
        ElasticSearchResponse res = new ElasticSearchResponse();
        long starttime = System.currentTimeMillis();
        try {
            List<CustomInfoVo> customInfoist = customInfoService.queryCustomInfoList();
            List<ClueInfoVo> clueInfoList = clueInfoService.queryClueInfoList();
            customInfoist = EncapCommonUtils.encapCustomInfo(customInfoist, clueInfoList);
            res.setData(customInfoist);
        } catch (Exception e) {
            logger.error("", e);
        }
        logger.info("查询消耗时间为:" + (System.currentTimeMillis() - starttime));
        return res;
    }

    @GetMapping("/searchManyCondition")
    public ElasticSearchResponse searchManyCondition(HttpServletRequest request, HttpServletResponse response, String searchString) {
        ElasticSearchResponse res = new ElasticSearchResponse();
        try {
            BoolQueryBuilder builder = QueryBuilders.boolQuery();
            String email = "tom.zhan*";
            //设置email中包含tom.zhan
            builder.must(new QueryStringQueryBuilder(email).field("email"));
            builder.must(QueryBuilders.termQuery("sex", 1));
            //按照年龄从高到低
            FieldSortBuilder sort = SortBuilders.fieldSort("userId").order(SortOrder.DESC);
            //设置分页(拿第一页，一页显示两条)
            //注意!es的分页api是从第0页开始的(坑)
            PageRequest page = new PageRequest(0, 20);

            //构建查询
            NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
            //将搜索条件设置到构建中
            nativeSearchQueryBuilder.withQuery(builder);
//            //将分页设置到构建中
            nativeSearchQueryBuilder.withPageable(page);
            //将排序设置到构建中
            nativeSearchQueryBuilder.withSort(sort);
            //生产NativeSearchQuery
            NativeSearchQuery query = nativeSearchQueryBuilder.build();
//            Page<SysUsers> search = searchRepository.search(query);
            //获取总条数(前端分页需要使用)
//            int total = (int) search.getTotalElements();

            //获取查询到的数据内容
//            List<SysUsers> list = search.getContent();
        } catch (Exception e) {
            logger.error("", e);
        }
        return res;
    }

    @GetMapping("/deleteUser")
    public ElasticSearchResponse deleteUser(HttpServletRequest request, HttpServletResponse response) {
        ElasticSearchResponse res = new ElasticSearchResponse();
        int user_id = 54;
        SysUsers sysUsers = null;
//        searchRepository.delete(sysUsers);
        return res;
    }
}
