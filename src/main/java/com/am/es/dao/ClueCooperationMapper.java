package com.am.es.dao;

import com.am.es.entity.ClueCooperation;
import com.am.es.entity.ClueCooperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClueCooperationMapper {
    int countByExample(ClueCooperationExample example);

    int deleteByExample(ClueCooperationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClueCooperation record);

    int insertSelective(ClueCooperation record);

    List<ClueCooperation> selectByExample(ClueCooperationExample example);

    ClueCooperation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClueCooperation record, @Param("example") ClueCooperationExample example);

    int updateByExample(@Param("record") ClueCooperation record, @Param("example") ClueCooperationExample example);

    int updateByPrimaryKeySelective(ClueCooperation record);

    int updateByPrimaryKey(ClueCooperation record);
}