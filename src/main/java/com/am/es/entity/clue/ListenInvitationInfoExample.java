package com.am.es.entity.clue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListenInvitationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ListenInvitationInfoExample() {
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

        public Criteria andListenInvitationNoIsNull() {
            addCriterion("listen_invitation_no is null");
            return (Criteria) this;
        }

        public Criteria andListenInvitationNoIsNotNull() {
            addCriterion("listen_invitation_no is not null");
            return (Criteria) this;
        }

        public Criteria andListenInvitationNoEqualTo(String value) {
            addCriterion("listen_invitation_no =", value, "listenInvitationNo");
            return (Criteria) this;
        }

        public Criteria andListenInvitationNoNotEqualTo(String value) {
            addCriterion("listen_invitation_no <>", value, "listenInvitationNo");
            return (Criteria) this;
        }

        public Criteria andListenInvitationNoGreaterThan(String value) {
            addCriterion("listen_invitation_no >", value, "listenInvitationNo");
            return (Criteria) this;
        }

        public Criteria andListenInvitationNoGreaterThanOrEqualTo(String value) {
            addCriterion("listen_invitation_no >=", value, "listenInvitationNo");
            return (Criteria) this;
        }

        public Criteria andListenInvitationNoLessThan(String value) {
            addCriterion("listen_invitation_no <", value, "listenInvitationNo");
            return (Criteria) this;
        }

        public Criteria andListenInvitationNoLessThanOrEqualTo(String value) {
            addCriterion("listen_invitation_no <=", value, "listenInvitationNo");
            return (Criteria) this;
        }

        public Criteria andListenInvitationNoLike(String value) {
            addCriterion("listen_invitation_no like", value, "listenInvitationNo");
            return (Criteria) this;
        }

        public Criteria andListenInvitationNoNotLike(String value) {
            addCriterion("listen_invitation_no not like", value, "listenInvitationNo");
            return (Criteria) this;
        }

        public Criteria andListenInvitationNoIn(List<String> values) {
            addCriterion("listen_invitation_no in", values, "listenInvitationNo");
            return (Criteria) this;
        }

        public Criteria andListenInvitationNoNotIn(List<String> values) {
            addCriterion("listen_invitation_no not in", values, "listenInvitationNo");
            return (Criteria) this;
        }

        public Criteria andListenInvitationNoBetween(String value1, String value2) {
            addCriterion("listen_invitation_no between", value1, value2, "listenInvitationNo");
            return (Criteria) this;
        }

        public Criteria andListenInvitationNoNotBetween(String value1, String value2) {
            addCriterion("listen_invitation_no not between", value1, value2, "listenInvitationNo");
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

        public Criteria andLiStatusIsNull() {
            addCriterion("LI_status is null");
            return (Criteria) this;
        }

        public Criteria andLiStatusIsNotNull() {
            addCriterion("LI_status is not null");
            return (Criteria) this;
        }

        public Criteria andLiStatusEqualTo(Integer value) {
            addCriterion("LI_status =", value, "liStatus");
            return (Criteria) this;
        }

        public Criteria andLiStatusNotEqualTo(Integer value) {
            addCriterion("LI_status <>", value, "liStatus");
            return (Criteria) this;
        }

        public Criteria andLiStatusGreaterThan(Integer value) {
            addCriterion("LI_status >", value, "liStatus");
            return (Criteria) this;
        }

        public Criteria andLiStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("LI_status >=", value, "liStatus");
            return (Criteria) this;
        }

        public Criteria andLiStatusLessThan(Integer value) {
            addCriterion("LI_status <", value, "liStatus");
            return (Criteria) this;
        }

        public Criteria andLiStatusLessThanOrEqualTo(Integer value) {
            addCriterion("LI_status <=", value, "liStatus");
            return (Criteria) this;
        }

        public Criteria andLiStatusIn(List<Integer> values) {
            addCriterion("LI_status in", values, "liStatus");
            return (Criteria) this;
        }

        public Criteria andLiStatusNotIn(List<Integer> values) {
            addCriterion("LI_status not in", values, "liStatus");
            return (Criteria) this;
        }

        public Criteria andLiStatusBetween(Integer value1, Integer value2) {
            addCriterion("LI_status between", value1, value2, "liStatus");
            return (Criteria) this;
        }

        public Criteria andLiStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("LI_status not between", value1, value2, "liStatus");
            return (Criteria) this;
        }

        public Criteria andLiTypeIsNull() {
            addCriterion("LI_type is null");
            return (Criteria) this;
        }

        public Criteria andLiTypeIsNotNull() {
            addCriterion("LI_type is not null");
            return (Criteria) this;
        }

        public Criteria andLiTypeEqualTo(Integer value) {
            addCriterion("LI_type =", value, "liType");
            return (Criteria) this;
        }

        public Criteria andLiTypeNotEqualTo(Integer value) {
            addCriterion("LI_type <>", value, "liType");
            return (Criteria) this;
        }

        public Criteria andLiTypeGreaterThan(Integer value) {
            addCriterion("LI_type >", value, "liType");
            return (Criteria) this;
        }

        public Criteria andLiTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("LI_type >=", value, "liType");
            return (Criteria) this;
        }

        public Criteria andLiTypeLessThan(Integer value) {
            addCriterion("LI_type <", value, "liType");
            return (Criteria) this;
        }

        public Criteria andLiTypeLessThanOrEqualTo(Integer value) {
            addCriterion("LI_type <=", value, "liType");
            return (Criteria) this;
        }

        public Criteria andLiTypeIn(List<Integer> values) {
            addCriterion("LI_type in", values, "liType");
            return (Criteria) this;
        }

        public Criteria andLiTypeNotIn(List<Integer> values) {
            addCriterion("LI_type not in", values, "liType");
            return (Criteria) this;
        }

        public Criteria andLiTypeBetween(Integer value1, Integer value2) {
            addCriterion("LI_type between", value1, value2, "liType");
            return (Criteria) this;
        }

        public Criteria andLiTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("LI_type not between", value1, value2, "liType");
            return (Criteria) this;
        }

        public Criteria andLiStartTimeIsNull() {
            addCriterion("LI_start_time is null");
            return (Criteria) this;
        }

        public Criteria andLiStartTimeIsNotNull() {
            addCriterion("LI_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andLiStartTimeEqualTo(Date value) {
            addCriterion("LI_start_time =", value, "liStartTime");
            return (Criteria) this;
        }

        public Criteria andLiStartTimeNotEqualTo(Date value) {
            addCriterion("LI_start_time <>", value, "liStartTime");
            return (Criteria) this;
        }

        public Criteria andLiStartTimeGreaterThan(Date value) {
            addCriterion("LI_start_time >", value, "liStartTime");
            return (Criteria) this;
        }

        public Criteria andLiStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LI_start_time >=", value, "liStartTime");
            return (Criteria) this;
        }

        public Criteria andLiStartTimeLessThan(Date value) {
            addCriterion("LI_start_time <", value, "liStartTime");
            return (Criteria) this;
        }

        public Criteria andLiStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("LI_start_time <=", value, "liStartTime");
            return (Criteria) this;
        }

        public Criteria andLiStartTimeIn(List<Date> values) {
            addCriterion("LI_start_time in", values, "liStartTime");
            return (Criteria) this;
        }

        public Criteria andLiStartTimeNotIn(List<Date> values) {
            addCriterion("LI_start_time not in", values, "liStartTime");
            return (Criteria) this;
        }

        public Criteria andLiStartTimeBetween(Date value1, Date value2) {
            addCriterion("LI_start_time between", value1, value2, "liStartTime");
            return (Criteria) this;
        }

        public Criteria andLiStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("LI_start_time not between", value1, value2, "liStartTime");
            return (Criteria) this;
        }

        public Criteria andLiEndtImeIsNull() {
            addCriterion("LI_endt_ime is null");
            return (Criteria) this;
        }

        public Criteria andLiEndtImeIsNotNull() {
            addCriterion("LI_endt_ime is not null");
            return (Criteria) this;
        }

        public Criteria andLiEndtImeEqualTo(Date value) {
            addCriterion("LI_endt_ime =", value, "liEndtIme");
            return (Criteria) this;
        }

        public Criteria andLiEndtImeNotEqualTo(Date value) {
            addCriterion("LI_endt_ime <>", value, "liEndtIme");
            return (Criteria) this;
        }

        public Criteria andLiEndtImeGreaterThan(Date value) {
            addCriterion("LI_endt_ime >", value, "liEndtIme");
            return (Criteria) this;
        }

        public Criteria andLiEndtImeGreaterThanOrEqualTo(Date value) {
            addCriterion("LI_endt_ime >=", value, "liEndtIme");
            return (Criteria) this;
        }

        public Criteria andLiEndtImeLessThan(Date value) {
            addCriterion("LI_endt_ime <", value, "liEndtIme");
            return (Criteria) this;
        }

        public Criteria andLiEndtImeLessThanOrEqualTo(Date value) {
            addCriterion("LI_endt_ime <=", value, "liEndtIme");
            return (Criteria) this;
        }

        public Criteria andLiEndtImeIn(List<Date> values) {
            addCriterion("LI_endt_ime in", values, "liEndtIme");
            return (Criteria) this;
        }

        public Criteria andLiEndtImeNotIn(List<Date> values) {
            addCriterion("LI_endt_ime not in", values, "liEndtIme");
            return (Criteria) this;
        }

        public Criteria andLiEndtImeBetween(Date value1, Date value2) {
            addCriterion("LI_endt_ime between", value1, value2, "liEndtIme");
            return (Criteria) this;
        }

        public Criteria andLiEndtImeNotBetween(Date value1, Date value2) {
            addCriterion("LI_endt_ime not between", value1, value2, "liEndtIme");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(String value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(String value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(String value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(String value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(String value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(String value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLike(String value) {
            addCriterion("room_id like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotLike(String value) {
            addCriterion("room_id not like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<String> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<String> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(String value1, String value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(String value1, String value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
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

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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

        public Criteria andLiContentIsNull() {
            addCriterion("LI_content is null");
            return (Criteria) this;
        }

        public Criteria andLiContentIsNotNull() {
            addCriterion("LI_content is not null");
            return (Criteria) this;
        }

        public Criteria andLiContentEqualTo(String value) {
            addCriterion("LI_content =", value, "liContent");
            return (Criteria) this;
        }

        public Criteria andLiContentNotEqualTo(String value) {
            addCriterion("LI_content <>", value, "liContent");
            return (Criteria) this;
        }

        public Criteria andLiContentGreaterThan(String value) {
            addCriterion("LI_content >", value, "liContent");
            return (Criteria) this;
        }

        public Criteria andLiContentGreaterThanOrEqualTo(String value) {
            addCriterion("LI_content >=", value, "liContent");
            return (Criteria) this;
        }

        public Criteria andLiContentLessThan(String value) {
            addCriterion("LI_content <", value, "liContent");
            return (Criteria) this;
        }

        public Criteria andLiContentLessThanOrEqualTo(String value) {
            addCriterion("LI_content <=", value, "liContent");
            return (Criteria) this;
        }

        public Criteria andLiContentLike(String value) {
            addCriterion("LI_content like", value, "liContent");
            return (Criteria) this;
        }

        public Criteria andLiContentNotLike(String value) {
            addCriterion("LI_content not like", value, "liContent");
            return (Criteria) this;
        }

        public Criteria andLiContentIn(List<String> values) {
            addCriterion("LI_content in", values, "liContent");
            return (Criteria) this;
        }

        public Criteria andLiContentNotIn(List<String> values) {
            addCriterion("LI_content not in", values, "liContent");
            return (Criteria) this;
        }

        public Criteria andLiContentBetween(String value1, String value2) {
            addCriterion("LI_content between", value1, value2, "liContent");
            return (Criteria) this;
        }

        public Criteria andLiContentNotBetween(String value1, String value2) {
            addCriterion("LI_content not between", value1, value2, "liContent");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(String value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(String value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(String value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(String value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(String value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLike(String value) {
            addCriterion("course_id like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotLike(String value) {
            addCriterion("course_id not like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<String> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<String> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(String value1, String value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(String value1, String value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
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