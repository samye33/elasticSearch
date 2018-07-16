package com.am.es.orderentity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo implements Serializable {
    private Integer id;

    private String orderNo;

    private Integer courseType;

    private Integer source;

    private BigDecimal costPrice;

    private BigDecimal discountAmount;

    private BigDecimal paidAmount;

    private Integer orderStatus;

    private Integer orderType;

    private Integer owner;

    private Date firstPayTime;

    private Date completionPayTime;

    private BigDecimal customizeDepositAmount;

    private Integer customizeDepositUserId;

    private Integer isDeposit;

    private Integer depositAmount;

    private String recommender;

    private Integer isNeedAudit;

    private String sourceChannelCode;

    private String channelCodeSub;

    private Integer signUpSchoolId;

    private Integer attendSchoolId;

    private String school;

    private Date enrollmentYear;

    private Integer age;

    private String grade;

    private String remark;

    private String agreementRemark;

    private Integer isPushEds;

    private Integer createId;

    private Integer updateId;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getCourseType() {
        return courseType;
    }

    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public Date getFirstPayTime() {
        return firstPayTime;
    }

    public void setFirstPayTime(Date firstPayTime) {
        this.firstPayTime = firstPayTime;
    }

    public Date getCompletionPayTime() {
        return completionPayTime;
    }

    public void setCompletionPayTime(Date completionPayTime) {
        this.completionPayTime = completionPayTime;
    }

    public BigDecimal getCustomizeDepositAmount() {
        return customizeDepositAmount;
    }

    public void setCustomizeDepositAmount(BigDecimal customizeDepositAmount) {
        this.customizeDepositAmount = customizeDepositAmount;
    }

    public Integer getCustomizeDepositUserId() {
        return customizeDepositUserId;
    }

    public void setCustomizeDepositUserId(Integer customizeDepositUserId) {
        this.customizeDepositUserId = customizeDepositUserId;
    }

    public Integer getIsDeposit() {
        return isDeposit;
    }

    public void setIsDeposit(Integer isDeposit) {
        this.isDeposit = isDeposit;
    }

    public Integer getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Integer depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getRecommender() {
        return recommender;
    }

    public void setRecommender(String recommender) {
        this.recommender = recommender;
    }

    public Integer getIsNeedAudit() {
        return isNeedAudit;
    }

    public void setIsNeedAudit(Integer isNeedAudit) {
        this.isNeedAudit = isNeedAudit;
    }

    public String getSourceChannelCode() {
        return sourceChannelCode;
    }

    public void setSourceChannelCode(String sourceChannelCode) {
        this.sourceChannelCode = sourceChannelCode;
    }

    public String getChannelCodeSub() {
        return channelCodeSub;
    }

    public void setChannelCodeSub(String channelCodeSub) {
        this.channelCodeSub = channelCodeSub;
    }

    public Integer getSignUpSchoolId() {
        return signUpSchoolId;
    }

    public void setSignUpSchoolId(Integer signUpSchoolId) {
        this.signUpSchoolId = signUpSchoolId;
    }

    public Integer getAttendSchoolId() {
        return attendSchoolId;
    }

    public void setAttendSchoolId(Integer attendSchoolId) {
        this.attendSchoolId = attendSchoolId;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Date getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(Date enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAgreementRemark() {
        return agreementRemark;
    }

    public void setAgreementRemark(String agreementRemark) {
        this.agreementRemark = agreementRemark;
    }

    public Integer getIsPushEds() {
        return isPushEds;
    }

    public void setIsPushEds(Integer isPushEds) {
        this.isPushEds = isPushEds;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}