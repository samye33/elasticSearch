package com.am.es.dao;

import com.am.es.entity.ClueMergerRecord;
import com.am.es.entity.ClueMergerRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClueMergerRecordMapper {
    int countByExample(ClueMergerRecordExample example);

    int deleteByExample(ClueMergerRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClueMergerRecord record);

    int insertSelective(ClueMergerRecord record);

    List<ClueMergerRecord> selectByExampleWithBLOBs(ClueMergerRecordExample example);

    List<ClueMergerRecord> selectByExample(ClueMergerRecordExample example);

    ClueMergerRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClueMergerRecord record, @Param("example") ClueMergerRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") ClueMergerRecord record, @Param("example") ClueMergerRecordExample example);

    int updateByExample(@Param("record") ClueMergerRecord record, @Param("example") ClueMergerRecordExample example);

    int updateByPrimaryKeySelective(ClueMergerRecord record);

    int updateByPrimaryKeyWithBLOBs(ClueMergerRecord record);

    int updateByPrimaryKey(ClueMergerRecord record);
}