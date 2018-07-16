package com.am.es.clueentity;

import java.io.Serializable;
import java.util.Date;

public class ClueInfoChangeRecord implements Serializable {
    private Integer id;

    private String guid;

    private String clueNo;

    private String customGuid;

    private String customNo;

    private Integer originalCourseType;

    private Integer courseType;

    private String remark;

    private Integer createBy;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
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

    public Integer getOriginalCourseType() {
        return originalCourseType;
    }

    public void setOriginalCourseType(Integer originalCourseType) {
        this.originalCourseType = originalCourseType;
    }

    public Integer getCourseType() {
        return courseType;
    }

    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
}