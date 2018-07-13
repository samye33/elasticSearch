package com.am.es.dao;

import com.am.es.entity.ClueLabel;
import com.am.es.entity.ClueLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClueLabelMapper {
    int countByExample(ClueLabelExample example);

    int deleteByExample(ClueLabelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClueLabel record);

    int insertSelective(ClueLabel record);

    List<ClueLabel> selectByExample(ClueLabelExample example);

    ClueLabel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClueLabel record, @Param("example") ClueLabelExample example);

    int updateByExample(@Param("record") ClueLabel record, @Param("example") ClueLabelExample example);

    int updateByPrimaryKeySelective(ClueLabel record);

    int updateByPrimaryKey(ClueLabel record);
}