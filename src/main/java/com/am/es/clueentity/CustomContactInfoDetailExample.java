package com.am.es.clueentity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomContactInfoDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomContactInfoDetailExample() {
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

        public Criteria andCustomContactsIdIsNull() {
            addCriterion("custom_contacts_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomContactsIdIsNotNull() {
            addCriterion("custom_contacts_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomContactsIdEqualTo(Integer value) {
            addCriterion("custom_contacts_id =", value, "customContactsId");
            return (Criteria) this;
        }

        public Criteria andCustomContactsIdNotEqualTo(Integer value) {
            addCriterion("custom_contacts_id <>", value, "customContactsId");
            return (Criteria) this;
        }

        public Criteria andCustomContactsIdGreaterThan(Integer value) {
            addCriterion("custom_contacts_id >", value, "customContactsId");
            return (Criteria) this;
        }

        public Criteria andCustomContactsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("custom_contacts_id >=", value, "customContactsId");
            return (Criteria) this;
        }

        public Criteria andCustomContactsIdLessThan(Integer value) {
            addCriterion("custom_contacts_id <", value, "customContactsId");
            return (Criteria) this;
        }

        public Criteria andCustomContactsIdLessThanOrEqualTo(Integer value) {
            addCriterion("custom_contacts_id <=", value, "customContactsId");
            return (Criteria) this;
        }

        public Criteria andCustomContactsIdIn(List<Integer> values) {
            addCriterion("custom_contacts_id in", values, "customContactsId");
            return (Criteria) this;
        }

        public Criteria andCustomContactsIdNotIn(List<Integer> values) {
            addCriterion("custom_contacts_id not in", values, "customContactsId");
            return (Criteria) this;
        }

        public Criteria andCustomContactsIdBetween(Integer value1, Integer value2) {
            addCriterion("custom_contacts_id between", value1, value2, "customContactsId");
            return (Criteria) this;
        }

        public Criteria andCustomContactsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("custom_contacts_id not between", value1, value2, "customContactsId");
            return (Criteria) this;
        }

        public Criteria andContactsToolIsNull() {
            addCriterion("contacts_tool is null");
            return (Criteria) this;
        }

        public Criteria andContactsToolIsNotNull() {
            addCriterion("contacts_tool is not null");
            return (Criteria) this;
        }

        public Criteria andContactsToolEqualTo(Integer value) {
            addCriterion("contacts_tool =", value, "contactsTool");
            return (Criteria) this;
        }

        public Criteria andContactsToolNotEqualTo(Integer value) {
            addCriterion("contacts_tool <>", value, "contactsTool");
            return (Criteria) this;
        }

        public Criteria andContactsToolGreaterThan(Integer value) {
            addCriterion("contacts_tool >", value, "contactsTool");
            return (Criteria) this;
        }

        public Criteria andContactsToolGreaterThanOrEqualTo(Integer value) {
            addCriterion("contacts_tool >=", value, "contactsTool");
            return (Criteria) this;
        }

        public Criteria andContactsToolLessThan(Integer value) {
            addCriterion("contacts_tool <", value, "contactsTool");
            return (Criteria) this;
        }

        public Criteria andContactsToolLessThanOrEqualTo(Integer value) {
            addCriterion("contacts_tool <=", value, "contactsTool");
            return (Criteria) this;
        }

        public Criteria andContactsToolIn(List<Integer> values) {
            addCriterion("contacts_tool in", values, "contactsTool");
            return (Criteria) this;
        }

        public Criteria andContactsToolNotIn(List<Integer> values) {
            addCriterion("contacts_tool not in", values, "contactsTool");
            return (Criteria) this;
        }

        public Criteria andContactsToolBetween(Integer value1, Integer value2) {
            addCriterion("contacts_tool between", value1, value2, "contactsTool");
            return (Criteria) this;
        }

        public Criteria andContactsToolNotBetween(Integer value1, Integer value2) {
            addCriterion("contacts_tool not between", value1, value2, "contactsTool");
            return (Criteria) this;
        }

        public Criteria andContactsNoIsNull() {
            addCriterion("contacts_no is null");
            return (Criteria) this;
        }

        public Criteria andContactsNoIsNotNull() {
            addCriterion("contacts_no is not null");
            return (Criteria) this;
        }

        public Criteria andContactsNoEqualTo(String value) {
            addCriterion("contacts_no =", value, "contactsNo");
            return (Criteria) this;
        }

        public Criteria andContactsNoNotEqualTo(String value) {
            addCriterion("contacts_no <>", value, "contactsNo");
            return (Criteria) this;
        }

        public Criteria andContactsNoGreaterThan(String value) {
            addCriterion("contacts_no >", value, "contactsNo");
            return (Criteria) this;
        }

        public Criteria andContactsNoGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_no >=", value, "contactsNo");
            return (Criteria) this;
        }

        public Criteria andContactsNoLessThan(String value) {
            addCriterion("contacts_no <", value, "contactsNo");
            return (Criteria) this;
        }

        public Criteria andContactsNoLessThanOrEqualTo(String value) {
            addCriterion("contacts_no <=", value, "contactsNo");
            return (Criteria) this;
        }

        public Criteria andContactsNoLike(String value) {
            addCriterion("contacts_no like", value, "contactsNo");
            return (Criteria) this;
        }

        public Criteria andContactsNoNotLike(String value) {
            addCriterion("contacts_no not like", value, "contactsNo");
            return (Criteria) this;
        }

        public Criteria andContactsNoIn(List<String> values) {
            addCriterion("contacts_no in", values, "contactsNo");
            return (Criteria) this;
        }

        public Criteria andContactsNoNotIn(List<String> values) {
            addCriterion("contacts_no not in", values, "contactsNo");
            return (Criteria) this;
        }

        public Criteria andContactsNoBetween(String value1, String value2) {
            addCriterion("contacts_no between", value1, value2, "contactsNo");
            return (Criteria) this;
        }

        public Criteria andContactsNoNotBetween(String value1, String value2) {
            addCriterion("contacts_no not between", value1, value2, "contactsNo");
            return (Criteria) this;
        }

        public Criteria andOldCustomGuidIsNull() {
            addCriterion("old_custom_guid is null");
            return (Criteria) this;
        }

        public Criteria andOldCustomGuidIsNotNull() {
            addCriterion("old_custom_guid is not null");
            return (Criteria) this;
        }

        public Criteria andOldCustomGuidEqualTo(String value) {
            addCriterion("old_custom_guid =", value, "oldCustomGuid");
            return (Criteria) this;
        }

        public Criteria andOldCustomGuidNotEqualTo(String value) {
            addCriterion("old_custom_guid <>", value, "oldCustomGuid");
            return (Criteria) this;
        }

        public Criteria andOldCustomGuidGreaterThan(String value) {
            addCriterion("old_custom_guid >", value, "oldCustomGuid");
            return (Criteria) this;
        }

        public Criteria andOldCustomGuidGreaterThanOrEqualTo(String value) {
            addCriterion("old_custom_guid >=", value, "oldCustomGuid");
            return (Criteria) this;
        }

        public Criteria andOldCustomGuidLessThan(String value) {
            addCriterion("old_custom_guid <", value, "oldCustomGuid");
            return (Criteria) this;
        }

        public Criteria andOldCustomGuidLessThanOrEqualTo(String value) {
            addCriterion("old_custom_guid <=", value, "oldCustomGuid");
            return (Criteria) this;
        }

        public Criteria andOldCustomGuidLike(String value) {
            addCriterion("old_custom_guid like", value, "oldCustomGuid");
            return (Criteria) this;
        }

        public Criteria andOldCustomGuidNotLike(String value) {
            addCriterion("old_custom_guid not like", value, "oldCustomGuid");
            return (Criteria) this;
        }

        public Criteria andOldCustomGuidIn(List<String> values) {
            addCriterion("old_custom_guid in", values, "oldCustomGuid");
            return (Criteria) this;
        }

        public Criteria andOldCustomGuidNotIn(List<String> values) {
            addCriterion("old_custom_guid not in", values, "oldCustomGuid");
            return (Criteria) this;
        }

        public Criteria andOldCustomGuidBetween(String value1, String value2) {
            addCriterion("old_custom_guid between", value1, value2, "oldCustomGuid");
            return (Criteria) this;
        }

        public Criteria andOldCustomGuidNotBetween(String value1, String value2) {
            addCriterion("old_custom_guid not between", value1, value2, "oldCustomGuid");
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andContactNoMd5IsNull() {
            addCriterion("contact_no_md5 is null");
            return (Criteria) this;
        }

        public Criteria andContactNoMd5IsNotNull() {
            addCriterion("contact_no_md5 is not null");
            return (Criteria) this;
        }

        public Criteria andContactNoMd5EqualTo(String value) {
            addCriterion("contact_no_md5 =", value, "contactNoMd5");
            return (Criteria) this;
        }

        public Criteria andContactNoMd5NotEqualTo(String value) {
            addCriterion("contact_no_md5 <>", value, "contactNoMd5");
            return (Criteria) this;
        }

        public Criteria andContactNoMd5GreaterThan(String value) {
            addCriterion("contact_no_md5 >", value, "contactNoMd5");
            return (Criteria) this;
        }

        public Criteria andContactNoMd5GreaterThanOrEqualTo(String value) {
            addCriterion("contact_no_md5 >=", value, "contactNoMd5");
            return (Criteria) this;
        }

        public Criteria andContactNoMd5LessThan(String value) {
            addCriterion("contact_no_md5 <", value, "contactNoMd5");
            return (Criteria) this;
        }

        public Criteria andContactNoMd5LessThanOrEqualTo(String value) {
            addCriterion("contact_no_md5 <=", value, "contactNoMd5");
            return (Criteria) this;
        }

        public Criteria andContactNoMd5Like(String value) {
            addCriterion("contact_no_md5 like", value, "contactNoMd5");
            return (Criteria) this;
        }

        public Criteria andContactNoMd5NotLike(String value) {
            addCriterion("contact_no_md5 not like", value, "contactNoMd5");
            return (Criteria) this;
        }

        public Criteria andContactNoMd5In(List<String> values) {
            addCriterion("contact_no_md5 in", values, "contactNoMd5");
            return (Criteria) this;
        }

        public Criteria andContactNoMd5NotIn(List<String> values) {
            addCriterion("contact_no_md5 not in", values, "contactNoMd5");
            return (Criteria) this;
        }

        public Criteria andContactNoMd5Between(String value1, String value2) {
            addCriterion("contact_no_md5 between", value1, value2, "contactNoMd5");
            return (Criteria) this;
        }

        public Criteria andContactNoMd5NotBetween(String value1, String value2) {
            addCriterion("contact_no_md5 not between", value1, value2, "contactNoMd5");
            return (Criteria) this;
        }

        public Criteria andDbaIsNull() {
            addCriterion("dba is null");
            return (Criteria) this;
        }

        public Criteria andDbaIsNotNull() {
            addCriterion("dba is not null");
            return (Criteria) this;
        }

        public Criteria andDbaEqualTo(String value) {
            addCriterion("dba =", value, "dba");
            return (Criteria) this;
        }

        public Criteria andDbaNotEqualTo(String value) {
            addCriterion("dba <>", value, "dba");
            return (Criteria) this;
        }

        public Criteria andDbaGreaterThan(String value) {
            addCriterion("dba >", value, "dba");
            return (Criteria) this;
        }

        public Criteria andDbaGreaterThanOrEqualTo(String value) {
            addCriterion("dba >=", value, "dba");
            return (Criteria) this;
        }

        public Criteria andDbaLessThan(String value) {
            addCriterion("dba <", value, "dba");
            return (Criteria) this;
        }

        public Criteria andDbaLessThanOrEqualTo(String value) {
            addCriterion("dba <=", value, "dba");
            return (Criteria) this;
        }

        public Criteria andDbaLike(String value) {
            addCriterion("dba like", value, "dba");
            return (Criteria) this;
        }

        public Criteria andDbaNotLike(String value) {
            addCriterion("dba not like", value, "dba");
            return (Criteria) this;
        }

        public Criteria andDbaIn(List<String> values) {
            addCriterion("dba in", values, "dba");
            return (Criteria) this;
        }

        public Criteria andDbaNotIn(List<String> values) {
            addCriterion("dba not in", values, "dba");
            return (Criteria) this;
        }

        public Criteria andDbaBetween(String value1, String value2) {
            addCriterion("dba between", value1, value2, "dba");
            return (Criteria) this;
        }

        public Criteria andDbaNotBetween(String value1, String value2) {
            addCriterion("dba not between", value1, value2, "dba");
            return (Criteria) this;
        }

        public Criteria andShowContactsNoIsNull() {
            addCriterion("show_contacts_no is null");
            return (Criteria) this;
        }

        public Criteria andShowContactsNoIsNotNull() {
            addCriterion("show_contacts_no is not null");
            return (Criteria) this;
        }

        public Criteria andShowContactsNoEqualTo(String value) {
            addCriterion("show_contacts_no =", value, "showContactsNo");
            return (Criteria) this;
        }

        public Criteria andShowContactsNoNotEqualTo(String value) {
            addCriterion("show_contacts_no <>", value, "showContactsNo");
            return (Criteria) this;
        }

        public Criteria andShowContactsNoGreaterThan(String value) {
            addCriterion("show_contacts_no >", value, "showContactsNo");
            return (Criteria) this;
        }

        public Criteria andShowContactsNoGreaterThanOrEqualTo(String value) {
            addCriterion("show_contacts_no >=", value, "showContactsNo");
            return (Criteria) this;
        }

        public Criteria andShowContactsNoLessThan(String value) {
            addCriterion("show_contacts_no <", value, "showContactsNo");
            return (Criteria) this;
        }

        public Criteria andShowContactsNoLessThanOrEqualTo(String value) {
            addCriterion("show_contacts_no <=", value, "showContactsNo");
            return (Criteria) this;
        }

        public Criteria andShowContactsNoLike(String value) {
            addCriterion("show_contacts_no like", value, "showContactsNo");
            return (Criteria) this;
        }

        public Criteria andShowContactsNoNotLike(String value) {
            addCriterion("show_contacts_no not like", value, "showContactsNo");
            return (Criteria) this;
        }

        public Criteria andShowContactsNoIn(List<String> values) {
            addCriterion("show_contacts_no in", values, "showContactsNo");
            return (Criteria) this;
        }

        public Criteria andShowContactsNoNotIn(List<String> values) {
            addCriterion("show_contacts_no not in", values, "showContactsNo");
            return (Criteria) this;
        }

        public Criteria andShowContactsNoBetween(String value1, String value2) {
            addCriterion("show_contacts_no between", value1, value2, "showContactsNo");
            return (Criteria) this;
        }

        public Criteria andShowContactsNoNotBetween(String value1, String value2) {
            addCriterion("show_contacts_no not between", value1, value2, "showContactsNo");
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