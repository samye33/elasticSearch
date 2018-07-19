package com.am.es.dao.order;

import com.am.es.entity.order.OrderClueCustomStudentRelation;
import com.am.es.entity.order.OrderClueCustomStudentRelationExample;
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