package com.am.es.entity.clue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomInfoExample() {
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

        public Criteria andTrueNameIsNull() {
            addCriterion("true_name is null");
            return (Criteria) this;
        }

        public Criteria andTrueNameIsNotNull() {
            addCriterion("true_name is not null");
            return (Criteria) this;
        }

        public Criteria andTrueNameEqualTo(String value) {
            addCriterion("true_name =", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotEqualTo(String value) {
            addCriterion("true_name <>", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameGreaterThan(String value) {
            addCriterion("true_name >", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameGreaterThanOrEqualTo(String value) {
            addCriterion("true_name >=", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLessThan(String value) {
            addCriterion("true_name <", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLessThanOrEqualTo(String value) {
            addCriterion("true_name <=", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLike(String value) {
            addCriterion("true_name like", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotLike(String value) {
            addCriterion("true_name not like", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameIn(List<String> values) {
            addCriterion("true_name in", values, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotIn(List<String> values) {
            addCriterion("true_name not in", values, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameBetween(String value1, String value2) {
            addCriterion("true_name between", value1, value2, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotBetween(String value1, String value2) {
            addCriterion("true_name not between", value1, value2, "trueName");
            return (Criteria) this;
        }

        public Criteria andParentNameIsNull() {
            addCriterion("parent_name is null");
            return (Criteria) this;
        }

        public Criteria andParentNameIsNotNull() {
            addCriterion("parent_name is not null");
            return (Criteria) this;
        }

        public Criteria andParentNameEqualTo(String value) {
            addCriterion("parent_name =", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotEqualTo(String value) {
            addCriterion("parent_name <>", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameGreaterThan(String value) {
            addCriterion("parent_name >", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("parent_name >=", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLessThan(String value) {
            addCriterion("parent_name <", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLessThanOrEqualTo(String value) {
            addCriterion("parent_name <=", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLike(String value) {
            addCriterion("parent_name like", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotLike(String value) {
            addCriterion("parent_name not like", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameIn(List<String> values) {
            addCriterion("parent_name in", values, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotIn(List<String> values) {
            addCriterion("parent_name not in", values, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameBetween(String value1, String value2) {
            addCriterion("parent_name between", value1, value2, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotBetween(String value1, String value2) {
            addCriterion("parent_name not between", value1, value2, "parentName");
            return (Criteria) this;
        }

        public Criteria andENameIsNull() {
            addCriterion("e_name is null");
            return (Criteria) this;
        }

        public Criteria andENameIsNotNull() {
            addCriterion("e_name is not null");
            return (Criteria) this;
        }

        public Criteria andENameEqualTo(String value) {
            addCriterion("e_name =", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotEqualTo(String value) {
            addCriterion("e_name <>", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThan(String value) {
            addCriterion("e_name >", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThanOrEqualTo(String value) {
            addCriterion("e_name >=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThan(String value) {
            addCriterion("e_name <", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThanOrEqualTo(String value) {
            addCriterion("e_name <=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLike(String value) {
            addCriterion("e_name like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotLike(String value) {
            addCriterion("e_name not like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameIn(List<String> values) {
            addCriterion("e_name in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotIn(List<String> values) {
            addCriterion("e_name not in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameBetween(String value1, String value2) {
            addCriterion("e_name between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotBetween(String value1, String value2) {
            addCriterion("e_name not between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andMainPhoneIsNull() {
            addCriterion("main_phone is null");
            return (Criteria) this;
        }

        public Criteria andMainPhoneIsNotNull() {
            addCriterion("main_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMainPhoneEqualTo(String value) {
            addCriterion("main_phone =", value, "mainPhone");
            return (Criteria) this;
        }

        public Criteria andMainPhoneNotEqualTo(String value) {
            addCriterion("main_phone <>", value, "mainPhone");
            return (Criteria) this;
        }

        public Criteria andMainPhoneGreaterThan(String value) {
            addCriterion("main_phone >", value, "mainPhone");
            return (Criteria) this;
        }

        public Criteria andMainPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("main_phone >=", value, "mainPhone");
            return (Criteria) this;
        }

        public Criteria andMainPhoneLessThan(String value) {
            addCriterion("main_phone <", value, "mainPhone");
            return (Criteria) this;
        }

        public Criteria andMainPhoneLessThanOrEqualTo(String value) {
            addCriterion("main_phone <=", value, "mainPhone");
            return (Criteria) this;
        }

        public Criteria andMainPhoneLike(String value) {
            addCriterion("main_phone like", value, "mainPhone");
            return (Criteria) this;
        }

        public Criteria andMainPhoneNotLike(String value) {
            addCriterion("main_phone not like", value, "mainPhone");
            return (Criteria) this;
        }

        public Criteria andMainPhoneIn(List<String> values) {
            addCriterion("main_phone in", values, "mainPhone");
            return (Criteria) this;
        }

        public Criteria andMainPhoneNotIn(List<String> values) {
            addCriterion("main_phone not in", values, "mainPhone");
            return (Criteria) this;
        }

        public Criteria andMainPhoneBetween(String value1, String value2) {
            addCriterion("main_phone between", value1, value2, "mainPhone");
            return (Criteria) this;
        }

        public Criteria andMainPhoneNotBetween(String value1, String value2) {
            addCriterion("main_phone not between", value1, value2, "mainPhone");
            return (Criteria) this;
        }

        public Criteria andBornDateIsNull() {
            addCriterion("born_date is null");
            return (Criteria) this;
        }

        public Criteria andBornDateIsNotNull() {
            addCriterion("born_date is not null");
            return (Criteria) this;
        }

        public Criteria andBornDateEqualTo(Date value) {
            addCriterion("born_date =", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateNotEqualTo(Date value) {
            addCriterion("born_date <>", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateGreaterThan(Date value) {
            addCriterion("born_date >", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateGreaterThanOrEqualTo(Date value) {
            addCriterion("born_date >=", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateLessThan(Date value) {
            addCriterion("born_date <", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateLessThanOrEqualTo(Date value) {
            addCriterion("born_date <=", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateIn(List<Date> values) {
            addCriterion("born_date in", values, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateNotIn(List<Date> values) {
            addCriterion("born_date not in", values, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateBetween(Date value1, Date value2) {
            addCriterion("born_date between", value1, value2, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateNotBetween(Date value1, Date value2) {
            addCriterion("born_date not between", value1, value2, "bornDate");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNull() {
            addCriterion("profession is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNotNull() {
            addCriterion("profession is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionEqualTo(String value) {
            addCriterion("profession =", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotEqualTo(String value) {
            addCriterion("profession <>", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThan(String value) {
            addCriterion("profession >", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("profession >=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThan(String value) {
            addCriterion("profession <", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThanOrEqualTo(String value) {
            addCriterion("profession <=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLike(String value) {
            addCriterion("profession like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotLike(String value) {
            addCriterion("profession not like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionIn(List<String> values) {
            addCriterion("profession in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotIn(List<String> values) {
            addCriterion("profession not in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionBetween(String value1, String value2) {
            addCriterion("profession between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotBetween(String value1, String value2) {
            addCriterion("profession not between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andIsAbroadIsNull() {
            addCriterion("is_abroad is null");
            return (Criteria) this;
        }

        public Criteria andIsAbroadIsNotNull() {
            addCriterion("is_abroad is not null");
            return (Criteria) this;
        }

        public Criteria andIsAbroadEqualTo(Integer value) {
            addCriterion("is_abroad =", value, "isAbroad");
            return (Criteria) this;
        }

        public Criteria andIsAbroadNotEqualTo(Integer value) {
            addCriterion("is_abroad <>", value, "isAbroad");
            return (Criteria) this;
        }

        public Criteria andIsAbroadGreaterThan(Integer value) {
            addCriterion("is_abroad >", value, "isAbroad");
            return (Criteria) this;
        }

        public Criteria andIsAbroadGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_abroad >=", value, "isAbroad");
            return (Criteria) this;
        }

        public Criteria andIsAbroadLessThan(Integer value) {
            addCriterion("is_abroad <", value, "isAbroad");
            return (Criteria) this;
        }

        public Criteria andIsAbroadLessThanOrEqualTo(Integer value) {
            addCriterion("is_abroad <=", value, "isAbroad");
            return (Criteria) this;
        }

        public Criteria andIsAbroadIn(List<Integer> values) {
            addCriterion("is_abroad in", values, "isAbroad");
            return (Criteria) this;
        }

        public Criteria andIsAbroadNotIn(List<Integer> values) {
            addCriterion("is_abroad not in", values, "isAbroad");
            return (Criteria) this;
        }

        public Criteria andIsAbroadBetween(Integer value1, Integer value2) {
            addCriterion("is_abroad between", value1, value2, "isAbroad");
            return (Criteria) this;
        }

        public Criteria andIsAbroadNotBetween(Integer value1, Integer value2) {
            addCriterion("is_abroad not between", value1, value2, "isAbroad");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andQualificationIsNull() {
            addCriterion("qualification is null");
            return (Criteria) this;
        }

        public Criteria andQualificationIsNotNull() {
            addCriterion("qualification is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationEqualTo(Integer value) {
            addCriterion("qualification =", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationNotEqualTo(Integer value) {
            addCriterion("qualification <>", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationGreaterThan(Integer value) {
            addCriterion("qualification >", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationGreaterThanOrEqualTo(Integer value) {
            addCriterion("qualification >=", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationLessThan(Integer value) {
            addCriterion("qualification <", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationLessThanOrEqualTo(Integer value) {
            addCriterion("qualification <=", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationIn(List<Integer> values) {
            addCriterion("qualification in", values, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationNotIn(List<Integer> values) {
            addCriterion("qualification not in", values, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationBetween(Integer value1, Integer value2) {
            addCriterion("qualification between", value1, value2, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationNotBetween(Integer value1, Integer value2) {
            addCriterion("qualification not between", value1, value2, "qualification");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearIsNull() {
            addCriterion("enrollment_year is null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearIsNotNull() {
            addCriterion("enrollment_year is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearEqualTo(Date value) {
            addCriterion("enrollment_year =", value, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearNotEqualTo(Date value) {
            addCriterion("enrollment_year <>", value, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearGreaterThan(Date value) {
            addCriterion("enrollment_year >", value, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearGreaterThanOrEqualTo(Date value) {
            addCriterion("enrollment_year >=", value, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearLessThan(Date value) {
            addCriterion("enrollment_year <", value, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearLessThanOrEqualTo(Date value) {
            addCriterion("enrollment_year <=", value, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearIn(List<Date> values) {
            addCriterion("enrollment_year in", values, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearNotIn(List<Date> values) {
            addCriterion("enrollment_year not in", values, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearBetween(Date value1, Date value2) {
            addCriterion("enrollment_year between", value1, value2, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andEnrollmentYearNotBetween(Date value1, Date value2) {
            addCriterion("enrollment_year not between", value1, value2, "enrollmentYear");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIsNull() {
            addCriterion("graduation_time is null");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIsNotNull() {
            addCriterion("graduation_time is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeEqualTo(Date value) {
            addCriterion("graduation_time =", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotEqualTo(Date value) {
            addCriterion("graduation_time <>", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeGreaterThan(Date value) {
            addCriterion("graduation_time >", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("graduation_time >=", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeLessThan(Date value) {
            addCriterion("graduation_time <", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeLessThanOrEqualTo(Date value) {
            addCriterion("graduation_time <=", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIn(List<Date> values) {
            addCriterion("graduation_time in", values, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotIn(List<Date> values) {
            addCriterion("graduation_time not in", values, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeBetween(Date value1, Date value2) {
            addCriterion("graduation_time between", value1, value2, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotBetween(Date value1, Date value2) {
            addCriterion("graduation_time not between", value1, value2, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andUCenterUidIsNull() {
            addCriterion("u_center_uid is null");
            return (Criteria) this;
        }

        public Criteria andUCenterUidIsNotNull() {
            addCriterion("u_center_uid is not null");
            return (Criteria) this;
        }

        public Criteria andUCenterUidEqualTo(Integer value) {
            addCriterion("u_center_uid =", value, "uCenterUid");
            return (Criteria) this;
        }

        public Criteria andUCenterUidNotEqualTo(Integer value) {
            addCriterion("u_center_uid <>", value, "uCenterUid");
            return (Criteria) this;
        }

        public Criteria andUCenterUidGreaterThan(Integer value) {
            addCriterion("u_center_uid >", value, "uCenterUid");
            return (Criteria) this;
        }

        public Criteria andUCenterUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_center_uid >=", value, "uCenterUid");
            return (Criteria) this;
        }

        public Criteria andUCenterUidLessThan(Integer value) {
            addCriterion("u_center_uid <", value, "uCenterUid");
            return (Criteria) this;
        }

        public Criteria andUCenterUidLessThanOrEqualTo(Integer value) {
            addCriterion("u_center_uid <=", value, "uCenterUid");
            return (Criteria) this;
        }

        public Criteria andUCenterUidIn(List<Integer> values) {
            addCriterion("u_center_uid in", values, "uCenterUid");
            return (Criteria) this;
        }

        public Criteria andUCenterUidNotIn(List<Integer> values) {
            addCriterion("u_center_uid not in", values, "uCenterUid");
            return (Criteria) this;
        }

        public Criteria andUCenterUidBetween(Integer value1, Integer value2) {
            addCriterion("u_center_uid between", value1, value2, "uCenterUid");
            return (Criteria) this;
        }

        public Criteria andUCenterUidNotBetween(Integer value1, Integer value2) {
            addCriterion("u_center_uid not between", value1, value2, "uCenterUid");
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

        public Criteria andCustomPicIsNull() {
            addCriterion("custom_pic is null");
            return (Criteria) this;
        }

        public Criteria andCustomPicIsNotNull() {
            addCriterion("custom_pic is not null");
            return (Criteria) this;
        }

        public Criteria andCustomPicEqualTo(String value) {
            addCriterion("custom_pic =", value, "customPic");
            return (Criteria) this;
        }

        public Criteria andCustomPicNotEqualTo(String value) {
            addCriterion("custom_pic <>", value, "customPic");
            return (Criteria) this;
        }

        public Criteria andCustomPicGreaterThan(String value) {
            addCriterion("custom_pic >", value, "customPic");
            return (Criteria) this;
        }

        public Criteria andCustomPicGreaterThanOrEqualTo(String value) {
            addCriterion("custom_pic >=", value, "customPic");
            return (Criteria) this;
        }

        public Criteria andCustomPicLessThan(String value) {
            addCriterion("custom_pic <", value, "customPic");
            return (Criteria) this;
        }

        public Criteria andCustomPicLessThanOrEqualTo(String value) {
            addCriterion("custom_pic <=", value, "customPic");
            return (Criteria) this;
        }

        public Criteria andCustomPicLike(String value) {
            addCriterion("custom_pic like", value, "customPic");
            return (Criteria) this;
        }

        public Criteria andCustomPicNotLike(String value) {
            addCriterion("custom_pic not like", value, "customPic");
            return (Criteria) this;
        }

        public Criteria andCustomPicIn(List<String> values) {
            addCriterion("custom_pic in", values, "customPic");
            return (Criteria) this;
        }

        public Criteria andCustomPicNotIn(List<String> values) {
            addCriterion("custom_pic not in", values, "customPic");
            return (Criteria) this;
        }

        public Criteria andCustomPicBetween(String value1, String value2) {
            addCriterion("custom_pic between", value1, value2, "customPic");
            return (Criteria) this;
        }

        public Criteria andCustomPicNotBetween(String value1, String value2) {
            addCriterion("custom_pic not between", value1, value2, "customPic");
            return (Criteria) this;
        }

        public Criteria andWxNickIsNull() {
            addCriterion("wx_nick is null");
            return (Criteria) this;
        }

        public Criteria andWxNickIsNotNull() {
            addCriterion("wx_nick is not null");
            return (Criteria) this;
        }

        public Criteria andWxNickEqualTo(String value) {
            addCriterion("wx_nick =", value, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickNotEqualTo(String value) {
            addCriterion("wx_nick <>", value, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickGreaterThan(String value) {
            addCriterion("wx_nick >", value, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickGreaterThanOrEqualTo(String value) {
            addCriterion("wx_nick >=", value, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickLessThan(String value) {
            addCriterion("wx_nick <", value, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickLessThanOrEqualTo(String value) {
            addCriterion("wx_nick <=", value, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickLike(String value) {
            addCriterion("wx_nick like", value, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickNotLike(String value) {
            addCriterion("wx_nick not like", value, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickIn(List<String> values) {
            addCriterion("wx_nick in", values, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickNotIn(List<String> values) {
            addCriterion("wx_nick not in", values, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickBetween(String value1, String value2) {
            addCriterion("wx_nick between", value1, value2, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxNickNotBetween(String value1, String value2) {
            addCriterion("wx_nick not between", value1, value2, "wxNick");
            return (Criteria) this;
        }

        public Criteria andWxImgIsNull() {
            addCriterion("wx_img is null");
            return (Criteria) this;
        }

        public Criteria andWxImgIsNotNull() {
            addCriterion("wx_img is not null");
            return (Criteria) this;
        }

        public Criteria andWxImgEqualTo(String value) {
            addCriterion("wx_img =", value, "wxImg");
            return (Criteria) this;
        }

        public Criteria andWxImgNotEqualTo(String value) {
            addCriterion("wx_img <>", value, "wxImg");
            return (Criteria) this;
        }

        public Criteria andWxImgGreaterThan(String value) {
            addCriterion("wx_img >", value, "wxImg");
            return (Criteria) this;
        }

        public Criteria andWxImgGreaterThanOrEqualTo(String value) {
            addCriterion("wx_img >=", value, "wxImg");
            return (Criteria) this;
        }

        public Criteria andWxImgLessThan(String value) {
            addCriterion("wx_img <", value, "wxImg");
            return (Criteria) this;
        }

        public Criteria andWxImgLessThanOrEqualTo(String value) {
            addCriterion("wx_img <=", value, "wxImg");
            return (Criteria) this;
        }

        public Criteria andWxImgLike(String value) {
            addCriterion("wx_img like", value, "wxImg");
            return (Criteria) this;
        }

        public Criteria andWxImgNotLike(String value) {
            addCriterion("wx_img not like", value, "wxImg");
            return (Criteria) this;
        }

        public Criteria andWxImgIn(List<String> values) {
            addCriterion("wx_img in", values, "wxImg");
            return (Criteria) this;
        }

        public Criteria andWxImgNotIn(List<String> values) {
            addCriterion("wx_img not in", values, "wxImg");
            return (Criteria) this;
        }

        public Criteria andWxImgBetween(String value1, String value2) {
            addCriterion("wx_img between", value1, value2, "wxImg");
            return (Criteria) this;
        }

        public Criteria andWxImgNotBetween(String value1, String value2) {
            addCriterion("wx_img not between", value1, value2, "wxImg");
            return (Criteria) this;
        }

        public Criteria andWxIdIsNull() {
            addCriterion("wx_id is null");
            return (Criteria) this;
        }

        public Criteria andWxIdIsNotNull() {
            addCriterion("wx_id is not null");
            return (Criteria) this;
        }

        public Criteria andWxIdEqualTo(String value) {
            addCriterion("wx_id =", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdNotEqualTo(String value) {
            addCriterion("wx_id <>", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdGreaterThan(String value) {
            addCriterion("wx_id >", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdGreaterThanOrEqualTo(String value) {
            addCriterion("wx_id >=", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdLessThan(String value) {
            addCriterion("wx_id <", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdLessThanOrEqualTo(String value) {
            addCriterion("wx_id <=", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdLike(String value) {
            addCriterion("wx_id like", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdNotLike(String value) {
            addCriterion("wx_id not like", value, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdIn(List<String> values) {
            addCriterion("wx_id in", values, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdNotIn(List<String> values) {
            addCriterion("wx_id not in", values, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdBetween(String value1, String value2) {
            addCriterion("wx_id between", value1, value2, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxIdNotBetween(String value1, String value2) {
            addCriterion("wx_id not between", value1, value2, "wxId");
            return (Criteria) this;
        }

        public Criteria andWxUserNameIsNull() {
            addCriterion("wx_user_name is null");
            return (Criteria) this;
        }

        public Criteria andWxUserNameIsNotNull() {
            addCriterion("wx_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andWxUserNameEqualTo(String value) {
            addCriterion("wx_user_name =", value, "wxUserName");
            return (Criteria) this;
        }

        public Criteria andWxUserNameNotEqualTo(String value) {
            addCriterion("wx_user_name <>", value, "wxUserName");
            return (Criteria) this;
        }

        public Criteria andWxUserNameGreaterThan(String value) {
            addCriterion("wx_user_name >", value, "wxUserName");
            return (Criteria) this;
        }

        public Criteria andWxUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("wx_user_name >=", value, "wxUserName");
            return (Criteria) this;
        }

        public Criteria andWxUserNameLessThan(String value) {
            addCriterion("wx_user_name <", value, "wxUserName");
            return (Criteria) this;
        }

        public Criteria andWxUserNameLessThanOrEqualTo(String value) {
            addCriterion("wx_user_name <=", value, "wxUserName");
            return (Criteria) this;
        }

        public Criteria andWxUserNameLike(String value) {
            addCriterion("wx_user_name like", value, "wxUserName");
            return (Criteria) this;
        }

        public Criteria andWxUserNameNotLike(String value) {
            addCriterion("wx_user_name not like", value, "wxUserName");
            return (Criteria) this;
        }

        public Criteria andWxUserNameIn(List<String> values) {
            addCriterion("wx_user_name in", values, "wxUserName");
            return (Criteria) this;
        }

        public Criteria andWxUserNameNotIn(List<String> values) {
            addCriterion("wx_user_name not in", values, "wxUserName");
            return (Criteria) this;
        }

        public Criteria andWxUserNameBetween(String value1, String value2) {
            addCriterion("wx_user_name between", value1, value2, "wxUserName");
            return (Criteria) this;
        }

        public Criteria andWxUserNameNotBetween(String value1, String value2) {
            addCriterion("wx_user_name not between", value1, value2, "wxUserName");
            return (Criteria) this;
        }

        public Criteria andWxUnionIdIsNull() {
            addCriterion("wx_union_id is null");
            return (Criteria) this;
        }

        public Criteria andWxUnionIdIsNotNull() {
            addCriterion("wx_union_id is not null");
            return (Criteria) this;
        }

        public Criteria andWxUnionIdEqualTo(String value) {
            addCriterion("wx_union_id =", value, "wxUnionId");
            return (Criteria) this;
        }

        public Criteria andWxUnionIdNotEqualTo(String value) {
            addCriterion("wx_union_id <>", value, "wxUnionId");
            return (Criteria) this;
        }

        public Criteria andWxUnionIdGreaterThan(String value) {
            addCriterion("wx_union_id >", value, "wxUnionId");
            return (Criteria) this;
        }

        public Criteria andWxUnionIdGreaterThanOrEqualTo(String value) {
            addCriterion("wx_union_id >=", value, "wxUnionId");
            return (Criteria) this;
        }

        public Criteria andWxUnionIdLessThan(String value) {
            addCriterion("wx_union_id <", value, "wxUnionId");
            return (Criteria) this;
        }

        public Criteria andWxUnionIdLessThanOrEqualTo(String value) {
            addCriterion("wx_union_id <=", value, "wxUnionId");
            return (Criteria) this;
        }

        public Criteria andWxUnionIdLike(String value) {
            addCriterion("wx_union_id like", value, "wxUnionId");
            return (Criteria) this;
        }

        public Criteria andWxUnionIdNotLike(String value) {
            addCriterion("wx_union_id not like", value, "wxUnionId");
            return (Criteria) this;
        }

        public Criteria andWxUnionIdIn(List<String> values) {
            addCriterion("wx_union_id in", values, "wxUnionId");
            return (Criteria) this;
        }

        public Criteria andWxUnionIdNotIn(List<String> values) {
            addCriterion("wx_union_id not in", values, "wxUnionId");
            return (Criteria) this;
        }

        public Criteria andWxUnionIdBetween(String value1, String value2) {
            addCriterion("wx_union_id between", value1, value2, "wxUnionId");
            return (Criteria) this;
        }

        public Criteria andWxUnionIdNotBetween(String value1, String value2) {
            addCriterion("wx_union_id not between", value1, value2, "wxUnionId");
            return (Criteria) this;
        }

        public Criteria andUrgentNameIsNull() {
            addCriterion("urgent_name is null");
            return (Criteria) this;
        }

        public Criteria andUrgentNameIsNotNull() {
            addCriterion("urgent_name is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentNameEqualTo(String value) {
            addCriterion("urgent_name =", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameNotEqualTo(String value) {
            addCriterion("urgent_name <>", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameGreaterThan(String value) {
            addCriterion("urgent_name >", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("urgent_name >=", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameLessThan(String value) {
            addCriterion("urgent_name <", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameLessThanOrEqualTo(String value) {
            addCriterion("urgent_name <=", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameLike(String value) {
            addCriterion("urgent_name like", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameNotLike(String value) {
            addCriterion("urgent_name not like", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameIn(List<String> values) {
            addCriterion("urgent_name in", values, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameNotIn(List<String> values) {
            addCriterion("urgent_name not in", values, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameBetween(String value1, String value2) {
            addCriterion("urgent_name between", value1, value2, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameNotBetween(String value1, String value2) {
            addCriterion("urgent_name not between", value1, value2, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneIsNull() {
            addCriterion("urgent_phone is null");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneIsNotNull() {
            addCriterion("urgent_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneEqualTo(String value) {
            addCriterion("urgent_phone =", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneNotEqualTo(String value) {
            addCriterion("urgent_phone <>", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneGreaterThan(String value) {
            addCriterion("urgent_phone >", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("urgent_phone >=", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneLessThan(String value) {
            addCriterion("urgent_phone <", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneLessThanOrEqualTo(String value) {
            addCriterion("urgent_phone <=", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneLike(String value) {
            addCriterion("urgent_phone like", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneNotLike(String value) {
            addCriterion("urgent_phone not like", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneIn(List<String> values) {
            addCriterion("urgent_phone in", values, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneNotIn(List<String> values) {
            addCriterion("urgent_phone not in", values, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneBetween(String value1, String value2) {
            addCriterion("urgent_phone between", value1, value2, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneNotBetween(String value1, String value2) {
            addCriterion("urgent_phone not between", value1, value2, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andHasDealIsNull() {
            addCriterion("has_deal is null");
            return (Criteria) this;
        }

        public Criteria andHasDealIsNotNull() {
            addCriterion("has_deal is not null");
            return (Criteria) this;
        }

        public Criteria andHasDealEqualTo(Integer value) {
            addCriterion("has_deal =", value, "hasDeal");
            return (Criteria) this;
        }

        public Criteria andHasDealNotEqualTo(Integer value) {
            addCriterion("has_deal <>", value, "hasDeal");
            return (Criteria) this;
        }

        public Criteria andHasDealGreaterThan(Integer value) {
            addCriterion("has_deal >", value, "hasDeal");
            return (Criteria) this;
        }

        public Criteria andHasDealGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_deal >=", value, "hasDeal");
            return (Criteria) this;
        }

        public Criteria andHasDealLessThan(Integer value) {
            addCriterion("has_deal <", value, "hasDeal");
            return (Criteria) this;
        }

        public Criteria andHasDealLessThanOrEqualTo(Integer value) {
            addCriterion("has_deal <=", value, "hasDeal");
            return (Criteria) this;
        }

        public Criteria andHasDealIn(List<Integer> values) {
            addCriterion("has_deal in", values, "hasDeal");
            return (Criteria) this;
        }

        public Criteria andHasDealNotIn(List<Integer> values) {
            addCriterion("has_deal not in", values, "hasDeal");
            return (Criteria) this;
        }

        public Criteria andHasDealBetween(Integer value1, Integer value2) {
            addCriterion("has_deal between", value1, value2, "hasDeal");
            return (Criteria) this;
        }

        public Criteria andHasDealNotBetween(Integer value1, Integer value2) {
            addCriterion("has_deal not between", value1, value2, "hasDeal");
            return (Criteria) this;
        }

        public Criteria andShowMainPhoneIsNull() {
            addCriterion("show_main_phone is null");
            return (Criteria) this;
        }

        public Criteria andShowMainPhoneIsNotNull() {
            addCriterion("show_main_phone is not null");
            return (Criteria) this;
        }

        public Criteria andShowMainPhoneEqualTo(String value) {
            addCriterion("show_main_phone =", value, "showMainPhone");
            return (Criteria) this;
        }

        public Criteria andShowMainPhoneNotEqualTo(String value) {
            addCriterion("show_main_phone <>", value, "showMainPhone");
            return (Criteria) this;
        }

        public Criteria andShowMainPhoneGreaterThan(String value) {
            addCriterion("show_main_phone >", value, "showMainPhone");
            return (Criteria) this;
        }

        public Criteria andShowMainPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("show_main_phone >=", value, "showMainPhone");
            return (Criteria) this;
        }

        public Criteria andShowMainPhoneLessThan(String value) {
            addCriterion("show_main_phone <", value, "showMainPhone");
            return (Criteria) this;
        }

        public Criteria andShowMainPhoneLessThanOrEqualTo(String value) {
            addCriterion("show_main_phone <=", value, "showMainPhone");
            return (Criteria) this;
        }

        public Criteria andShowMainPhoneLike(String value) {
            addCriterion("show_main_phone like", value, "showMainPhone");
            return (Criteria) this;
        }

        public Criteria andShowMainPhoneNotLike(String value) {
            addCriterion("show_main_phone not like", value, "showMainPhone");
            return (Criteria) this;
        }

        public Criteria andShowMainPhoneIn(List<String> values) {
            addCriterion("show_main_phone in", values, "showMainPhone");
            return (Criteria) this;
        }

        public Criteria andShowMainPhoneNotIn(List<String> values) {
            addCriterion("show_main_phone not in", values, "showMainPhone");
            return (Criteria) this;
        }

        public Criteria andShowMainPhoneBetween(String value1, String value2) {
            addCriterion("show_main_phone between", value1, value2, "showMainPhone");
            return (Criteria) this;
        }

        public Criteria andShowMainPhoneNotBetween(String value1, String value2) {
            addCriterion("show_main_phone not between", value1, value2, "showMainPhone");
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