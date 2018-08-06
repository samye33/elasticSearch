package com.am.es.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;

import java.util.Map;

public class SearchConditionEncape {
    public NativeSearchQuery queryCondition(Map<String, ?> map, Integer currentPage, Integer pageSize) {
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.equals("currentPage") || key.equals("pageSize")) {
                continue;
            }
            Object obj = entry.getValue();
            JSONObject jsonObject = (JSONObject) obj;
            //根据type判断是准确查询还是模糊查询
            String type = jsonObject.getString("type");
            String value = jsonObject.getString("value");
            //type为term 为准确查询;fuzzy为模糊查询;sort为排序;not为不满足条件;time为时间范围；rangeNum为数字范围
            if (("term").equals(type)) {
                builder.must(QueryBuilders.termQuery(key, value));
            } else if (("fuzzy").equals(type)) {
                builder.must(new QueryStringQueryBuilder("*" + value + "*").field(key));
            } else if (("sort").equals(type)) {
                String field = jsonObject.getString("field");
                FieldSortBuilder sort = null;
                if (("desc").equals(value)) {
                    sort = SortBuilders.fieldSort(field).order(SortOrder.DESC);
                } else {
                    sort = SortBuilders.fieldSort(field).order(SortOrder.ASC);
                }
                //将排序设置到构建中
                nativeSearchQueryBuilder.withSort(sort);
            } else if ("range".equals(type)) {
                String start = value.split("~")[0];
                String end = value.split("~")[1];
                RangeQueryBuilder rangeQueryBuilder = QueryBuilders.rangeQuery(key);
                if (StringUtils.isNotBlank(start)) {
                    rangeQueryBuilder.from(start).includeLower(true);
                }
                if (StringUtils.isNotBlank(end)) {
                    rangeQueryBuilder.to(end).includeUpper(true);
                }
                builder.must(rangeQueryBuilder);
            } else if ("not".equals(type)) {
                builder.mustNot(QueryBuilders.termQuery(key, value));
            }
        }
        PageRequest page = new PageRequest(currentPage, pageSize);
        //将分页设置到构建中
        nativeSearchQueryBuilder.withPageable(page);
        //将搜索条件设置到构建中
        nativeSearchQueryBuilder.withQuery(builder);
        //生产NativeSearchQuery
        NativeSearchQuery query = nativeSearchQueryBuilder.build();
        return query;
    }
}
