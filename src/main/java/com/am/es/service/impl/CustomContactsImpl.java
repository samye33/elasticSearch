package com.am.es.service.impl;

import com.am.es.dao.CustomContactsMapper;
import com.am.es.model.CustomContactsVo;
import com.am.es.service.SearchCustomContactsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomContactsImpl {

    @Autowired
    private SearchCustomContactsRepository searchCustomContactsRepository;

    @Autowired
    private CustomContactsMapper customContactsMapper;

    public void saveCustomContactsList(List<Integer> customerList) {
        //根据传入的list 用户id查询对应的list
        List<CustomContactsVo> list = customContactsMapper.selectListByPrimaryKeyList(customerList);
        //将需要更改的查出来
        searchCustomContactsRepository.saveAll(list);
    }
}
