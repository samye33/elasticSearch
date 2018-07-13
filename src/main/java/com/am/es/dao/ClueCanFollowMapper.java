package com.am.es.dao;

import com.am.es.entity.ClueCanFollow;
import com.am.es.entity.ClueCanFollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClueCanFollowMapper {
    int countByExample(ClueCanFollowExample example);

    int deleteByExample(ClueCanFollowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClueCanFollow record);

    int insertSelective(ClueCanFollow record);

    List<ClueCanFollow> selectByExample(ClueCanFollowExample example);

    ClueCanFollow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClueCanFollow record, @Param("example") ClueCanFollowExample example);

    int updateByExample(@Param("record") ClueCanFollow record, @Param("example") ClueCanFollowExample example);

    int updateByPrimaryKeySelective(ClueCanFollow record);

    int updateByPrimaryKey(ClueCanFollow record);
}