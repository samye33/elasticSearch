package com.am.es.dao;

import com.am.es.entity.ClueCallRecord;
import com.am.es.entity.ClueCallRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClueCallRecordMapper {
    int countByExample(ClueCallRecordExample example);

    int deleteByExample(ClueCallRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClueCallRecord record);

    int insertSelective(ClueCallRecord record);

    List<ClueCallRecord> selectByExample(ClueCallRecordExample example);

    ClueCallRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClueCallRecord record, @Param("example") ClueCallRecordExample example);

    int updateByExample(@Param("record") ClueCallRecord record, @Param("example") ClueCallRecordExample example);

    int updateByPrimaryKeySelective(ClueCallRecord record);

    int updateByPrimaryKey(ClueCallRecord record);
}