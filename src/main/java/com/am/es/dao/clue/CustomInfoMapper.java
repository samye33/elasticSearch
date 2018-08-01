package com.am.es.dao.clue;

import com.am.es.entity.clue.CustomInfo;
import com.am.es.entity.clue.CustomInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomInfoMapper {
    int countByExample(CustomInfoExample example);

    int deleteByExample(CustomInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomInfo record);

    int insertSelective(CustomInfo record);

    List<CustomInfo> selectByExample(CustomInfoExample example);

    CustomInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomInfo record, @Param("example") CustomInfoExample example);

    int updateByExample(@Param("record") CustomInfo record, @Param("example") CustomInfoExample example);

    int updateByPrimaryKeySelective(CustomInfo record);

    int updateByPrimaryKey(CustomInfo record);

}