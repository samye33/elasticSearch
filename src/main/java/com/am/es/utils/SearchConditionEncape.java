package com.am.es.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SearchConditionEncape {
    /**
     * @param json
     * @param currentPage
     * @param pageSize
     * @return org.springframework.data.elasticsearch.core.query.NativeSearchQuery
     * @author sam.ye
     * @desc
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchConditionEncape.class);

    public NativeSearchQuery queryConditions(JSONObject json, Integer currentPage, Integer pageSize) {
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();

        //获取Must的封装条件对象
        JSONArray mustArr = json.getJSONArray("must");
        JSONArray shouldArr = json.getJSONArray("should");
        JSONArray notArr = json.getJSONArray("not");
        JSONArray jsonSortArr = json.getJSONArray("sort");
        if (mustArr != null) {
            builder = recursionEncape(builder, mustArr, "must");
        }
        if (shouldArr != null) {
            builder = recursionEncape(builder, shouldArr, "should");
        }
        if (notArr != null) {
            builder = recursionEncape(builder, notArr, "not");
        }
        //将搜索条件设置到构建中
        nativeSearchQueryBuilder.withQuery(builder);
        if (currentPage != null && pageSize > 0) {
            PageRequest page = new PageRequest(currentPage, pageSize);
            //将分页设置到构建中
            nativeSearchQueryBuilder.withPageable(page);
        }
        if (jsonSortArr != null) {
            for (int i = 0; i < jsonSortArr.size(); i++) {
                String key = jsonSortArr.getJSONObject(i).getString("key");
                String value = jsonSortArr.getJSONObject(i).getString("value");
                FieldSortBuilder sort = null;
                if (("desc").equals(value)) {
                    sort = SortBuilders.fieldSort(key).order(SortOrder.DESC);
                } else {
                    sort = SortBuilders.fieldSort(key).order(SortOrder.ASC);
                }
                //将排序设置到构建中
                nativeSearchQueryBuilder.withSort(sort);
            }

        }
        NativeSearchQuery query = nativeSearchQueryBuilder.build();
        LOGGER.debug(query.getQuery().toString());
        return query;
    }

    private BoolQueryBuilder recursionEncape(BoolQueryBuilder builder, JSONArray jsonArray, String logic) {
        //如果有子查询则用递归来进行多层查询封装
        for (int i = 0; i < jsonArray.size(); i++) {
            //如果jsonObject对象中存在child数组，且不为空，则表示该查询存在子查询
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            //如果是child不为null，则递归封装；反之则进行正常封装
            JSONObject child = jsonObject.getJSONObject("child");
            if (null != child) {
                BoolQueryBuilder newBuilder = QueryBuilders.boolQuery();
                String newLogic = child.getString("logic");
                JSONArray childArray = child.getJSONArray("arrCondition");
                newBuilder = recursionEncape(newBuilder, childArray, newLogic);
                if ("must".equals(logic)) {
                    builder.must(newBuilder);
                } else if ("should".equals(logic)) {
                    builder.should(newBuilder);
                } else {
                    builder.mustNot(newBuilder);
                }
            } else {
                String key = jsonObject.getString("key");
                String value = jsonObject.getString("value");
                //json中key为es的查询字段；value为查询值；type为查询类型[term 为准确查询;fuzzy为模糊查询;range为范围查询,match为字符匹配,QueryString字符串查询（可查询带特殊字符）]
                String type = jsonObject.getString("type");
                if (StringUtils.isBlank(key) || StringUtils.isBlank(value) || StringUtils.isBlank(type)) {
                    continue;
                }

                if ("must".equals(logic)) {
                    if (type.equals("null")) {
                        builder.must(QueryBuilders.existsQuery(key));
                    } else {
                        QueryBuilder queryBuilder = queryEncape(key, value, type);
                        if (null != queryBuilder) {
                            builder.must(queryBuilder);
                        }

                    }
                } else if ("should".equals(logic)) {
                    if (type.equals("null")) {
                        builder.should(QueryBuilders.termQuery(key, 0));
                        builder.should(QueryBuilders.existsQuery(key));
                    } else {
                        QueryBuilder queryBuilder = queryEncape(key, value, type);
                        if (null != queryBuilder) {
                            builder.should(queryBuilder);
                        }
                    }
                } else {
                    if (type.equals("null")) {
                        builder.mustNot(QueryBuilders.existsQuery(key));
                    } else {
                        QueryBuilder queryBuilder = queryEncape(key, value, type);
                        if (null != queryBuilder) {
                            builder.mustNot(queryBuilder);
                        }
                    }
                }
            }
        }
        return builder;
    }

    private QueryBuilder queryEncape(String key, String value, String type) {
        QueryBuilder queryBuilder = null;
        if (key.equals("match_all")) {
            queryBuilder = QueryBuilders.matchAllQuery();
            return queryBuilder;
        }
        switch (type) {
            case "term":
                if (value.startsWith("[") && value.endsWith("]")) {
                    value = value.substring(0, value.length() - 1);
                    value = value.substring(1, value.length());
                    try {
                        value = URLDecoder.decode(value, "utf-8");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    String arr[] = value.split(",");
                    queryBuilder = QueryBuilders.termsQuery(key, arr);
                } else {
                    queryBuilder = QueryBuilders.termQuery(key, value);
                }
                break;
            case "match":
                try {
                    value = URLDecoder.decode(value, "utf-8");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                queryBuilder = QueryBuilders.matchQuery(key, value);
                break;

            case "fuzzy":
                QueryBuilders.matchQuery(key, "*" + value + "*");
                break;
            case "range":
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
                    queryBuilder = rangeQueryBuilder;
                }
                break;
            case "wildcard":
                queryBuilder = QueryBuilders.wildcardQuery(key, value + "*");
                break;

            case "queryString":
                try {
                    value = URLDecoder.decode(value, "utf-8").replace("[", (char) 92 + "[").replace("]", (char) 92 + "]");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                queryBuilder = QueryBuilders.queryStringQuery(value).field(key);
                break;
            default:
                break;

        }
        return queryBuilder;
    }

    /**
     * @param str
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @author sam.ye
     * @desc 将标准格式的Str转为Map格式
     */

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

    public static JSONObject stringToJson(String jsonStr) {
        JSONObject json = JSONObject.parseObject(jsonStr);
        return json;
    }
}
