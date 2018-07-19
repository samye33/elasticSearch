package com.am.es.service.impl;

import com.am.es.dao.clue.CustomContactInfoDetailMapper;
import com.am.es.model.clue.CustomContactInfoDetailVo;
import com.am.es.service.search.SearchCustomContactInfoDetailRepository;
import com.am.es.service.CustomContactInfoDeatailService;
import com.am.es.utils.SearchConditionEncape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class CustomContactInfoDeatailServiceImpl implements CustomContactInfoDeatailService {
    @Autowired
    private SearchCustomContactInfoDetailRepository searchCustomContactInfoDetailRepository;

    @Autowired
    private CustomContactInfoDetailMapper customContactInfoDetailMapper;

    public void saveCustomContactInfoDeatailList(List<Integer> customerList) {
        //根据传入的list 用户id查询对应的list
        List<CustomContactInfoDetailVo> list = customContactInfoDetailMapper.selectListByPrimaryKeyList(customerList);
        //将需要更改的查出来
        if (list.size() > 0) {
            searchCustomContactInfoDetailRepository.saveAll(list);
        }
    }

    public void deleteCustomContactInfoDetail(Integer id) {
        CustomContactInfoDetailVo customContactInfoDetailVo = new CustomContactInfoDetailVo();
        customContactInfoDetailVo.setId(id);
        searchCustomContactInfoDetailRepository.delete(customContactInfoDetailVo);
    }

    public List<CustomContactInfoDetailVo> getCustomContactInfoDetailList(Map<String, ?> map, Integer currentPage, Integer pageSize) {
        List<CustomContactInfoDetailVo> list = null;
        SearchConditionEncape searchConditionEncape = new SearchConditionEncape();
        NativeSearchQuery query = searchConditionEncape.queryCondition(map, currentPage, pageSize);
        list = searchCustomContactInfoDetailRepository.search(query).getContent();
        return list;
    }
}
