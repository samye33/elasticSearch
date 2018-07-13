package com.am.es.entity;

import java.io.Serializable;
import java.util.Date;

public class ClueRepeatConsult implements Serializable {
    private Integer id;

    private Integer clueId;

    private Integer consultChannelId;

    private Integer consultUser;

    private Date consultTime;

    private Integer consultWay;

    private Date createTime;

    private Integer createBy;

    private String consultContent;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClueId() {
        return clueId;
    }

    public void setClueId(Integer clueId) {
        this.clueId = clueId;
    }

    public Integer getConsultChannelId() {
        return consultChannelId;
    }

    public void setConsultChannelId(Integer consultChannelId) {
        this.consultChannelId = consultChannelId;
    }

    public Integer getConsultUser() {
        return consultUser;
    }

    public void setConsultUser(Integer consultUser) {
        this.consultUser = consultUser;
    }

    public Date getConsultTime() {
        return consultTime;
    }

    public void setConsultTime(Date consultTime) {
        this.consultTime = consultTime;
    }

    public Integer getConsultWay() {
        return consultWay;
    }

    public void setConsultWay(Integer consultWay) {
        this.consultWay = consultWay;
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

    public String getConsultContent() {
        return consultContent;
    }

    public void setConsultContent(String consultContent) {
        this.consultContent = consultContent;
    }
}