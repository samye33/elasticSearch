package com.am.es.entity.clue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClueInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClueInfoExample() {
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

        public Criteria andIntentionIsNull() {
            addCriterion("intention is null");
            return (Criteria) this;
        }

        public Criteria andIntentionIsNotNull() {
            addCriterion("intention is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionEqualTo(Integer value) {
            addCriterion("intention =", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionNotEqualTo(Integer value) {
            addCriterion("intention <>", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionGreaterThan(Integer value) {
            addCriterion("intention >", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionGreaterThanOrEqualTo(Integer value) {
            addCriterion("intention >=", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionLessThan(Integer value) {
            addCriterion("intention <", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionLessThanOrEqualTo(Integer value) {
            addCriterion("intention <=", value, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionIn(List<Integer> values) {
            addCriterion("intention in", values, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionNotIn(List<Integer> values) {
            addCriterion("intention not in", values, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionBetween(Integer value1, Integer value2) {
            addCriterion("intention between", value1, value2, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionNotBetween(Integer value1, Integer value2) {
            addCriterion("intention not between", value1, value2, "intention");
            return (Criteria) this;
        }

        public Criteria andIntentionGradeIsNull() {
            addCriterion("intention_grade is null");
            return (Criteria) this;
        }

        public Criteria andIntentionGradeIsNotNull() {
            addCriterion("intention_grade is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionGradeEqualTo(Integer value) {
            addCriterion("intention_grade =", value, "intentionGrade");
            return (Criteria) this;
        }

        public Criteria andIntentionGradeNotEqualTo(Integer value) {
            addCriterion("intention_grade <>", value, "intentionGrade");
            return (Criteria) this;
        }

        public Criteria andIntentionGradeGreaterThan(Integer value) {
            addCriterion("intention_grade >", value, "intentionGrade");
            return (Criteria) this;
        }

        public Criteria andIntentionGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("intention_grade >=", value, "intentionGrade");
            return (Criteria) this;
        }

        public Criteria andIntentionGradeLessThan(Integer value) {
            addCriterion("intention_grade <", value, "intentionGrade");
            return (Criteria) this;
        }

        public Criteria andIntentionGradeLessThanOrEqualTo(Integer value) {
            addCriterion("intention_grade <=", value, "intentionGrade");
            return (Criteria) this;
        }

        public Criteria andIntentionGradeIn(List<Integer> values) {
            addCriterion("intention_grade in", values, "intentionGrade");
            return (Criteria) this;
        }

        public Criteria andIntentionGradeNotIn(List<Integer> values) {
            addCriterion("intention_grade not in", values, "intentionGrade");
            return (Criteria) this;
        }

        public Criteria andIntentionGradeBetween(Integer value1, Integer value2) {
            addCriterion("intention_grade between", value1, value2, "intentionGrade");
            return (Criteria) this;
        }

        public Criteria andIntentionGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("intention_grade not between", value1, value2, "intentionGrade");
            return (Criteria) this;
        }

        public Criteria andFirstChannelCodeIsNull() {
            addCriterion("first_channel_code is null");
            return (Criteria) this;
        }

        public Criteria andFirstChannelCodeIsNotNull() {
            addCriterion("first_channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andFirstChannelCodeEqualTo(String value) {
            addCriterion("first_channel_code =", value, "firstChannelCode");
            return (Criteria) this;
        }

        public Criteria andFirstChannelCodeNotEqualTo(String value) {
            addCriterion("first_channel_code <>", value, "firstChannelCode");
            return (Criteria) this;
        }

        public Criteria andFirstChannelCodeGreaterThan(String value) {
            addCriterion("first_channel_code >", value, "firstChannelCode");
            return (Criteria) this;
        }

        public Criteria andFirstChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("first_channel_code >=", value, "firstChannelCode");
            return (Criteria) this;
        }

        public Criteria andFirstChannelCodeLessThan(String value) {
            addCriterion("first_channel_code <", value, "firstChannelCode");
            return (Criteria) this;
        }

        public Criteria andFirstChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("first_channel_code <=", value, "firstChannelCode");
            return (Criteria) this;
        }

        public Criteria andFirstChannelCodeLike(String value) {
            addCriterion("first_channel_code like", value, "firstChannelCode");
            return (Criteria) this;
        }

        public Criteria andFirstChannelCodeNotLike(String value) {
            addCriterion("first_channel_code not like", value, "firstChannelCode");
            return (Criteria) this;
        }

        public Criteria andFirstChannelCodeIn(List<String> values) {
            addCriterion("first_channel_code in", values, "firstChannelCode");
            return (Criteria) this;
        }

        public Criteria andFirstChannelCodeNotIn(List<String> values) {
            addCriterion("first_channel_code not in", values, "firstChannelCode");
            return (Criteria) this;
        }

        public Criteria andFirstChannelCodeBetween(String value1, String value2) {
            addCriterion("first_channel_code between", value1, value2, "firstChannelCode");
            return (Criteria) this;
        }

        public Criteria andFirstChannelCodeNotBetween(String value1, String value2) {
            addCriterion("first_channel_code not between", value1, value2, "firstChannelCode");
            return (Criteria) this;
        }

        public Criteria andEffectivelyChannelCodeIsNull() {
            addCriterion("effectively_channel_code is null");
            return (Criteria) this;
        }

        public Criteria andEffectivelyChannelCodeIsNotNull() {
            addCriterion("effectively_channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andEffectivelyChannelCodeEqualTo(String value) {
            addCriterion("effectively_channel_code =", value, "effectivelyChannelCode");
            return (Criteria) this;
        }

        public Criteria andEffectivelyChannelCodeNotEqualTo(String value) {
            addCriterion("effectively_channel_code <>", value, "effectivelyChannelCode");
            return (Criteria) this;
        }

        public Criteria andEffectivelyChannelCodeGreaterThan(String value) {
            addCriterion("effectively_channel_code >", value, "effectivelyChannelCode");
            return (Criteria) this;
        }

        public Criteria andEffectivelyChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("effectively_channel_code >=", value, "effectivelyChannelCode");
            return (Criteria) this;
        }

        public Criteria andEffectivelyChannelCodeLessThan(String value) {
            addCriterion("effectively_channel_code <", value, "effectivelyChannelCode");
            return (Criteria) this;
        }

        public Criteria andEffectivelyChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("effectively_channel_code <=", value, "effectivelyChannelCode");
            return (Criteria) this;
        }

        public Criteria andEffectivelyChannelCodeLike(String value) {
            addCriterion("effectively_channel_code like", value, "effectivelyChannelCode");
            return (Criteria) this;
        }

        public Criteria andEffectivelyChannelCodeNotLike(String value) {
            addCriterion("effectively_channel_code not like", value, "effectivelyChannelCode");
            return (Criteria) this;
        }

        public Criteria andEffectivelyChannelCodeIn(List<String> values) {
            addCriterion("effectively_channel_code in", values, "effectivelyChannelCode");
            return (Criteria) this;
        }

        public Criteria andEffectivelyChannelCodeNotIn(List<String> values) {
            addCriterion("effectively_channel_code not in", values, "effectivelyChannelCode");
            return (Criteria) this;
        }

        public Criteria andEffectivelyChannelCodeBetween(String value1, String value2) {
            addCriterion("effectively_channel_code between", value1, value2, "effectivelyChannelCode");
            return (Criteria) this;
        }

        public Criteria andEffectivelyChannelCodeNotBetween(String value1, String value2) {
            addCriterion("effectively_channel_code not between", value1, value2, "effectivelyChannelCode");
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andChannelCodeSubIsNull() {
            addCriterion("channel_code_sub is null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubIsNotNull() {
            addCriterion("channel_code_sub is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubEqualTo(Integer value) {
            addCriterion("channel_code_sub =", value, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubNotEqualTo(Integer value) {
            addCriterion("channel_code_sub <>", value, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubGreaterThan(Integer value) {
            addCriterion("channel_code_sub >", value, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_code_sub >=", value, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubLessThan(Integer value) {
            addCriterion("channel_code_sub <", value, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubLessThanOrEqualTo(Integer value) {
            addCriterion("channel_code_sub <=", value, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubIn(List<Integer> values) {
            addCriterion("channel_code_sub in", values, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubNotIn(List<Integer> values) {
            addCriterion("channel_code_sub not in", values, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubBetween(Integer value1, Integer value2) {
            addCriterion("channel_code_sub between", value1, value2, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_code_sub not between", value1, value2, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andSourceChannelCodeIsNull() {
            addCriterion("source_channel_code is null");
            return (Criteria) this;
        }

        public Criteria andSourceChannelCodeIsNotNull() {
            addCriterion("source_channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andSourceChannelCodeEqualTo(String value) {
            addCriterion("source_channel_code =", value, "sourceChannelCode");
            return (Criteria) this;
        }

        public Criteria andSourceChannelCodeNotEqualTo(String value) {
            addCriterion("source_channel_code <>", value, "sourceChannelCode");
            return (Criteria) this;
        }

        public Criteria andSourceChannelCodeGreaterThan(String value) {
            addCriterion("source_channel_code >", value, "sourceChannelCode");
            return (Criteria) this;
        }

        public Criteria andSourceChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("source_channel_code >=", value, "sourceChannelCode");
            return (Criteria) this;
        }

        public Criteria andSourceChannelCodeLessThan(String value) {
            addCriterion("source_channel_code <", value, "sourceChannelCode");
            return (Criteria) this;
        }

        public Criteria andSourceChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("source_channel_code <=", value, "sourceChannelCode");
            return (Criteria) this;
        }

        public Criteria andSourceChannelCodeLike(String value) {
            addCriterion("source_channel_code like", value, "sourceChannelCode");
            return (Criteria) this;
        }

        public Criteria andSourceChannelCodeNotLike(String value) {
            addCriterion("source_channel_code not like", value, "sourceChannelCode");
            return (Criteria) this;
        }

        public Criteria andSourceChannelCodeIn(List<String> values) {
            addCriterion("source_channel_code in", values, "sourceChannelCode");
            return (Criteria) this;
        }

        public Criteria andSourceChannelCodeNotIn(List<String> values) {
            addCriterion("source_channel_code not in", values, "sourceChannelCode");
            return (Criteria) this;
        }

        public Criteria andSourceChannelCodeBetween(String value1, String value2) {
            addCriterion("source_channel_code between", value1, value2, "sourceChannelCode");
            return (Criteria) this;
        }

        public Criteria andSourceChannelCodeNotBetween(String value1, String value2) {
            addCriterion("source_channel_code not between", value1, value2, "sourceChannelCode");
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