package com.am.es.model;

import org.apache.commons.lang.StringUtils;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Document(indexName = "clue_query_response_es", type = "clue_query_response", refreshInterval = "-1")
public class ClueQueryResponseModel extends Extramodel implements Serializable {

    private Integer id;

    private String remark;

    private String suggestContactTime;
    //关联字段createBy
    private String clueCreateByName;

    private String clueCreateTime;
    //关联字段source_channel_code
    private String sourceChannelName;
    //关联字段channel_code_sub
    private String channelCodeSubName;

    private String clueJoinActivitieName;
    //first_channel_code（首次客户来源）
    private String firstChannelName;
    //effectively_channel_code(末次客户来源)
    private String effectivelyChannelName;
    //绑定字段clue_consult_type
    private String clueConsultTypeName;

    private String courseTypeName;

    private String recommenderContact;

    private String clueOwerGetTime;

    private String associates;
    //表clue_status的update_time
    private String updateTime;
    //绑定字段repeat_consultation_time
    private String repeatConsultationTime;
    //关联字段clueOwner
    private String clueOwnerName;
    //关联字段recommender
    private String recommenderName;
    //绑定字段clue_school_manager_owner
    private String clueSchoolManagerOwnerName;

    private String convenienceCourseTime;

    private int saleConnetCount;
    //关联字段last_communicate_time
    private String lastCommunicateTime;

    private int saleDialCount;

    private int saleFailureFollowCount;
    //绑定字段next_communicate_time
    private String nextCommunicateTime;

    private String urgencyName;

    private String clueQualityName;

    private String trafficStateName;

    private String failureReasonName;

    private String clueStatusName;

    private String trueName;

    //关联字段province
    private String provinceCity;
    //关联字段born_date
    private String bornDate;
    //关联字段enrollment_year
    private String enrollmentYear;

    private String profession;

    private String wxId;

    private String qq;

    private String contactName;

    private String phone;

    private String relationshipName;

    private String genderName;
    //学历
    private String qualificationName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSuggestContactTime() {
        return suggestContactTime;
    }

    public void setSuggestContactTime(String suggestContactTime) {
        if (StringUtils.isNotBlank(suggestContactTime)) {
            this.suggestContactTime = suggestContactTime.substring(0, 11);
        } else {
            this.suggestContactTime = suggestContactTime;
        }
    }

    public String getClueCreateByName() {
        return clueCreateByName;
    }

    public void setClueCreateByName(String clueCreateByName) {
        this.clueCreateByName = clueCreateByName;
    }

    public String getClueCreateTime() {
        return clueCreateTime;
    }

    public void setClueCreateTime(String clueCreateTime) {
        if (StringUtils.isNotBlank(clueCreateTime)) {
            this.clueCreateTime = clueCreateTime.substring(0, 11);
        } else {
            this.clueCreateTime = clueCreateTime;
        }
    }

    public String getSourceChannelName() {
        return sourceChannelName;
    }

    public void setSourceChannelName(String sourceChannelName) {
        this.sourceChannelName = sourceChannelName;
    }

    public String getChannelCodeSubName() {
        return channelCodeSubName;
    }

    public void setChannelCodeSubName(String channelCodeSubName) {
        this.channelCodeSubName = channelCodeSubName;
    }

    public String getClueJoinActivitieName() {
        return clueJoinActivitieName;
    }

    public void setClueJoinActivitieName(String clueJoinActivitieName) {
        this.clueJoinActivitieName = clueJoinActivitieName;
    }

    public String getFirstChannelName() {
        return firstChannelName;
    }

    public void setFirstChannelName(String firstChannelName) {
        this.firstChannelName = firstChannelName;
    }

    public String getEffectivelyChannelName() {
        return effectivelyChannelName;
    }

    public void setEffectivelyChannelName(String effectivelyChannelName) {
        this.effectivelyChannelName = effectivelyChannelName;
    }

    public String getClueConsultTypeName() {
        return clueConsultTypeName;
    }

    public void setClueConsultTypeName(String clueConsultTypeName) {
        this.clueConsultTypeName = clueConsultTypeName;
    }

    public String getCourseTypeName() {
        return courseTypeName;
    }

    public void setCourseTypeName(String courseTypeName) {
        this.courseTypeName = courseTypeName;
    }

    public String getRecommenderContact() {
        return recommenderContact;
    }

    public void setRecommenderContact(String recommenderContact) {
        this.recommenderContact = recommenderContact;
    }

    public String getClueOwerGetTime() {
        return clueOwerGetTime;
    }

