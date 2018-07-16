package com.am.es.clueentity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClueOperateRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClueOperateRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andClueIdIsNull() {
            addCriterion("clue_id is null");
            return (Criteria) this;
        }

        public Criteria andClueIdIsNotNull() {
            addCriterion("clue_id is not null");
            return (Criteria) this;
        }

        public Criteria andClueIdEqualTo(Integer value) {
            addCriterion("clue_id =", value, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdNotEqualTo(Integer value) {
            addCriterion("clue_id <>", value, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdGreaterThan(Integer value) {
            addCriterion("clue_id >", value, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("clue_id >=", value, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdLessThan(Integer value) {
            addCriterion("clue_id <", value, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdLessThanOrEqualTo(Integer value) {
            addCriterion("clue_id <=", value, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdIn(List<Integer> values) {
            addCriterion("clue_id in", values, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdNotIn(List<Integer> values) {
            addCriterion("clue_id not in", values, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdBetween(Integer value1, Integer value2) {
            addCriterion("clue_id between", value1, value2, "clueId");
            return (Criteria) this;
        }

        public Criteria andClueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("clue_id not between", value1, value2, "clueId");
            return (Criteria) this;
        }

        public Criteria andCustomIdIsNull() {
            addCriterion("custom_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomIdIsNotNull() {
            addCriterion("custom_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomIdEqualTo(Integer value) {
            addCriterion("custom_id =", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotEqualTo(Integer value) {
            addCriterion("custom_id <>", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdGreaterThan(Integer value) {
            addCriterion("custom_id >", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("custom_id >=", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdLessThan(Integer value) {
            addCriterion("custom_id <", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdLessThanOrEqualTo(Integer value) {
            addCriterion("custom_id <=", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdIn(List<Integer> values) {
            addCriterion("custom_id in", values, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotIn(List<Integer> values) {
            addCriterion("custom_id not in", values, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdBetween(Integer value1, Integer value2) {
            addCriterion("custom_id between", value1, value2, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("custom_id not between", value1, value2, "customId");
            return (Criteria) this;
        }

        public Criteria andOperatingIsNull() {
            addCriterion("operating is null");
            return (Criteria) this;
        }

        public Criteria andOperatingIsNotNull() {
            addCriterion("operating is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingEqualTo(Integer value) {
            addCriterion("operating =", value, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingNotEqualTo(Integer value) {
            addCriterion("operating <>", value, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingGreaterThan(Integer value) {
            addCriterion("operating >", value, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingGreaterThanOrEqualTo(Integer value) {
            addCriterion("operating >=", value, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingLessThan(Integer value) {
            addCriterion("operating <", value, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingLessThanOrEqualTo(Integer value) {
            addCriterion("operating <=", value, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingIn(List<Integer> values) {
            addCriterion("operating in", values, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingNotIn(List<Integer> values) {
            addCriterion("operating not in", values, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingBetween(Integer value1, Integer value2) {
            addCriterion("operating between", value1, value2, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingNotBetween(Integer value1, Integer value2) {
            addCriterion("operating not between", value1, value2, "operating");
            return (Criteria) this;
        }

        public Criteria andOperateDataIsNull() {
            addCriterion("operate_data is null");
            return (Criteria) this;
        }

        public Criteria andOperateDataIsNotNull() {
            addCriterion("operate_data is not null");
            return (Criteria) this;
        }

        public Criteria andOperateDataEqualTo(String value) {
            addCriterion("operate_data =", value, "operateData");
            return (Criteria) this;
        }

        public Criteria andOperateDataNotEqualTo(String value) {
            addCriterion("operate_data <>", value, "operateData");
            return (Criteria) this;
        }

        public Criteria andOperateDataGreaterThan(String value) {
            addCriterion("operate_data >", value, "operateData");
            return (Criteria) this;
        }

        public Criteria andOperateDataGreaterThanOrEqualTo(String value) {
            addCriterion("operate_data >=", value, "operateData");
            return (Criteria) this;
        }

        public Criteria andOperateDataLessThan(String value) {
            addCriterion("operate_data <", value, "operateData");
            return (Criteria) this;
        }

        public Criteria andOperateDataLessThanOrEqualTo(String value) {
            addCriterion("operate_data <=", value, "operateData");
            return (Criteria) this;
        }

        public Criteria andOperateDataLike(String value) {
            addCriterion("operate_data like", value, "operateData");
            return (Criteria) this;
        }

        public Criteria andOperateDataNotLike(String value) {
            addCriterion("operate_data not like", value, "operateData");
            return (Criteria) this;
        }

        public Criteria andOperateDataIn(List<String> values) {
            addCriterion("operate_data in", values, "operateData");
            return (Criteria) this;
        }

        public Criteria andOperateDataNotIn(List<String> values) {
            addCriterion("operate_data not in", values, "operateData");
            return (Criteria) this;
        }

        public Criteria andOperateDataBetween(String value1, String value2) {
            addCriterion("operate_data between", value1, value2, "operateData");
            return (Criteria) this;
        }

        public Criteria andOperateDataNotBetween(String value1, String value2) {
            addCriterion("operate_data not between", value1, value2, "operateData");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Integer value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Integer value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Integer value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Integer value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Integer value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Integer> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Integer> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Integer value1, Integer value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Integer value1, Integer value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}