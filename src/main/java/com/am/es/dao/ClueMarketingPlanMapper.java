package com.am.es.dao;

import com.am.es.entity.ClueMarketingPlan;
import com.am.es.entity.ClueMarketingPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClueMarketingPlanMapper {
    int countByExample(ClueMarketingPlanExample example);

    int deleteByExample(ClueMarketingPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClueMarketingPlan record);

    int insertSelective(ClueMarketingPlan record);

    List<ClueMarketingPlan> selectByExample(ClueMarketingPlanExample example);

    ClueMarketingPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClueMarketingPlan record, @Param("example") ClueMarketingPlanExample example);

    int updateByExample(@Param("record") ClueMarketingPlan record, @Param("example") ClueMarketingPlanExample example);

    int updateByPrimaryKeySelective(ClueMarketingPlan record);

    int updateByPrimaryKey(ClueMarketingPlan record);
}