package com.am.es.clueentity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListenInvitationFeedBackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ListenInvitationFeedBackExample() {
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

        public Criteria andListenInvitationIdIsNull() {
            addCriterion("listen_invitation_id is null");
            return (Criteria) this;
        }

        public Criteria andListenInvitationIdIsNotNull() {
            addCriterion("listen_invitation_id is not null");
            return (Criteria) this;
        }

        public Criteria andListenInvitationIdEqualTo(Integer value) {
            addCriterion("listen_invitation_id =", value, "listenInvitationId");
            return (Criteria) this;
        }

        public Criteria andListenInvitationIdNotEqualTo(Integer value) {
            addCriterion("listen_invitation_id <>", value, "listenInvitationId");
            return (Criteria) this;
        }

        public Criteria andListenInvitationIdGreaterThan(Integer value) {
            addCriterion("listen_invitation_id >", value, "listenInvitationId");
            return (Criteria) this;
        }

        public Criteria andListenInvitationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("listen_invitation_id >=", value, "listenInvitationId");
            return (Criteria) this;
        }

        public Criteria andListenInvitationIdLessThan(Integer value) {
            addCriterion("listen_invitation_id <", value, "listenInvitationId");
            return (Criteria) this;
        }

        public Criteria andListenInvitationIdLessThanOrEqualTo(Integer value) {
            addCriterion("listen_invitation_id <=", value, "listenInvitationId");
            return (Criteria) this;
        }

        public Criteria andListenInvitationIdIn(List<Integer> values) {
            addCriterion("listen_invitation_id in", values, "listenInvitationId");
            return (Criteria) this;
        }

        public Criteria andListenInvitationIdNotIn(List<Integer> values) {
            addCriterion("listen_invitation_id not in", values, "listenInvitationId");
            return (Criteria) this;
        }

        public Criteria andListenInvitationIdBetween(Integer value1, Integer value2) {
            addCriterion("listen_invitation_id between", value1, value2, "listenInvitationId");
            return (Criteria) this;
        }

        public Criteria andListenInvitationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("listen_invitation_id not between", value1, value2, "listenInvitationId");
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

        public Criteria andIsVisitIsNull() {
            addCriterion("is_visit is null");
            return (Criteria) this;
        }

        public Criteria andIsVisitIsNotNull() {
            addCriterion("is_visit is not null");
            return (Criteria) this;
        }

        public Criteria andIsVisitEqualTo(Byte value) {
            addCriterion("is_visit =", value, "isVisit");
            return (Criteria) this;
        }

        public Criteria andIsVisitNotEqualTo(Byte value) {
            addCriterion("is_visit <>", value, "isVisit");
            return (Criteria) this;
        }

        public Criteria andIsVisitGreaterThan(Byte value) {
            addCriterion("is_visit >", value, "isVisit");
            return (Criteria) this;
        }

        public Criteria andIsVisitGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_visit >=", value, "isVisit");
            return (Criteria) this;
        }

        public Criteria andIsVisitLessThan(Byte value) {
            addCriterion("is_visit <", value, "isVisit");
            return (Criteria) this;
        }

        public Criteria andIsVisitLessThanOrEqualTo(Byte value) {
            addCriterion("is_visit <=", value, "isVisit");
            return (Criteria) this;
        }

        public Criteria andIsVisitIn(List<Byte> values) {
            addCriterion("is_visit in", values, "isVisit");
            return (Criteria) this;
        }

        public Criteria andIsVisitNotIn(List<Byte> values) {
            addCriterion("is_visit not in", values, "isVisit");
            return (Criteria) this;
        }

        public Criteria andIsVisitBetween(Byte value1, Byte value2) {
            addCriterion("is_visit between", value1, value2, "isVisit");
            return (Criteria) this;
        }

        public Criteria andIsVisitNotBetween(Byte value1, Byte value2) {
            addCriterion("is_visit not between", value1, value2, "isVisit");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andLongTimeIsNull() {
            addCriterion("long_time is null");
            return (Criteria) this;
        }

        public Criteria andLongTimeIsNotNull() {
            addCriterion("long_time is not null");
            return (Criteria) this;
        }

        public Criteria andLongTimeEqualTo(Integer value) {
            addCriterion("long_time =", value, "longTime");
            return (Criteria) this;
        }

        public Criteria andLongTimeNotEqualTo(Integer value) {
            addCriterion("long_time <>", value, "longTime");
            return (Criteria) this;
        }

        public Criteria andLongTimeGreaterThan(Integer value) {
            addCriterion("long_time >", value, "longTime");
            return (Criteria) this;
        }

        public Criteria andLongTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("long_time >=", value, "longTime");
            return (Criteria) this;
        }

        public Criteria andLongTimeLessThan(Integer value) {
            addCriterion("long_time <", value, "longTime");
            return (Criteria) this;
        }

        public Criteria andLongTimeLessThanOrEqualTo(Integer value) {
            addCriterion("long_time <=", value, "longTime");
            return (Criteria) this;
        }

        public Criteria andLongTimeIn(List<Integer> values) {
            addCriterion("long_time in", values, "longTime");
            return (Criteria) this;
        }

        public Criteria andLongTimeNotIn(List<Integer> values) {
            addCriterion("long_time not in", values, "longTime");
            return (Criteria) this;
        }

        public Criteria andLongTimeBetween(Integer value1, Integer value2) {
            addCriterion("long_time between", value1, value2, "longTime");
            return (Criteria) this;
        }

        public Criteria andLongTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("long_time not between", value1, value2, "longTime");
            return (Criteria) this;
        }

        public Criteria andStudentFeedFackIsNull() {
            addCriterion("student_feed_fack is null");
            return (Criteria) this;
        }

        public Criteria andStudentFeedFackIsNotNull() {
            addCriterion("student_feed_fack is not null");
            return (Criteria) this;
        }

        public Criteria andStudentFeedFackEqualTo(String value) {
            addCriterion("student_feed_fack =", value, "studentFeedFack");
            return (Criteria) this;
        }

        public Criteria andStudentFeedFackNotEqualTo(String value) {
            addCriterion("student_feed_fack <>", value, "studentFeedFack");
            return (Criteria) this;
        }

        public Criteria andStudentFeedFackGreaterThan(String value) {
            addCriterion("student_feed_fack >", value, "studentFeedFack");
            return (Criteria) this;
        }

        public Criteria andStudentFeedFackGreaterThanOrEqualTo(String value) {
            addCriterion("student_feed_fack >=", value, "studentFeedFack");
            return (Criteria) this;
        }

        public Criteria andStudentFeedFackLessThan(String value) {
            addCriterion("student_feed_fack <", value, "studentFeedFack");
            return (Criteria) this;
        }

        public Criteria andStudentFeedFackLessThanOrEqualTo(String value) {
            addCriterion("student_feed_fack <=", value, "studentFeedFack");
            return (Criteria) this;
        }

        public Criteria andStudentFeedFackLike(String value) {
            addCriterion("student_feed_fack like", value, "studentFeedFack");
            return (Criteria) this;
        }

        public Criteria andStudentFeedFackNotLike(String value) {
            addCriterion("student_feed_fack not like", value, "studentFeedFack");
            return (Criteria) this;
        }

        public Criteria andStudentFeedFackIn(List<String> values) {
            addCriterion("student_feed_fack in", values, "studentFeedFack");
            return (Criteria) this;
        }

        public Criteria andStudentFeedFackNotIn(List<String> values) {
            addCriterion("student_feed_fack not in", values, "studentFeedFack");
            return (Criteria) this;
        }

        public Criteria andStudentFeedFackBetween(String value1, String value2) {
            addCriterion("student_feed_fack between", value1, value2, "studentFeedFack");
            return (Criteria) this;
        }

        public Criteria andStudentFeedFackNotBetween(String value1, String value2) {
            addCriterion("student_feed_fack not between", value1, value2, "studentFeedFack");
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

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(String value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(String value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(String value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(String value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLike(String value) {
            addCriterion("teacher_id like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotLike(String value) {
            addCriterion("teacher_id not like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<String> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<String> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(String value1, String value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(String value1, String value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andLessonIdIsNull() {
            addCriterion("lesson_id is null");
            return (Criteria) this;
        }

        public Criteria andLessonIdIsNotNull() {
            addCriterion("lesson_id is not null");
            return (Criteria) this;
        }

        public Criteria andLessonIdEqualTo(String value) {
            addCriterion("lesson_id =", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdNotEqualTo(String value) {
            addCriterion("lesson_id <>", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdGreaterThan(String value) {
            addCriterion("lesson_id >", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdGreaterThanOrEqualTo(String value) {
            addCriterion("lesson_id >=", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdLessThan(String value) {
            addCriterion("lesson_id <", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdLessThanOrEqualTo(String value) {
            addCriterion("lesson_id <=", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdLike(String value) {
            addCriterion("lesson_id like", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdNotLike(String value) {
            addCriterion("lesson_id not like", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdIn(List<String> values) {
            addCriterion("lesson_id in", values, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdNotIn(List<String> values) {
            addCriterion("lesson_id not in", values, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdBetween(String value1, String value2) {
            addCriterion("lesson_id between", value1, value2, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdNotBetween(String value1, String value2) {
            addCriterion("lesson_id not between", value1, value2, "lessonId");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andLessonUrlIsNull() {
            addCriterion("lesson_url is null");
            return (Criteria) this;
        }

        public Criteria andLessonUrlIsNotNull() {
            addCriterion("lesson_url is not null");
            return (Criteria) this;
        }

        public Criteria andLessonUrlEqualTo(String value) {
            addCriterion("lesson_url =", value, "lessonUrl");
            return (Criteria) this;
        }

        public Criteria andLessonUrlNotEqualTo(String value) {
            addCriterion("lesson_url <>", value, "lessonUrl");
            return (Criteria) this;
        }

        public Criteria andLessonUrlGreaterThan(String value) {
            addCriterion("lesson_url >", value, "lessonUrl");
            return (Criteria) this;
        }

        public Criteria andLessonUrlGreaterThanOrEqualTo(String value) {
            addCriterion("lesson_url >=", value, "lessonUrl");
            return (Criteria) this;
        }

        public Criteria andLessonUrlLessThan(String value) {
            addCriterion("lesson_url <", value, "lessonUrl");
            return (Criteria) this;
        }

        public Criteria andLessonUrlLessThanOrEqualTo(String value) {
            addCriterion("lesson_url <=", value, "lessonUrl");
            return (Criteria) this;
        }

        public Criteria andLessonUrlLike(String value) {
            addCriterion("lesson_url like", value, "lessonUrl");
            return (Criteria) this;
        }

        public Criteria andLessonUrlNotLike(String value) {
            addCriterion("lesson_url not like", value, "lessonUrl");
            return (Criteria) this;
        }

        public Criteria andLessonUrlIn(List<String> values) {
            addCriterion("lesson_url in", values, "lessonUrl");
            return (Criteria) this;
        }

        public Criteria andLessonUrlNotIn(List<String> values) {
            addCriterion("lesson_url not in", values, "lessonUrl");
            return (Criteria) this;
        }

        public Criteria andLessonUrlBetween(String value1, String value2) {
            addCriterion("lesson_url between", value1, value2, "lessonUrl");
            return (Criteria) this;
        }

        public Criteria andLessonUrlNotBetween(String value1, String value2) {
            addCriterion("lesson_url not between", value1, value2, "lessonUrl");
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