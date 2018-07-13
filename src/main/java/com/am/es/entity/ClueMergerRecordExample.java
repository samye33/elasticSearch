package com.am.es.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClueMergerRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClueMergerRecordExample() {
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

        public Criteria andRetainClueGuidIsNull() {
            addCriterion("retain_clue_guid is null");
            return (Criteria) this;
        }

        public Criteria andRetainClueGuidIsNotNull() {
            addCriterion("retain_clue_guid is not null");
            return (Criteria) this;
        }

        public Criteria andRetainClueGuidEqualTo(String value) {
            addCriterion("retain_clue_guid =", value, "retainClueGuid");
            return (Criteria) this;
        }

        public Criteria andRetainClueGuidNotEqualTo(String value) {
            addCriterion("retain_clue_guid <>", value, "retainClueGuid");
            return (Criteria) this;
        }

        public Criteria andRetainClueGuidGreaterThan(String value) {
            addCriterion("retain_clue_guid >", value, "retainClueGuid");
            return (Criteria) this;
        }

        public Criteria andRetainClueGuidGreaterThanOrEqualTo(String value) {
            addCriterion("retain_clue_guid >=", value, "retainClueGuid");
            return (Criteria) this;
        }

        public Criteria andRetainClueGuidLessThan(String value) {
            addCriterion("retain_clue_guid <", value, "retainClueGuid");
            return (Criteria) this;
        }

        public Criteria andRetainClueGuidLessThanOrEqualTo(String value) {
            addCriterion("retain_clue_guid <=", value, "retainClueGuid");
            return (Criteria) this;
        }

        public Criteria andRetainClueGuidLike(String value) {
            addCriterion("retain_clue_guid like", value, "retainClueGuid");
            return (Criteria) this;
        }

        public Criteria andRetainClueGuidNotLike(String value) {
            addCriterion("retain_clue_guid not like", value, "retainClueGuid");
            return (Criteria) this;
        }

        public Criteria andRetainClueGuidIn(List<String> values) {
            addCriterion("retain_clue_guid in", values, "retainClueGuid");
            return (Criteria) this;
        }

        public Criteria andRetainClueGuidNotIn(List<String> values) {
            addCriterion("retain_clue_guid not in", values, "retainClueGuid");
            return (Criteria) this;
        }

        public Criteria andRetainClueGuidBetween(String value1, String value2) {
            addCriterion("retain_clue_guid between", value1, value2, "retainClueGuid");
            return (Criteria) this;
        }

        public Criteria andRetainClueGuidNotBetween(String value1, String value2) {
            addCriterion("retain_clue_guid not between", value1, value2, "retainClueGuid");
            return (Criteria) this;
        }

        public Criteria andRetainClueNoIsNull() {
            addCriterion("retain_clue_no is null");
            return (Criteria) this;
        }

        public Criteria andRetainClueNoIsNotNull() {
            addCriterion("retain_clue_no is not null");
            return (Criteria) this;
        }

        public Criteria andRetainClueNoEqualTo(String value) {
            addCriterion("retain_clue_no =", value, "retainClueNo");
            return (Criteria) this;
        }

        public Criteria andRetainClueNoNotEqualTo(String value) {
            addCriterion("retain_clue_no <>", value, "retainClueNo");
            return (Criteria) this;
        }

        public Criteria andRetainClueNoGreaterThan(String value) {
            addCriterion("retain_clue_no >", value, "retainClueNo");
            return (Criteria) this;
        }

        public Criteria andRetainClueNoGreaterThanOrEqualTo(String value) {
            addCriterion("retain_clue_no >=", value, "retainClueNo");
            return (Criteria) this;
        }

        public Criteria andRetainClueNoLessThan(String value) {
            addCriterion("retain_clue_no <", value, "retainClueNo");
            return (Criteria) this;
        }

        public Criteria andRetainClueNoLessThanOrEqualTo(String value) {
            addCriterion("retain_clue_no <=", value, "retainClueNo");
            return (Criteria) this;
        }

        public Criteria andRetainClueNoLike(String value) {
            addCriterion("retain_clue_no like", value, "retainClueNo");
            return (Criteria) this;
        }

        public Criteria andRetainClueNoNotLike(String value) {
            addCriterion("retain_clue_no not like", value, "retainClueNo");
            return (Criteria) this;
        }

        public Criteria andRetainClueNoIn(List<String> values) {
            addCriterion("retain_clue_no in", values, "retainClueNo");
            return (Criteria) this;
        }

        public Criteria andRetainClueNoNotIn(List<String> values) {
            addCriterion("retain_clue_no not in", values, "retainClueNo");
            return (Criteria) this;
        }

        public Criteria andRetainClueNoBetween(String value1, String value2) {
            addCriterion("retain_clue_no between", value1, value2, "retainClueNo");
            return (Criteria) this;
        }

        public Criteria andRetainClueNoNotBetween(String value1, String value2) {
            addCriterion("retain_clue_no not between", value1, value2, "retainClueNo");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerGuidIsNull() {
            addCriterion("retain_customer_guid is null");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerGuidIsNotNull() {
            addCriterion("retain_customer_guid is not null");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerGuidEqualTo(String value) {
            addCriterion("retain_customer_guid =", value, "retainCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerGuidNotEqualTo(String value) {
            addCriterion("retain_customer_guid <>", value, "retainCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerGuidGreaterThan(String value) {
            addCriterion("retain_customer_guid >", value, "retainCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerGuidGreaterThanOrEqualTo(String value) {
            addCriterion("retain_customer_guid >=", value, "retainCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerGuidLessThan(String value) {
            addCriterion("retain_customer_guid <", value, "retainCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerGuidLessThanOrEqualTo(String value) {
            addCriterion("retain_customer_guid <=", value, "retainCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerGuidLike(String value) {
            addCriterion("retain_customer_guid like", value, "retainCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerGuidNotLike(String value) {
            addCriterion("retain_customer_guid not like", value, "retainCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerGuidIn(List<String> values) {
            addCriterion("retain_customer_guid in", values, "retainCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerGuidNotIn(List<String> values) {
            addCriterion("retain_customer_guid not in", values, "retainCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerGuidBetween(String value1, String value2) {
            addCriterion("retain_customer_guid between", value1, value2, "retainCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerGuidNotBetween(String value1, String value2) {
            addCriterion("retain_customer_guid not between", value1, value2, "retainCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerNoIsNull() {
            addCriterion("retain_customer_no is null");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerNoIsNotNull() {
            addCriterion("retain_customer_no is not null");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerNoEqualTo(String value) {
            addCriterion("retain_customer_no =", value, "retainCustomerNo");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerNoNotEqualTo(String value) {
            addCriterion("retain_customer_no <>", value, "retainCustomerNo");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerNoGreaterThan(String value) {
            addCriterion("retain_customer_no >", value, "retainCustomerNo");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerNoGreaterThanOrEqualTo(String value) {
            addCriterion("retain_customer_no >=", value, "retainCustomerNo");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerNoLessThan(String value) {
            addCriterion("retain_customer_no <", value, "retainCustomerNo");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerNoLessThanOrEqualTo(String value) {
            addCriterion("retain_customer_no <=", value, "retainCustomerNo");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerNoLike(String value) {
            addCriterion("retain_customer_no like", value, "retainCustomerNo");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerNoNotLike(String value) {
            addCriterion("retain_customer_no not like", value, "retainCustomerNo");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerNoIn(List<String> values) {
            addCriterion("retain_customer_no in", values, "retainCustomerNo");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerNoNotIn(List<String> values) {
            addCriterion("retain_customer_no not in", values, "retainCustomerNo");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerNoBetween(String value1, String value2) {
            addCriterion("retain_customer_no between", value1, value2, "retainCustomerNo");
            return (Criteria) this;
        }

        public Criteria andRetainCustomerNoNotBetween(String value1, String value2) {
            addCriterion("retain_customer_no not between", value1, value2, "retainCustomerNo");
            return (Criteria) this;
        }

        public Criteria andMergerClueGuidIsNull() {
            addCriterion("merger_clue_guid is null");
            return (Criteria) this;
        }

        public Criteria andMergerClueGuidIsNotNull() {
            addCriterion("merger_clue_guid is not null");
            return (Criteria) this;
        }

        public Criteria andMergerClueGuidEqualTo(String value) {
            addCriterion("merger_clue_guid =", value, "mergerClueGuid");
            return (Criteria) this;
        }

        public Criteria andMergerClueGuidNotEqualTo(String value) {
            addCriterion("merger_clue_guid <>", value, "mergerClueGuid");
            return (Criteria) this;
        }

        public Criteria andMergerClueGuidGreaterThan(String value) {
            addCriterion("merger_clue_guid >", value, "mergerClueGuid");
            return (Criteria) this;
        }

        public Criteria andMergerClueGuidGreaterThanOrEqualTo(String value) {
            addCriterion("merger_clue_guid >=", value, "mergerClueGuid");
            return (Criteria) this;
        }

        public Criteria andMergerClueGuidLessThan(String value) {
            addCriterion("merger_clue_guid <", value, "mergerClueGuid");
            return (Criteria) this;
        }

        public Criteria andMergerClueGuidLessThanOrEqualTo(String value) {
            addCriterion("merger_clue_guid <=", value, "mergerClueGuid");
            return (Criteria) this;
        }

        public Criteria andMergerClueGuidLike(String value) {
            addCriterion("merger_clue_guid like", value, "mergerClueGuid");
            return (Criteria) this;
        }

        public Criteria andMergerClueGuidNotLike(String value) {
            addCriterion("merger_clue_guid not like", value, "mergerClueGuid");
            return (Criteria) this;
        }

        public Criteria andMergerClueGuidIn(List<String> values) {
            addCriterion("merger_clue_guid in", values, "mergerClueGuid");
            return (Criteria) this;
        }

        public Criteria andMergerClueGuidNotIn(List<String> values) {
            addCriterion("merger_clue_guid not in", values, "mergerClueGuid");
            return (Criteria) this;
        }

        public Criteria andMergerClueGuidBetween(String value1, String value2) {
            addCriterion("merger_clue_guid between", value1, value2, "mergerClueGuid");
            return (Criteria) this;
        }

        public Criteria andMergerClueGuidNotBetween(String value1, String value2) {
            addCriterion("merger_clue_guid not between", value1, value2, "mergerClueGuid");
            return (Criteria) this;
        }

        public Criteria andMergerClueNoIsNull() {
            addCriterion("merger_clue_no is null");
            return (Criteria) this;
        }

        public Criteria andMergerClueNoIsNotNull() {
            addCriterion("merger_clue_no is not null");
            return (Criteria) this;
        }

        public Criteria andMergerClueNoEqualTo(String value) {
            addCriterion("merger_clue_no =", value, "mergerClueNo");
            return (Criteria) this;
        }

        public Criteria andMergerClueNoNotEqualTo(String value) {
            addCriterion("merger_clue_no <>", value, "mergerClueNo");
            return (Criteria) this;
        }

        public Criteria andMergerClueNoGreaterThan(String value) {
            addCriterion("merger_clue_no >", value, "mergerClueNo");
            return (Criteria) this;
        }

        public Criteria andMergerClueNoGreaterThanOrEqualTo(String value) {
            addCriterion("merger_clue_no >=", value, "mergerClueNo");
            return (Criteria) this;
        }

        public Criteria andMergerClueNoLessThan(String value) {
            addCriterion("merger_clue_no <", value, "mergerClueNo");
            return (Criteria) this;
        }

        public Criteria andMergerClueNoLessThanOrEqualTo(String value) {
            addCriterion("merger_clue_no <=", value, "mergerClueNo");
            return (Criteria) this;
        }

        public Criteria andMergerClueNoLike(String value) {
            addCriterion("merger_clue_no like", value, "mergerClueNo");
            return (Criteria) this;
        }

        public Criteria andMergerClueNoNotLike(String value) {
            addCriterion("merger_clue_no not like", value, "mergerClueNo");
            return (Criteria) this;
        }

        public Criteria andMergerClueNoIn(List<String> values) {
            addCriterion("merger_clue_no in", values, "mergerClueNo");
            return (Criteria) this;
        }

        public Criteria andMergerClueNoNotIn(List<String> values) {
            addCriterion("merger_clue_no not in", values, "mergerClueNo");
            return (Criteria) this;
        }

        public Criteria andMergerClueNoBetween(String value1, String value2) {
            addCriterion("merger_clue_no between", value1, value2, "mergerClueNo");
            return (Criteria) this;
        }

        public Criteria andMergerClueNoNotBetween(String value1, String value2) {
            addCriterion("merger_clue_no not between", value1, value2, "mergerClueNo");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerGuidIsNull() {
            addCriterion("merger_customer_guid is null");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerGuidIsNotNull() {
            addCriterion("merger_customer_guid is not null");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerGuidEqualTo(String value) {
            addCriterion("merger_customer_guid =", value, "mergerCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerGuidNotEqualTo(String value) {
            addCriterion("merger_customer_guid <>", value, "mergerCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerGuidGreaterThan(String value) {
            addCriterion("merger_customer_guid >", value, "mergerCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerGuidGreaterThanOrEqualTo(String value) {
            addCriterion("merger_customer_guid >=", value, "mergerCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerGuidLessThan(String value) {
            addCriterion("merger_customer_guid <", value, "mergerCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerGuidLessThanOrEqualTo(String value) {
            addCriterion("merger_customer_guid <=", value, "mergerCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerGuidLike(String value) {
            addCriterion("merger_customer_guid like", value, "mergerCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerGuidNotLike(String value) {
            addCriterion("merger_customer_guid not like", value, "mergerCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerGuidIn(List<String> values) {
            addCriterion("merger_customer_guid in", values, "mergerCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerGuidNotIn(List<String> values) {
            addCriterion("merger_customer_guid not in", values, "mergerCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerGuidBetween(String value1, String value2) {
            addCriterion("merger_customer_guid between", value1, value2, "mergerCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerGuidNotBetween(String value1, String value2) {
            addCriterion("merger_customer_guid not between", value1, value2, "mergerCustomerGuid");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerNoIsNull() {
            addCriterion("merger_customer_no is null");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerNoIsNotNull() {
            addCriterion("merger_customer_no is not null");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerNoEqualTo(String value) {
            addCriterion("merger_customer_no =", value, "mergerCustomerNo");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerNoNotEqualTo(String value) {
            addCriterion("merger_customer_no <>", value, "mergerCustomerNo");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerNoGreaterThan(String value) {
            addCriterion("merger_customer_no >", value, "mergerCustomerNo");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerNoGreaterThanOrEqualTo(String value) {
            addCriterion("merger_customer_no >=", value, "mergerCustomerNo");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerNoLessThan(String value) {
            addCriterion("merger_customer_no <", value, "mergerCustomerNo");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerNoLessThanOrEqualTo(String value) {
            addCriterion("merger_customer_no <=", value, "mergerCustomerNo");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerNoLike(String value) {
            addCriterion("merger_customer_no like", value, "mergerCustomerNo");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerNoNotLike(String value) {
            addCriterion("merger_customer_no not like", value, "mergerCustomerNo");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerNoIn(List<String> values) {
            addCriterion("merger_customer_no in", values, "mergerCustomerNo");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerNoNotIn(List<String> values) {
            addCriterion("merger_customer_no not in", values, "mergerCustomerNo");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerNoBetween(String value1, String value2) {
            addCriterion("merger_customer_no between", value1, value2, "mergerCustomerNo");
            return (Criteria) this;
        }

        public Criteria andMergerCustomerNoNotBetween(String value1, String value2) {
            addCriterion("merger_customer_no not between", value1, value2, "mergerCustomerNo");
            return (Criteria) this;
        }

        public Criteria andMergerTimeIsNull() {
            addCriterion("merger_time is null");
            return (Criteria) this;
        }

        public Criteria andMergerTimeIsNotNull() {
            addCriterion("merger_time is not null");
            return (Criteria) this;
        }

        public Criteria andMergerTimeEqualTo(Date value) {
            addCriterion("merger_time =", value, "mergerTime");
            return (Criteria) this;
        }

        public Criteria andMergerTimeNotEqualTo(Date value) {
            addCriterion("merger_time <>", value, "mergerTime");
            return (Criteria) this;
        }

        public Criteria andMergerTimeGreaterThan(Date value) {
            addCriterion("merger_time >", value, "mergerTime");
            return (Criteria) this;
        }

        public Criteria andMergerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("merger_time >=", value, "mergerTime");
            return (Criteria) this;
        }

        public Criteria andMergerTimeLessThan(Date value) {
            addCriterion("merger_time <", value, "mergerTime");
            return (Criteria) this;
        }

        public Criteria andMergerTimeLessThanOrEqualTo(Date value) {
            addCriterion("merger_time <=", value, "mergerTime");
            return (Criteria) this;
        }

        public Criteria andMergerTimeIn(List<Date> values) {
            addCriterion("merger_time in", values, "mergerTime");
            return (Criteria) this;
        }

        public Criteria andMergerTimeNotIn(List<Date> values) {
            addCriterion("merger_time not in", values, "mergerTime");
            return (Criteria) this;
        }

        public Criteria andMergerTimeBetween(Date value1, Date value2) {
            addCriterion("merger_time between", value1, value2, "mergerTime");
            return (Criteria) this;
        }

        public Criteria andMergerTimeNotBetween(Date value1, Date value2) {
            addCriterion("merger_time not between", value1, value2, "mergerTime");
            return (Criteria) this;
        }

        public Criteria andMergerOperatorIsNull() {
            addCriterion("merger_operator is null");
            return (Criteria) this;
        }

        public Criteria andMergerOperatorIsNotNull() {
            addCriterion("merger_operator is not null");
            return (Criteria) this;
        }

        public Criteria andMergerOperatorEqualTo(Integer value) {
            addCriterion("merger_operator =", value, "mergerOperator");
            return (Criteria) this;
        }

        public Criteria andMergerOperatorNotEqualTo(Integer value) {
            addCriterion("merger_operator <>", value, "mergerOperator");
            return (Criteria) this;
        }

        public Criteria andMergerOperatorGreaterThan(Integer value) {
            addCriterion("merger_operator >", value, "mergerOperator");
            return (Criteria) this;
        }

        public Criteria andMergerOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("merger_operator >=", value, "mergerOperator");
            return (Criteria) this;
        }

        public Criteria andMergerOperatorLessThan(Integer value) {
            addCriterion("merger_operator <", value, "mergerOperator");
            return (Criteria) this;
        }

        public Criteria andMergerOperatorLessThanOrEqualTo(Integer value) {
            addCriterion("merger_operator <=", value, "mergerOperator");
            return (Criteria) this;
        }

        public Criteria andMergerOperatorIn(List<Integer> values) {
            addCriterion("merger_operator in", values, "mergerOperator");
            return (Criteria) this;
        }

        public Criteria andMergerOperatorNotIn(List<Integer> values) {
            addCriterion("merger_operator not in", values, "mergerOperator");
            return (Criteria) this;
        }

        public Criteria andMergerOperatorBetween(Integer value1, Integer value2) {
            addCriterion("merger_operator between", value1, value2, "mergerOperator");
            return (Criteria) this;
        }

        public Criteria andMergerOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("merger_operator not between", value1, value2, "mergerOperator");
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