package com.am.es.clueentity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClueTurnRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClueTurnRecordExample() {
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

        public Criteria andCustomNoIsNull() {
            addCriterion("custom_no is null");
            return (Criteria) this;
        }

        public Criteria andCustomNoIsNotNull() {
            addCriterion("custom_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustomNoEqualTo(String value) {
            addCriterion("custom_no =", value, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoNotEqualTo(String value) {
            addCriterion("custom_no <>", value, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoGreaterThan(String value) {
            addCriterion("custom_no >", value, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoGreaterThanOrEqualTo(String value) {
            addCriterion("custom_no >=", value, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoLessThan(String value) {
            addCriterion("custom_no <", value, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoLessThanOrEqualTo(String value) {
            addCriterion("custom_no <=", value, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoLike(String value) {
            addCriterion("custom_no like", value, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoNotLike(String value) {
            addCriterion("custom_no not like", value, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoIn(List<String> values) {
            addCriterion("custom_no in", values, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoNotIn(List<String> values) {
            addCriterion("custom_no not in", values, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoBetween(String value1, String value2) {
            addCriterion("custom_no between", value1, value2, "customNo");
            return (Criteria) this;
        }

        public Criteria andCustomNoNotBetween(String value1, String value2) {
            addCriterion("custom_no not between", value1, value2, "customNo");
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

        public Criteria andClueNoIsNull() {
            addCriterion("clue_no is null");
            return (Criteria) this;
        }

        public Criteria andClueNoIsNotNull() {
            addCriterion("clue_no is not null");
            return (Criteria) this;
        }

        public Criteria andClueNoEqualTo(String value) {
            addCriterion("clue_no =", value, "clueNo");
            return (Criteria) this;
        }

        public Criteria andClueNoNotEqualTo(String value) {
            addCriterion("clue_no <>", value, "clueNo");
            return (Criteria) this;
        }

        public Criteria andClueNoGreaterThan(String value) {
            addCriterion("clue_no >", value, "clueNo");
            return (Criteria) this;
        }

        public Criteria andClueNoGreaterThanOrEqualTo(String value) {
            addCriterion("clue_no >=", value, "clueNo");
            return (Criteria) this;
        }

        public Criteria andClueNoLessThan(String value) {
            addCriterion("clue_no <", value, "clueNo");
            return (Criteria) this;
        }

        public Criteria andClueNoLessThanOrEqualTo(String value) {
            addCriterion("clue_no <=", value, "clueNo");
            return (Criteria) this;
        }

        public Criteria andClueNoLike(String value) {
            addCriterion("clue_no like", value, "clueNo");
            return (Criteria) this;
        }

        public Criteria andClueNoNotLike(String value) {
            addCriterion("clue_no not like", value, "clueNo");
            return (Criteria) this;
        }

        public Criteria andClueNoIn(List<String> values) {
            addCriterion("clue_no in", values, "clueNo");
            return (Criteria) this;
        }

        public Criteria andClueNoNotIn(List<String> values) {
            addCriterion("clue_no not in", values, "clueNo");
            return (Criteria) this;
        }

        public Criteria andClueNoBetween(String value1, String value2) {
            addCriterion("clue_no between", value1, value2, "clueNo");
            return (Criteria) this;
        }

        public Criteria andClueNoNotBetween(String value1, String value2) {
            addCriterion("clue_no not between", value1, value2, "clueNo");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andPreGroupIdIsNull() {
            addCriterion("pre_group_id is null");
            return (Criteria) this;
        }

        public Criteria andPreGroupIdIsNotNull() {
            addCriterion("pre_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andPreGroupIdEqualTo(Integer value) {
            addCriterion("pre_group_id =", value, "preGroupId");
            return (Criteria) this;
        }

        public Criteria andPreGroupIdNotEqualTo(Integer value) {
            addCriterion("pre_group_id <>", value, "preGroupId");
            return (Criteria) this;
        }

        public Criteria andPreGroupIdGreaterThan(Integer value) {
            addCriterion("pre_group_id >", value, "preGroupId");
            return (Criteria) this;
        }

        public Criteria andPreGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pre_group_id >=", value, "preGroupId");
            return (Criteria) this;
        }

        public Criteria andPreGroupIdLessThan(Integer value) {
            addCriterion("pre_group_id <", value, "preGroupId");
            return (Criteria) this;
        }

        public Criteria andPreGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("pre_group_id <=", value, "preGroupId");
            return (Criteria) this;
        }

        public Criteria andPreGroupIdIn(List<Integer> values) {
            addCriterion("pre_group_id in", values, "preGroupId");
            return (Criteria) this;
        }

        public Criteria andPreGroupIdNotIn(List<Integer> values) {
            addCriterion("pre_group_id not in", values, "preGroupId");
            return (Criteria) this;
        }

        public Criteria andPreGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("pre_group_id between", value1, value2, "preGroupId");
            return (Criteria) this;
        }

        public Criteria andPreGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pre_group_id not between", value1, value2, "preGroupId");
            return (Criteria) this;
        }

        public Criteria andPreUserIdIsNull() {
            addCriterion("pre_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPreUserIdIsNotNull() {
            addCriterion("pre_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPreUserIdEqualTo(Integer value) {
            addCriterion("pre_user_id =", value, "preUserId");
            return (Criteria) this;
        }

        public Criteria andPreUserIdNotEqualTo(Integer value) {
            addCriterion("pre_user_id <>", value, "preUserId");
            return (Criteria) this;
        }

        public Criteria andPreUserIdGreaterThan(Integer value) {
            addCriterion("pre_user_id >", value, "preUserId");
            return (Criteria) this;
        }

        public Criteria andPreUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pre_user_id >=", value, "preUserId");
            return (Criteria) this;
        }

        public Criteria andPreUserIdLessThan(Integer value) {
            addCriterion("pre_user_id <", value, "preUserId");
            return (Criteria) this;
        }

        public Criteria andPreUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("pre_user_id <=", value, "preUserId");
            return (Criteria) this;
        }

        public Criteria andPreUserIdIn(List<Integer> values) {
            addCriterion("pre_user_id in", values, "preUserId");
            return (Criteria) this;
        }

        public Criteria andPreUserIdNotIn(List<Integer> values) {
            addCriterion("pre_user_id not in", values, "preUserId");
            return (Criteria) this;
        }

        public Criteria andPreUserIdBetween(Integer value1, Integer value2) {
            addCriterion("pre_user_id between", value1, value2, "preUserId");
            return (Criteria) this;
        }

        public Criteria andPreUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pre_user_id not between", value1, value2, "preUserId");
            return (Criteria) this;
        }

        public Criteria andCurrentUserIdIsNull() {
            addCriterion("current_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrentUserIdIsNotNull() {
            addCriterion("current_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentUserIdEqualTo(Integer value) {
            addCriterion("current_user_id =", value, "currentUserId");
            return (Criteria) this;
        }

        public Criteria andCurrentUserIdNotEqualTo(Integer value) {
            addCriterion("current_user_id <>", value, "currentUserId");
            return (Criteria) this;
        }

        public Criteria andCurrentUserIdGreaterThan(Integer value) {
            addCriterion("current_user_id >", value, "currentUserId");
            return (Criteria) this;
        }

        public Criteria andCurrentUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_user_id >=", value, "currentUserId");
            return (Criteria) this;
        }

        public Criteria andCurrentUserIdLessThan(Integer value) {
            addCriterion("current_user_id <", value, "currentUserId");
            return (Criteria) this;
        }

        public Criteria andCurrentUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("current_user_id <=", value, "currentUserId");
            return (Criteria) this;
        }

        public Criteria andCurrentUserIdIn(List<Integer> values) {
            addCriterion("current_user_id in", values, "currentUserId");
            return (Criteria) this;
        }

        public Criteria andCurrentUserIdNotIn(List<Integer> values) {
            addCriterion("current_user_id not in", values, "currentUserId");
            return (Criteria) this;
        }

        public Criteria andCurrentUserIdBetween(Integer value1, Integer value2) {
            addCriterion("current_user_id between", value1, value2, "currentUserId");
            return (Criteria) this;
        }

        public Criteria andCurrentUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("current_user_id not between", value1, value2, "currentUserId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdIsNull() {
            addCriterion("current_group_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdIsNotNull() {
            addCriterion("current_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdEqualTo(Integer value) {
            addCriterion("current_group_id =", value, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdNotEqualTo(Integer value) {
            addCriterion("current_group_id <>", value, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdGreaterThan(Integer value) {
            addCriterion("current_group_id >", value, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_group_id >=", value, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdLessThan(Integer value) {
            addCriterion("current_group_id <", value, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("current_group_id <=", value, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdIn(List<Integer> values) {
            addCriterion("current_group_id in", values, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdNotIn(List<Integer> values) {
            addCriterion("current_group_id not in", values, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("current_group_id between", value1, value2, "currentGroupId");
            return (Criteria) this;
        }

        public Criteria andCurrentGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("current_group_id not between", value1, value2, "currentGroupId");
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

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Integer value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Integer value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Integer value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Integer value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Integer value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Integer> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Integer> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Integer value1, Integer value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Integer value1, Integer value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andPreClueStatusIsNull() {
            addCriterion("pre_clue_status is null");
            return (Criteria) this;
        }

        public Criteria andPreClueStatusIsNotNull() {
            addCriterion("pre_clue_status is not null");
            return (Criteria) this;
        }

        public Criteria andPreClueStatusEqualTo(String value) {
            addCriterion("pre_clue_status =", value, "preClueStatus");
            return (Criteria) this;
        }

        public Criteria andPreClueStatusNotEqualTo(String value) {
            addCriterion("pre_clue_status <>", value, "preClueStatus");
            return (Criteria) this;
        }

        public Criteria andPreClueStatusGreaterThan(String value) {
            addCriterion("pre_clue_status >", value, "preClueStatus");
            return (Criteria) this;
        }

        public Criteria andPreClueStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pre_clue_status >=", value, "preClueStatus");
            return (Criteria) this;
        }

        public Criteria andPreClueStatusLessThan(String value) {
            addCriterion("pre_clue_status <", value, "preClueStatus");
            return (Criteria) this;
        }

        public Criteria andPreClueStatusLessThanOrEqualTo(String value) {
            addCriterion("pre_clue_status <=", value, "preClueStatus");
            return (Criteria) this;
        }

        public Criteria andPreClueStatusLike(String value) {
            addCriterion("pre_clue_status like", value, "preClueStatus");
            return (Criteria) this;
        }

        public Criteria andPreClueStatusNotLike(String value) {
            addCriterion("pre_clue_status not like", value, "preClueStatus");
            return (Criteria) this;
        }

        public Criteria andPreClueStatusIn(List<String> values) {
            addCriterion("pre_clue_status in", values, "preClueStatus");
            return (Criteria) this;
        }

        public Criteria andPreClueStatusNotIn(List<String> values) {
            addCriterion("pre_clue_status not in", values, "preClueStatus");
            return (Criteria) this;
        }

        public Criteria andPreClueStatusBetween(String value1, String value2) {
            addCriterion("pre_clue_status between", value1, value2, "preClueStatus");
            return (Criteria) this;
        }

        public Criteria andPreClueStatusNotBetween(String value1, String value2) {
            addCriterion("pre_clue_status not between", value1, value2, "preClueStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentClueStatusIsNull() {
            addCriterion("current_clue_status is null");
            return (Criteria) this;
        }

        public Criteria andCurrentClueStatusIsNotNull() {
            addCriterion("current_clue_status is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentClueStatusEqualTo(String value) {
            addCriterion("current_clue_status =", value, "currentClueStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentClueStatusNotEqualTo(String value) {
            addCriterion("current_clue_status <>", value, "currentClueStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentClueStatusGreaterThan(String value) {
            addCriterion("current_clue_status >", value, "currentClueStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentClueStatusGreaterThanOrEqualTo(String value) {
            addCriterion("current_clue_status >=", value, "currentClueStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentClueStatusLessThan(String value) {
            addCriterion("current_clue_status <", value, "currentClueStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentClueStatusLessThanOrEqualTo(String value) {
            addCriterion("current_clue_status <=", value, "currentClueStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentClueStatusLike(String value) {
            addCriterion("current_clue_status like", value, "currentClueStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentClueStatusNotLike(String value) {
            addCriterion("current_clue_status not like", value, "currentClueStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentClueStatusIn(List<String> values) {
            addCriterion("current_clue_status in", values, "currentClueStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentClueStatusNotIn(List<String> values) {
            addCriterion("current_clue_status not in", values, "currentClueStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentClueStatusBetween(String value1, String value2) {
            addCriterion("current_clue_status between", value1, value2, "currentClueStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentClueStatusNotBetween(String value1, String value2) {
            addCriterion("current_clue_status not between", value1, value2, "currentClueStatus");
            return (Criteria) this;
        }

        public Criteria andClueTurnTypeIsNull() {
            addCriterion("clue_turn_type is null");
            return (Criteria) this;
        }

        public Criteria andClueTurnTypeIsNotNull() {
            addCriterion("clue_turn_type is not null");
            return (Criteria) this;
        }

        public Criteria andClueTurnTypeEqualTo(Integer value) {
            addCriterion("clue_turn_type =", value, "clueTurnType");
            return (Criteria) this;
        }

        public Criteria andClueTurnTypeNotEqualTo(Integer value) {
            addCriterion("clue_turn_type <>", value, "clueTurnType");
            return (Criteria) this;
        }

        public Criteria andClueTurnTypeGreaterThan(Integer value) {
            addCriterion("clue_turn_type >", value, "clueTurnType");
            return (Criteria) this;
        }

        public Criteria andClueTurnTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("clue_turn_type >=", value, "clueTurnType");
            return (Criteria) this;
        }

        public Criteria andClueTurnTypeLessThan(Integer value) {
            addCriterion("clue_turn_type <", value, "clueTurnType");
            return (Criteria) this;
        }

        public Criteria andClueTurnTypeLessThanOrEqualTo(Integer value) {
            addCriterion("clue_turn_type <=", value, "clueTurnType");
            return (Criteria) this;
        }

        public Criteria andClueTurnTypeIn(List<Integer> values) {
            addCriterion("clue_turn_type in", values, "clueTurnType");
            return (Criteria) this;
        }

        public Criteria andClueTurnTypeNotIn(List<Integer> values) {
            addCriterion("clue_turn_type not in", values, "clueTurnType");
            return (Criteria) this;
        }

        public Criteria andClueTurnTypeBetween(Integer value1, Integer value2) {
            addCriterion("clue_turn_type between", value1, value2, "clueTurnType");
            return (Criteria) this;
        }

        public Criteria andClueTurnTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("clue_turn_type not between", value1, value2, "clueTurnType");
            return (Criteria) this;
        }

        public Criteria andCurrentUserTypeIsNull() {
            addCriterion("current_user_type is null");
            return (Criteria) this;
        }

        public Criteria andCurrentUserTypeIsNotNull() {
            addCriterion("current_user_type is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentUserTypeEqualTo(Integer value) {
            addCriterion("current_user_type =", value, "currentUserType");
            return (Criteria) this;
        }

        public Criteria andCurrentUserTypeNotEqualTo(Integer value) {
            addCriterion("current_user_type <>", value, "currentUserType");
            return (Criteria) this;
        }

        public Criteria andCurrentUserTypeGreaterThan(Integer value) {
            addCriterion("current_user_type >", value, "currentUserType");
            return (Criteria) this;
        }

        public Criteria andCurrentUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_user_type >=", value, "currentUserType");
            return (Criteria) this;
        }

        public Criteria andCurrentUserTypeLessThan(Integer value) {
            addCriterion("current_user_type <", value, "currentUserType");
            return (Criteria) this;
        }

        public Criteria andCurrentUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("current_user_type <=", value, "currentUserType");
            return (Criteria) this;
        }

        public Criteria andCurrentUserTypeIn(List<Integer> values) {
            addCriterion("current_user_type in", values, "currentUserType");
            return (Criteria) this;
        }

        public Criteria andCurrentUserTypeNotIn(List<Integer> values) {
            addCriterion("current_user_type not in", values, "currentUserType");
            return (Criteria) this;
        }

        public Criteria andCurrentUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("current_user_type between", value1, value2, "currentUserType");
            return (Criteria) this;
        }

        public Criteria andCurrentUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("current_user_type not between", value1, value2, "currentUserType");
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