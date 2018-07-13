package com.am.es.dao;

import com.am.es.entity.ClueRepeatConsult;
import com.am.es.entity.ClueRepeatConsultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClueRepeatConsultMapper {
    int countByExample(ClueRepeatConsultExample example);

    int deleteByExample(ClueRepeatConsultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClueRepeatConsult record);

    int insertSelective(ClueRepeatConsult record);

    List<ClueRepeatConsult> selectByExampleWithBLOBs(ClueRepeatConsultExample example);

    List<ClueRepeatConsult> selectByExample(ClueRepeatConsultExample example);

    ClueRepeatConsult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClueRepeatConsult record, @Param("example") ClueRepeatConsultExample example);

    int updateByExampleWithBLOBs(@Param("record") ClueRepeatConsult record, @Param("example") ClueRepeatConsultExample example);

    int updateByExample(@Param("record") ClueRepeatConsult record, @Param("example") ClueRepeatConsultExample example);

    int updateByPrimaryKeySelective(ClueRepeatConsult record);

    int updateByPrimaryKeyWithBLOBs(ClueRepeatConsult record);

    int updateByPrimaryKey(ClueRepeatConsult record);
}