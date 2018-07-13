package com.am.es.entity;

import java.io.Serializable;
import java.util.Date;

public class ClueCooperation implements Serializable {
    private Integer id;

    private String clueGuid;

    private String customGuid;

    private Integer userId;

    private Integer isDelete;

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

    public String getCustomGuid() {
        return customGuid;
    }

    public void setCustomGuid(String customGuid) {
        this.customGuid = customGuid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
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