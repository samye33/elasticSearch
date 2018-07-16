package com.am.es.clueentity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClueStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClueStatusExample() {
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

        public Criteria andClueSourceIsNull() {
            addCriterion("clue_source is null");
            return (Criteria) this;
        }

        public Criteria andClueSourceIsNotNull() {
            addCriterion("clue_source is not null");
            return (Criteria) this;
        }

        public Criteria andClueSourceEqualTo(Integer value) {
            addCriterion("clue_source =", value, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceNotEqualTo(Integer value) {
            addCriterion("clue_source <>", value, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceGreaterThan(Integer value) {
            addCriterion("clue_source >", value, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("clue_source >=", value, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceLessThan(Integer value) {
            addCriterion("clue_source <", value, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceLessThanOrEqualTo(Integer value) {
            addCriterion("clue_source <=", value, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceIn(List<Integer> values) {
            addCriterion("clue_source in", values, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceNotIn(List<Integer> values) {
            addCriterion("clue_source not in", values, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceBetween(Integer value1, Integer value2) {
            addCriterion("clue_source between", value1, value2, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("clue_source not between", value1, value2, "clueSource");
            return (Criteria) this;
        }

        public Criteria andClueSaleOwnerIsNull() {
            addCriterion("clue_sale_owner is null");
            return (Criteria) this;
        }

        public Criteria andClueSaleOwnerIsNotNull() {
            addCriterion("clue_sale_owner is not null");
            return (Criteria) this;
        }

        public Criteria andClueSaleOwnerEqualTo(Integer value) {
            addCriterion("clue_sale_owner =", value, "clueSaleOwner");
            return (Criteria) this;
        }

        public Criteria andClueSaleOwnerNotEqualTo(Integer value) {
            addCriterion("clue_sale_owner <>", value, "clueSaleOwner");
            return (Criteria) this;
        }

        public Criteria andClueSaleOwnerGreaterThan(Integer value) {
            addCriterion("clue_sale_owner >", value, "clueSaleOwner");
            return (Criteria) this;
        }

        public Criteria andClueSaleOwnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("clue_sale_owner >=", value, "clueSaleOwner");
            return (Criteria) this;
        }

        public Criteria andClueSaleOwnerLessThan(Integer value) {
            addCriterion("clue_sale_owner <", value, "clueSaleOwner");
            return (Criteria) this;
        }

        public Criteria andClueSaleOwnerLessThanOrEqualTo(Integer value) {
            addCriterion("clue_sale_owner <=", value, "clueSaleOwner");
            return (Criteria) this;
        }

        public Criteria andClueSaleOwnerIn(List<Integer> values) {
            addCriterion("clue_sale_owner in", values, "clueSaleOwner");
            return (Criteria) this;
        }

        public Criteria andClueSaleOwnerNotIn(List<Integer> values) {
            addCriterion("clue_sale_owner not in", values, "clueSaleOwner");
            return (Criteria) this;
        }

        public Criteria andClueSaleOwnerBetween(Integer value1, Integer value2) {
            addCriterion("clue_sale_owner between", value1, value2, "clueSaleOwner");
            return (Criteria) this;
        }

        public Criteria andClueSaleOwnerNotBetween(Integer value1, Integer value2) {
            addCriterion("clue_sale_owner not between", value1, value2, "clueSaleOwner");
            return (Criteria) this;
        }

        public Criteria andClueTmkOwnerIsNull() {
            addCriterion("clue_tmk_owner is null");
            return (Criteria) this;
        }

        public Criteria andClueTmkOwnerIsNotNull() {
            addCriterion("clue_tmk_owner is not null");
            return (Criteria) this;
        }

        public Criteria andClueTmkOwnerEqualTo(Integer value) {
            addCriterion("clue_tmk_owner =", value, "clueTmkOwner");
            return (Criteria) this;
        }

        public Criteria andClueTmkOwnerNotEqualTo(Integer value) {
            addCriterion("clue_tmk_owner <>", value, "clueTmkOwner");
            return (Criteria) this;
        }

        public Criteria andClueTmkOwnerGreaterThan(Integer value) {
            addCriterion("clue_tmk_owner >", value, "clueTmkOwner");
            return (Criteria) this;
        }

        public Criteria andClueTmkOwnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("clue_tmk_owner >=", value, "clueTmkOwner");
            return (Criteria) this;
        }

        public Criteria andClueTmkOwnerLessThan(Integer value) {
            addCriterion("clue_tmk_owner <", value, "clueTmkOwner");
            return (Criteria) this;
        }

        public Criteria andClueTmkOwnerLessThanOrEqualTo(Integer value) {
            addCriterion("clue_tmk_owner <=", value, "clueTmkOwner");
            return (Criteria) this;
        }

        public Criteria andClueTmkOwnerIn(List<Integer> values) {
            addCriterion("clue_tmk_owner in", values, "clueTmkOwner");
            return (Criteria) this;
        }

        public Criteria andClueTmkOwnerNotIn(List<Integer> values) {
            addCriterion("clue_tmk_owner not in", values, "clueTmkOwner");
            return (Criteria) this;
        }

        public Criteria andClueTmkOwnerBetween(Integer value1, Integer value2) {
            addCriterion("clue_tmk_owner between", value1, value2, "clueTmkOwner");
            return (Criteria) this;
        }

        public Criteria andClueTmkOwnerNotBetween(Integer value1, Integer value2) {
            addCriterion("clue_tmk_owner not between", value1, value2, "clueTmkOwner");
            return (Criteria) this;
        }

        public Criteria andClueCsOwnerIsNull() {
            addCriterion("clue_cs_owner is null");
            return (Criteria) this;
        }

        public Criteria andClueCsOwnerIsNotNull() {
            addCriterion("clue_cs_owner is not null");
            return (Criteria) this;
        }

        public Criteria andClueCsOwnerEqualTo(Integer value) {
            addCriterion("clue_cs_owner =", value, "clueCsOwner");
            return (Criteria) this;
        }

        public Criteria andClueCsOwnerNotEqualTo(Integer value) {
            addCriterion("clue_cs_owner <>", value, "clueCsOwner");
            return (Criteria) this;
        }

        public Criteria andClueCsOwnerGreaterThan(Integer value) {
            addCriterion("clue_cs_owner >", value, "clueCsOwner");
            return (Criteria) this;
        }

        public Criteria andClueCsOwnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("clue_cs_owner >=", value, "clueCsOwner");
            return (Criteria) this;
        }

        public Criteria andClueCsOwnerLessThan(Integer value) {
            addCriterion("clue_cs_owner <", value, "clueCsOwner");
            return (Criteria) this;
        }

        public Criteria andClueCsOwnerLessThanOrEqualTo(Integer value) {
            addCriterion("clue_cs_owner <=", value, "clueCsOwner");
            return (Criteria) this;
        }

        public Criteria andClueCsOwnerIn(List<Integer> values) {
            addCriterion("clue_cs_owner in", values, "clueCsOwner");
            return (Criteria) this;
        }

        public Criteria andClueCsOwnerNotIn(List<Integer> values) {
            addCriterion("clue_cs_owner not in", values, "clueCsOwner");
            return (Criteria) this;
        }

        public Criteria andClueCsOwnerBetween(Integer value1, Integer value2) {
            addCriterion("clue_cs_owner between", value1, value2, "clueCsOwner");
            return (Criteria) this;
        }

        public Criteria andClueCsOwnerNotBetween(Integer value1, Integer value2) {
            addCriterion("clue_cs_owner not between", value1, value2, "clueCsOwner");
            return (Criteria) this;
        }

        public Criteria andClueSchoolManagerOwnerIsNull() {
            addCriterion("clue_school_manager_owner is null");
            return (Criteria) this;
        }

        public Criteria andClueSchoolManagerOwnerIsNotNull() {
            addCriterion("clue_school_manager_owner is not null");
            return (Criteria) this;
        }

        public Criteria andClueSchoolManagerOwnerEqualTo(Integer value) {
            addCriterion("clue_school_manager_owner =", value, "clueSchoolManagerOwner");
            return (Criteria) this;
        }

        public Criteria andClueSchoolManagerOwnerNotEqualTo(Integer value) {
            addCriterion("clue_school_manager_owner <>", value, "clueSchoolManagerOwner");
            return (Criteria) this;
        }

        public Criteria andClueSchoolManagerOwnerGreaterThan(Integer value) {
            addCriterion("clue_school_manager_owner >", value, "clueSchoolManagerOwner");
            return (Criteria) this;
        }

        public Criteria andClueSchoolManagerOwnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("clue_school_manager_owner >=", value, "clueSchoolManagerOwner");
            return (Criteria) this;
        }

        public Criteria andClueSchoolManagerOwnerLessThan(Integer value) {
            addCriterion("clue_school_manager_owner <", value, "clueSchoolManagerOwner");
            return (Criteria) this;
        }

        public Criteria andClueSchoolManagerOwnerLessThanOrEqualTo(Integer value) {
            addCriterion("clue_school_manager_owner <=", value, "clueSchoolManagerOwner");
            return (Criteria) this;
        }

        public Criteria andClueSchoolManagerOwnerIn(List<Integer> values) {
            addCriterion("clue_school_manager_owner in", values, "clueSchoolManagerOwner");
            return (Criteria) this;
        }

        public Criteria andClueSchoolManagerOwnerNotIn(List<Integer> values) {
            addCriterion("clue_school_manager_owner not in", values, "clueSchoolManagerOwner");
            return (Criteria) this;
        }

        public Criteria andClueSchoolManagerOwnerBetween(Integer value1, Integer value2) {
            addCriterion("clue_school_manager_owner between", value1, value2, "clueSchoolManagerOwner");
            return (Criteria) this;
        }

        public Criteria andClueSchoolManagerOwnerNotBetween(Integer value1, Integer value2) {
            addCriterion("clue_school_manager_owner not between", value1, value2, "clueSchoolManagerOwner");
            return (Criteria) this;
        }

        public Criteria andClueOwnerDeparmentIsNull() {
            addCriterion("clue_owner_deparment is null");
            return (Criteria) this;
        }

        public Criteria andClueOwnerDeparmentIsNotNull() {
            addCriterion("clue_owner_deparment is not null");
            return (Criteria) this;
        }

        public Criteria andClueOwnerDeparmentEqualTo(Integer value) {
            addCriterion("clue_owner_deparment =", value, "clueOwnerDeparment");
            return (Criteria) this;
        }

        public Criteria andClueOwnerDeparmentNotEqualTo(Integer value) {
            addCriterion("clue_owner_deparment <>", value, "clueOwnerDeparment");
            return (Criteria) this;
        }

        public Criteria andClueOwnerDeparmentGreaterThan(Integer value) {
            addCriterion("clue_owner_deparment >", value, "clueOwnerDeparment");
            return (Criteria) this;
        }

        public Criteria andClueOwnerDeparmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("clue_owner_deparment >=", value, "clueOwnerDeparment");
            return (Criteria) this;
        }

        public Criteria andClueOwnerDeparmentLessThan(Integer value) {
            addCriterion("clue_owner_deparment <", value, "clueOwnerDeparment");
            return (Criteria) this;
        }

        public Criteria andClueOwnerDeparmentLessThanOrEqualTo(Integer value) {
            addCriterion("clue_owner_deparment <=", value, "clueOwnerDeparment");
            return (Criteria) this;
        }

        public Criteria andClueOwnerDeparmentIn(List<Integer> values) {
            addCriterion("clue_owner_deparment in", values, "clueOwnerDeparment");
            return (Criteria) this;
        }

        public Criteria andClueOwnerDeparmentNotIn(List<Integer> values) {
            addCriterion("clue_owner_deparment not in", values, "clueOwnerDeparment");
            return (Criteria) this;
        }

        public Criteria andClueOwnerDeparmentBetween(Integer value1, Integer value2) {
            addCriterion("clue_owner_deparment between", value1, value2, "clueOwnerDeparment");
            return (Criteria) this;
        }

        public Criteria andClueOwnerDeparmentNotBetween(Integer value1, Integer value2) {
            addCriterion("clue_owner_deparment not between", value1, value2, "clueOwnerDeparment");
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

        public Criteria andClueOwerGetTimeIsNull() {
            addCriterion("clue_ower_get_time is null");
            return (Criteria) this;
        }

        public Criteria andClueOwerGetTimeIsNotNull() {
            addCriterion("clue_ower_get_time is not null");
            return (Criteria) this;
        }

        public Criteria andClueOwerGetTimeEqualTo(Date value) {
            addCriterion("clue_ower_get_time =", value, "clueOwerGetTime");
            return (Criteria) this;
        }

        public Criteria andClueOwerGetTimeNotEqualTo(Date value) {
            addCriterion("clue_ower_get_time <>", value, "clueOwerGetTime");
            return (Criteria) this;
        }

        public Criteria andClueOwerGetTimeGreaterThan(Date value) {
            addCriterion("clue_ower_get_time >", value, "clueOwerGetTime");
            return (Criteria) this;
        }

        public Criteria andClueOwerGetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("clue_ower_get_time >=", value, "clueOwerGetTime");
            return (Criteria) this;
        }

        public Criteria andClueOwerGetTimeLessThan(Date value) {
            addCriterion("clue_ower_get_time <", value, "clueOwerGetTime");
            return (Criteria) this;
        }

        public Criteria andClueOwerGetTimeLessThanOrEqualTo(Date value) {
            addCriterion("clue_ower_get_time <=", value, "clueOwerGetTime");
            return (Criteria) this;
        }

        public Criteria andClueOwerGetTimeIn(List<Date> values) {
            addCriterion("clue_ower_get_time in", values, "clueOwerGetTime");
            return (Criteria) this;
        }

        public Criteria andClueOwerGetTimeNotIn(List<Date> values) {
            addCriterion("clue_ower_get_time not in", values, "clueOwerGetTime");
            return (Criteria) this;
        }

        public Criteria andClueOwerGetTimeBetween(Date value1, Date value2) {
            addCriterion("clue_ower_get_time between", value1, value2, "clueOwerGetTime");
            return (Criteria) this;
        }

        public Criteria andClueOwerGetTimeNotBetween(Date value1, Date value2) {
            addCriterion("clue_ower_get_time not between", value1, value2, "clueOwerGetTime");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationChannelIsNull() {
            addCriterion("repeat_consultation_channel is null");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationChannelIsNotNull() {
            addCriterion("repeat_consultation_channel is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationChannelEqualTo(String value) {
            addCriterion("repeat_consultation_channel =", value, "repeatConsultationChannel");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationChannelNotEqualTo(String value) {
            addCriterion("repeat_consultation_channel <>", value, "repeatConsultationChannel");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationChannelGreaterThan(String value) {
            addCriterion("repeat_consultation_channel >", value, "repeatConsultationChannel");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationChannelGreaterThanOrEqualTo(String value) {
            addCriterion("repeat_consultation_channel >=", value, "repeatConsultationChannel");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationChannelLessThan(String value) {
            addCriterion("repeat_consultation_channel <", value, "repeatConsultationChannel");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationChannelLessThanOrEqualTo(String value) {
            addCriterion("repeat_consultation_channel <=", value, "repeatConsultationChannel");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationChannelLike(String value) {
            addCriterion("repeat_consultation_channel like", value, "repeatConsultationChannel");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationChannelNotLike(String value) {
            addCriterion("repeat_consultation_channel not like", value, "repeatConsultationChannel");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationChannelIn(List<String> values) {
            addCriterion("repeat_consultation_channel in", values, "repeatConsultationChannel");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationChannelNotIn(List<String> values) {
            addCriterion("repeat_consultation_channel not in", values, "repeatConsultationChannel");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationChannelBetween(String value1, String value2) {
            addCriterion("repeat_consultation_channel between", value1, value2, "repeatConsultationChannel");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationChannelNotBetween(String value1, String value2) {
            addCriterion("repeat_consultation_channel not between", value1, value2, "repeatConsultationChannel");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationOwnerIsNull() {
            addCriterion("repeat_consultation_owner is null");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationOwnerIsNotNull() {
            addCriterion("repeat_consultation_owner is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationOwnerEqualTo(Integer value) {
            addCriterion("repeat_consultation_owner =", value, "repeatConsultationOwner");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationOwnerNotEqualTo(Integer value) {
            addCriterion("repeat_consultation_owner <>", value, "repeatConsultationOwner");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationOwnerGreaterThan(Integer value) {
            addCriterion("repeat_consultation_owner >", value, "repeatConsultationOwner");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationOwnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("repeat_consultation_owner >=", value, "repeatConsultationOwner");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationOwnerLessThan(Integer value) {
            addCriterion("repeat_consultation_owner <", value, "repeatConsultationOwner");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationOwnerLessThanOrEqualTo(Integer value) {
            addCriterion("repeat_consultation_owner <=", value, "repeatConsultationOwner");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationOwnerIn(List<Integer> values) {
            addCriterion("repeat_consultation_owner in", values, "repeatConsultationOwner");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationOwnerNotIn(List<Integer> values) {
            addCriterion("repeat_consultation_owner not in", values, "repeatConsultationOwner");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationOwnerBetween(Integer value1, Integer value2) {
            addCriterion("repeat_consultation_owner between", value1, value2, "repeatConsultationOwner");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationOwnerNotBetween(Integer value1, Integer value2) {
            addCriterion("repeat_consultation_owner not between", value1, value2, "repeatConsultationOwner");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationTimeIsNull() {
            addCriterion("repeat_consultation_time is null");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationTimeIsNotNull() {
            addCriterion("repeat_consultation_time is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationTimeEqualTo(Date value) {
            addCriterion("repeat_consultation_time =", value, "repeatConsultationTime");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationTimeNotEqualTo(Date value) {
            addCriterion("repeat_consultation_time <>", value, "repeatConsultationTime");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationTimeGreaterThan(Date value) {
            addCriterion("repeat_consultation_time >", value, "repeatConsultationTime");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("repeat_consultation_time >=", value, "repeatConsultationTime");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationTimeLessThan(Date value) {
            addCriterion("repeat_consultation_time <", value, "repeatConsultationTime");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationTimeLessThanOrEqualTo(Date value) {
            addCriterion("repeat_consultation_time <=", value, "repeatConsultationTime");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationTimeIn(List<Date> values) {
            addCriterion("repeat_consultation_time in", values, "repeatConsultationTime");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationTimeNotIn(List<Date> values) {
            addCriterion("repeat_consultation_time not in", values, "repeatConsultationTime");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationTimeBetween(Date value1, Date value2) {
            addCriterion("repeat_consultation_time between", value1, value2, "repeatConsultationTime");
            return (Criteria) this;
        }

        public Criteria andRepeatConsultationTimeNotBetween(Date value1, Date value2) {
            addCriterion("repeat_consultation_time not between", value1, value2, "repeatConsultationTime");
            return (Criteria) this;
        }

        public Criteria andRecommenderIsNull() {
            addCriterion("recommender is null");
            return (Criteria) this;
        }

        public Criteria andRecommenderIsNotNull() {
            addCriterion("recommender is not null");
            return (Criteria) this;
        }

        public Criteria andRecommenderEqualTo(String value) {
            addCriterion("recommender =", value, "recommender");
            return (Criteria) this;
        }

        public Criteria andRecommenderNotEqualTo(String value) {
            addCriterion("recommender <>", value, "recommender");
            return (Criteria) this;
        }

        public Criteria andRecommenderGreaterThan(String value) {
            addCriterion("recommender >", value, "recommender");
            return (Criteria) this;
        }

        public Criteria andRecommenderGreaterThanOrEqualTo(String value) {
            addCriterion("recommender >=", value, "recommender");
            return (Criteria) this;
        }

        public Criteria andRecommenderLessThan(String value) {
            addCriterion("recommender <", value, "recommender");
            return (Criteria) this;
        }

        public Criteria andRecommenderLessThanOrEqualTo(String value) {
            addCriterion("recommender <=", value, "recommender");
            return (Criteria) this;
        }

        public Criteria andRecommenderLike(String value) {
            addCriterion("recommender like", value, "recommender");
            return (Criteria) this;
        }

        public Criteria andRecommenderNotLike(String value) {
            addCriterion("recommender not like", value, "recommender");
            return (Criteria) this;
        }

        public Criteria andRecommenderIn(List<String> values) {
            addCriterion("recommender in", values, "recommender");
            return (Criteria) this;
        }

        public Criteria andRecommenderNotIn(List<String> values) {
            addCriterion("recommender not in", values, "recommender");
            return (Criteria) this;
        }

        public Criteria andRecommenderBetween(String value1, String value2) {
            addCriterion("recommender between", value1, value2, "recommender");
            return (Criteria) this;
        }

        public Criteria andRecommenderNotBetween(String value1, String value2) {
            addCriterion("recommender not between", value1, value2, "recommender");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeIsNull() {
            addCriterion("recommend_time is null");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeIsNotNull() {
            addCriterion("recommend_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeEqualTo(Date value) {
            addCriterion("recommend_time =", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeNotEqualTo(Date value) {
            addCriterion("recommend_time <>", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeGreaterThan(Date value) {
            addCriterion("recommend_time >", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recommend_time >=", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeLessThan(Date value) {
            addCriterion("recommend_time <", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeLessThanOrEqualTo(Date value) {
            addCriterion("recommend_time <=", value, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeIn(List<Date> values) {
            addCriterion("recommend_time in", values, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeNotIn(List<Date> values) {
            addCriterion("recommend_time not in", values, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeBetween(Date value1, Date value2) {
            addCriterion("recommend_time between", value1, value2, "recommendTime");
            return (Criteria) this;
        }

        public Criteria andRecommendTimeNotBetween(Date value1, Date value2) {
            addCriterion("recommend_time not between", value1, value2, "recommendTime");
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

        public Criteria andRecommendTypeIsNull() {
            addCriterion("recommend_type is null");
            return (Criteria) this;
        }

        public Criteria andRecommendTypeIsNotNull() {
            addCriterion("recommend_type is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendTypeEqualTo(Integer value) {
            addCriterion("recommend_type =", value, "recommendType");
            return (Criteria) this;
        }

        public Criteria andRecommendTypeNotEqualTo(Integer value) {
            addCriterion("recommend_type <>", value, "recommendType");
            return (Criteria) this;
        }

        public Criteria andRecommendTypeGreaterThan(Integer value) {
            addCriterion("recommend_type >", value, "recommendType");
            return (Criteria) this;
        }

        public Criteria andRecommendTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend_type >=", value, "recommendType");
            return (Criteria) this;
        }

        public Criteria andRecommendTypeLessThan(Integer value) {
            addCriterion("recommend_type <", value, "recommendType");
            return (Criteria) this;
        }

        public Criteria andRecommendTypeLessThanOrEqualTo(Integer value) {
            addCriterion("recommend_type <=", value, "recommendType");
            return (Criteria) this;
        }

        public Criteria andRecommendTypeIn(List<Integer> values) {
            addCriterion("recommend_type in", values, "recommendType");
            return (Criteria) this;
        }

        public Criteria andRecommendTypeNotIn(List<Integer> values) {
            addCriterion("recommend_type not in", values, "recommendType");
            return (Criteria) this;
        }

        public Criteria andRecommendTypeBetween(Integer value1, Integer value2) {
            addCriterion("recommend_type between", value1, value2, "recommendType");
            return (Criteria) this;
        }

        public Criteria andRecommendTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend_type not between", value1, value2, "recommendType");
            return (Criteria) this;
        }

        public Criteria andErpRecommenderIsNull() {
            addCriterion("erp_recommender is null");
            return (Criteria) this;
        }

        public Criteria andErpRecommenderIsNotNull() {
            addCriterion("erp_recommender is not null");
            return (Criteria) this;
        }

        public Criteria andErpRecommenderEqualTo(String value) {
            addCriterion("erp_recommender =", value, "erpRecommender");
            return (Criteria) this;
        }

        public Criteria andErpRecommenderNotEqualTo(String value) {
            addCriterion("erp_recommender <>", value, "erpRecommender");
            return (Criteria) this;
        }

        public Criteria andErpRecommenderGreaterThan(String value) {
            addCriterion("erp_recommender >", value, "erpRecommender");
            return (Criteria) this;
        }

        public Criteria andErpRecommenderGreaterThanOrEqualTo(String value) {
            addCriterion("erp_recommender >=", value, "erpRecommender");
            return (Criteria) this;
        }

        public Criteria andErpRecommenderLessThan(String value) {
            addCriterion("erp_recommender <", value, "erpRecommender");
            return (Criteria) this;
        }

        public Criteria andErpRecommenderLessThanOrEqualTo(String value) {
            addCriterion("erp_recommender <=", value, "erpRecommender");
            return (Criteria) this;
        }

        public Criteria andErpRecommenderLike(String value) {
            addCriterion("erp_recommender like", value, "erpRecommender");
            return (Criteria) this;
        }

        public Criteria andErpRecommenderNotLike(String value) {
            addCriterion("erp_recommender not like", value, "erpRecommender");
            return (Criteria) this;
        }

        public Criteria andErpRecommenderIn(List<String> values) {
            addCriterion("erp_recommender in", values, "erpRecommender");
            return (Criteria) this;
        }

        public Criteria andErpRecommenderNotIn(List<String> values) {
            addCriterion("erp_recommender not in", values, "erpRecommender");
            return (Criteria) this;
        }

        public Criteria andErpRecommenderBetween(String value1, String value2) {
            addCriterion("erp_recommender between", value1, value2, "erpRecommender");
            return (Criteria) this;
        }

        public Criteria andErpRecommenderNotBetween(String value1, String value2) {
            addCriterion("erp_recommender not between", value1, value2, "erpRecommender");
            return (Criteria) this;
        }

        public Criteria andErpClueOwnerIsNull() {
            addCriterion("erp_clue_owner is null");
            return (Criteria) this;
        }

        public Criteria andErpClueOwnerIsNotNull() {
            addCriterion("erp_clue_owner is not null");
            return (Criteria) this;
        }

        public Criteria andErpClueOwnerEqualTo(String value) {
            addCriterion("erp_clue_owner =", value, "erpClueOwner");
            return (Criteria) this;
        }

        public Criteria andErpClueOwnerNotEqualTo(String value) {
            addCriterion("erp_clue_owner <>", value, "erpClueOwner");
            return (Criteria) this;
        }

        public Criteria andErpClueOwnerGreaterThan(String value) {
            addCriterion("erp_clue_owner >", value, "erpClueOwner");
            return (Criteria) this;
        }

        public Criteria andErpClueOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("erp_clue_owner >=", value, "erpClueOwner");
            return (Criteria) this;
        }

        public Criteria andErpClueOwnerLessThan(String value) {
            addCriterion("erp_clue_owner <", value, "erpClueOwner");
            return (Criteria) this;
        }

        public Criteria andErpClueOwnerLessThanOrEqualTo(String value) {
            addCriterion("erp_clue_owner <=", value, "erpClueOwner");
            return (Criteria) this;
        }

        public Criteria andErpClueOwnerLike(String value) {
            addCriterion("erp_clue_owner like", value, "erpClueOwner");
            return (Criteria) this;
        }

        public Criteria andErpClueOwnerNotLike(String value) {
            addCriterion("erp_clue_owner not like", value, "erpClueOwner");
            return (Criteria) this;
        }

        public Criteria andErpClueOwnerIn(List<String> values) {
            addCriterion("erp_clue_owner in", values, "erpClueOwner");
            return (Criteria) this;
        }

        public Criteria andErpClueOwnerNotIn(List<String> values) {
            addCriterion("erp_clue_owner not in", values, "erpClueOwner");
            return (Criteria) this;
        }

        public Criteria andErpClueOwnerBetween(String value1, String value2) {
            addCriterion("erp_clue_owner between", value1, value2, "erpClueOwner");
            return (Criteria) this;
        }

        public Criteria andErpClueOwnerNotBetween(String value1, String value2) {
            addCriterion("erp_clue_owner not between", value1, value2, "erpClueOwner");
            return (Criteria) this;
        }

        public Criteria andAssociatesIsNull() {
            addCriterion("associates is null");
            return (Criteria) this;
        }

        public Criteria andAssociatesIsNotNull() {
            addCriterion("associates is not null");
            return (Criteria) this;
        }

        public Criteria andAssociatesEqualTo(String value) {
            addCriterion("associates =", value, "associates");
            return (Criteria) this;
        }

        public Criteria andAssociatesNotEqualTo(String value) {
            addCriterion("associates <>", value, "associates");
            return (Criteria) this;
        }

        public Criteria andAssociatesGreaterThan(String value) {
            addCriterion("associates >", value, "associates");
            return (Criteria) this;
        }

        public Criteria andAssociatesGreaterThanOrEqualTo(String value) {
            addCriterion("associates >=", value, "associates");
            return (Criteria) this;
        }

        public Criteria andAssociatesLessThan(String value) {
            addCriterion("associates <", value, "associates");
            return (Criteria) this;
        }

        public Criteria andAssociatesLessThanOrEqualTo(String value) {
            addCriterion("associates <=", value, "associates");
            return (Criteria) this;
        }

        public Criteria andAssociatesLike(String value) {
            addCriterion("associates like", value, "associates");
            return (Criteria) this;
        }

        public Criteria andAssociatesNotLike(String value) {
            addCriterion("associates not like", value, "associates");
            return (Criteria) this;
        }

        public Criteria andAssociatesIn(List<String> values) {
            addCriterion("associates in", values, "associates");
            return (Criteria) this;
        }

        public Criteria andAssociatesNotIn(List<String> values) {
            addCriterion("associates not in", values, "associates");
            return (Criteria) this;
        }

        public Criteria andAssociatesBetween(String value1, String value2) {
            addCriterion("associates between", value1, value2, "associates");
            return (Criteria) this;
        }

        public Criteria andAssociatesNotBetween(String value1, String value2) {
            addCriterion("associates not between", value1, value2, "associates");
            return (Criteria) this;
        }

        public Criteria andIsPrivatePoolIsNull() {
            addCriterion("is_private_pool is null");
            return (Criteria) this;
        }

        public Criteria andIsPrivatePoolIsNotNull() {
            addCriterion("is_private_pool is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrivatePoolEqualTo(Byte value) {
            addCriterion("is_private_pool =", value, "isPrivatePool");
            return (Criteria) this;
        }

        public Criteria andIsPrivatePoolNotEqualTo(Byte value) {
            addCriterion("is_private_pool <>", value, "isPrivatePool");
            return (Criteria) this;
        }

        public Criteria andIsPrivatePoolGreaterThan(Byte value) {
            addCriterion("is_private_pool >", value, "isPrivatePool");
            return (Criteria) this;
        }

        public Criteria andIsPrivatePoolGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_private_pool >=", value, "isPrivatePool");
            return (Criteria) this;
        }

        public Criteria andIsPrivatePoolLessThan(Byte value) {
            addCriterion("is_private_pool <", value, "isPrivatePool");
            return (Criteria) this;
        }

        public Criteria andIsPrivatePoolLessThanOrEqualTo(Byte value) {
            addCriterion("is_private_pool <=", value, "isPrivatePool");
            return (Criteria) this;
        }

        public Criteria andIsPrivatePoolIn(List<Byte> values) {
            addCriterion("is_private_pool in", values, "isPrivatePool");
            return (Criteria) this;
        }

        public Criteria andIsPrivatePoolNotIn(List<Byte> values) {
            addCriterion("is_private_pool not in", values, "isPrivatePool");
            return (Criteria) this;
        }

        public Criteria andIsPrivatePoolBetween(Byte value1, Byte value2) {
            addCriterion("is_private_pool between", value1, value2, "isPrivatePool");
            return (Criteria) this;
        }

        public Criteria andIsPrivatePoolNotBetween(Byte value1, Byte value2) {
            addCriterion("is_private_pool not between", value1, value2, "isPrivatePool");
            return (Criteria) this;
        }

        public Criteria andClueOwnerCommunicateCountIsNull() {
            addCriterion("clue_owner_communicate_count is null");
            return (Criteria) this;
        }

        public Criteria andClueOwnerCommunicateCountIsNotNull() {
            addCriterion("clue_owner_communicate_count is not null");
            return (Criteria) this;
        }

        public Criteria andClueOwnerCommunicateCountEqualTo(Integer value) {
            addCriterion("clue_owner_communicate_count =", value, "clueOwnerCommunicateCount");
            return (Criteria) this;
        }

        public Criteria andClueOwnerCommunicateCountNotEqualTo(Integer value) {
            addCriterion("clue_owner_communicate_count <>", value, "clueOwnerCommunicateCount");
            return (Criteria) this;
        }

        public Criteria andClueOwnerCommunicateCountGreaterThan(Integer value) {
            addCriterion("clue_owner_communicate_count >", value, "clueOwnerCommunicateCount");
            return (Criteria) this;
        }

        public Criteria andClueOwnerCommunicateCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("clue_owner_communicate_count >=", value, "clueOwnerCommunicateCount");
            return (Criteria) this;
        }

        public Criteria andClueOwnerCommunicateCountLessThan(Integer value) {
            addCriterion("clue_owner_communicate_count <", value, "clueOwnerCommunicateCount");
            return (Criteria) this;
        }

        public Criteria andClueOwnerCommunicateCountLessThanOrEqualTo(Integer value) {
            addCriterion("clue_owner_communicate_count <=", value, "clueOwnerCommunicateCount");
            return (Criteria) this;
        }

        public Criteria andClueOwnerCommunicateCountIn(List<Integer> values) {
            addCriterion("clue_owner_communicate_count in", values, "clueOwnerCommunicateCount");
            return (Criteria) this;
        }

        public Criteria andClueOwnerCommunicateCountNotIn(List<Integer> values) {
            addCriterion("clue_owner_communicate_count not in", values, "clueOwnerCommunicateCount");
            return (Criteria) this;
        }

        public Criteria andClueOwnerCommunicateCountBetween(Integer value1, Integer value2) {
            addCriterion("clue_owner_communicate_count between", value1, value2, "clueOwnerCommunicateCount");
            return (Criteria) this;
        }

        public Criteria andClueOwnerCommunicateCountNotBetween(Integer value1, Integer value2) {
            addCriterion("clue_owner_communicate_count not between", value1, value2, "clueOwnerCommunicateCount");
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