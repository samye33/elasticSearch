package com.am.es.entity;

import java.io.Serializable;
import java.util.Date;

public class ClueInfo implements Serializable {
    private Integer id;

    private String clueNo;

    private Integer customId;

    private String customNo;

    private Integer intention;

    private Integer intentionGrade;

    private String firstChannelCode;

    private String effectivelyChannelCode;

    private Integer courseType;

    private String remark;

    private Date createTime;

    private Integer createBy;

    private Date updateTime;

    private Integer updateBy;

    private Integer channelCodeSub;

    private String sourceChannelCode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClueNo() {
        return clueNo;
    }

    public void setClueNo(String clueNo) {
        this.clueNo = clueNo;
    }

    public Integer getCustomId() {
        return customId;
    }

    public void setCustomId(Integer customId) {
        this.customId = customId;
    }

    public String getCustomNo() {
        return customNo;
    }

    public void setCustomNo(String customNo) {
        this.customNo = customNo;
    }

    public Integer getIntention() {
        return intention;
    }

    public void setIntention(Integer intention) {
        this.intention = intention;
    }

    public Integer getIntentionGrade() {
        return intentionGrade;
    }

    public void setIntentionGrade(Integer intentionGrade) {
        this.intentionGrade = intentionGrade;
    }

    public String getFirstChannelCode() {
        return firstChannelCode;
    }

    public void setFirstChannelCode(String firstChannelCode) {
        this.firstChannelCode = firstChannelCode;
    }

    public String getEffectivelyChannelCode() {
        return effectivelyChannelCode;
    }

    public void setEffectivelyChannelCode(String effectivelyChannelCode) {
        this.effectivelyChannelCode = effectivelyChannelCode;
    }

    public Integer getCourseType() {
        return courseType;
    }

    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getChannelCodeSub() {
        return channelCodeSub;
    }

    public void setChannelCodeSub(Integer channelCodeSub) {
        this.channelCodeSub = channelCodeSub;
    }

    public String getSourceChannelCode() {
        return sourceChannelCode;
    }

    public void setSourceChannelCode(String sourceChannelCode) {
        this.sourceChannelCode = sourceChannelCode;
    }
}