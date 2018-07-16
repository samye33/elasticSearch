package com.am.es.orderdao;

import com.am.es.model.OrderInfoVo;
import com.am.es.model.OrderSerialVo;
import com.am.es.orderentity.OrderSerial;
import com.am.es.orderentity.OrderSerialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderSerialMapper {
    int countByExample(OrderSerialExample example);

    int deleteByExample(OrderSerialExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderSerial record);

    int insertSelective(OrderSerial record);

    List<OrderSerial> selectByExample(OrderSerialExample example);

    OrderSerial selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderSerial record, @Param("example") OrderSerialExample example);

    int updateByExample(@Param("record") OrderSerial record, @Param("example") OrderSerialExample example);

    int updateByPrimaryKeySelective(OrderSerial record);

    int updateByPrimaryKey(OrderSerial record);

    List<OrderSerialVo> selectListByPrimaryKeyList(List<Integer> orderList);
}