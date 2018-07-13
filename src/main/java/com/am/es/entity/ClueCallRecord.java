package com.am.es.entity;

import java.io.Serializable;
import java.util.Date;

public class ClueCallRecord implements Serializable {
    private Integer id;

    private Integer recordId;

    private String clueGuid;

    private Integer hasUpdate;

    private Date createTime;

    private Integer createBy;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getClueGuid() {
        return clueGuid;
    }

    public void setClueGuid(String clueGuid) {
        this.clueGuid = clueGuid;
    }

    public Integer getHasUpdate() {
        return hasUpdate;
    }

    public void setHasUpdate(Integer hasUpdate) {
        this.hasUpdate = hasUpdate;
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
}