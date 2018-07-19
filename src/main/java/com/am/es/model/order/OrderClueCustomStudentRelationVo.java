package com.am.es.model.order;

import java.io.Serializable;
import java.util.Date;

public class OrderClueCustomStudentRelationVo implements Serializable {
    private Integer id;

    private String orderNo;

    private String clueNo;

    private String clueId;

    private String customNo;

    private String customId;

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

    public String getClueId() {
        return clueId;
    }

    public void setClueId(String clueId) {
        this.clueId = clueId;
    }

    public String getCustomNo() {
        return customNo;
    }

    public void setCustomNo(String customNo) {
        this.customNo = customNo;
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId;
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