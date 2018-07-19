package com.am.es.model.clue;

import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

@Document(indexName = "listen_invitation_info_es", type = "listen_invitation_info",refreshInterval = "-1")
public class ListenInvitationInfoVo implements Serializable {
    private Integer id;

    private String listenInvitationNo;

    private String customGuid;

    private String customNo;

    private String clueGuid;

    private String clueNo;

    private Integer courseType;

    private Integer liStatus;

    private Integer liType;

    private Date liStartTime;

    private Date liEndtIme;

    private String roomId;

    private Date createTime;

    private Integer createBy;

    private Integer isDelete;

    private Date updateTime;

    private Integer updateBy;

    private String liContent;

    private String courseId;

    private String courseName;

    private ListenInvitationFeedBackVo listenInvitationFeedBackVo;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getListenInvitationNo() {
        return listenInvitationNo;
    }

    public void setListenInvitationNo(String listenInvitationNo) {
        this.listenInvitationNo = listenInvitationNo;
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

    public Integer getCourseType() {
        return courseType;
    }

    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
    }

    public Integer getLiStatus() {
        return liStatus;
    }

    public void setLiStatus(Integer liStatus) {
        this.liStatus = liStatus;
    }

    public Integer getLiType() {
        return liType;
    }

    public void setLiType(Integer liType) {
        this.liType = liType;
    }

    public Date getLiStartTime() {
        return liStartTime;
    }

    public void setLiStartTime(Date liStartTime) {
        this.liStartTime = liStartTime;
    }

    public Date getLiEndtIme() {
        return liEndtIme;
    }

    public void setLiEndtIme(Date liEndtIme) {
        this.liEndtIme = liEndtIme;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
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

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
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

    public String getLiContent() {
        return liContent;
    }

    public void setLiContent(String liContent) {
        this.liContent = liContent;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ListenInvitationFeedBackVo getListenInvitationFeedBackVo() {
        return listenInvitationFeedBackVo;
    }

    public void setListenInvitationFeedBackVo(ListenInvitationFeedBackVo listenInvitationFeedBackVo) {
        this.listenInvitationFeedBackVo = listenInvitationFeedBackVo;
    }
}