package com.am.es.cluedao;

import com.am.es.clueentity.ClueOwnerRecord;
import com.am.es.clueentity.ClueOwnerRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClueOwnerRecordMapper {
    int countByExample(ClueOwnerRecordExample example);

    int deleteByExample(ClueOwnerRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClueOwnerRecord record);

    int insertSelective(ClueOwnerRecord record);

    List<ClueOwnerRecord> selectByExample(ClueOwnerRecordExample example);

    ClueOwnerRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClueOwnerRecord record, @Param("example") ClueOwnerRecordExample example);

    int updateByExample(@Param("record") ClueOwnerRecord record, @Param("example") ClueOwnerRecordExample example);

    int updateByPrimaryKeySelective(ClueOwnerRecord record);

    int updateByPrimaryKey(ClueOwnerRecord record);
}