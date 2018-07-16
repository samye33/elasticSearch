package com.am.es.model;

import java.io.Serializable;
import java.util.Date;

public class OrderClueCustomStudentRelationVo implements Serializable {
    private Integer id;

    private String orderNo;

    private String clueNo;

    private String clueGuid;

    private String customNo;

    private String customGuid;

    private String studentNo;

    private Integer ucenterUid;

    private String vOrderNo;

    private Integer createId;

    private Date createTime;

    private Date updateTime;

    private Integer flag;

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

    public String getClueNo() {
        return clueNo;
    }

    public void setClueNo(String clueNo) {
        this.clueNo = clueNo;
    }

    public String getClueGuid() {
        return clueGuid;
    }

    public void setClueGuid(String clueGuid) {
        this.clueGuid = clueGuid;
    }

    public String getCustomNo() {
        return customNo;
    }

    public void setCustomNo(String customNo) {
        this.customNo = customNo;
    }

    public String getCustomGuid() {
        return customGuid;
    }

    public void setCustomGuid(String customGuid) {
        this.customGuid = customGuid;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public Integer getUcenterUid() {
        return ucenterUid;
    }

    public void setUcenterUid(Integer ucenterUid) {
        this.ucenterUid = ucenterUid;
    }

    public String getvOrderNo() {
        return vOrderNo;
    }

    public void setvOrderNo(String vOrderNo) {
        this.vOrderNo = vOrderNo;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
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

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}