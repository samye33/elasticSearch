package com.am.es.dao.clue;

import com.am.es.entity.clue.ClueOperateRecord;
import com.am.es.entity.clue.ClueOperateRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClueOperateRecordMapper {
    int countByExample(ClueOperateRecordExample example);

    int deleteByExample(ClueOperateRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClueOperateRecord record);

    int insertSelective(ClueOperateRecord record);

    List<ClueOperateRecord> selectByExample(ClueOperateRecordExample example);

    ClueOperateRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClueOperateRecord record, @Param("example") ClueOperateRecordExample example);

    int updateByExample(@Param("record") ClueOperateRecord record, @Param("example") ClueOperateRecordExample example);

    int updateByPrimaryKeySelective(ClueOperateRecord record);

    int updateByPrimaryKey(ClueOperateRecord record);
}