package com.am.es.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SearchConditionEncape {
    public NativeSearchQuery queryCondition(Map<String, String> map, Integer currentPage, Integer pageSize) {
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.equals("currentPage") || key.equals("pageSize")) {
                continue;
            }
            String str = entry.getValue();
            JSONObject jsonObject = JSONObject.parseObject(str);
            //根据type判断是准确查询还是模糊查询
            String type = jsonObject.getString("type");
            String value = jsonObject.getString("value");
            if (StringUtils.isBlank(value)) {
                continue;
            }
            //type为term 为准确查询;fuzzy为模糊查询;sort为排序;not为不满足条件;time为时间范围；rangeNum为数字范围,match为字符匹配,QueryString
            if (("term").equals(type)) {
                if (value.startsWith("[") && value.endsWith("]")) {
                    value = value.substring(0, value.length() - 1);
                    value = value.substring(1, value.length());
                    try {
                        value = URLDecoder.decode(value, "utf-8");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    String arr[] = value.split(",");
                    builder.must(QueryBuilders.termsQuery(key, arr));
                } else {
                    builder.must(QueryBuilders.termQuery(key, value));
                }

            } else if (("fuzzy").equals(type)) {
                builder.must(QueryBuilders.matchQuery(key, "*" + value + "*"));
            } else if (("sort").equals(type)) {
                String field = jsonObject.getString("field");
                FieldSortBuilder sort = null;
                if (StringUtils.isNotBlank(field)) {
                    if (("desc").equals(value)) {
                        sort = SortBuilders.fieldSort(field).order(SortOrder.DESC);
                    } else {
                        sort = SortBuilders.fieldSort(field).order(SortOrder.ASC);
                    }
                }
                //将排序设置到构建中
                nativeSearchQueryBuilder.withSort(sort);
            } else if ("mustRange".equals(type)) {
                String[] arr = value.split("~");
                if (arr.length >= 1) {
                    String start = arr[0];
                    RangeQueryBuilder rangeQueryBuilder = QueryBuilders.rangeQuery(key);
                    if (StringUtils.isNotBlank(start)) {
                        rangeQueryBuilder.from(start).includeLower(true);
                    }
                    if (arr.length == 2) {
                        String end = arr[1];
                        if (StringUtils.isNotBlank(end)) {
                            rangeQueryBuilder.to(end).includeUpper(true);
                        }
                    }
                    builder.must(rangeQueryBuilder);
                }
            } else if ("not".equals(type)) {
                if (value.startsWith("[") && value.endsWith("]")) {
                    value = value.substring(0, value.length() - 1);
                    value = value.substring(1, value.length());
                    String arr[] = value.split(",");
                    builder.mustNot(QueryBuilders.termsQuery("preUserId", arr));
                } else {
                    builder.mustNot(QueryBuilders.termQuery("preUserId", value));
                }

            } else if ("match".equals(type)) {
                try {
                    value = URLDecoder.decode(value, "utf-8");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                builder.must(QueryBuilders.matchQuery(key, value));
            } else if ("wildcard".equals(type)) {
                builder.must(QueryBuilders.wildcardQuery(key, value + "*"));
            } else if ("shouldNull".equals(type)) {
                builder.should(QueryBuilders.termQuery(key, 0));
                builder.should(QueryBuilders.existsQuery(key));
            } else if ("queryString".equals(type)) {
                try {
                    value = URLDecoder.decode(value, "utf-8");
                    value = value.replace("[", (char) 92 + "[").replace("]", (char) 92 + "]");
                    System.out.println(value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                builder.must(QueryBuilders.queryStringQuery(value).field(key));
            } else if ("shouldRange".equals(type)) {
                String[] arr = value.split("~");
                if (arr.length >= 1) {
                    String start = arr[0];
                    RangeQueryBuilder rangeQueryBuilder = QueryBuilders.rangeQuery(key);
                    if (StringUtils.isNotBlank(start)) {
                        rangeQueryBuilder.from(start).includeLower(true);
                    }
                    if (arr.length == 2) {
                        String end = arr[1];
                        if (StringUtils.isNotBlank(end)) {
                            rangeQueryBuilder.to(end).includeUpper(true);
                        }
                    }
                    builder.should(rangeQueryBuilder);
                }
            }
        }
        PageRequest page = new PageRequest(currentPage, pageSize);
        //将分页设置到构建中
        nativeSearchQueryBuilder.withPageable(page);
        //将搜索条件设置到构建中
        nativeSearchQueryBuilder.withQuery(builder);
        //生产NativeSearchQuery
        NativeSearchQuery query = nativeSearchQueryBuilder.build();
        System.out.println(query.getQuery().toString());
        return query;
    }

    public static Map<String, Object> stringToMap(String str) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (str.startsWith("{") && str.endsWith("}")) {
            str = str.substring(1, str.length());
            str = str.substring(0, str.length() - 1);
            String[] eArr = str.split("=");
            String key = "";
            for (int i = 0; i < eArr.length; i++) {
                String tempStr = eArr[i];
                //如果为最后一个直接做为值进行封装
                if (i == eArr.length - 1) {
                    map.put(key, tempStr);
                } else {
                    //判断字符串中是否包含又"'{', '}','[',']'"字符
                    if ((tempStr).contains("{") || (tempStr).contains("[") || (tempStr).contains("}") || (tempStr).contains("]")) {
                        Stack<String> stackChar = new Stack<String>();
                        Integer stackLength = null;
                        for (int j = 0; j < tempStr.length(); j++) {
                            char c = tempStr.charAt(j);
                            if ((c + "").equals("{") || (c + "").equals("[")) {
                                stackChar.push(c + "");
                                stackLength = stackChar.size();
                            } else if ((c + "").equals("}") || (c + "").equals("]")) {
                                stackChar.pop();
                                stackLength = stackChar.size();
                            } else if ((c + "").equals(",")) {
                                if (stackLength == 0) {
                                    //跳出该循环，并从该处进行分离
                                    String jsonStr = tempStr.substring(0, j);
                                    String newKey = tempStr.substring(j + 1, tempStr.length());
                                    map.put(key, jsonStr);
                                    key = newKey.replace(" ", "");
                                    //清空栈
                                    stackChar.clear();
                                    break;
                                }
                            }
                        }
                    } else {
                        //判断是否有逗号
                        if (tempStr.contains(",")) {
                            Stack<String> stack = new Stack<String>();

                            //从分离的字符串中获取上一个key的value和下一个key的name
                            for (int j = 0; j < tempStr.length(); j++) {
                                char c = tempStr.charAt(j);
                                if (!(c + "").equals(",")) {
                                    stack.push(c + "");
                                } else if ((c + "").equals(" ")) {
                                    continue;
                                } else {
                                    String sStr = stack.pop();
                                    if (sStr.equals("\"")) {
                                        stack.push(sStr);
                                        stack.push(c + "");
                                    } else {
                                        String jsonStr = tempStr.substring(0, j);
                                        String newKey = tempStr.substring(j + 1, tempStr.length());
                                        map.put(key, jsonStr);
                                        key = newKey.replace(" ", "");
                                        //清空栈
                                        stack.clear();
                                        break;
                                    }
                                }
                            }
                        } else {
                            key = tempStr.replace(" ", "");
                        }
                    }
                }
            }
        } else {
            System.out.println("不是正确的Map格式");
        }

        return map;
    }
}
