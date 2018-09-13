package com.am.es.dao.clue;

import com.am.es.entity.clue.EsRecordId;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EsRecordIdMapper {
    int insert(EsRecordId record);

    int insertSelective(EsRecordId record);

    List<EsRecordId> selectAllLimit();

    int updateFlagByAll(Map map);

    int deleteByIdTypeForm(Map map);

    List<Integer> selectByCondition(@Param("form") String form, @Param("type") Integer type);
}