package com.am.es.dao.clue;

import com.am.es.entity.clue.EsRecordId;

import java.util.List;

public interface EsRecordIdMapper {
    int insert(EsRecordId record);

    int insertSelective(EsRecordId record);

    List<EsRecordId> selectAllLimit();

    int updateFlagByAll(EsRecordId record);

    int deleteByIdTypeForm(EsRecordId record);
}