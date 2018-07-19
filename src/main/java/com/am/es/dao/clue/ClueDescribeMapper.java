package com.am.es.dao.clue;

import com.am.es.entity.clue.ClueDescribe;
import com.am.es.entity.clue.ClueDescribeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClueDescribeMapper {
    int countByExample(ClueDescribeExample example);

    int deleteByExample(ClueDescribeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClueDescribe record);

    int insertSelective(ClueDescribe record);

    List<ClueDescribe> selectByExample(ClueDescribeExample example);

    ClueDescribe selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClueDescribe record, @Param("example") ClueDescribeExample example);

    int updateByExample(@Param("record") ClueDescribe record, @Param("example") ClueDescribeExample example);

    int updateByPrimaryKeySelective(ClueDescribe record);

    int updateByPrimaryKey(ClueDescribe record);
}