package com.am.es.dao.clue;

import com.am.es.entity.clue.ListenInvitationInfo;
import com.am.es.entity.clue.ListenInvitationInfoExample;
import java.util.List;

import com.am.es.model.clue.ListenInvitationInfoVo;
import org.apache.ibatis.annotations.Param;

public interface ListenInvitationInfoMapper {
    int countByExample(ListenInvitationInfoExample example);

    int deleteByExample(ListenInvitationInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ListenInvitationInfo record);

    int insertSelective(ListenInvitationInfo record);

    List<ListenInvitationInfo> selectByExample(ListenInvitationInfoExample example);

    ListenInvitationInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ListenInvitationInfo record, @Param("example") ListenInvitationInfoExample example);

    int updateByExample(@Param("record") ListenInvitationInfo record, @Param("example") ListenInvitationInfoExample example);

    int updateByPrimaryKeySelective(ListenInvitationInfo record);

    int updateByPrimaryKey(ListenInvitationInfo record);

    List<ListenInvitationInfoVo> selectListByPrimaryKeyList(List<Integer> customerList);
}