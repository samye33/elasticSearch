package com.am.es.orderentity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoExample() {
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
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

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(BigDecimal value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(BigDecimal value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(BigDecimal value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<BigDecimal> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("discount_amount =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("discount_amount <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("discount_amount >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(BigDecimal value) {
            addCriterion("discount_amount <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("discount_amount in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("discount_amount not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountIsNull() {
            addCriterion("paid_amount is null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountIsNotNull() {
            addCriterion("paid_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountEqualTo(BigDecimal value) {
            addCriterion("paid_amount =", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotEqualTo(BigDecimal value) {
            addCriterion("paid_amount <>", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountGreaterThan(BigDecimal value) {
            addCriterion("paid_amount >", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_amount >=", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountLessThan(BigDecimal value) {
            addCriterion("paid_amount <", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_amount <=", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountIn(List<BigDecimal> values) {
            addCriterion("paid_amount in", values, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotIn(List<BigDecimal> values) {
            addCriterion("paid_amount not in", values, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_amount between", value1, value2, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_amount not between", value1, value2, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(Integer value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(Integer value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(Integer value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(Integer value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(Integer value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<Integer> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<Integer> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(Integer value1, Integer value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(Integer value1, Integer value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeIsNull() {
            addCriterion("first_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeIsNotNull() {
            addCriterion("first_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeEqualTo(Date value) {
            addCriterion("first_pay_time =", value, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeNotEqualTo(Date value) {
            addCriterion("first_pay_time <>", value, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeGreaterThan(Date value) {
            addCriterion("first_pay_time >", value, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("first_pay_time >=", value, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeLessThan(Date value) {
            addCriterion("first_pay_time <", value, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("first_pay_time <=", value, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeIn(List<Date> values) {
            addCriterion("first_pay_time in", values, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeNotIn(List<Date> values) {
            addCriterion("first_pay_time not in", values, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeBetween(Date value1, Date value2) {
            addCriterion("first_pay_time between", value1, value2, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("first_pay_time not between", value1, value2, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andCompletionPayTimeIsNull() {
            addCriterion("completion_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andCompletionPayTimeIsNotNull() {
            addCriterion("completion_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompletionPayTimeEqualTo(Date value) {
            addCriterion("completion_pay_time =", value, "completionPayTime");
            return (Criteria) this;
        }

        public Criteria andCompletionPayTimeNotEqualTo(Date value) {
            addCriterion("completion_pay_time <>", value, "completionPayTime");
            return (Criteria) this;
        }

        public Criteria andCompletionPayTimeGreaterThan(Date value) {
            addCriterion("completion_pay_time >", value, "completionPayTime");
            return (Criteria) this;
        }

        public Criteria andCompletionPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("completion_pay_time >=", value, "completionPayTime");
            return (Criteria) this;
        }

        public Criteria andCompletionPayTimeLessThan(Date value) {
            addCriterion("completion_pay_time <", value, "completionPayTime");
            return (Criteria) this;
        }

        public Criteria andCompletionPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("completion_pay_time <=", value, "completionPayTime");
            return (Criteria) this;
        }

        public Criteria andCompletionPayTimeIn(List<Date> values) {
            addCriterion("completion_pay_time in", values, "completionPayTime");
            return (Criteria) this;
        }

        public Criteria andCompletionPayTimeNotIn(List<Date> values) {
            addCriterion("completion_pay_time not in", values, "completionPayTime");
            return (Criteria) this;
        }

        public Criteria andCompletionPayTimeBetween(Date value1, Date value2) {
            addCriterion("completion_pay_time between", value1, value2, "completionPayTime");
            return (Criteria) this;
        }

        public Criteria andCompletionPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("completion_pay_time not between", value1, value2, "completionPayTime");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositAmountIsNull() {
            addCriterion("customize_deposit_amount is null");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositAmountIsNotNull() {
            addCriterion("customize_deposit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositAmountEqualTo(BigDecimal value) {
            addCriterion("customize_deposit_amount =", value, "customizeDepositAmount");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositAmountNotEqualTo(BigDecimal value) {
            addCriterion("customize_deposit_amount <>", value, "customizeDepositAmount");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositAmountGreaterThan(BigDecimal value) {
            addCriterion("customize_deposit_amount >", value, "customizeDepositAmount");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("customize_deposit_amount >=", value, "customizeDepositAmount");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositAmountLessThan(BigDecimal value) {
            addCriterion("customize_deposit_amount <", value, "customizeDepositAmount");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("customize_deposit_amount <=", value, "customizeDepositAmount");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositAmountIn(List<BigDecimal> values) {
            addCriterion("customize_deposit_amount in", values, "customizeDepositAmount");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositAmountNotIn(List<BigDecimal> values) {
            addCriterion("customize_deposit_amount not in", values, "customizeDepositAmount");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("customize_deposit_amount between", value1, value2, "customizeDepositAmount");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("customize_deposit_amount not between", value1, value2, "customizeDepositAmount");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositUserIdIsNull() {
            addCriterion("customize_deposit_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositUserIdIsNotNull() {
            addCriterion("customize_deposit_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositUserIdEqualTo(Integer value) {
            addCriterion("customize_deposit_user_id =", value, "customizeDepositUserId");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositUserIdNotEqualTo(Integer value) {
            addCriterion("customize_deposit_user_id <>", value, "customizeDepositUserId");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositUserIdGreaterThan(Integer value) {
            addCriterion("customize_deposit_user_id >", value, "customizeDepositUserId");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customize_deposit_user_id >=", value, "customizeDepositUserId");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositUserIdLessThan(Integer value) {
            addCriterion("customize_deposit_user_id <", value, "customizeDepositUserId");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("customize_deposit_user_id <=", value, "customizeDepositUserId");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositUserIdIn(List<Integer> values) {
            addCriterion("customize_deposit_user_id in", values, "customizeDepositUserId");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositUserIdNotIn(List<Integer> values) {
            addCriterion("customize_deposit_user_id not in", values, "customizeDepositUserId");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositUserIdBetween(Integer value1, Integer value2) {
            addCriterion("customize_deposit_user_id between", value1, value2, "customizeDepositUserId");
            return (Criteria) this;
        }

        public Criteria andCustomizeDepositUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customize_deposit_user_id not between", value1, value2, "customizeDepositUserId");
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

        public Criteria andDepositAmountIsNull() {
            addCriterion("deposit_amount is null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNotNull() {
            addCriterion("deposit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountEqualTo(Integer value) {
            addCriterion("deposit_amount =", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotEqualTo(Integer value) {
            addCriterion("deposit_amount <>", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThan(Integer value) {
            addCriterion("deposit_amount >", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit_amount >=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThan(Integer value) {
            addCriterion("deposit_amount <", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThanOrEqualTo(Integer value) {
            addCriterion("deposit_amount <=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIn(List<Integer> values) {
            addCriterion("deposit_amount in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotIn(List<Integer> values) {
            addCriterion("deposit_amount not in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountBetween(Integer value1, Integer value2) {
            addCriterion("deposit_amount between", value1, value2, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit_amount not between", value1, value2, "depositAmount");
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

        public Criteria andIsNeedAuditIsNull() {
            addCriterion("is_need_audit is null");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuditIsNotNull() {
            addCriterion("is_need_audit is not null");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuditEqualTo(Integer value) {
            addCriterion("is_need_audit =", value, "isNeedAudit");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuditNotEqualTo(Integer value) {
            addCriterion("is_need_audit <>", value, "isNeedAudit");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuditGreaterThan(Integer value) {
            addCriterion("is_need_audit >", value, "isNeedAudit");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuditGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_need_audit >=", value, "isNeedAudit");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuditLessThan(Integer value) {
            addCriterion("is_need_audit <", value, "isNeedAudit");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuditLessThanOrEqualTo(Integer value) {
            addCriterion("is_need_audit <=", value, "isNeedAudit");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuditIn(List<Integer> values) {
            addCriterion("is_need_audit in", values, "isNeedAudit");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuditNotIn(List<Integer> values) {
            addCriterion("is_need_audit not in", values, "isNeedAudit");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuditBetween(Integer value1, Integer value2) {
            addCriterion("is_need_audit between", value1, value2, "isNeedAudit");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuditNotBetween(Integer value1, Integer value2) {
            addCriterion("is_need_audit not between", value1, value2, "isNeedAudit");
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

        public Criteria andChannelCodeSubIsNull() {
            addCriterion("channel_code_sub is null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubIsNotNull() {
            addCriterion("channel_code_sub is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubEqualTo(String value) {
            addCriterion("channel_code_sub =", value, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubNotEqualTo(String value) {
            addCriterion("channel_code_sub <>", value, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubGreaterThan(String value) {
            addCriterion("channel_code_sub >", value, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubGreaterThanOrEqualTo(String value) {
            addCriterion("channel_code_sub >=", value, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubLessThan(String value) {
            addCriterion("channel_code_sub <", value, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubLessThanOrEqualTo(String value) {
            addCriterion("channel_code_sub <=", value, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubLike(String value) {
            addCriterion("channel_code_sub like", value, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubNotLike(String value) {
            addCriterion("channel_code_sub not like", value, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubIn(List<String> values) {
            addCriterion("channel_code_sub in", values, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubNotIn(List<String> values) {
            addCriterion("channel_code_sub not in", values, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubBetween(String value1, String value2) {
            addCriterion("channel_code_sub between", value1, value2, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andChannelCodeSubNotBetween(String value1, String value2) {
            addCriterion("channel_code_sub not between", value1, value2, "channelCodeSub");
            return (Criteria) this;
        }

        public Criteria andSignUpSchoolIdIsNull() {
            addCriterion("sign_up_school_id is null");
            return (Criteria) this;
        }

        public Criteria andSignUpSchoolIdIsNotNull() {
            addCriterion("sign_up_school_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignUpSchoolIdEqualTo(Integer value) {
            addCriterion("sign_up_school_id =", value, "signUpSchoolId");
            return (Criteria) this;
        }

        public Criteria andSignUpSchoolIdNotEqualTo(Integer value) {
            addCriterion("sign_up_school_id <>", value, "signUpSchoolId");
            return (Criteria) this;
        }

        public Criteria andSignUpSchoolIdGreaterThan(Integer value) {
            addCriterion("sign_up_school_id >", value, "signUpSchoolId");
            return (Criteria) this;
        }

        public Criteria andSignUpSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_up_school_id >=", value, "signUpSchoolId");
            return (Criteria) this;
        }

        public Criteria andSignUpSchoolIdLessThan(Integer value) {
            addCriterion("sign_up_school_id <", value, "signUpSchoolId");
            return (Criteria) this;
        }

        public Criteria andSignUpSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("sign_up_school_id <=", value, "signUpSchoolId");
            return (Criteria) this;
        }

        public Criteria andSignUpSchoolIdIn(List<Integer> values) {
            addCriterion("sign_up_school_id in", values, "signUpSchoolId");
            return (Criteria) this;
        }

        public Criteria andSignUpSchoolIdNotIn(List<Integer> values) {
            addCriterion("sign_up_school_id not in", values, "signUpSchoolId");
            return (Criteria) this;
        }

        public Criteria andSignUpSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("sign_up_school_id between", value1, value2, "signUpSchoolId");
            return (Criteria) this;
        }

        public Criteria andSignUpSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_up_school_id not between", value1, value2, "signUpSchoolId");
            return (Criteria) this;
        }

        public Criteria andAttendSchoolIdIsNull() {
            addCriterion("attend_school_id is null");
            return (Criteria) this;
        }

        public Criteria andAttendSchoolIdIsNotNull() {
            addCriterion("attend_school_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttendSchoolIdEqualTo(Integer value) {
            addCriterion("attend_school_id =", value, "attendSchoolId");
            return (Criteria) this;
        }

        public Criteria andAttendSchoolIdNotEqualTo(Integer value) {
            addCriterion("attend_school_id <>", value, "attendSchoolId");
            return (Criteria) this;
        }

        public Criteria andAttendSchoolIdGreaterThan(Integer value) {
            addCriterion("attend_school_id >", value, "attendSchoolId");
            return (Criteria) this;
        }

        public Criteria andAttendSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attend_school_id >=", value, "attendSchoolId");
            return (Criteria) this;
        }

        public Criteria andAttendSchoolIdLessThan(Integer value) {
            addCriterion("attend_school_id <", value, "attendSchoolId");
            return (Criteria) this;
        }

        public Criteria andAttendSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("attend_school_id <=", value, "attendSchoolId");
            return (Criteria) this;
        }

        public Criteria andAttendSchoolIdIn(List<Integer> values) {
            addCriterion("attend_school_id in", values, "attendSchoolId");
            return (Criteria) this;
        }

        public Criteria andAttendSchoolIdNotIn(List<Integer> values) {
            addCriterion("attend_school_id not in", values, "attendSchoolId");
            return (Criteria) this;
        }

        public Criteria andAttendSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("attend_school_id between", value1, value2, "attendSchoolId");
            return (Criteria) this;
        }

        public Criteria andAttendSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attend_school_id not between", value1, value2, "attendSchoolId");
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

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
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

        public Criteria andAgreementRemarkIsNull() {
            addCriterion("agreement_remark is null");
            return (Criteria) this;
        }

        public Criteria andAgreementRemarkIsNotNull() {
            addCriterion("agreement_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementRemarkEqualTo(String value) {
            addCriterion("agreement_remark =", value, "agreementRemark");
            return (Criteria) this;
        }

        public Criteria andAgreementRemarkNotEqualTo(String value) {
            addCriterion("agreement_remark <>", value, "agreementRemark");
            return (Criteria) this;
        }

        public Criteria andAgreementRemarkGreaterThan(String value) {
            addCriterion("agreement_remark >", value, "agreementRemark");
            return (Criteria) this;
        }

        public Criteria andAgreementRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("agreement_remark >=", value, "agreementRemark");
            return (Criteria) this;
        }

        public Criteria andAgreementRemarkLessThan(String value) {
            addCriterion("agreement_remark <", value, "agreementRemark");
            return (Criteria) this;
        }

        public Criteria andAgreementRemarkLessThanOrEqualTo(String value) {
            addCriterion("agreement_remark <=", value, "agreementRemark");
            return (Criteria) this;
        }

        public Criteria andAgreementRemarkLike(String value) {
            addCriterion("agreement_remark like", value, "agreementRemark");
            return (Criteria) this;
        }

        public Criteria andAgreementRemarkNotLike(String value) {
            addCriterion("agreement_remark not like", value, "agreementRemark");
            return (Criteria) this;
        }

        public Criteria andAgreementRemarkIn(List<String> values) {
            addCriterion("agreement_remark in", values, "agreementRemark");
            return (Criteria) this;
        }

        public Criteria andAgreementRemarkNotIn(List<String> values) {
            addCriterion("agreement_remark not in", values, "agreementRemark");
            return (Criteria) this;
        }

        public Criteria andAgreementRemarkBetween(String value1, String value2) {
            addCriterion("agreement_remark between", value1, value2, "agreementRemark");
            return (Criteria) this;
        }

        public Criteria andAgreementRemarkNotBetween(String value1, String value2) {
            addCriterion("agreement_remark not between", value1, value2, "agreementRemark");
            return (Criteria) this;
        }

        public Criteria andIsPushEdsIsNull() {
            addCriterion("is_push_eds is null");
            return (Criteria) this;
        }

        public Criteria andIsPushEdsIsNotNull() {
            addCriterion("is_push_eds is not null");
            return (Criteria) this;
        }

        public Criteria andIsPushEdsEqualTo(Integer value) {
            addCriterion("is_push_eds =", value, "isPushEds");
            return (Criteria) this;
        }

        public Criteria andIsPushEdsNotEqualTo(Integer value) {
            addCriterion("is_push_eds <>", value, "isPushEds");
            return (Criteria) this;
        }

        public Criteria andIsPushEdsGreaterThan(Integer value) {
            addCriterion("is_push_eds >", value, "isPushEds");
            return (Criteria) this;
        }

        public Criteria andIsPushEdsGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_push_eds >=", value, "isPushEds");
            return (Criteria) this;
        }

        public Criteria andIsPushEdsLessThan(Integer value) {
            addCriterion("is_push_eds <", value, "isPushEds");
            return (Criteria) this;
        }

        public Criteria andIsPushEdsLessThanOrEqualTo(Integer value) {
            addCriterion("is_push_eds <=", value, "isPushEds");
            return (Criteria) this;
        }

        public Criteria andIsPushEdsIn(List<Integer> values) {
            addCriterion("is_push_eds in", values, "isPushEds");
            return (Criteria) this;
        }

        public Criteria andIsPushEdsNotIn(List<Integer> values) {
            addCriterion("is_push_eds not in", values, "isPushEds");
            return (Criteria) this;
        }

        public Criteria andIsPushEdsBetween(Integer value1, Integer value2) {
            addCriterion("is_push_eds between", value1, value2, "isPushEds");
            return (Criteria) this;
        }

        public Criteria andIsPushEdsNotBetween(Integer value1, Integer value2) {
            addCriterion("is_push_eds not between", value1, value2, "isPushEds");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Integer value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Integer value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Integer value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Integer value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Integer> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Integer> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Integer value1, Integer value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Integer value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Integer value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Integer value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Integer value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Integer value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Integer> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Integer> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Integer value1, Integer value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
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