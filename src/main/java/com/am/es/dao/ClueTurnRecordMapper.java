package com.am.es.dao;

import com.am.es.entity.ClueTurnRecord;
import com.am.es.entity.ClueTurnRecordExample;
import java.util.List;

import com.am.es.model.ClueTurnRecordVo;
import org.apache.ibatis.annotations.Param;

public interface ClueTurnRecordMapper {
    int countByExample(ClueTurnRecordExample example);

    int deleteByExample(ClueTurnRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClueTurnRecord record);

    int insertSelective(ClueTurnRecord record);

    List<ClueTurnRecord> selectByExample(ClueTurnRecordExample example);

    ClueTurnRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClueTurnRecord record, @Param("example") ClueTurnRecordExample example);

    int updateByExample(@Param("record") ClueTurnRecord record, @Param("example") ClueTurnRecordExample example);

    int updateByPrimaryKeySelective(ClueTurnRecord record);

    int updateByPrimaryKey(ClueTurnRecord record);

    List<ClueTurnRecordVo> selectListByPrimaryKeyList(List<Integer> clueInfoList);
}