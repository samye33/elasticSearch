package com.am.es.service.impl;

import com.am.es.cluedao.CustomContactInfoDetailMapper;
import com.am.es.model.CustomContactInfoDetailVo;
import com.am.es.service.SearchCustomContactInfoDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
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

    public void deleteCustomContactInfoDetail(Integer id) {
        CustomContactInfoDetailVo customContactInfoDetailVo = new CustomContactInfoDetailVo();
        customContactInfoDetailVo.setId(id);
        searchCustomContactInfoDetailRepository.delete(customContactInfoDetailVo);
    }
}
