package com.am.es.entity;

import java.io.Serializable;
import java.util.Date;

public class ClueCommunicateRecord implements Serializable {
    private Integer id;

    private String customGuid;

    private String customNo;

    private String clueGuid;

    private String clueNo;

    private Integer tool;

    private Date communicatTime;

    private Date nextCommunicateTime;

    private String clueStatus;

    private String oldClueStatus;

    private String communicateDepart;

    private Integer commucinateStatus;

    private Integer telTrafficStatus;

    private Date createTime;

    private Integer createBy;

    private String erpCreatedBy;

    private String erpGdGtjdNext;

    private String erpGdName;

    private String erpGdActionproject;

    private String guid;

    private String erpCreateBy;

    private Integer callRecordId;

    private Integer communicateRecordType;

    private Integer callDuration;

    private Integer isPushedToErp;

    private Integer pushFailTime;

    private String communicatContent;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getTool() {
        return tool;
    }

    public void setTool(Integer tool) {
        this.tool = tool;
    }

    public Date getCommunicatTime() {
        return communicatTime;
    }

    public void setCommunicatTime(Date communicatTime) {
        this.communicatTime = communicatTime;
    }

    public Date getNextCommunicateTime() {
        return nextCommunicateTime;
    }

    public void setNextCommunicateTime(Date nextCommunicateTime) {
        this.nextCommunicateTime = nextCommunicateTime;
    }

    public String getClueStatus() {
        return clueStatus;
    }

    public void setClueStatus(String clueStatus) {
        this.clueStatus = clueStatus;
    }

    public String getOldClueStatus() {
        return oldClueStatus;
    }

    public void setOldClueStatus(String oldClueStatus) {
        this.oldClueStatus = oldClueStatus;
    }

    public String getCommunicateDepart() {
        return communicateDepart;
    }

    public void setCommunicateDepart(String communicateDepart) {
        this.communicateDepart = communicateDepart;
    }

    public Integer getCommucinateStatus() {
        return commucinateStatus;
    }

    public void setCommucinateStatus(Integer commucinateStatus) {
        this.commucinateStatus = commucinateStatus;
    }

    public Integer getTelTrafficStatus() {
        return telTrafficStatus;
    }

    public void setTelTrafficStatus(Integer telTrafficStatus) {
        this.telTrafficStatus = telTrafficStatus;
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

    public String getErpCreatedBy() {
        return erpCreatedBy;
    }

    public void setErpCreatedBy(String erpCreatedBy) {
        this.erpCreatedBy = erpCreatedBy;
    }

    public String getErpGdGtjdNext() {
        return erpGdGtjdNext;
    }

    public void setErpGdGtjdNext(String erpGdGtjdNext) {
        this.erpGdGtjdNext = erpGdGtjdNext;
    }

    public String getErpGdName() {
        return erpGdName;
    }

    public void setErpGdName(String erpGdName) {
        this.erpGdName = erpGdName;
    }

    public String getErpGdActionproject() {
        return erpGdActionproject;
    }

    public void setErpGdActionproject(String erpGdActionproject) {
        this.erpGdActionproject = erpGdActionproject;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getErpCreateBy() {
        return erpCreateBy;
    }

    public void setErpCreateBy(String erpCreateBy) {
        this.erpCreateBy = erpCreateBy;
    }

    public Integer getCallRecordId() {
        return callRecordId;
    }

    public void setCallRecordId(Integer callRecordId) {
        this.callRecordId = callRecordId;
    }

    public Integer getCommunicateRecordType() {
        return communicateRecordType;
    }

    public void setCommunicateRecordType(Integer communicateRecordType) {
        this.communicateRecordType = communicateRecordType;
    }

    public Integer getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(Integer callDuration) {
        this.callDuration = callDuration;
    }

    public Integer getIsPushedToErp() {
        return isPushedToErp;
    }

    public void setIsPushedToErp(Integer isPushedToErp) {
        this.isPushedToErp = isPushedToErp;
    }

    public Integer getPushFailTime() {
        return pushFailTime;
    }

    public void setPushFailTime(Integer pushFailTime) {
        this.pushFailTime = pushFailTime;
    }

    public String getCommunicatContent() {
        return communicatContent;
    }

    public void setCommunicatContent(String communicatContent) {
        this.communicatContent = communicatContent;
    }
}