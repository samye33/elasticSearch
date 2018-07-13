package com.am.es.entity;

import java.io.Serializable;
import java.util.Date;

public class ClueCanFollow implements Serializable {
    private Integer id;

    private String clueGuid;

    private String clueNo;

    private String customGuid;

    private String customNo;

    private Integer clueStage;

    private Integer clueChannelCode;

    private String clueStatus;

    private Integer clueQuality;

    private Integer lastOwner;

    private Date lastCommunicateTime;

    private Integer courseType;

    private Date createTime;

    private Integer createBy;

    private Date updateTime;

    private Integer updateBy;

    private Integer clueOwner;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClueGuid() {
        return clueGuid;
    }

    public void setClueGuid(String clueGuid) {
        this.clueGuid = clueGuid;
    }

    public String getClueNo() {
        return clueNo;
    }

    public void setClueNo(String clueNo) {
        this.clueNo = clueNo;
    }

    public String getCustomGuid() {
        return customGuid;
    }

    public void setCustomGuid(String customGuid) {
        this.customGuid = customGuid;
    }

    public String getCustomNo() {
        return customNo;
    }

    public void setCustomNo(String customNo) {
        this.customNo = customNo;
    }

    public Integer getClueStage() {
        return clueStage;
    }

    public void setClueStage(Integer clueStage) {
        this.clueStage = clueStage;
    }

    public Integer getClueChannelCode() {
        return clueChannelCode;
    }

    public void setClueChannelCode(Integer clueChannelCode) {
        this.clueChannelCode = clueChannelCode;
    }

    public String getClueStatus() {
        return clueStatus;
    }

    public void setClueStatus(String clueStatus) {
        this.clueStatus = clueStatus;
    }

    public Integer getClueQuality() {
        return clueQuality;
    }

    public void setClueQuality(Integer clueQuality) {
        this.clueQuality = clueQuality;
    }

    public Integer getLastOwner() {
        return lastOwner;
    }

    public void setLastOwner(Integer lastOwner) {
        this.lastOwner = lastOwner;
    }

    public Date getLastCommunicateTime() {
        return lastCommunicateTime;
    }

    public void setLastCommunicateTime(Date lastCommunicateTime) {
        this.lastCommunicateTime = lastCommunicateTime;
    }

    public Integer getCourseType() {
        return courseType;
    }

    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
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

    public Integer getClueOwner() {
        return clueOwner;
    }

    public void setClueOwner(Integer clueOwner) {
        this.clueOwner = clueOwner;
    }
}