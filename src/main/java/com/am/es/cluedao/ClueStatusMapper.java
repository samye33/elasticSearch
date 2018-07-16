package com.am.es.cluedao;

import com.am.es.clueentity.ClueStatus;
import com.am.es.clueentity.ClueStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClueStatusMapper {
    int countByExample(ClueStatusExample example);

    int deleteByExample(ClueStatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClueStatus record);

    int insertSelective(ClueStatus record);

    List<ClueStatus> selectByExample(ClueStatusExample example);

    ClueStatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClueStatus record, @Param("example") ClueStatusExample example);

    int updateByExample(@Param("record") ClueStatus record, @Param("example") ClueStatusExample example);

    int updateByPrimaryKeySelective(ClueStatus record);

    int updateByPrimaryKey(ClueStatus record);
}