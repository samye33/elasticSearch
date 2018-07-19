package com.am.es.entity.clue;

import java.io.Serializable;
import java.util.Date;

public class ClueOwnerRecord implements Serializable {
    private Integer id;

    private String trueName;

    private String contactNo;

    private Integer contactTool;

    private String uid;

    private Integer userId;

    private String userName;

    private String result;

    private Date createTime;

    private Integer createBy;

    private String clueGuids;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Integer getContactTool() {
        return contactTool;
    }

    public void setContactTool(Integer contactTool) {
        this.contactTool = contactTool;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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

    public String getClueGuids() {
        return clueGuids;
    }

    public void setClueGuids(String clueGuids) {
        this.clueGuids = clueGuids;
    }
}