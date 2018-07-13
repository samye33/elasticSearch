package com.am.es.entity;

import java.io.Serializable;
import java.util.Date;

public class ClueFollowUping implements Serializable {
    private Integer id;

    private String clueGuid;

    private String clueNo;

    private String customGuid;

    private String customNo;

    private Integer clueStage;

    private Date nextCommunicateTime;

    private Date planRecoveryTime;

    private Integer clueOwner;

    private Date createTime;

    private Integer createBy;

    private Date updateTime;

    private Integer updateBy;

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

    public Date getNextCommunicateTime() {
        return nextCommunicateTime;
    }

    public void setNextCommunicateTime(Date nextCommunicateTime) {
        this.nextCommunicateTime = nextCommunicateTime;
    }

    public Date getPlanRecoveryTime() {
        return planRecoveryTime;
    }

    public void setPlanRecoveryTime(Date planRecoveryTime) {
        this.planRecoveryTime = planRecoveryTime;
    }

    public Integer getClueOwner() {
        return clueOwner;
    }

    public void setClueOwner(Integer clueOwner) {
        this.clueOwner = clueOwner;
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
}