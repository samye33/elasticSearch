package com.am.es.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClueRepeatConsultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClueRepeatConsultExample() {
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

        public Criteria andConsultChannelIdIsNull() {
            addCriterion("consult_channel_id is null");
            return (Criteria) this;
        }

        public Criteria andConsultChannelIdIsNotNull() {
            addCriterion("consult_channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsultChannelIdEqualTo(Integer value) {
            addCriterion("consult_channel_id =", value, "consultChannelId");
            return (Criteria) this;
        }

        public Criteria andConsultChannelIdNotEqualTo(Integer value) {
            addCriterion("consult_channel_id <>", value, "consultChannelId");
            return (Criteria) this;
        }

        public Criteria andConsultChannelIdGreaterThan(Integer value) {
            addCriterion("consult_channel_id >", value, "consultChannelId");
            return (Criteria) this;
        }

        public Criteria andConsultChannelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("consult_channel_id >=", value, "consultChannelId");
            return (Criteria) this;
        }

        public Criteria andConsultChannelIdLessThan(Integer value) {
            addCriterion("consult_channel_id <", value, "consultChannelId");
            return (Criteria) this;
        }

        public Criteria andConsultChannelIdLessThanOrEqualTo(Integer value) {
            addCriterion("consult_channel_id <=", value, "consultChannelId");
            return (Criteria) this;
        }

        public Criteria andConsultChannelIdIn(List<Integer> values) {
            addCriterion("consult_channel_id in", values, "consultChannelId");
            return (Criteria) this;
        }

        public Criteria andConsultChannelIdNotIn(List<Integer> values) {
            addCriterion("consult_channel_id not in", values, "consultChannelId");
            return (Criteria) this;
        }

        public Criteria andConsultChannelIdBetween(Integer value1, Integer value2) {
            addCriterion("consult_channel_id between", value1, value2, "consultChannelId");
            return (Criteria) this;
        }

        public Criteria andConsultChannelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("consult_channel_id not between", value1, value2, "consultChannelId");
            return (Criteria) this;
        }

        public Criteria andConsultUserIsNull() {
            addCriterion("consult_user is null");
            return (Criteria) this;
        }

        public Criteria andConsultUserIsNotNull() {
            addCriterion("consult_user is not null");
            return (Criteria) this;
        }

        public Criteria andConsultUserEqualTo(Integer value) {
            addCriterion("consult_user =", value, "consultUser");
            return (Criteria) this;
        }

        public Criteria andConsultUserNotEqualTo(Integer value) {
            addCriterion("consult_user <>", value, "consultUser");
            return (Criteria) this;
        }

        public Criteria andConsultUserGreaterThan(Integer value) {
            addCriterion("consult_user >", value, "consultUser");
            return (Criteria) this;
        }

        public Criteria andConsultUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("consult_user >=", value, "consultUser");
            return (Criteria) this;
        }

        public Criteria andConsultUserLessThan(Integer value) {
            addCriterion("consult_user <", value, "consultUser");
            return (Criteria) this;
        }

        public Criteria andConsultUserLessThanOrEqualTo(Integer value) {
            addCriterion("consult_user <=", value, "consultUser");
            return (Criteria) this;
        }

        public Criteria andConsultUserIn(List<Integer> values) {
            addCriterion("consult_user in", values, "consultUser");
            return (Criteria) this;
        }

        public Criteria andConsultUserNotIn(List<Integer> values) {
            addCriterion("consult_user not in", values, "consultUser");
            return (Criteria) this;
        }

        public Criteria andConsultUserBetween(Integer value1, Integer value2) {
            addCriterion("consult_user between", value1, value2, "consultUser");
            return (Criteria) this;
        }

        public Criteria andConsultUserNotBetween(Integer value1, Integer value2) {
            addCriterion("consult_user not between", value1, value2, "consultUser");
            return (Criteria) this;
        }

        public Criteria andConsultTimeIsNull() {
            addCriterion("consult_time is null");
            return (Criteria) this;
        }

        public Criteria andConsultTimeIsNotNull() {
            addCriterion("consult_time is not null");
            return (Criteria) this;
        }

        public Criteria andConsultTimeEqualTo(Date value) {
            addCriterion("consult_time =", value, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeNotEqualTo(Date value) {
            addCriterion("consult_time <>", value, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeGreaterThan(Date value) {
            addCriterion("consult_time >", value, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("consult_time >=", value, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeLessThan(Date value) {
            addCriterion("consult_time <", value, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeLessThanOrEqualTo(Date value) {
            addCriterion("consult_time <=", value, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeIn(List<Date> values) {
            addCriterion("consult_time in", values, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeNotIn(List<Date> values) {
            addCriterion("consult_time not in", values, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeBetween(Date value1, Date value2) {
            addCriterion("consult_time between", value1, value2, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeNotBetween(Date value1, Date value2) {
            addCriterion("consult_time not between", value1, value2, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultWayIsNull() {
            addCriterion("consult_way is null");
            return (Criteria) this;
        }

        public Criteria andConsultWayIsNotNull() {
            addCriterion("consult_way is not null");
            return (Criteria) this;
        }

        public Criteria andConsultWayEqualTo(Integer value) {
            addCriterion("consult_way =", value, "consultWay");
            return (Criteria) this;
        }

        public Criteria andConsultWayNotEqualTo(Integer value) {
            addCriterion("consult_way <>", value, "consultWay");
            return (Criteria) this;
        }

        public Criteria andConsultWayGreaterThan(Integer value) {
            addCriterion("consult_way >", value, "consultWay");
            return (Criteria) this;
        }

        public Criteria andConsultWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("consult_way >=", value, "consultWay");
            return (Criteria) this;
        }

        public Criteria andConsultWayLessThan(Integer value) {
            addCriterion("consult_way <", value, "consultWay");
            return (Criteria) this;
        }

        public Criteria andConsultWayLessThanOrEqualTo(Integer value) {
            addCriterion("consult_way <=", value, "consultWay");
            return (Criteria) this;
        }

        public Criteria andConsultWayIn(List<Integer> values) {
            addCriterion("consult_way in", values, "consultWay");
            return (Criteria) this;
        }

        public Criteria andConsultWayNotIn(List<Integer> values) {
            addCriterion("consult_way not in", values, "consultWay");
            return (Criteria) this;
        }

        public Criteria andConsultWayBetween(Integer value1, Integer value2) {
            addCriterion("consult_way between", value1, value2, "consultWay");
            return (Criteria) this;
        }

        public Criteria andConsultWayNotBetween(Integer value1, Integer value2) {
            addCriterion("consult_way not between", value1, value2, "consultWay");
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