    public void setClueOwerGetTime(String clueOwerGetTime) {
        if (StringUtils.isNotBlank(clueOwerGetTime)) {
            this.clueOwerGetTime = clueOwerGetTime.substring(0, 11);
        } else {
            this.clueOwerGetTime = clueOwerGetTime;
        }
    }

    public String getAssociates() {
        return associates;
    }

    public void setAssociates(String associates) {
        this.associates = associates;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        if (StringUtils.isNotBlank(updateTime)) {
            this.updateTime = updateTime.substring(0, 11);
        } else {
            this.updateTime = updateTime;
        }
    }

    public String getRepeatConsultationTime() {
        return repeatConsultationTime;
    }

    public void setRepeatConsultationTime(String repeatConsultationTime) {
        if (StringUtils.isNotBlank(repeatConsultationTime)) {
            this.repeatConsultationTime = repeatConsultationTime.substring(0, 11);
        } else {
            this.repeatConsultationTime = repeatConsultationTime;
        }
    }

    public String getClueOwnerName() {
        return clueOwnerName;
    }

    public void setClueOwnerName(String clueOwnerName) {
        this.clueOwnerName = clueOwnerName;
    }

    public String getRecommenderName() {
        return recommenderName;
    }

    public void setRecommenderName(String recommenderName) {
        this.recommenderName = recommenderName;
    }

    public String getClueSchoolManagerOwnerName() {
        return clueSchoolManagerOwnerName;
    }

    public void setClueSchoolManagerOwnerName(String clueSchoolManagerOwnerName) {
        this.clueSchoolManagerOwnerName = clueSchoolManagerOwnerName;
    }

    public String getConvenienceCourseTime() {
        return convenienceCourseTime;
    }

    public void setConvenienceCourseTime(String convenienceCourseTime) {
        if (StringUtils.isNotBlank(convenienceCourseTime)) {
            this.convenienceCourseTime = convenienceCourseTime.substring(0, 11);
        } else {
            this.convenienceCourseTime = convenienceCourseTime;
        }

    }

    public int getSaleConnetCount() {
        return saleConnetCount;
    }

    public void setSaleConnetCount(int saleConnetCount) {
        this.saleConnetCount = saleConnetCount;
    }

    public String getLastCommunicateTime() {
        return lastCommunicateTime;
    }

    public void setLastCommunicateTime(String lastCommunicateTime) {
        if (StringUtils.isNotBlank(lastCommunicateTime)) {
            this.lastCommunicateTime = lastCommunicateTime.substring(0, 11);
        } else {
            this.lastCommunicateTime = lastCommunicateTime;
        }

    }

    public int getSaleDialCount() {
        return saleDialCount;
    }

    public void setSaleDialCount(int saleDialCount) {
        this.saleDialCount = saleDialCount;
    }

    public int getSaleFailureFollowCount() {
        return saleFailureFollowCount;
    }

    public void setSaleFailureFollowCount(int saleFailureFollowCount) {
        this.saleFailureFollowCount = saleFailureFollowCount;
    }

    public String getNextCommunicateTime() {
        return nextCommunicateTime;
    }

    public void setNextCommunicateTime(String nextCommunicateTime) {
        if (StringUtils.isNotBlank(nextCommunicateTime)) {
            this.nextCommunicateTime = nextCommunicateTime.substring(0, 11);
        } else {
            this.nextCommunicateTime = nextCommunicateTime;
        }

    }

    public String getUrgencyName() {
        return urgencyName;
    }

    public void setUrgencyName(String urgencyName) {
        this.urgencyName = urgencyName;
    }

    public String getClueQualityName() {
        return clueQualityName;
    }

    public void setClueQualityName(String clueQualityName) {
        this.clueQualityName = clueQualityName;
    }

    public String getTrafficStateName() {
        return trafficStateName;
    }

    public void setTrafficStateName(String trafficStateName) {
        this.trafficStateName = trafficStateName;
    }

    public String getFailureReasonName() {
        return failureReasonName;
    }

    public void setFailureReasonName(String failureReasonName) {
        this.failureReasonName = failureReasonName;
    }

    public String getClueStatusName() {
        return clueStatusName;
    }

    public void setClueStatusName(String clueStatusName) {
        this.clueStatusName = clueStatusName;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getProvinceCity() {
        return provinceCity;
    }

    public void setProvinceCity(String provinceCity) {
        this.provinceCity = provinceCity;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public String getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(String enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRelationshipName() {
        return relationshipName;
    }

    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    public String getQualificationName() {
        return qualificationName;
    }

    public void setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName;
    }
}
