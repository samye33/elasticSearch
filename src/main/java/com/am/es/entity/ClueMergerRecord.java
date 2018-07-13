package com.am.es.entity;

import java.io.Serializable;
import java.util.Date;

public class ClueMergerRecord implements Serializable {
    private Integer id;

    private String retainClueGuid;

    private String retainClueNo;

    private String retainCustomerGuid;

    private String retainCustomerNo;

    private String mergerClueGuid;

    private String mergerClueNo;

    private String mergerCustomerGuid;

    private String mergerCustomerNo;

    private Date mergerTime;

    private Integer mergerOperator;

    private Date createTime;

    private Integer createBy;

    private Date updateTime;

    private Integer updateBy;

    private String mergerRemark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRetainClueGuid() {
        return retainClueGuid;
    }

    public void setRetainClueGuid(String retainClueGuid) {
        this.retainClueGuid = retainClueGuid;
    }

    public String getRetainClueNo() {
        return retainClueNo;
    }

    public void setRetainClueNo(String retainClueNo) {
        this.retainClueNo = retainClueNo;
    }

    public String getRetainCustomerGuid() {
        return retainCustomerGuid;
    }

    public void setRetainCustomerGuid(String retainCustomerGuid) {
        this.retainCustomerGuid = retainCustomerGuid;
    }

    public String getRetainCustomerNo() {
        return retainCustomerNo;
    }

    public void setRetainCustomerNo(String retainCustomerNo) {
        this.retainCustomerNo = retainCustomerNo;
    }

    public String getMergerClueGuid() {
        return mergerClueGuid;
    }

    public void setMergerClueGuid(String mergerClueGuid) {
        this.mergerClueGuid = mergerClueGuid;
    }

    public String getMergerClueNo() {
        return mergerClueNo;
    }

    public void setMergerClueNo(String mergerClueNo) {
        this.mergerClueNo = mergerClueNo;
    }

    public String getMergerCustomerGuid() {
        return mergerCustomerGuid;
    }

    public void setMergerCustomerGuid(String mergerCustomerGuid) {
        this.mergerCustomerGuid = mergerCustomerGuid;
    }

    public String getMergerCustomerNo() {
        return mergerCustomerNo;
    }

    public void setMergerCustomerNo(String mergerCustomerNo) {
        this.mergerCustomerNo = mergerCustomerNo;
    }

    public Date getMergerTime() {
        return mergerTime;
    }

    public void setMergerTime(Date mergerTime) {
        this.mergerTime = mergerTime;
    }

    public Integer getMergerOperator() {
        return mergerOperator;
    }

    public void setMergerOperator(Integer mergerOperator) {
        this.mergerOperator = mergerOperator;
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

    public String getMergerRemark() {
        return mergerRemark;
    }

    public void setMergerRemark(String mergerRemark) {
        this.mergerRemark = mergerRemark;
    }
}