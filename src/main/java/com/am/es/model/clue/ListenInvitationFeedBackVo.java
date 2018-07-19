package com.am.es.model.clue;

import java.io.Serializable;
import java.util.Date;

public class ListenInvitationFeedBackVo implements Serializable {
    private Integer id;

    private Integer listenInvitationId;

    private String listenInvitationNo;

    private Byte isVisit;

    private Date startTime;

    private Integer longTime;

    private String studentFeedFack;

    private Date createTime;

    private Integer createBy;

    private Integer classId;

    private String teacherId;

    private String lessonId;

    private String note;

    private String lessonUrl;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getListenInvitationId() {
        return listenInvitationId;
    }

    public void setListenInvitationId(Integer listenInvitationId) {
        this.listenInvitationId = listenInvitationId;
    }

    public String getListenInvitationNo() {
        return listenInvitationNo;
    }

    public void setListenInvitationNo(String listenInvitationNo) {
        this.listenInvitationNo = listenInvitationNo;
    }

    public Byte getIsVisit() {
        return isVisit;
    }

    public void setIsVisit(Byte isVisit) {
        this.isVisit = isVisit;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getLongTime() {
        return longTime;
    }

    public void setLongTime(Integer longTime) {
        this.longTime = longTime;
    }

    public String getStudentFeedFack() {
        return studentFeedFack;
    }

    public void setStudentFeedFack(String studentFeedFack) {
        this.studentFeedFack = studentFeedFack;
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

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getLessonUrl() {
        return lessonUrl;
    }

    public void setLessonUrl(String lessonUrl) {
        this.lessonUrl = lessonUrl;
    }
}