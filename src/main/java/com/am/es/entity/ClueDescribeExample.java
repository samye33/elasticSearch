package com.am.es.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClueDescribeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClueDescribeExample() {
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

        public Criteria andClueTypeIsNull() {
            addCriterion("clue_type is null");
            return (Criteria) this;
        }

        public Criteria andClueTypeIsNotNull() {
            addCriterion("clue_type is not null");
            return (Criteria) this;
        }

        public Criteria andClueTypeEqualTo(Integer value) {
            addCriterion("clue_type =", value, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeNotEqualTo(Integer value) {
            addCriterion("clue_type <>", value, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeGreaterThan(Integer value) {
            addCriterion("clue_type >", value, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("clue_type >=", value, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeLessThan(Integer value) {
            addCriterion("clue_type <", value, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeLessThanOrEqualTo(Integer value) {
            addCriterion("clue_type <=", value, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeIn(List<Integer> values) {
            addCriterion("clue_type in", values, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeNotIn(List<Integer> values) {
            addCriterion("clue_type not in", values, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeBetween(Integer value1, Integer value2) {
            addCriterion("clue_type between", value1, value2, "clueType");
            return (Criteria) this;
        }

        public Criteria andClueTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("clue_type not between", value1, value2, "clueType");
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

        public Criteria andNextCommunicateTimeIsNull() {
            addCriterion("next_communicate_time is null");
            return (Criteria) this;
        }

        public Criteria andNextCommunicateTimeIsNotNull() {
            addCriterion("next_communicate_time is not null");
            return (Criteria) this;
        }

        public Criteria andNextCommunicateTimeEqualTo(Date value) {
            addCriterion("next_communicate_time =", value, "nextCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andNextCommunicateTimeNotEqualTo(Date value) {
            addCriterion("next_communicate_time <>", value, "nextCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andNextCommunicateTimeGreaterThan(Date value) {
            addCriterion("next_communicate_time >", value, "nextCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andNextCommunicateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("next_communicate_time >=", value, "nextCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andNextCommunicateTimeLessThan(Date value) {
            addCriterion("next_communicate_time <", value, "nextCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andNextCommunicateTimeLessThanOrEqualTo(Date value) {
            addCriterion("next_communicate_time <=", value, "nextCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andNextCommunicateTimeIn(List<Date> values) {
            addCriterion("next_communicate_time in", values, "nextCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andNextCommunicateTimeNotIn(List<Date> values) {
            addCriterion("next_communicate_time not in", values, "nextCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andNextCommunicateTimeBetween(Date value1, Date value2) {
            addCriterion("next_communicate_time between", value1, value2, "nextCommunicateTime");
            return (Criteria) this;
        }

        public Criteria andNextCommunicateTimeNotBetween(Date value1, Date value2) {
            addCriterion("next_communicate_time not between", value1, value2, "nextCommunicateTime");
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

        public Criteria andConvenienceCourseTimeIsNull() {
            addCriterion("convenience_course_time is null");
            return (Criteria) this;
        }

        public Criteria andConvenienceCourseTimeIsNotNull() {
            addCriterion("convenience_course_time is not null");
            return (Criteria) this;
        }

        public Criteria andConvenienceCourseTimeEqualTo(String value) {
            addCriterion("convenience_course_time =", value, "convenienceCourseTime");
            return (Criteria) this;
        }

        public Criteria andConvenienceCourseTimeNotEqualTo(String value) {
            addCriterion("convenience_course_time <>", value, "convenienceCourseTime");
            return (Criteria) this;
        }

        public Criteria andConvenienceCourseTimeGreaterThan(String value) {
            addCriterion("convenience_course_time >", value, "convenienceCourseTime");
            return (Criteria) this;
        }

        public Criteria andConvenienceCourseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("convenience_course_time >=", value, "convenienceCourseTime");
            return (Criteria) this;
        }

        public Criteria andConvenienceCourseTimeLessThan(String value) {
            addCriterion("convenience_course_time <", value, "convenienceCourseTime");
            return (Criteria) this;
        }

        public Criteria andConvenienceCourseTimeLessThanOrEqualTo(String value) {
            addCriterion("convenience_course_time <=", value, "convenienceCourseTime");
            return (Criteria) this;
        }

        public Criteria andConvenienceCourseTimeLike(String value) {
            addCriterion("convenience_course_time like", value, "convenienceCourseTime");
            return (Criteria) this;
        }

        public Criteria andConvenienceCourseTimeNotLike(String value) {
            addCriterion("convenience_course_time not like", value, "convenienceCourseTime");
            return (Criteria) this;
        }

        public Criteria andConvenienceCourseTimeIn(List<String> values) {
            addCriterion("convenience_course_time in", values, "convenienceCourseTime");
            return (Criteria) this;
        }

        public Criteria andConvenienceCourseTimeNotIn(List<String> values) {
            addCriterion("convenience_course_time not in", values, "convenienceCourseTime");
            return (Criteria) this;
        }

        public Criteria andConvenienceCourseTimeBetween(String value1, String value2) {
            addCriterion("convenience_course_time between", value1, value2, "convenienceCourseTime");
            return (Criteria) this;
        }

        public Criteria andConvenienceCourseTimeNotBetween(String value1, String value2) {
            addCriterion("convenience_course_time not between", value1, value2, "convenienceCourseTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeIsNull() {
            addCriterion("exam_time is null");
            return (Criteria) this;
        }

        public Criteria andExamTimeIsNotNull() {
            addCriterion("exam_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamTimeEqualTo(Date value) {
            addCriterion("exam_time =", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotEqualTo(Date value) {
            addCriterion("exam_time <>", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeGreaterThan(Date value) {
            addCriterion("exam_time >", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_time >=", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeLessThan(Date value) {
            addCriterion("exam_time <", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_time <=", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeIn(List<Date> values) {
            addCriterion("exam_time in", values, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotIn(List<Date> values) {
            addCriterion("exam_time not in", values, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeBetween(Date value1, Date value2) {
            addCriterion("exam_time between", value1, value2, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_time not between", value1, value2, "examTime");
            return (Criteria) this;
        }

        public Criteria andLastCommunicaterIsNull() {
            addCriterion("last_communicater is null");
            return (Criteria) this;
        }

        public Criteria andLastCommunicaterIsNotNull() {
            addCriterion("last_communicater is not null");
            return (Criteria) this;
        }

        public Criteria andLastCommunicaterEqualTo(Integer value) {
            addCriterion("last_communicater =", value, "lastCommunicater");
            return (Criteria) this;
        }

        public Criteria andLastCommunicaterNotEqualTo(Integer value) {
            addCriterion("last_communicater <>", value, "lastCommunicater");
            return (Criteria) this;
        }

        public Criteria andLastCommunicaterGreaterThan(Integer value) {
            addCriterion("last_communicater >", value, "lastCommunicater");
            return (Criteria) this;
        }

        public Criteria andLastCommunicaterGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_communicater >=", value, "lastCommunicater");
            return (Criteria) this;
        }

        public Criteria andLastCommunicaterLessThan(Integer value) {
            addCriterion("last_communicater <", value, "lastCommunicater");
            return (Criteria) this;
        }

        public Criteria andLastCommunicaterLessThanOrEqualTo(Integer value) {
            addCriterion("last_communicater <=", value, "lastCommunicater");
            return (Criteria) this;
        }

        public Criteria andLastCommunicaterIn(List<Integer> values) {
            addCriterion("last_communicater in", values, "lastCommunicater");
            return (Criteria) this;
        }

        public Criteria andLastCommunicaterNotIn(List<Integer> values) {
            addCriterion("last_communicater not in", values, "lastCommunicater");
            return (Criteria) this;
        }

        public Criteria andLastCommunicaterBetween(Integer value1, Integer value2) {
            addCriterion("last_communicater between", value1, value2, "lastCommunicater");
            return (Criteria) this;
        }

        public Criteria andLastCommunicaterNotBetween(Integer value1, Integer value2) {
            addCriterion("last_communicater not between", value1, value2, "lastCommunicater");
            return (Criteria) this;
        }

        public Criteria andIsDepositIsNull() {
            addCriterion("is_deposit is null");
            return (Criteria) this;
        }

        public Criteria andIsDepositIsNotNull() {
            addCriterion("is_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andIsDepositEqualTo(Integer value) {
            addCriterion("is_deposit =", value, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositNotEqualTo(Integer value) {
            addCriterion("is_deposit <>", value, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositGreaterThan(Integer value) {
            addCriterion("is_deposit >", value, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_deposit >=", value, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositLessThan(Integer value) {
            addCriterion("is_deposit <", value, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositLessThanOrEqualTo(Integer value) {
            addCriterion("is_deposit <=", value, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositIn(List<Integer> values) {
            addCriterion("is_deposit in", values, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositNotIn(List<Integer> values) {
            addCriterion("is_deposit not in", values, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositBetween(Integer value1, Integer value2) {
            addCriterion("is_deposit between", value1, value2, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositNotBetween(Integer value1, Integer value2) {
            addCriterion("is_deposit not between", value1, value2, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andSaleConnetCountIsNull() {
            addCriterion("sale_connet_count is null");
            return (Criteria) this;
        }

        public Criteria andSaleConnetCountIsNotNull() {
            addCriterion("sale_connet_count is not null");
            return (Criteria) this;
        }

        public Criteria andSaleConnetCountEqualTo(Integer value) {
            addCriterion("sale_connet_count =", value, "saleConnetCount");
            return (Criteria) this;
        }

        public Criteria andSaleConnetCountNotEqualTo(Integer value) {
            addCriterion("sale_connet_count <>", value, "saleConnetCount");
            return (Criteria) this;
        }

        public Criteria andSaleConnetCountGreaterThan(Integer value) {
            addCriterion("sale_connet_count >", value, "saleConnetCount");
            return (Criteria) this;
        }

        public Criteria andSaleConnetCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_connet_count >=", value, "saleConnetCount");
            return (Criteria) this;
        }

        public Criteria andSaleConnetCountLessThan(Integer value) {
            addCriterion("sale_connet_count <", value, "saleConnetCount");
            return (Criteria) this;
        }

        public Criteria andSaleConnetCountLessThanOrEqualTo(Integer value) {
            addCriterion("sale_connet_count <=", value, "saleConnetCount");
            return (Criteria) this;
        }

        public Criteria andSaleConnetCountIn(List<Integer> values) {
            addCriterion("sale_connet_count in", values, "saleConnetCount");
            return (Criteria) this;
        }

        public Criteria andSaleConnetCountNotIn(List<Integer> values) {
            addCriterion("sale_connet_count not in", values, "saleConnetCount");
            return (Criteria) this;
        }

        public Criteria andSaleConnetCountBetween(Integer value1, Integer value2) {
            addCriterion("sale_connet_count between", value1, value2, "saleConnetCount");
            return (Criteria) this;
        }

        public Criteria andSaleConnetCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_connet_count not between", value1, value2, "saleConnetCount");
            return (Criteria) this;
        }

        public Criteria andTmkFailureFollowCountIsNull() {
            addCriterion("tmk_failure_follow_count is null");
            return (Criteria) this;
        }

        public Criteria andTmkFailureFollowCountIsNotNull() {
            addCriterion("tmk_failure_follow_count is not null");
            return (Criteria) this;
        }

        public Criteria andTmkFailureFollowCountEqualTo(Integer value) {
            addCriterion("tmk_failure_follow_count =", value, "tmkFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andTmkFailureFollowCountNotEqualTo(Integer value) {
            addCriterion("tmk_failure_follow_count <>", value, "tmkFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andTmkFailureFollowCountGreaterThan(Integer value) {
            addCriterion("tmk_failure_follow_count >", value, "tmkFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andTmkFailureFollowCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("tmk_failure_follow_count >=", value, "tmkFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andTmkFailureFollowCountLessThan(Integer value) {
            addCriterion("tmk_failure_follow_count <", value, "tmkFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andTmkFailureFollowCountLessThanOrEqualTo(Integer value) {
            addCriterion("tmk_failure_follow_count <=", value, "tmkFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andTmkFailureFollowCountIn(List<Integer> values) {
            addCriterion("tmk_failure_follow_count in", values, "tmkFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andTmkFailureFollowCountNotIn(List<Integer> values) {
            addCriterion("tmk_failure_follow_count not in", values, "tmkFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andTmkFailureFollowCountBetween(Integer value1, Integer value2) {
            addCriterion("tmk_failure_follow_count between", value1, value2, "tmkFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andTmkFailureFollowCountNotBetween(Integer value1, Integer value2) {
            addCriterion("tmk_failure_follow_count not between", value1, value2, "tmkFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andSaleFailureFollowCountIsNull() {
            addCriterion("sale_failure_follow_count is null");
            return (Criteria) this;
        }

        public Criteria andSaleFailureFollowCountIsNotNull() {
            addCriterion("sale_failure_follow_count is not null");
            return (Criteria) this;
        }

        public Criteria andSaleFailureFollowCountEqualTo(Integer value) {
            addCriterion("sale_failure_follow_count =", value, "saleFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andSaleFailureFollowCountNotEqualTo(Integer value) {
            addCriterion("sale_failure_follow_count <>", value, "saleFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andSaleFailureFollowCountGreaterThan(Integer value) {
            addCriterion("sale_failure_follow_count >", value, "saleFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andSaleFailureFollowCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_failure_follow_count >=", value, "saleFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andSaleFailureFollowCountLessThan(Integer value) {
            addCriterion("sale_failure_follow_count <", value, "saleFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andSaleFailureFollowCountLessThanOrEqualTo(Integer value) {
            addCriterion("sale_failure_follow_count <=", value, "saleFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andSaleFailureFollowCountIn(List<Integer> values) {
            addCriterion("sale_failure_follow_count in", values, "saleFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andSaleFailureFollowCountNotIn(List<Integer> values) {
            addCriterion("sale_failure_follow_count not in", values, "saleFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andSaleFailureFollowCountBetween(Integer value1, Integer value2) {
            addCriterion("sale_failure_follow_count between", value1, value2, "saleFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andSaleFailureFollowCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_failure_follow_count not between", value1, value2, "saleFailureFollowCount");
            return (Criteria) this;
        }

        public Criteria andSaleDialCountIsNull() {
            addCriterion("sale_dial_count is null");
            return (Criteria) this;
        }

        public Criteria andSaleDialCountIsNotNull() {
            addCriterion("sale_dial_count is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDialCountEqualTo(Integer value) {
            addCriterion("sale_dial_count =", value, "saleDialCount");
            return (Criteria) this;
        }

        public Criteria andSaleDialCountNotEqualTo(Integer value) {
            addCriterion("sale_dial_count <>", value, "saleDialCount");
            return (Criteria) this;
        }

        public Criteria andSaleDialCountGreaterThan(Integer value) {
            addCriterion("sale_dial_count >", value, "saleDialCount");
            return (Criteria) this;
        }

        public Criteria andSaleDialCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_dial_count >=", value, "saleDialCount");
            return (Criteria) this;
        }

        public Criteria andSaleDialCountLessThan(Integer value) {
            addCriterion("sale_dial_count <", value, "saleDialCount");
            return (Criteria) this;
        }

        public Criteria andSaleDialCountLessThanOrEqualTo(Integer value) {
            addCriterion("sale_dial_count <=", value, "saleDialCount");
            return (Criteria) this;
        }

        public Criteria andSaleDialCountIn(List<Integer> values) {
            addCriterion("sale_dial_count in", values, "saleDialCount");
            return (Criteria) this;
        }

        public Criteria andSaleDialCountNotIn(List<Integer> values) {
            addCriterion("sale_dial_count not in", values, "saleDialCount");
            return (Criteria) this;
        }

        public Criteria andSaleDialCountBetween(Integer value1, Integer value2) {
            addCriterion("sale_dial_count between", value1, value2, "saleDialCount");
            return (Criteria) this;
        }

        public Criteria andSaleDialCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_dial_count not between", value1, value2, "saleDialCount");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationCountIsNull() {
            addCriterion("repeat_consultation_count is null");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationCountIsNotNull() {
            addCriterion("repeat_consultation_count is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationCountEqualTo(Integer value) {
            addCriterion("repeat_consultation_count =", value, "repeatConsultationCount");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationCountNotEqualTo(Integer value) {
            addCriterion("repeat_consultation_count <>", value, "repeatConsultationCount");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationCountGreaterThan(Integer value) {
            addCriterion("repeat_consultation_count >", value, "repeatConsultationCount");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("repeat_consultation_count >=", value, "repeatConsultationCount");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationCountLessThan(Integer value) {
            addCriterion("repeat_consultation_count <", value, "repeatConsultationCount");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationCountLessThanOrEqualTo(Integer value) {
            addCriterion("repeat_consultation_count <=", value, "repeatConsultationCount");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationCountIn(List<Integer> values) {
            addCriterion("repeat_consultation_count in", values, "repeatConsultationCount");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationCountNotIn(List<Integer> values) {
            addCriterion("repeat_consultation_count not in", values, "repeatConsultationCount");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationCountBetween(Integer value1, Integer value2) {
            addCriterion("repeat_consultation_count between", value1, value2, "repeatConsultationCount");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationCountNotBetween(Integer value1, Integer value2) {
            addCriterion("repeat_consultation_count not between", value1, value2, "repeatConsultationCount");
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

        public Criteria andIsLockIsNull() {
            addCriterion("is_lock is null");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNotNull() {
            addCriterion("is_lock is not null");
            return (Criteria) this;
        }

        public Criteria andIsLockEqualTo(Integer value) {
            addCriterion("is_lock =", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotEqualTo(Integer value) {
            addCriterion("is_lock <>", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThan(Integer value) {
            addCriterion("is_lock >", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_lock >=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThan(Integer value) {
            addCriterion("is_lock <", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThanOrEqualTo(Integer value) {
            addCriterion("is_lock <=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockIn(List<Integer> values) {
            addCriterion("is_lock in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotIn(List<Integer> values) {
            addCriterion("is_lock not in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockBetween(Integer value1, Integer value2) {
            addCriterion("is_lock between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotBetween(Integer value1, Integer value2) {
            addCriterion("is_lock not between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andOldClueGuidIsNull() {
            addCriterion("old_clue_guid is null");
            return (Criteria) this;
        }

        public Criteria andOldClueGuidIsNotNull() {
            addCriterion("old_clue_guid is not null");
            return (Criteria) this;
        }

        public Criteria andOldClueGuidEqualTo(String value) {
            addCriterion("old_clue_guid =", value, "oldClueGuid");
            return (Criteria) this;
        }

        public Criteria andOldClueGuidNotEqualTo(String value) {
            addCriterion("old_clue_guid <>", value, "oldClueGuid");
            return (Criteria) this;
        }

        public Criteria andOldClueGuidGreaterThan(String value) {
            addCriterion("old_clue_guid >", value, "oldClueGuid");
            return (Criteria) this;
        }

        public Criteria andOldClueGuidGreaterThanOrEqualTo(String value) {
            addCriterion("old_clue_guid >=", value, "oldClueGuid");
            return (Criteria) this;
        }

        public Criteria andOldClueGuidLessThan(String value) {
            addCriterion("old_clue_guid <", value, "oldClueGuid");
            return (Criteria) this;
        }

        public Criteria andOldClueGuidLessThanOrEqualTo(String value) {
            addCriterion("old_clue_guid <=", value, "oldClueGuid");
            return (Criteria) this;
        }

        public Criteria andOldClueGuidLike(String value) {
            addCriterion("old_clue_guid like", value, "oldClueGuid");
            return (Criteria) this;
        }

        public Criteria andOldClueGuidNotLike(String value) {
            addCriterion("old_clue_guid not like", value, "oldClueGuid");
            return (Criteria) this;
        }

        public Criteria andOldClueGuidIn(List<String> values) {
            addCriterion("old_clue_guid in", values, "oldClueGuid");
            return (Criteria) this;
        }

        public Criteria andOldClueGuidNotIn(List<String> values) {
            addCriterion("old_clue_guid not in", values, "oldClueGuid");
            return (Criteria) this;
        }

        public Criteria andOldClueGuidBetween(String value1, String value2) {
            addCriterion("old_clue_guid between", value1, value2, "oldClueGuid");
            return (Criteria) this;
        }

        public Criteria andOldClueGuidNotBetween(String value1, String value2) {
            addCriterion("old_clue_guid not between", value1, value2, "oldClueGuid");
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

        public Criteria andTmkGetTimeIsNull() {
            addCriterion("tmk_get_time is null");
            return (Criteria) this;
        }

        public Criteria andTmkGetTimeIsNotNull() {
            addCriterion("tmk_get_time is not null");
            return (Criteria) this;
        }

        public Criteria andTmkGetTimeEqualTo(Date value) {
            addCriterion("tmk_get_time =", value, "tmkGetTime");
            return (Criteria) this;
        }

        public Criteria andTmkGetTimeNotEqualTo(Date value) {
            addCriterion("tmk_get_time <>", value, "tmkGetTime");
            return (Criteria) this;
        }

        public Criteria andTmkGetTimeGreaterThan(Date value) {
            addCriterion("tmk_get_time >", value, "tmkGetTime");
            return (Criteria) this;
        }

        public Criteria andTmkGetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tmk_get_time >=", value, "tmkGetTime");
            return (Criteria) this;
        }

        public Criteria andTmkGetTimeLessThan(Date value) {
            addCriterion("tmk_get_time <", value, "tmkGetTime");
            return (Criteria) this;
        }

        public Criteria andTmkGetTimeLessThanOrEqualTo(Date value) {
            addCriterion("tmk_get_time <=", value, "tmkGetTime");
            return (Criteria) this;
        }

        public Criteria andTmkGetTimeIn(List<Date> values) {
            addCriterion("tmk_get_time in", values, "tmkGetTime");
            return (Criteria) this;
        }

        public Criteria andTmkGetTimeNotIn(List<Date> values) {
            addCriterion("tmk_get_time not in", values, "tmkGetTime");
            return (Criteria) this;
        }

        public Criteria andTmkGetTimeBetween(Date value1, Date value2) {
            addCriterion("tmk_get_time between", value1, value2, "tmkGetTime");
            return (Criteria) this;
        }

        public Criteria andTmkGetTimeNotBetween(Date value1, Date value2) {
            addCriterion("tmk_get_time not between", value1, value2, "tmkGetTime");
            return (Criteria) this;
        }

        public Criteria andSaleGetTimeIsNull() {
            addCriterion("sale_get_time is null");
            return (Criteria) this;
        }

        public Criteria andSaleGetTimeIsNotNull() {
            addCriterion("sale_get_time is not null");
            return (Criteria) this;
        }

        public Criteria andSaleGetTimeEqualTo(Date value) {
            addCriterion("sale_get_time =", value, "saleGetTime");
            return (Criteria) this;
        }

        public Criteria andSaleGetTimeNotEqualTo(Date value) {
            addCriterion("sale_get_time <>", value, "saleGetTime");
            return (Criteria) this;
        }

        public Criteria andSaleGetTimeGreaterThan(Date value) {
            addCriterion("sale_get_time >", value, "saleGetTime");
            return (Criteria) this;
        }

        public Criteria andSaleGetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sale_get_time >=", value, "saleGetTime");
            return (Criteria) this;
        }

        public Criteria andSaleGetTimeLessThan(Date value) {
            addCriterion("sale_get_time <", value, "saleGetTime");
            return (Criteria) this;
        }

        public Criteria andSaleGetTimeLessThanOrEqualTo(Date value) {
            addCriterion("sale_get_time <=", value, "saleGetTime");
            return (Criteria) this;
        }

        public Criteria andSaleGetTimeIn(List<Date> values) {
            addCriterion("sale_get_time in", values, "saleGetTime");
            return (Criteria) this;
        }

        public Criteria andSaleGetTimeNotIn(List<Date> values) {
            addCriterion("sale_get_time not in", values, "saleGetTime");
            return (Criteria) this;
        }

        public Criteria andSaleGetTimeBetween(Date value1, Date value2) {
            addCriterion("sale_get_time between", value1, value2, "saleGetTime");
            return (Criteria) this;
        }

        public Criteria andSaleGetTimeNotBetween(Date value1, Date value2) {
            addCriterion("sale_get_time not between", value1, value2, "saleGetTime");
            return (Criteria) this;
        }

        public Criteria andSchoolManagerGetTimeIsNull() {
            addCriterion("school_manager_get_time is null");
            return (Criteria) this;
        }

        public Criteria andSchoolManagerGetTimeIsNotNull() {
            addCriterion("school_manager_get_time is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolManagerGetTimeEqualTo(Date value) {
            addCriterion("school_manager_get_time =", value, "schoolManagerGetTime");
            return (Criteria) this;
        }

        public Criteria andSchoolManagerGetTimeNotEqualTo(Date value) {
            addCriterion("school_manager_get_time <>", value, "schoolManagerGetTime");
            return (Criteria) this;
        }

        public Criteria andSchoolManagerGetTimeGreaterThan(Date value) {
            addCriterion("school_manager_get_time >", value, "schoolManagerGetTime");
            return (Criteria) this;
        }

        public Criteria andSchoolManagerGetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("school_manager_get_time >=", value, "schoolManagerGetTime");
            return (Criteria) this;
        }

        public Criteria andSchoolManagerGetTimeLessThan(Date value) {
            addCriterion("school_manager_get_time <", value, "schoolManagerGetTime");
            return (Criteria) this;
        }

        public Criteria andSchoolManagerGetTimeLessThanOrEqualTo(Date value) {
            addCriterion("school_manager_get_time <=", value, "schoolManagerGetTime");
            return (Criteria) this;
        }

        public Criteria andSchoolManagerGetTimeIn(List<Date> values) {
            addCriterion("school_manager_get_time in", values, "schoolManagerGetTime");
            return (Criteria) this;
        }

        public Criteria andSchoolManagerGetTimeNotIn(List<Date> values) {
            addCriterion("school_manager_get_time not in", values, "schoolManagerGetTime");
            return (Criteria) this;
        }

        public Criteria andSchoolManagerGetTimeBetween(Date value1, Date value2) {
            addCriterion("school_manager_get_time between", value1, value2, "schoolManagerGetTime");
            return (Criteria) this;
        }

        public Criteria andSchoolManagerGetTimeNotBetween(Date value1, Date value2) {
            addCriterion("school_manager_get_time not between", value1, value2, "schoolManagerGetTime");
            return (Criteria) this;
        }

        public Criteria andIdGuidIsNull() {
            addCriterion("id_guid is null");
            return (Criteria) this;
        }

        public Criteria andIdGuidIsNotNull() {
            addCriterion("id_guid is not null");
            return (Criteria) this;
        }

        public Criteria andIdGuidEqualTo(String value) {
            addCriterion("id_guid =", value, "idGuid");
            return (Criteria) this;
        }

        public Criteria andIdGuidNotEqualTo(String value) {
            addCriterion("id_guid <>", value, "idGuid");
            return (Criteria) this;
        }

        public Criteria andIdGuidGreaterThan(String value) {
            addCriterion("id_guid >", value, "idGuid");
            return (Criteria) this;
        }

        public Criteria andIdGuidGreaterThanOrEqualTo(String value) {
            addCriterion("id_guid >=", value, "idGuid");
            return (Criteria) this;
        }

        public Criteria andIdGuidLessThan(String value) {
            addCriterion("id_guid <", value, "idGuid");
            return (Criteria) this;
        }

        public Criteria andIdGuidLessThanOrEqualTo(String value) {
            addCriterion("id_guid <=", value, "idGuid");
            return (Criteria) this;
        }

        public Criteria andIdGuidLike(String value) {
            addCriterion("id_guid like", value, "idGuid");
            return (Criteria) this;
        }

        public Criteria andIdGuidNotLike(String value) {
            addCriterion("id_guid not like", value, "idGuid");
            return (Criteria) this;
        }

        public Criteria andIdGuidIn(List<String> values) {
            addCriterion("id_guid in", values, "idGuid");
            return (Criteria) this;
        }

        public Criteria andIdGuidNotIn(List<String> values) {
            addCriterion("id_guid not in", values, "idGuid");
            return (Criteria) this;
        }

        public Criteria andIdGuidBetween(String value1, String value2) {
            addCriterion("id_guid between", value1, value2, "idGuid");
            return (Criteria) this;
        }

        public Criteria andIdGuidNotBetween(String value1, String value2) {
            addCriterion("id_guid not between", value1, value2, "idGuid");
            return (Criteria) this;
        }

        public Criteria andIsmergeclueIsNull() {
            addCriterion("IsMergeClue is null");
            return (Criteria) this;
        }

        public Criteria andIsmergeclueIsNotNull() {
            addCriterion("IsMergeClue is not null");
            return (Criteria) this;
        }

        public Criteria andIsmergeclueEqualTo(Integer value) {
            addCriterion("IsMergeClue =", value, "ismergeclue");
            return (Criteria) this;
        }

        public Criteria andIsmergeclueNotEqualTo(Integer value) {
            addCriterion("IsMergeClue <>", value, "ismergeclue");
            return (Criteria) this;
        }

        public Criteria andIsmergeclueGreaterThan(Integer value) {
            addCriterion("IsMergeClue >", value, "ismergeclue");
            return (Criteria) this;
        }

        public Criteria andIsmergeclueGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsMergeClue >=", value, "ismergeclue");
            return (Criteria) this;
        }

        public Criteria andIsmergeclueLessThan(Integer value) {
            addCriterion("IsMergeClue <", value, "ismergeclue");
            return (Criteria) this;
        }

        public Criteria andIsmergeclueLessThanOrEqualTo(Integer value) {
            addCriterion("IsMergeClue <=", value, "ismergeclue");
            return (Criteria) this;
        }

        public Criteria andIsmergeclueIn(List<Integer> values) {
            addCriterion("IsMergeClue in", values, "ismergeclue");
            return (Criteria) this;
        }

        public Criteria andIsmergeclueNotIn(List<Integer> values) {
            addCriterion("IsMergeClue not in", values, "ismergeclue");
            return (Criteria) this;
        }

        public Criteria andIsmergeclueBetween(Integer value1, Integer value2) {
            addCriterion("IsMergeClue between", value1, value2, "ismergeclue");
            return (Criteria) this;
        }

        public Criteria andIsmergeclueNotBetween(Integer value1, Integer value2) {
            addCriterion("IsMergeClue not between", value1, value2, "ismergeclue");
            return (Criteria) this;
        }

        public Criteria andTrafficstateIsNull() {
            addCriterion("TrafficState is null");
            return (Criteria) this;
        }

        public Criteria andTrafficstateIsNotNull() {
            addCriterion("TrafficState is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficstateEqualTo(Integer value) {
            addCriterion("TrafficState =", value, "trafficstate");
            return (Criteria) this;
        }

        public Criteria andTrafficstateNotEqualTo(Integer value) {
            addCriterion("TrafficState <>", value, "trafficstate");
            return (Criteria) this;
        }

        public Criteria andTrafficstateGreaterThan(Integer value) {
            addCriterion("TrafficState >", value, "trafficstate");
            return (Criteria) this;
        }

        public Criteria andTrafficstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("TrafficState >=", value, "trafficstate");
            return (Criteria) this;
        }

        public Criteria andTrafficstateLessThan(Integer value) {
            addCriterion("TrafficState <", value, "trafficstate");
            return (Criteria) this;
        }

        public Criteria andTrafficstateLessThanOrEqualTo(Integer value) {
            addCriterion("TrafficState <=", value, "trafficstate");
            return (Criteria) this;
        }

        public Criteria andTrafficstateIn(List<Integer> values) {
            addCriterion("TrafficState in", values, "trafficstate");
            return (Criteria) this;
        }

        public Criteria andTrafficstateNotIn(List<Integer> values) {
            addCriterion("TrafficState not in", values, "trafficstate");
            return (Criteria) this;
        }

        public Criteria andTrafficstateBetween(Integer value1, Integer value2) {
            addCriterion("TrafficState between", value1, value2, "trafficstate");
            return (Criteria) this;
        }

        public Criteria andTrafficstateNotBetween(Integer value1, Integer value2) {
            addCriterion("TrafficState not between", value1, value2, "trafficstate");
            return (Criteria) this;
        }

        public Criteria andFailurereasonIsNull() {
            addCriterion("FailureReason is null");
            return (Criteria) this;
        }

        public Criteria andFailurereasonIsNotNull() {
            addCriterion("FailureReason is not null");
            return (Criteria) this;
        }

        public Criteria andFailurereasonEqualTo(Integer value) {
            addCriterion("FailureReason =", value, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonNotEqualTo(Integer value) {
            addCriterion("FailureReason <>", value, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonGreaterThan(Integer value) {
            addCriterion("FailureReason >", value, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("FailureReason >=", value, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonLessThan(Integer value) {
            addCriterion("FailureReason <", value, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonLessThanOrEqualTo(Integer value) {
            addCriterion("FailureReason <=", value, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonIn(List<Integer> values) {
            addCriterion("FailureReason in", values, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonNotIn(List<Integer> values) {
            addCriterion("FailureReason not in", values, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonBetween(Integer value1, Integer value2) {
            addCriterion("FailureReason between", value1, value2, "failurereason");
            return (Criteria) this;
        }

        public Criteria andFailurereasonNotBetween(Integer value1, Integer value2) {
            addCriterion("FailureReason not between", value1, value2, "failurereason");
            return (Criteria) this;
        }

        public Criteria andUrgencyIsNull() {
            addCriterion("Urgency is null");
            return (Criteria) this;
        }

        public Criteria andUrgencyIsNotNull() {
            addCriterion("Urgency is not null");
            return (Criteria) this;
        }

        public Criteria andUrgencyEqualTo(Integer value) {
            addCriterion("Urgency =", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotEqualTo(Integer value) {
            addCriterion("Urgency <>", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyGreaterThan(Integer value) {
            addCriterion("Urgency >", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Urgency >=", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLessThan(Integer value) {
            addCriterion("Urgency <", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLessThanOrEqualTo(Integer value) {
            addCriterion("Urgency <=", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyIn(List<Integer> values) {
            addCriterion("Urgency in", values, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotIn(List<Integer> values) {
            addCriterion("Urgency not in", values, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyBetween(Integer value1, Integer value2) {
            addCriterion("Urgency between", value1, value2, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotBetween(Integer value1, Integer value2) {
            addCriterion("Urgency not between", value1, value2, "urgency");
            return (Criteria) this;
        }

        public Criteria andErpCluestatusIsNull() {
            addCriterion("erp_ClueStatus is null");
            return (Criteria) this;
        }

        public Criteria andErpCluestatusIsNotNull() {
            addCriterion("erp_ClueStatus is not null");
            return (Criteria) this;
        }

        public Criteria andErpCluestatusEqualTo(String value) {
            addCriterion("erp_ClueStatus =", value, "erpCluestatus");
            return (Criteria) this;
        }

        public Criteria andErpCluestatusNotEqualTo(String value) {
            addCriterion("erp_ClueStatus <>", value, "erpCluestatus");
            return (Criteria) this;
        }

        public Criteria andErpCluestatusGreaterThan(String value) {
            addCriterion("erp_ClueStatus >", value, "erpCluestatus");
            return (Criteria) this;
        }

        public Criteria andErpCluestatusGreaterThanOrEqualTo(String value) {
            addCriterion("erp_ClueStatus >=", value, "erpCluestatus");
            return (Criteria) this;
        }

        public Criteria andErpCluestatusLessThan(String value) {
            addCriterion("erp_ClueStatus <", value, "erpCluestatus");
            return (Criteria) this;
        }

        public Criteria andErpCluestatusLessThanOrEqualTo(String value) {
            addCriterion("erp_ClueStatus <=", value, "erpCluestatus");
            return (Criteria) this;
        }

        public Criteria andErpCluestatusLike(String value) {
            addCriterion("erp_ClueStatus like", value, "erpCluestatus");
            return (Criteria) this;
        }

        public Criteria andErpCluestatusNotLike(String value) {
            addCriterion("erp_ClueStatus not like", value, "erpCluestatus");
            return (Criteria) this;
        }

        public Criteria andErpCluestatusIn(List<String> values) {
            addCriterion("erp_ClueStatus in", values, "erpCluestatus");
            return (Criteria) this;
        }

        public Criteria andErpCluestatusNotIn(List<String> values) {
            addCriterion("erp_ClueStatus not in", values, "erpCluestatus");
            return (Criteria) this;
        }

        public Criteria andErpCluestatusBetween(String value1, String value2) {
            addCriterion("erp_ClueStatus between", value1, value2, "erpCluestatus");
            return (Criteria) this;
        }

        public Criteria andErpCluestatusNotBetween(String value1, String value2) {
            addCriterion("erp_ClueStatus not between", value1, value2, "erpCluestatus");
            return (Criteria) this;
        }

        public Criteria andLastfollowbyIsNull() {
            addCriterion("LastFollowBy is null");
            return (Criteria) this;
        }

        public Criteria andLastfollowbyIsNotNull() {
            addCriterion("LastFollowBy is not null");
            return (Criteria) this;
        }

        public Criteria andLastfollowbyEqualTo(Integer value) {
            addCriterion("LastFollowBy =", value, "lastfollowby");
            return (Criteria) this;
        }

        public Criteria andLastfollowbyNotEqualTo(Integer value) {
            addCriterion("LastFollowBy <>", value, "lastfollowby");
            return (Criteria) this;
        }

        public Criteria andLastfollowbyGreaterThan(Integer value) {
            addCriterion("LastFollowBy >", value, "lastfollowby");
            return (Criteria) this;
        }

        public Criteria andLastfollowbyGreaterThanOrEqualTo(Integer value) {
            addCriterion("LastFollowBy >=", value, "lastfollowby");
            return (Criteria) this;
        }

        public Criteria andLastfollowbyLessThan(Integer value) {
            addCriterion("LastFollowBy <", value, "lastfollowby");
            return (Criteria) this;
        }

        public Criteria andLastfollowbyLessThanOrEqualTo(Integer value) {
            addCriterion("LastFollowBy <=", value, "lastfollowby");
            return (Criteria) this;
        }

        public Criteria andLastfollowbyIn(List<Integer> values) {
            addCriterion("LastFollowBy in", values, "lastfollowby");
            return (Criteria) this;
        }

        public Criteria andLastfollowbyNotIn(List<Integer> values) {
            addCriterion("LastFollowBy not in", values, "lastfollowby");
            return (Criteria) this;
        }

        public Criteria andLastfollowbyBetween(Integer value1, Integer value2) {
            addCriterion("LastFollowBy between", value1, value2, "lastfollowby");
            return (Criteria) this;
        }

        public Criteria andLastfollowbyNotBetween(Integer value1, Integer value2) {
            addCriterion("LastFollowBy not between", value1, value2, "lastfollowby");
            return (Criteria) this;
        }

        public Criteria andLastfollowtimeIsNull() {
            addCriterion("LastFollowTime is null");
            return (Criteria) this;
        }

        public Criteria andLastfollowtimeIsNotNull() {
            addCriterion("LastFollowTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastfollowtimeEqualTo(Date value) {
            addCriterion("LastFollowTime =", value, "lastfollowtime");
            return (Criteria) this;
        }

        public Criteria andLastfollowtimeNotEqualTo(Date value) {
            addCriterion("LastFollowTime <>", value, "lastfollowtime");
            return (Criteria) this;
        }

        public Criteria andLastfollowtimeGreaterThan(Date value) {
            addCriterion("LastFollowTime >", value, "lastfollowtime");
            return (Criteria) this;
        }

        public Criteria andLastfollowtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastFollowTime >=", value, "lastfollowtime");
            return (Criteria) this;
        }

        public Criteria andLastfollowtimeLessThan(Date value) {
            addCriterion("LastFollowTime <", value, "lastfollowtime");
            return (Criteria) this;
        }

        public Criteria andLastfollowtimeLessThanOrEqualTo(Date value) {
            addCriterion("LastFollowTime <=", value, "lastfollowtime");
            return (Criteria) this;
        }

        public Criteria andLastfollowtimeIn(List<Date> values) {
            addCriterion("LastFollowTime in", values, "lastfollowtime");
            return (Criteria) this;
        }

        public Criteria andLastfollowtimeNotIn(List<Date> values) {
            addCriterion("LastFollowTime not in", values, "lastfollowtime");
            return (Criteria) this;
        }

        public Criteria andLastfollowtimeBetween(Date value1, Date value2) {
            addCriterion("LastFollowTime between", value1, value2, "lastfollowtime");
            return (Criteria) this;
        }

        public Criteria andLastfollowtimeNotBetween(Date value1, Date value2) {
            addCriterion("LastFollowTime not between", value1, value2, "lastfollowtime");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Date value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Date value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Date value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Date value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Date value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Date> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Date> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Date value1, Date value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Date value1, Date value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
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