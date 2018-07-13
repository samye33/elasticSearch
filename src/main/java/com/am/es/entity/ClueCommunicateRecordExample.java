package com.am.es.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClueCommunicateRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClueCommunicateRecordExample() {
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

        public Criteria andToolIsNull() {
            addCriterion("tool is null");
            return (Criteria) this;
        }

        public Criteria andToolIsNotNull() {
            addCriterion("tool is not null");
            return (Criteria) this;
        }

        public Criteria andToolEqualTo(Integer value) {
            addCriterion("tool =", value, "tool");
            return (Criteria) this;
        }

        public Criteria andToolNotEqualTo(Integer value) {
            addCriterion("tool <>", value, "tool");
            return (Criteria) this;
        }

        public Criteria andToolGreaterThan(Integer value) {
            addCriterion("tool >", value, "tool");
            return (Criteria) this;
        }

        public Criteria andToolGreaterThanOrEqualTo(Integer value) {
            addCriterion("tool >=", value, "tool");
            return (Criteria) this;
        }

        public Criteria andToolLessThan(Integer value) {
            addCriterion("tool <", value, "tool");
            return (Criteria) this;
        }

        public Criteria andToolLessThanOrEqualTo(Integer value) {
            addCriterion("tool <=", value, "tool");
            return (Criteria) this;
        }

        public Criteria andToolIn(List<Integer> values) {
            addCriterion("tool in", values, "tool");
            return (Criteria) this;
        }

        public Criteria andToolNotIn(List<Integer> values) {
            addCriterion("tool not in", values, "tool");
            return (Criteria) this;
        }

        public Criteria andToolBetween(Integer value1, Integer value2) {
            addCriterion("tool between", value1, value2, "tool");
            return (Criteria) this;
        }

        public Criteria andToolNotBetween(Integer value1, Integer value2) {
            addCriterion("tool not between", value1, value2, "tool");
            return (Criteria) this;
        }

        public Criteria andCommunicatTimeIsNull() {
            addCriterion("communicat_time is null");
            return (Criteria) this;
        }

        public Criteria andCommunicatTimeIsNotNull() {
            addCriterion("communicat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicatTimeEqualTo(Date value) {
            addCriterion("communicat_time =", value, "communicatTime");
            return (Criteria) this;
        }

        public Criteria andCommunicatTimeNotEqualTo(Date value) {
            addCriterion("communicat_time <>", value, "communicatTime");
            return (Criteria) this;
        }

        public Criteria andCommunicatTimeGreaterThan(Date value) {
            addCriterion("communicat_time >", value, "communicatTime");
            return (Criteria) this;
        }

        public Criteria andCommunicatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("communicat_time >=", value, "communicatTime");
            return (Criteria) this;
        }

        public Criteria andCommunicatTimeLessThan(Date value) {
            addCriterion("communicat_time <", value, "communicatTime");
            return (Criteria) this;
        }

        public Criteria andCommunicatTimeLessThanOrEqualTo(Date value) {
            addCriterion("communicat_time <=", value, "communicatTime");
            return (Criteria) this;
        }

        public Criteria andCommunicatTimeIn(List<Date> values) {
            addCriterion("communicat_time in", values, "communicatTime");
            return (Criteria) this;
        }

        public Criteria andCommunicatTimeNotIn(List<Date> values) {
            addCriterion("communicat_time not in", values, "communicatTime");
            return (Criteria) this;
        }

        public Criteria andCommunicatTimeBetween(Date value1, Date value2) {
            addCriterion("communicat_time between", value1, value2, "communicatTime");
            return (Criteria) this;
        }

        public Criteria andCommunicatTimeNotBetween(Date value1, Date value2) {
            addCriterion("communicat_time not between", value1, value2, "communicatTime");
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

        public Criteria andOldClueStatusIsNull() {
            addCriterion("old_clue_status is null");
            return (Criteria) this;
        }

        public Criteria andOldClueStatusIsNotNull() {
            addCriterion("old_clue_status is not null");
            return (Criteria) this;
        }

        public Criteria andOldClueStatusEqualTo(String value) {
            addCriterion("old_clue_status =", value, "oldClueStatus");
            return (Criteria) this;
        }

        public Criteria andOldClueStatusNotEqualTo(String value) {
            addCriterion("old_clue_status <>", value, "oldClueStatus");
            return (Criteria) this;
        }

        public Criteria andOldClueStatusGreaterThan(String value) {
            addCriterion("old_clue_status >", value, "oldClueStatus");
            return (Criteria) this;
        }

        public Criteria andOldClueStatusGreaterThanOrEqualTo(String value) {
            addCriterion("old_clue_status >=", value, "oldClueStatus");
            return (Criteria) this;
        }

        public Criteria andOldClueStatusLessThan(String value) {
            addCriterion("old_clue_status <", value, "oldClueStatus");
            return (Criteria) this;
        }

        public Criteria andOldClueStatusLessThanOrEqualTo(String value) {
            addCriterion("old_clue_status <=", value, "oldClueStatus");
            return (Criteria) this;
        }

        public Criteria andOldClueStatusLike(String value) {
            addCriterion("old_clue_status like", value, "oldClueStatus");
            return (Criteria) this;
        }

        public Criteria andOldClueStatusNotLike(String value) {
            addCriterion("old_clue_status not like", value, "oldClueStatus");
            return (Criteria) this;
        }

        public Criteria andOldClueStatusIn(List<String> values) {
            addCriterion("old_clue_status in", values, "oldClueStatus");
            return (Criteria) this;
        }

        public Criteria andOldClueStatusNotIn(List<String> values) {
            addCriterion("old_clue_status not in", values, "oldClueStatus");
            return (Criteria) this;
        }

        public Criteria andOldClueStatusBetween(String value1, String value2) {
            addCriterion("old_clue_status between", value1, value2, "oldClueStatus");
            return (Criteria) this;
        }

        public Criteria andOldClueStatusNotBetween(String value1, String value2) {
            addCriterion("old_clue_status not between", value1, value2, "oldClueStatus");
            return (Criteria) this;
        }

        public Criteria andCommunicateDepartIsNull() {
            addCriterion("communicate_depart is null");
            return (Criteria) this;
        }

        public Criteria andCommunicateDepartIsNotNull() {
            addCriterion("communicate_depart is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicateDepartEqualTo(String value) {
            addCriterion("communicate_depart =", value, "communicateDepart");
            return (Criteria) this;
        }

        public Criteria andCommunicateDepartNotEqualTo(String value) {
            addCriterion("communicate_depart <>", value, "communicateDepart");
            return (Criteria) this;
        }

        public Criteria andCommunicateDepartGreaterThan(String value) {
            addCriterion("communicate_depart >", value, "communicateDepart");
            return (Criteria) this;
        }

        public Criteria andCommunicateDepartGreaterThanOrEqualTo(String value) {
            addCriterion("communicate_depart >=", value, "communicateDepart");
            return (Criteria) this;
        }

        public Criteria andCommunicateDepartLessThan(String value) {
            addCriterion("communicate_depart <", value, "communicateDepart");
            return (Criteria) this;
        }

        public Criteria andCommunicateDepartLessThanOrEqualTo(String value) {
            addCriterion("communicate_depart <=", value, "communicateDepart");
            return (Criteria) this;
        }

        public Criteria andCommunicateDepartLike(String value) {
            addCriterion("communicate_depart like", value, "communicateDepart");
            return (Criteria) this;
        }

        public Criteria andCommunicateDepartNotLike(String value) {
            addCriterion("communicate_depart not like", value, "communicateDepart");
            return (Criteria) this;
        }

        public Criteria andCommunicateDepartIn(List<String> values) {
            addCriterion("communicate_depart in", values, "communicateDepart");
            return (Criteria) this;
        }

        public Criteria andCommunicateDepartNotIn(List<String> values) {
            addCriterion("communicate_depart not in", values, "communicateDepart");
            return (Criteria) this;
        }

        public Criteria andCommunicateDepartBetween(String value1, String value2) {
            addCriterion("communicate_depart between", value1, value2, "communicateDepart");
            return (Criteria) this;
        }

        public Criteria andCommunicateDepartNotBetween(String value1, String value2) {
            addCriterion("communicate_depart not between", value1, value2, "communicateDepart");
            return (Criteria) this;
        }

        public Criteria andCommucinateStatusIsNull() {
            addCriterion("commucinate_status is null");
            return (Criteria) this;
        }

        public Criteria andCommucinateStatusIsNotNull() {
            addCriterion("commucinate_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommucinateStatusEqualTo(Integer value) {
            addCriterion("commucinate_status =", value, "commucinateStatus");
            return (Criteria) this;
        }

        public Criteria andCommucinateStatusNotEqualTo(Integer value) {
            addCriterion("commucinate_status <>", value, "commucinateStatus");
            return (Criteria) this;
        }

        public Criteria andCommucinateStatusGreaterThan(Integer value) {
            addCriterion("commucinate_status >", value, "commucinateStatus");
            return (Criteria) this;
        }

        public Criteria andCommucinateStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("commucinate_status >=", value, "commucinateStatus");
            return (Criteria) this;
        }

        public Criteria andCommucinateStatusLessThan(Integer value) {
            addCriterion("commucinate_status <", value, "commucinateStatus");
            return (Criteria) this;
        }

        public Criteria andCommucinateStatusLessThanOrEqualTo(Integer value) {
            addCriterion("commucinate_status <=", value, "commucinateStatus");
            return (Criteria) this;
        }

        public Criteria andCommucinateStatusIn(List<Integer> values) {
            addCriterion("commucinate_status in", values, "commucinateStatus");
            return (Criteria) this;
        }

        public Criteria andCommucinateStatusNotIn(List<Integer> values) {
            addCriterion("commucinate_status not in", values, "commucinateStatus");
            return (Criteria) this;
        }

        public Criteria andCommucinateStatusBetween(Integer value1, Integer value2) {
            addCriterion("commucinate_status between", value1, value2, "commucinateStatus");
            return (Criteria) this;
        }

        public Criteria andCommucinateStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("commucinate_status not between", value1, value2, "commucinateStatus");
            return (Criteria) this;
        }

        public Criteria andTelTrafficStatusIsNull() {
            addCriterion("tel_traffic_status is null");
            return (Criteria) this;
        }

        public Criteria andTelTrafficStatusIsNotNull() {
            addCriterion("tel_traffic_status is not null");
            return (Criteria) this;
        }

        public Criteria andTelTrafficStatusEqualTo(Integer value) {
            addCriterion("tel_traffic_status =", value, "telTrafficStatus");
            return (Criteria) this;
        }

        public Criteria andTelTrafficStatusNotEqualTo(Integer value) {
            addCriterion("tel_traffic_status <>", value, "telTrafficStatus");
            return (Criteria) this;
        }

        public Criteria andTelTrafficStatusGreaterThan(Integer value) {
            addCriterion("tel_traffic_status >", value, "telTrafficStatus");
            return (Criteria) this;
        }

        public Criteria andTelTrafficStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("tel_traffic_status >=", value, "telTrafficStatus");
            return (Criteria) this;
        }

        public Criteria andTelTrafficStatusLessThan(Integer value) {
            addCriterion("tel_traffic_status <", value, "telTrafficStatus");
            return (Criteria) this;
        }

        public Criteria andTelTrafficStatusLessThanOrEqualTo(Integer value) {
            addCriterion("tel_traffic_status <=", value, "telTrafficStatus");
            return (Criteria) this;
        }

        public Criteria andTelTrafficStatusIn(List<Integer> values) {
            addCriterion("tel_traffic_status in", values, "telTrafficStatus");
            return (Criteria) this;
        }

        public Criteria andTelTrafficStatusNotIn(List<Integer> values) {
            addCriterion("tel_traffic_status not in", values, "telTrafficStatus");
            return (Criteria) this;
        }

        public Criteria andTelTrafficStatusBetween(Integer value1, Integer value2) {
            addCriterion("tel_traffic_status between", value1, value2, "telTrafficStatus");
            return (Criteria) this;
        }

        public Criteria andTelTrafficStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tel_traffic_status not between", value1, value2, "telTrafficStatus");
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

        public Criteria andErpCreatedByIsNull() {
            addCriterion("erp_created_by is null");
            return (Criteria) this;
        }

        public Criteria andErpCreatedByIsNotNull() {
            addCriterion("erp_created_by is not null");
            return (Criteria) this;
        }

        public Criteria andErpCreatedByEqualTo(String value) {
            addCriterion("erp_created_by =", value, "erpCreatedBy");
            return (Criteria) this;
        }

        public Criteria andErpCreatedByNotEqualTo(String value) {
            addCriterion("erp_created_by <>", value, "erpCreatedBy");
            return (Criteria) this;
        }

        public Criteria andErpCreatedByGreaterThan(String value) {
            addCriterion("erp_created_by >", value, "erpCreatedBy");
            return (Criteria) this;
        }

        public Criteria andErpCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("erp_created_by >=", value, "erpCreatedBy");
            return (Criteria) this;
        }

        public Criteria andErpCreatedByLessThan(String value) {
            addCriterion("erp_created_by <", value, "erpCreatedBy");
            return (Criteria) this;
        }

        public Criteria andErpCreatedByLessThanOrEqualTo(String value) {
            addCriterion("erp_created_by <=", value, "erpCreatedBy");
            return (Criteria) this;
        }

        public Criteria andErpCreatedByLike(String value) {
            addCriterion("erp_created_by like", value, "erpCreatedBy");
            return (Criteria) this;
        }

        public Criteria andErpCreatedByNotLike(String value) {
            addCriterion("erp_created_by not like", value, "erpCreatedBy");
            return (Criteria) this;
        }

        public Criteria andErpCreatedByIn(List<String> values) {
            addCriterion("erp_created_by in", values, "erpCreatedBy");
            return (Criteria) this;
        }

        public Criteria andErpCreatedByNotIn(List<String> values) {
            addCriterion("erp_created_by not in", values, "erpCreatedBy");
            return (Criteria) this;
        }

        public Criteria andErpCreatedByBetween(String value1, String value2) {
            addCriterion("erp_created_by between", value1, value2, "erpCreatedBy");
            return (Criteria) this;
        }

        public Criteria andErpCreatedByNotBetween(String value1, String value2) {
            addCriterion("erp_created_by not between", value1, value2, "erpCreatedBy");
            return (Criteria) this;
        }

        public Criteria andErpGdGtjdNextIsNull() {
            addCriterion("erp_gd_gtjd_next is null");
            return (Criteria) this;
        }

        public Criteria andErpGdGtjdNextIsNotNull() {
            addCriterion("erp_gd_gtjd_next is not null");
            return (Criteria) this;
        }

        public Criteria andErpGdGtjdNextEqualTo(String value) {
            addCriterion("erp_gd_gtjd_next =", value, "erpGdGtjdNext");
            return (Criteria) this;
        }

        public Criteria andErpGdGtjdNextNotEqualTo(String value) {
            addCriterion("erp_gd_gtjd_next <>", value, "erpGdGtjdNext");
            return (Criteria) this;
        }

        public Criteria andErpGdGtjdNextGreaterThan(String value) {
            addCriterion("erp_gd_gtjd_next >", value, "erpGdGtjdNext");
            return (Criteria) this;
        }

        public Criteria andErpGdGtjdNextGreaterThanOrEqualTo(String value) {
            addCriterion("erp_gd_gtjd_next >=", value, "erpGdGtjdNext");
            return (Criteria) this;
        }

        public Criteria andErpGdGtjdNextLessThan(String value) {
            addCriterion("erp_gd_gtjd_next <", value, "erpGdGtjdNext");
            return (Criteria) this;
        }

        public Criteria andErpGdGtjdNextLessThanOrEqualTo(String value) {
            addCriterion("erp_gd_gtjd_next <=", value, "erpGdGtjdNext");
            return (Criteria) this;
        }

        public Criteria andErpGdGtjdNextLike(String value) {
            addCriterion("erp_gd_gtjd_next like", value, "erpGdGtjdNext");
            return (Criteria) this;
        }

        public Criteria andErpGdGtjdNextNotLike(String value) {
            addCriterion("erp_gd_gtjd_next not like", value, "erpGdGtjdNext");
            return (Criteria) this;
        }

        public Criteria andErpGdGtjdNextIn(List<String> values) {
            addCriterion("erp_gd_gtjd_next in", values, "erpGdGtjdNext");
            return (Criteria) this;
        }

        public Criteria andErpGdGtjdNextNotIn(List<String> values) {
            addCriterion("erp_gd_gtjd_next not in", values, "erpGdGtjdNext");
            return (Criteria) this;
        }

        public Criteria andErpGdGtjdNextBetween(String value1, String value2) {
            addCriterion("erp_gd_gtjd_next between", value1, value2, "erpGdGtjdNext");
            return (Criteria) this;
        }

        public Criteria andErpGdGtjdNextNotBetween(String value1, String value2) {
            addCriterion("erp_gd_gtjd_next not between", value1, value2, "erpGdGtjdNext");
            return (Criteria) this;
        }

        public Criteria andErpGdNameIsNull() {
            addCriterion("erp_gd_name is null");
            return (Criteria) this;
        }

        public Criteria andErpGdNameIsNotNull() {
            addCriterion("erp_gd_name is not null");
            return (Criteria) this;
        }

        public Criteria andErpGdNameEqualTo(String value) {
            addCriterion("erp_gd_name =", value, "erpGdName");
            return (Criteria) this;
        }

        public Criteria andErpGdNameNotEqualTo(String value) {
            addCriterion("erp_gd_name <>", value, "erpGdName");
            return (Criteria) this;
        }

        public Criteria andErpGdNameGreaterThan(String value) {
            addCriterion("erp_gd_name >", value, "erpGdName");
            return (Criteria) this;
        }

        public Criteria andErpGdNameGreaterThanOrEqualTo(String value) {
            addCriterion("erp_gd_name >=", value, "erpGdName");
            return (Criteria) this;
        }

        public Criteria andErpGdNameLessThan(String value) {
            addCriterion("erp_gd_name <", value, "erpGdName");
            return (Criteria) this;
        }

        public Criteria andErpGdNameLessThanOrEqualTo(String value) {
            addCriterion("erp_gd_name <=", value, "erpGdName");
            return (Criteria) this;
        }

        public Criteria andErpGdNameLike(String value) {
            addCriterion("erp_gd_name like", value, "erpGdName");
            return (Criteria) this;
        }

        public Criteria andErpGdNameNotLike(String value) {
            addCriterion("erp_gd_name not like", value, "erpGdName");
            return (Criteria) this;
        }

        public Criteria andErpGdNameIn(List<String> values) {
            addCriterion("erp_gd_name in", values, "erpGdName");
            return (Criteria) this;
        }

        public Criteria andErpGdNameNotIn(List<String> values) {
            addCriterion("erp_gd_name not in", values, "erpGdName");
            return (Criteria) this;
        }

        public Criteria andErpGdNameBetween(String value1, String value2) {
            addCriterion("erp_gd_name between", value1, value2, "erpGdName");
            return (Criteria) this;
        }

        public Criteria andErpGdNameNotBetween(String value1, String value2) {
            addCriterion("erp_gd_name not between", value1, value2, "erpGdName");
            return (Criteria) this;
        }

        public Criteria andErpGdActionprojectIsNull() {
            addCriterion("erp_gd_actionproject is null");
            return (Criteria) this;
        }

        public Criteria andErpGdActionprojectIsNotNull() {
            addCriterion("erp_gd_actionproject is not null");
            return (Criteria) this;
        }

        public Criteria andErpGdActionprojectEqualTo(String value) {
            addCriterion("erp_gd_actionproject =", value, "erpGdActionproject");
            return (Criteria) this;
        }

        public Criteria andErpGdActionprojectNotEqualTo(String value) {
            addCriterion("erp_gd_actionproject <>", value, "erpGdActionproject");
            return (Criteria) this;
        }

        public Criteria andErpGdActionprojectGreaterThan(String value) {
            addCriterion("erp_gd_actionproject >", value, "erpGdActionproject");
            return (Criteria) this;
        }

        public Criteria andErpGdActionprojectGreaterThanOrEqualTo(String value) {
            addCriterion("erp_gd_actionproject >=", value, "erpGdActionproject");
            return (Criteria) this;
        }

        public Criteria andErpGdActionprojectLessThan(String value) {
            addCriterion("erp_gd_actionproject <", value, "erpGdActionproject");
            return (Criteria) this;
        }

        public Criteria andErpGdActionprojectLessThanOrEqualTo(String value) {
            addCriterion("erp_gd_actionproject <=", value, "erpGdActionproject");
            return (Criteria) this;
        }

        public Criteria andErpGdActionprojectLike(String value) {
            addCriterion("erp_gd_actionproject like", value, "erpGdActionproject");
            return (Criteria) this;
        }

        public Criteria andErpGdActionprojectNotLike(String value) {
            addCriterion("erp_gd_actionproject not like", value, "erpGdActionproject");
            return (Criteria) this;
        }

        public Criteria andErpGdActionprojectIn(List<String> values) {
            addCriterion("erp_gd_actionproject in", values, "erpGdActionproject");
            return (Criteria) this;
        }

        public Criteria andErpGdActionprojectNotIn(List<String> values) {
            addCriterion("erp_gd_actionproject not in", values, "erpGdActionproject");
            return (Criteria) this;
        }

        public Criteria andErpGdActionprojectBetween(String value1, String value2) {
            addCriterion("erp_gd_actionproject between", value1, value2, "erpGdActionproject");
            return (Criteria) this;
        }

        public Criteria andErpGdActionprojectNotBetween(String value1, String value2) {
            addCriterion("erp_gd_actionproject not between", value1, value2, "erpGdActionproject");
            return (Criteria) this;
        }

        public Criteria andGuidIsNull() {
            addCriterion("guid is null");
            return (Criteria) this;
        }

        public Criteria andGuidIsNotNull() {
            addCriterion("guid is not null");
            return (Criteria) this;
        }

        public Criteria andGuidEqualTo(String value) {
            addCriterion("guid =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotEqualTo(String value) {
            addCriterion("guid <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThan(String value) {
            addCriterion("guid >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThanOrEqualTo(String value) {
            addCriterion("guid >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThan(String value) {
            addCriterion("guid <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThanOrEqualTo(String value) {
            addCriterion("guid <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLike(String value) {
            addCriterion("guid like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotLike(String value) {
            addCriterion("guid not like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidIn(List<String> values) {
            addCriterion("guid in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotIn(List<String> values) {
            addCriterion("guid not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidBetween(String value1, String value2) {
            addCriterion("guid between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotBetween(String value1, String value2) {
            addCriterion("guid not between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andErpCreateByIsNull() {
            addCriterion("erp_create_by is null");
            return (Criteria) this;
        }

        public Criteria andErpCreateByIsNotNull() {
            addCriterion("erp_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andErpCreateByEqualTo(String value) {
            addCriterion("erp_create_by =", value, "erpCreateBy");
            return (Criteria) this;
        }

        public Criteria andErpCreateByNotEqualTo(String value) {
            addCriterion("erp_create_by <>", value, "erpCreateBy");
            return (Criteria) this;
        }

        public Criteria andErpCreateByGreaterThan(String value) {
            addCriterion("erp_create_by >", value, "erpCreateBy");
            return (Criteria) this;
        }

        public Criteria andErpCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("erp_create_by >=", value, "erpCreateBy");
            return (Criteria) this;
        }

        public Criteria andErpCreateByLessThan(String value) {
            addCriterion("erp_create_by <", value, "erpCreateBy");
            return (Criteria) this;
        }

        public Criteria andErpCreateByLessThanOrEqualTo(String value) {
            addCriterion("erp_create_by <=", value, "erpCreateBy");
            return (Criteria) this;
        }

        public Criteria andErpCreateByLike(String value) {
            addCriterion("erp_create_by like", value, "erpCreateBy");
            return (Criteria) this;
        }

        public Criteria andErpCreateByNotLike(String value) {
            addCriterion("erp_create_by not like", value, "erpCreateBy");
            return (Criteria) this;
        }

        public Criteria andErpCreateByIn(List<String> values) {
            addCriterion("erp_create_by in", values, "erpCreateBy");
            return (Criteria) this;
        }

        public Criteria andErpCreateByNotIn(List<String> values) {
            addCriterion("erp_create_by not in", values, "erpCreateBy");
            return (Criteria) this;
        }

        public Criteria andErpCreateByBetween(String value1, String value2) {
            addCriterion("erp_create_by between", value1, value2, "erpCreateBy");
            return (Criteria) this;
        }

        public Criteria andErpCreateByNotBetween(String value1, String value2) {
            addCriterion("erp_create_by not between", value1, value2, "erpCreateBy");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdIsNull() {
            addCriterion("call_record_id is null");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdIsNotNull() {
            addCriterion("call_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdEqualTo(Integer value) {
            addCriterion("call_record_id =", value, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdNotEqualTo(Integer value) {
            addCriterion("call_record_id <>", value, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdGreaterThan(Integer value) {
            addCriterion("call_record_id >", value, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("call_record_id >=", value, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdLessThan(Integer value) {
            addCriterion("call_record_id <", value, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("call_record_id <=", value, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdIn(List<Integer> values) {
            addCriterion("call_record_id in", values, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdNotIn(List<Integer> values) {
            addCriterion("call_record_id not in", values, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("call_record_id between", value1, value2, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCallRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("call_record_id not between", value1, value2, "callRecordId");
            return (Criteria) this;
        }

        public Criteria andCommunicateRecordTypeIsNull() {
            addCriterion("communicate_record_type is null");
            return (Criteria) this;
        }

        public Criteria andCommunicateRecordTypeIsNotNull() {
            addCriterion("communicate_record_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicateRecordTypeEqualTo(Integer value) {
            addCriterion("communicate_record_type =", value, "communicateRecordType");
            return (Criteria) this;
        }

        public Criteria andCommunicateRecordTypeNotEqualTo(Integer value) {
            addCriterion("communicate_record_type <>", value, "communicateRecordType");
            return (Criteria) this;
        }

        public Criteria andCommunicateRecordTypeGreaterThan(Integer value) {
            addCriterion("communicate_record_type >", value, "communicateRecordType");
            return (Criteria) this;
        }

        public Criteria andCommunicateRecordTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("communicate_record_type >=", value, "communicateRecordType");
            return (Criteria) this;
        }

        public Criteria andCommunicateRecordTypeLessThan(Integer value) {
            addCriterion("communicate_record_type <", value, "communicateRecordType");
            return (Criteria) this;
        }

        public Criteria andCommunicateRecordTypeLessThanOrEqualTo(Integer value) {
            addCriterion("communicate_record_type <=", value, "communicateRecordType");
            return (Criteria) this;
        }

        public Criteria andCommunicateRecordTypeIn(List<Integer> values) {
            addCriterion("communicate_record_type in", values, "communicateRecordType");
            return (Criteria) this;
        }

        public Criteria andCommunicateRecordTypeNotIn(List<Integer> values) {
            addCriterion("communicate_record_type not in", values, "communicateRecordType");
            return (Criteria) this;
        }

        public Criteria andCommunicateRecordTypeBetween(Integer value1, Integer value2) {
            addCriterion("communicate_record_type between", value1, value2, "communicateRecordType");
            return (Criteria) this;
        }

        public Criteria andCommunicateRecordTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("communicate_record_type not between", value1, value2, "communicateRecordType");
            return (Criteria) this;
        }

        public Criteria andCallDurationIsNull() {
            addCriterion("call_duration is null");
            return (Criteria) this;
        }

        public Criteria andCallDurationIsNotNull() {
            addCriterion("call_duration is not null");
            return (Criteria) this;
        }

        public Criteria andCallDurationEqualTo(Integer value) {
            addCriterion("call_duration =", value, "callDuration");
            return (Criteria) this;
        }

        public Criteria andCallDurationNotEqualTo(Integer value) {
            addCriterion("call_duration <>", value, "callDuration");
            return (Criteria) this;
        }

        public Criteria andCallDurationGreaterThan(Integer value) {
            addCriterion("call_duration >", value, "callDuration");
            return (Criteria) this;
        }

        public Criteria andCallDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("call_duration >=", value, "callDuration");
            return (Criteria) this;
        }

        public Criteria andCallDurationLessThan(Integer value) {
            addCriterion("call_duration <", value, "callDuration");
            return (Criteria) this;
        }

        public Criteria andCallDurationLessThanOrEqualTo(Integer value) {
            addCriterion("call_duration <=", value, "callDuration");
            return (Criteria) this;
        }

        public Criteria andCallDurationIn(List<Integer> values) {
            addCriterion("call_duration in", values, "callDuration");
            return (Criteria) this;
        }

        public Criteria andCallDurationNotIn(List<Integer> values) {
            addCriterion("call_duration not in", values, "callDuration");
            return (Criteria) this;
        }

        public Criteria andCallDurationBetween(Integer value1, Integer value2) {
            addCriterion("call_duration between", value1, value2, "callDuration");
            return (Criteria) this;
        }

        public Criteria andCallDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("call_duration not between", value1, value2, "callDuration");
            return (Criteria) this;
        }

        public Criteria andIsPushedToErpIsNull() {
            addCriterion("is_pushed_to_erp is null");
            return (Criteria) this;
        }

        public Criteria andIsPushedToErpIsNotNull() {
            addCriterion("is_pushed_to_erp is not null");
            return (Criteria) this;
        }

        public Criteria andIsPushedToErpEqualTo(Integer value) {
            addCriterion("is_pushed_to_erp =", value, "isPushedToErp");
            return (Criteria) this;
        }

        public Criteria andIsPushedToErpNotEqualTo(Integer value) {
            addCriterion("is_pushed_to_erp <>", value, "isPushedToErp");
            return (Criteria) this;
        }

        public Criteria andIsPushedToErpGreaterThan(Integer value) {
            addCriterion("is_pushed_to_erp >", value, "isPushedToErp");
            return (Criteria) this;
        }

        public Criteria andIsPushedToErpGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_pushed_to_erp >=", value, "isPushedToErp");
            return (Criteria) this;
        }

        public Criteria andIsPushedToErpLessThan(Integer value) {
            addCriterion("is_pushed_to_erp <", value, "isPushedToErp");
            return (Criteria) this;
        }

        public Criteria andIsPushedToErpLessThanOrEqualTo(Integer value) {
            addCriterion("is_pushed_to_erp <=", value, "isPushedToErp");
            return (Criteria) this;
        }

        public Criteria andIsPushedToErpIn(List<Integer> values) {
            addCriterion("is_pushed_to_erp in", values, "isPushedToErp");
            return (Criteria) this;
        }

        public Criteria andIsPushedToErpNotIn(List<Integer> values) {
            addCriterion("is_pushed_to_erp not in", values, "isPushedToErp");
            return (Criteria) this;
        }

        public Criteria andIsPushedToErpBetween(Integer value1, Integer value2) {
            addCriterion("is_pushed_to_erp between", value1, value2, "isPushedToErp");
            return (Criteria) this;
        }

        public Criteria andIsPushedToErpNotBetween(Integer value1, Integer value2) {
            addCriterion("is_pushed_to_erp not between", value1, value2, "isPushedToErp");
            return (Criteria) this;
        }

        public Criteria andPushFailTimeIsNull() {
            addCriterion("push_fail_time is null");
            return (Criteria) this;
        }

        public Criteria andPushFailTimeIsNotNull() {
            addCriterion("push_fail_time is not null");
            return (Criteria) this;
        }

        public Criteria andPushFailTimeEqualTo(Integer value) {
            addCriterion("push_fail_time =", value, "pushFailTime");
            return (Criteria) this;
        }

        public Criteria andPushFailTimeNotEqualTo(Integer value) {
            addCriterion("push_fail_time <>", value, "pushFailTime");
            return (Criteria) this;
        }

        public Criteria andPushFailTimeGreaterThan(Integer value) {
            addCriterion("push_fail_time >", value, "pushFailTime");
            return (Criteria) this;
        }

        public Criteria andPushFailTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_fail_time >=", value, "pushFailTime");
            return (Criteria) this;
        }

        public Criteria andPushFailTimeLessThan(Integer value) {
            addCriterion("push_fail_time <", value, "pushFailTime");
            return (Criteria) this;
        }

        public Criteria andPushFailTimeLessThanOrEqualTo(Integer value) {
            addCriterion("push_fail_time <=", value, "pushFailTime");
            return (Criteria) this;
        }

        public Criteria andPushFailTimeIn(List<Integer> values) {
            addCriterion("push_fail_time in", values, "pushFailTime");
            return (Criteria) this;
        }

        public Criteria andPushFailTimeNotIn(List<Integer> values) {
            addCriterion("push_fail_time not in", values, "pushFailTime");
            return (Criteria) this;
        }

        public Criteria andPushFailTimeBetween(Integer value1, Integer value2) {
            addCriterion("push_fail_time between", value1, value2, "pushFailTime");
            return (Criteria) this;
        }

        public Criteria andPushFailTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("push_fail_time not between", value1, value2, "pushFailTime");
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