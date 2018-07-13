package com.am.es.service.impl;

import com.am.es.dao.CustomContactInfoDetailMapper;
import com.am.es.model.CustomContactInfoDetailVo;
import com.am.es.service.SearchCustomContactInfoDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomContactInfoDeatailImpl {
    @Autowired
    private SearchCustomContactInfoDetailRepository searchCustomContactInfoDetailRepository;

    @Autowired
    private CustomContactInfoDetailMapper customContactInfoDetailMapper;

    public void saveCustomContactInfoDeatailList(List<Integer> customerList) {
        //根据传入的list 用户id查询对应的list
        List<CustomContactInfoDetailVo> list = customContactInfoDetailMapper.selectListByPrimaryKeyList(customerList);
        //将需要更改的查出来
        searchCustomContactInfoDetailRepository.saveAll(list);
    }
}
