package com.am.es.orderdao;

import com.am.es.orderentity.OrderClueCustomStudentRelation;
import com.am.es.orderentity.OrderClueCustomStudentRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderClueCustomStudentRelationMapper {
    int countByExample(OrderClueCustomStudentRelationExample example);

    int deleteByExample(OrderClueCustomStudentRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderClueCustomStudentRelation record);

    int insertSelective(OrderClueCustomStudentRelation record);

    List<OrderClueCustomStudentRelation> selectByExample(OrderClueCustomStudentRelationExample example);

    OrderClueCustomStudentRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderClueCustomStudentRelation record, @Param("example") OrderClueCustomStudentRelationExample example);

    int updateByExample(@Param("record") OrderClueCustomStudentRelation record, @Param("example") OrderClueCustomStudentRelationExample example);

    int updateByPrimaryKeySelective(OrderClueCustomStudentRelation record);

    int updateByPrimaryKey(OrderClueCustomStudentRelation record);
}