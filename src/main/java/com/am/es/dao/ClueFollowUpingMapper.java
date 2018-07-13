package com.am.es.dao;

import com.am.es.entity.ClueFollowUping;
import com.am.es.entity.ClueFollowUpingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClueFollowUpingMapper {
    int countByExample(ClueFollowUpingExample example);

    int deleteByExample(ClueFollowUpingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClueFollowUping record);

    int insertSelective(ClueFollowUping record);

    List<ClueFollowUping> selectByExample(ClueFollowUpingExample example);

    ClueFollowUping selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClueFollowUping record, @Param("example") ClueFollowUpingExample example);

    int updateByExample(@Param("record") ClueFollowUping record, @Param("example") ClueFollowUpingExample example);

    int updateByPrimaryKeySelective(ClueFollowUping record);

    int updateByPrimaryKey(ClueFollowUping record);
}