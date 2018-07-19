package com.am.es.service;

import com.am.es.model.clue.ListenInvitationInfoVo;

import java.util.List;
import java.util.Map;

public interface ListenInvitationInfoService {
    void saveListenInvitationInfoList(List<Integer> customerList);

    void deleteListenInvitationInfo(Integer id);

    List<ListenInvitationInfoVo> getListenInvitationInfoList(Map<String, ?> map, Integer currentPage, Integer pageSize);
}
