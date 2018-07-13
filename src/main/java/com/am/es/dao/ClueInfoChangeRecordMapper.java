package com.am.es.dao;

import com.am.es.entity.ClueInfoChangeRecord;
import com.am.es.entity.ClueInfoChangeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClueInfoChangeRecordMapper {
    int countByExample(ClueInfoChangeRecordExample example);

    int deleteByExample(ClueInfoChangeRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClueInfoChangeRecord record);

    int insertSelective(ClueInfoChangeRecord record);

    List<ClueInfoChangeRecord> selectByExample(ClueInfoChangeRecordExample example);

    ClueInfoChangeRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClueInfoChangeRecord record, @Param("example") ClueInfoChangeRecordExample example);

    int updateByExample(@Param("record") ClueInfoChangeRecord record, @Param("example") ClueInfoChangeRecordExample example);

    int updateByPrimaryKeySelective(ClueInfoChangeRecord record);

    int updateByPrimaryKey(ClueInfoChangeRecord record);
}