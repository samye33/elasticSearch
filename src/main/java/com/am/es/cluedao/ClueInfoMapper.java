package com.am.es.cluedao;

import com.am.es.clueentity.ClueInfo;
import com.am.es.clueentity.ClueInfoExample;

import java.util.List;

import com.am.es.model.ClueInfoVo;
import org.apache.ibatis.annotations.Param;

public interface ClueInfoMapper {
    int countByExample(ClueInfoExample example);

    int deleteByExample(ClueInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClueInfo record);

    int insertSelective(ClueInfo record);

    List<ClueInfo> selectByExample(ClueInfoExample example);

    ClueInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClueInfo record, @Param("example") ClueInfoExample example);

    int updateByExample(@Param("record") ClueInfo record, @Param("example") ClueInfoExample example);

    int updateByPrimaryKeySelective(ClueInfo record);

    int updateByPrimaryKey(ClueInfo record);

    //传入的Integer的id为clueInfo表的id
    List<ClueInfoVo> selectListByPrimaryKeyList(List<Integer> clueInfoList);
}