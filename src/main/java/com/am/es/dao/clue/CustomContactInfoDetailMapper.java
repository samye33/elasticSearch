package com.am.es.dao.clue;

import com.am.es.entity.clue.CustomContactInfoDetail;
import com.am.es.entity.clue.CustomContactInfoDetailExample;

import java.util.List;

import com.am.es.model.clue.CustomContactInfoDetailVo;
import org.apache.ibatis.annotations.Param;

public interface CustomContactInfoDetailMapper {
    int countByExample(CustomContactInfoDetailExample example);

    int deleteByExample(CustomContactInfoDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomContactInfoDetail record);

    int insertSelective(CustomContactInfoDetail record);

    List<CustomContactInfoDetail> selectByExample(CustomContactInfoDetailExample example);

    CustomContactInfoDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomContactInfoDetail record, @Param("example") CustomContactInfoDetailExample example);

    int updateByExample(@Param("record") CustomContactInfoDetail record, @Param("example") CustomContactInfoDetailExample example);

    int updateByPrimaryKeySelective(CustomContactInfoDetail record);

    int updateByPrimaryKey(CustomContactInfoDetail record);

    List<CustomContactInfoDetailVo> selectListByPrimaryKeyList(List<Integer> customerList);
}