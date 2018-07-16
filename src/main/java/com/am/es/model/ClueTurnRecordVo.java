package com.am.es.model;

import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

@Document(indexName = "clue_turn_record_es", type = "clue_turn_record",refreshInterval = "-1")
public class ClueTurnRecordVo implements Serializable {
    private Integer id;

    private Integer customId;

    private String customNo;

    private Integer clueId;

    private String clueNo;

    private String memo;

    private Integer preGroupId;

    private Integer preUserId;

    private Integer currentUserId;

    private Integer currentGroupId;

    private Integer createBy;

    private Date createTime;

    private Integer updateBy;

    private Date updateTime;

    private String preClueStatus;

    private String currentClueStatus;

    private Integer clueTurnType;

    private Integer currentUserType;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getClueId() {
        return clueId;
    }

    public void setClueId(Integer clueId) {
        this.clueId = clueId;
    }

    public String getClueNo() {
        return clueNo;
    }

    public void setClueNo(String clueNo) {
        this.clueNo = clueNo;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getPreGroupId() {
        return preGroupId;
    }

    public void setPreGroupId(Integer preGroupId) {
        this.preGroupId = preGroupId;
    }

    public Integer getPreUserId() {
        return preUserId;
    }

    public void setPreUserId(Integer preUserId) {
        this.preUserId = preUserId;
    }

    public Integer getCurrentUserId() {
        return currentUserId;
    }

    public void setCurrentUserId(Integer currentUserId) {
        this.currentUserId = currentUserId;
    }

    public Integer getCurrentGroupId() {
        return currentGroupId;
    }

    public void setCurrentGroupId(Integer currentGroupId) {
        this.currentGroupId = currentGroupId;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getPreClueStatus() {
        return preClueStatus;
    }

    public void setPreClueStatus(String preClueStatus) {
        this.preClueStatus = preClueStatus;
    }

    public String getCurrentClueStatus() {
        return currentClueStatus;
    }

    public void setCurrentClueStatus(String currentClueStatus) {
        this.currentClueStatus = currentClueStatus;
    }

    public Integer getClueTurnType() {
        return clueTurnType;
    }

    public void setClueTurnType(Integer clueTurnType) {
        this.clueTurnType = clueTurnType;
    }

    public Integer getCurrentUserType() {
        return currentUserType;
    }

    public void setCurrentUserType(Integer currentUserType) {
        this.currentUserType = currentUserType;
    }
}