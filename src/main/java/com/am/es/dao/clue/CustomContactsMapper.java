package com.am.es.dao.clue;

import com.am.es.entity.clue.CustomContacts;
import com.am.es.entity.clue.CustomContactsExample;
import java.util.List;

import com.am.es.model.CustomContactsVo;
import org.apache.ibatis.annotations.Param;

public interface CustomContactsMapper {
    int countByExample(CustomContactsExample example);

    int deleteByExample(CustomContactsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomContacts record);

    int insertSelective(CustomContacts record);

    List<CustomContacts> selectByExample(CustomContactsExample example);

    CustomContacts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomContacts record, @Param("example") CustomContactsExample example);

    int updateByExample(@Param("record") CustomContacts record, @Param("example") CustomContactsExample example);

    int updateByPrimaryKeySelective(CustomContacts record);

    int updateByPrimaryKey(CustomContacts record);

    List<CustomContactsVo> selectListByPrimaryKeyList(List<Integer> customerList);
}