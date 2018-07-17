package com.am.es.service.impl;

import com.am.es.cluedao.ListenInvitationInfoMapper;
import com.am.es.model.ListenInvitationInfoVo;
import com.am.es.service.SearchListenInvitationInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListenInvitationInfoServiceImpl {
    @Autowired
    private SearchListenInvitationInfoRepository searchListenInvitationInfoRepository;

    @Autowired
    private ListenInvitationInfoMapper listenInvitationInfoMapper;

    public void saveListenInvitationInfoList(List<Integer> customerList) {
        //根据传入的list 用户id查询对应的list
        List<ListenInvitationInfoVo> list = listenInvitationInfoMapper.selectListByPrimaryKeyList(customerList);
        //将需要更改的查出来
        searchListenInvitationInfoRepository.saveAll(list);
    }

    public void deleteListenInvitationInfo(Integer id) {
        ListenInvitationInfoVo listenInvitationInfoVo = new ListenInvitationInfoVo();
        listenInvitationInfoVo.setId(id);
        searchListenInvitationInfoRepository.delete(listenInvitationInfoVo);
    }
}
