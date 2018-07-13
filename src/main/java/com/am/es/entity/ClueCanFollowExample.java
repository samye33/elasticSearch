package com.am.es.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClueCanFollowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClueCanFollowExample() {
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

        public Criteria andClueGuidIsNull() {
            addCriterion("clue_guid is null");
            return (Criteria) this;
        }

        public Criteria andClueGuidIsNotNull() {
            addCriterion("clue_guid is not null");
            return (Criteria) this;
        }

        public Criteria andClueGuidEqualTo(String value) {
            addCriterion("clue_guid =", value, "clueGuid");
            return (Criteria) this;
        }

        public Criteria andClueGuidNotEqualTo(String value) {
            addCriterion("clue_guid <>", value, "clueGuid");
            return (Criteria) this;
        }

        public Criteria andClueGuidGreaterThan(String value) {
            addCriterion("clue_guid >", value, "clueGuid");
            return (Criteria) this;
        }

        public Criteria andClueGuidGreaterThanOrEqualTo(String value) {
            addCriterion("clue_guid >=", value, "clueGuid");
            return (Criteria) this;
        }

        public Criteria andClueGuidLessThan(String value) {
            addCriterion("clue_guid <", value, "clueGuid");
            return (Criteria) this;
        }

        public Criteria andClueGuidLessThanOrEqualTo(String value) {
            addCriterion("clue_guid <=", value, "clueGuid");
            return (Criteria) this;
        }

        public Criteria andClueGuidLike(String value) {
            addCriterion("clue_guid like", value, "clueGuid");
            return (Criteria) this;
        }

        public Criteria andClueGuidNotLike(String value) {
            addCriterion("clue_guid not like", value, "clueGuid");
            return (Criteria) this;
        }

        public Criteria andClueGuidIn(List<String> values) {
            addCriterion("clue_guid in", values, "clueGuid");
            return (Criteria) this;
        }

        public Criteria andClueGuidNotIn(List<String> values) {
            addCriterion("clue_guid not in", values, "clueGuid");
            return (Criteria) this;
        }

        public Criteria andClueGuidBetween(String value1, String value2) {
            addCriterion("clue_guid between", value1, value2, "clueGuid");
            return (Criteria) this;
        }

        public Criteria andClueGuidNotBetween(String value1, String value2) {
            addCriterion("clue_guid not between", value1, value2, "clueGuid");
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

        public Criteria andCustomGuidIsNull() {
            addCriterion("custom_guid is null");
            return (Criteria) this;
        }

        public Criteria andCustomGuidIsNotNull() {
            addCriterion("custom_guid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomGuidEqualTo(String value) {
            addCriterion("custom_guid =", value, "customGuid");
            return (Criteria) this;
        }

        public Criteria andCustomGuidNotEqualTo(String value) {
            addCriterion("custom_guid <>", value, "customGuid");
            return (Criteria) this;
        }

        public Criteria andCustomGuidGreaterThan(String value) {
            addCriterion("custom_guid >", value, "customGuid");
            return (Criteria) this;
        }

        public Criteria andCustomGuidGreaterThanOrEqualTo(String value) {
            addCriterion("custom_guid >=", value, "customGuid");
            return (Criteria) this;
        }

        public Criteria andCustomGuidLessThan(String value) {
            addCriterion("custom_guid <", value, "customGuid");
            return (Criteria) this;
        }

        public Criteria andCustomGuidLessThanOrEqualTo(String value) {
            addCriterion("custom_guid <=", value, "customGuid");
            return (Criteria) this;
        }

        public Criteria andCustomGuidLike(String value) {
            addCriterion("custom_guid like", value, "customGuid");
            return (Criteria) this;
        }

        public Criteria andCustomGuidNotLike(String value) {
            addCriterion("custom_guid not like", value, "customGuid");
            return (Criteria) this;
        }

        public Criteria andCustomGuidIn(List<String> values) {
            addCriterion("custom_guid in", values, "customGuid");
            return (Criteria) this;
        }

        public Criteria andCustomGuidNotIn(List<String> values) {
            addCriterion("custom_guid not in", values, "customGuid");
            return (Criteria) this;
        }

        public Criteria andCustomGuidBetween(String value1, String value2) {
            addCriterion("custom_guid between", value1, value2, "customGuid");
            return (Criteria) this;
        }

        public Criteria andCustomGuidNotBetween(String value1, String value2) {
            addCriterion("custom_guid not between", value1, value2, "customGuid");
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

        public Criteria andClueStageIsNull() {
            addCriterion("clue_stage is null");
            return (Criteria) this;
        }

        public Criteria andClueStageIsNotNull() {
            addCriterion("clue_stage is not null");
            return (Criteria) this;
        }

        public Criteria andClueStageEqualTo(Integer value) {
            addCriterion("clue_stage =", value, "clueStage");
            return (Criteria) this;
        }

        public Criteria andClueStageNotEqualTo(Integer value) {
            addCriterion("clue_stage <>", value, "clueStage");
            return (Criteria) this;
        }

        public Criteria andClueStageGreaterThan(Integer value) {
            addCriterion("clue_stage >", value, "clueStage");
            return (Criteria) this;
        }

        public Criteria andClueStageGreaterThanOrEqualTo(Integer value) {
            addCriterion("clue_stage >=", value, "clueStage");
            return (Criteria) this;
        }

        public Criteria andClueStageLessThan(Integer value) {
            addCriterion("clue_stage <", value, "clueStage");
            return (Criteria) this;
        }

        public Criteria andClueStageLessThanOrEqualTo(Integer value) {
            addCriterion("clue_stage <=", value, "clueStage");
            return (Criteria) this;
        }

        public Criteria andClueStageIn(List<Integer> values) {
            addCriterion("clue_stage in", values, "clueStage");
            return (Criteria) this;
        }

        public Criteria andClueStageNotIn(List<Integer> values) {
            addCriterion("clue_stage not in", values, "clueStage");
            return (Criteria) this;
        }

        public Criteria andClueStageBetween(Integer value1, Integer value2) {
            addCriterion("clue_stage between", value1, value2, "clueStage");
            return (Criteria) this;
        }

        public Criteria andClueStageNotBetween(Integer value1, Integer value2) {
            addCriterion("clue_stage not between", value1, value2, "clueStage");
            return (Criteria) this;
        }

        public Criteria andClueChannelCodeIsNull() {
            addCriterion("clue_channel_code is null");
            return (Criteria) this;
        }

        public Criteria andClueChannelCodeIsNotNull() {
            addCriterion("clue_channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andClueChannelCodeEqualTo(Integer value) {
            addCriterion("clue_channel_code =", value, "clueChannelCode");
            return (Criteria) this;
        }

        public Criteria andClueChannelCodeNotEqualTo(Integer value) {
            addCriterion("clue_channel_code <>", value, "clueChannelCode");
            return (Criteria) this;
        }

        public Criteria andClueChannelCodeGreaterThan(Integer value) {
            addCriterion("clue_channel_code >", value, "clueChannelCode");
            return (Criteria) this;
        }

        public Criteria andClueChannelCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("clue_channel_code >=", value, "clueChannelCode");
            return (Criteria) this;
        }

        public Criteria andClueChannelCodeLessThan(Integer value) {
            addCriterion("clue_channel_code <", value, "clueChannelCode");
            return (Criteria) this;
        }

        public Criteria andClueChannelCodeLessThanOrEqualTo(Integer value) {
            addCriterion("clue_channel_code <=", value, "clueChannelCode");
            return (Criteria) this;
        }

        public Criteria andClueChannelCodeIn(List<Integer> values) {
            addCriterion("clue_channel_code in", values, "clueChannelCode");
            return (Criteria) this;
        }

        public Criteria andClueChannelCodeNotIn(List<Integer> values) {
            addCriterion("clue_channel_code not in", values, "clueChannelCode");
            return (Criteria) this;
        }

        public Criteria andClueChannelCodeBetween(Integer value1, Integer value2) {
            addCriterion("clue_channel_code between", value1, value2, "clueChannelCode");
            return (Criteria) this;
        }

        public Criteria andClueChannelCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("clue_channel_code not between", value1, value2, "clueChannelCode");
            return (Criteria) this;
        }

        public Criteria andClueStatusIsNull() {
            addCriterion("clue_status is null");
            return (Criteria) this;
        }

        public Criteria andClueStatusIsNotNull() {
            addCriterion("clue_status is not null");
            return (Criteria) this;
        }

        public Criteria andClueStatusEqualTo(String value) {
            addCriterion("clue_status =", value, "clueStatus");
            return (Criteria) this;
        }

        public Criteria andClueStatusNotEqualTo(String value) {
            addCriterion("clue_status <>", value, "clueStatus");
            return (Criteria) this;
        }

        public Criteria andClueStatusGreaterThan(String value) {
            addCriterion("clue_status >", value, "clueStatus");
            return (Criteria) this;
        }

        public Criteria andClueStatusGreaterThanOrEqualTo(String value) {
            addCriterion("clue_status >=", value, "clueStatus");
            return (Criteria) this;
        }

        public Criteria andClueStatusLessThan(String value) {
            addCriterion("clue_status <", value, "clueStatus");
            return (Criteria) this;
        }

        public Criteria andClueStatusLessThanOrEqualTo(String value) {
            addCriterion("clue_status <=", value, "clueStatus");
            return (Criteria) this;
        }

        public Criteria andClueStatusLike(String value) {
            addCriterion("clue_status like", value, "clueStatus");
            return (Criteria) this;
        }

        public Criteria andClueStatusNotLike(String value) {
            addCriterion("clue_status not like", value, "clueStatus");
            return (Criteria) this;
        }

        public Criteria andClueStatusIn(List<String> values) {
            addCriterion("clue_status in", values, "clueStatus");
            return (Criteria) this;
        }

        public Criteria andClueStatusNotIn(List<String> values) {
            addCriterion("clue_status not in", values, "clueStatus");
            return (Criteria) this;
        }

        public Criteria andClueStatusBetween(String value1, String value2) {
            addCriterion("clue_status between", value1, value2, "clueStatus");
            return (Criteria) this;
        }

        public Criteria andClueStatusNotBetween(String value1, String value2) {
            addCriterion("clue_status not between", value1, value2, "clueStatus");
            return (Criteria) this;
        }

        public Criteria andClueQualityIsNull() {
            addCriterion("clue_quality is null");
            return (Criteria) this;
        }

        public Criteria andClueQualityIsNotNull() {
            addCriterion("clue_quality is not null");
            return (Criteria) this;
        }

        public Criteria andClueQualityEqualTo(Integer value) {
            addCriterion("clue_quality =", value, "clueQuality");
            return (Criteria) this;
        }

        public Criteria andClueQualityNotEqualTo(Integer value) {
            addCriterion("clue_quality <>", value, "clueQuality");
            return (Criteria) this;
        }

        public Criteria andClueQualityGreaterThan(Integer value) {
            addCriterion("clue_quality >", value, "clueQuality");
            return (Criteria) this;
        }

        public Criteria andClueQualityGreaterThanOrEqualTo(Integer value) {
            addCriterion("clue_quality >=", value, "clueQuality");
            return (Criteria) this;
        }

        public Criteria andClueQualityLessThan(Integer value) {
            addCriterion("clue_quality <", value, "clueQuality");
            return (Criteria) this;
        }

        public Criteria andClueQualityLessThanOrEqualTo(Integer value) {
            addCriterion("clue_quality <=", value, "clueQuality");
            return (Criteria) this;
        }

        public Criteria andClueQualityIn(List<Integer> values) {
            addCriterion("clue_quality in", values, "clueQuality");
            return (Criteria) this;
        }

        public Criteria andClueQualityNotIn(List<Integer> values) {
            addCriterion("clue_quality not in", values, "clueQuality");
            return (Criteria) this;
        }

        public Criteria andClueQualityBetween(Integer value1, Integer value2) {
            addCriterion("clue_quality between", value1, value2, "clueQuality");
            return (Criteria) this;
        }

        public Criteria andClueQualityNotBetween(Integer value1, Integer value2) {
            addCriterion("clue_quality not between", value1, value2, "clueQuality");
            return (Criteria) this;
        }

        public Criteria andLastOwnerIsNull() {
            addCriterion("last_owner is null");
            return (Criteria) this;
        }

        public Criteria andLastOwnerIsNotNull() {
            addCriterion("last_owner is not null");
            return (Criteria) this;
        }

        public Criteria andLastOwnerEqualTo(Integer value) {
            addCriterion("last_owner =", value, "lastOwner");
            return (Criteria) this;
        }

        public Criteria andLastOwnerNotEqualTo(Integer value) {
            addCriterion("last_owner <>", value, "lastOwner");
            return (Criteria) this;
        }

        public Criteria andLastOwnerGreaterThan(Integer value) {
            addCriterion("last_owner >", value, "lastOwner");
            return (Criteria) this;
        }

        public Criteria andLastOwnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_owner >=", value, "lastOwner");
            return (Criteria) this;
        }

        public Criteria andLastOwnerLessThan(Integer value) {
            addCriterion("last_owner <", value, "lastOwner");
            return (Criteria) this;
        }

        public Criteria andLastOwnerLessThanOrEqualTo(Integer value) {
            addCriterion("last_owner <=", value, "lastOwner");
            return (Criteria) this;
        }

        public Criteria andLastOwnerIn(List<Integer> values) {
            addCriterion("last_owner in", values, "lastOwner");
            return (Criteria) this;
        }

        public Criteria andLastOwnerNotIn(List<Integer> values) {
            addCriterion("last_owner not in", values, "lastOwner");
            return (Criteria) this;
        }

        public Criteria andLastOwnerBetween(Integer value1, Integer value2) {
            addCriterion("last_owner between", value1, value2, "lastOwner");
            return (Criteria) this;
        }

        public Criteria andLastOwnerNotBetween(Integer value1, Integer value2) {
            addCriterion("last_owner not between", value1, value2, "lastOwner");
            return (Criteria) this;
        }

        public Criteria andLastCommunicateTimeIsNull() {
            addCriterion("last_communicate_time is null");
            return (Criteria) this;
        }

        public Criteria andLastCommunicateTimeIsNotNull() {
            addCriterion("last_communicate_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastCommunicateTimeEqualTo(Date value) {
            addCriterion("last_communicate_time =", value, "lastCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andLastCommunicateTimeNotEqualTo(Date value) {
            addCriterion("last_communicate_time <>", value, "lastCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andLastCommunicateTimeGreaterThan(Date value) {
            addCriterion("last_communicate_time >", value, "lastCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andLastCommunicateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_communicate_time >=", value, "lastCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andLastCommunicateTimeLessThan(Date value) {
            addCriterion("last_communicate_time <", value, "lastCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andLastCommunicateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_communicate_time <=", value, "lastCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andLastCommunicateTimeIn(List<Date> values) {
            addCriterion("last_communicate_time in", values, "lastCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andLastCommunicateTimeNotIn(List<Date> values) {
            addCriterion("last_communicate_time not in", values, "lastCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andLastCommunicateTimeBetween(Date value1, Date value2) {
            addCriterion("last_communicate_time between", value1, value2, "lastCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andLastCommunicateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_communicate_time not between", value1, value2, "lastCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNull() {
            addCriterion("course_type is null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNotNull() {
            addCriterion("course_type is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeEqualTo(Integer value) {
            addCriterion("course_type =", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotEqualTo(Integer value) {
            addCriterion("course_type <>", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThan(Integer value) {
            addCriterion("course_type >", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_type >=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThan(Integer value) {
            addCriterion("course_type <", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThanOrEqualTo(Integer value) {
            addCriterion("course_type <=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIn(List<Integer> values) {
            addCriterion("course_type in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotIn(List<Integer> values) {
            addCriterion("course_type not in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeBetween(Integer value1, Integer value2) {
            addCriterion("course_type between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("course_type not between", value1, value2, "courseType");
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

        public Criteria andClueOwnerIsNull() {
            addCriterion("clue_owner is null");
            return (Criteria) this;
        }

        public Criteria andClueOwnerIsNotNull() {
            addCriterion("clue_owner is not null");
            return (Criteria) this;
        }

        public Criteria andClueOwnerEqualTo(Integer value) {
            addCriterion("clue_owner =", value, "clueOwner");
            return (Criteria) this;
        }

        public Criteria andClueOwnerNotEqualTo(Integer value) {
            addCriterion("clue_owner <>", value, "clueOwner");
            return (Criteria) this;
        }

        public Criteria andClueOwnerGreaterThan(Integer value) {
            addCriterion("clue_owner >", value, "clueOwner");
            return (Criteria) this;
        }

        public Criteria andClueOwnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("clue_owner >=", value, "clueOwner");
            return (Criteria) this;
        }

        public Criteria andClueOwnerLessThan(Integer value) {
            addCriterion("clue_owner <", value, "clueOwner");
            return (Criteria) this;
        }

        public Criteria andClueOwnerLessThanOrEqualTo(Integer value) {
            addCriterion("clue_owner <=", value, "clueOwner");
            return (Criteria) this;
        }

        public Criteria andClueOwnerIn(List<Integer> values) {
            addCriterion("clue_owner in", values, "clueOwner");
            return (Criteria) this;
        }

        public Criteria andClueOwnerNotIn(List<Integer> values) {
            addCriterion("clue_owner not in", values, "clueOwner");
            return (Criteria) this;
        }

        public Criteria andClueOwnerBetween(Integer value1, Integer value2) {
            addCriterion("clue_owner between", value1, value2, "clueOwner");
            return (Criteria) this;
        }

        public Criteria andClueOwnerNotBetween(Integer value1, Integer value2) {
            addCriterion("clue_owner not between", value1, value2, "clueOwner");
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