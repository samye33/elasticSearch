package com.am.es.dao;

import com.am.es.entity.ClueCommunicateRecord;
import com.am.es.entity.ClueCommunicateRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClueCommunicateRecordMapper {
    int countByExample(ClueCommunicateRecordExample example);

    int deleteByExample(ClueCommunicateRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClueCommunicateRecord record);

    int insertSelective(ClueCommunicateRecord record);

    List<ClueCommunicateRecord> selectByExampleWithBLOBs(ClueCommunicateRecordExample example);

    List<ClueCommunicateRecord> selectByExample(ClueCommunicateRecordExample example);

    ClueCommunicateRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClueCommunicateRecord record, @Param("example") ClueCommunicateRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") ClueCommunicateRecord record, @Param("example") ClueCommunicateRecordExample example);

    int updateByExample(@Param("record") ClueCommunicateRecord record, @Param("example") ClueCommunicateRecordExample example);

    int updateByPrimaryKeySelective(ClueCommunicateRecord record);

    int updateByPrimaryKeyWithBLOBs(ClueCommunicateRecord record);

    int updateByPrimaryKey(ClueCommunicateRecord record);
}