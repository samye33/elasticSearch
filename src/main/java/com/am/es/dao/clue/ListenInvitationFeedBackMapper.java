package com.am.es.dao.clue;

import com.am.es.entity.clue.ListenInvitationFeedBack;
import com.am.es.entity.clue.ListenInvitationFeedBackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ListenInvitationFeedBackMapper {
    int countByExample(ListenInvitationFeedBackExample example);

    int deleteByExample(ListenInvitationFeedBackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ListenInvitationFeedBack record);

    int insertSelective(ListenInvitationFeedBack record);

    List<ListenInvitationFeedBack> selectByExample(ListenInvitationFeedBackExample example);

    ListenInvitationFeedBack selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ListenInvitationFeedBack record, @Param("example") ListenInvitationFeedBackExample example);

    int updateByExample(@Param("record") ListenInvitationFeedBack record, @Param("example") ListenInvitationFeedBackExample example);

    int updateByPrimaryKeySelective(ListenInvitationFeedBack record);

    int updateByPrimaryKey(ListenInvitationFeedBack record);
}