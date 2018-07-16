package com.am.es.model;

import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

@Document(indexName = "custom_info_es", type = "custom_info",refreshInterval = "-1")
public class CustomInfoVo implements Serializable {
    private Integer id;

    private String customNo;

    private String trueName;

    private String parentName;

    private String eName;

    private Integer gender;

    private String country;

    private String countryCode;

    private String mainPhone;

    private Date bornDate;

    private String profession;

    private String province;

    private Integer isAbroad;

    private String city;

    private String school;

    private String major;

    private Integer qualification;

    private Date enrollmentYear;

    private Date graduationTime;

    private Integer uCenterUid;

    private Date createTime;

    private Integer createBy;

    private Date updateTime;

    private Integer updateBy;

    private String customPic;

    private String wxNick;

    private String wxImg;

    private String wxId;

    private String wxUserName;

    private String wxUnionId;

    private String urgentName;

    private String urgentPhone;

    private Integer hasDeal;

    private String showMainPhone;

    private ClueInfoVo clueInfoVo;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomNo() {
        return customNo;
    }

    public void setCustomNo(String customNo) {
        this.customNo = customNo;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getMainPhone() {
        return mainPhone;
    }

    public void setMainPhone(String mainPhone) {
        this.mainPhone = mainPhone;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getIsAbroad() {
        return isAbroad;
    }

    public void setIsAbroad(Integer isAbroad) {
        this.isAbroad = isAbroad;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getQualification() {
        return qualification;
    }

    public void setQualification(Integer qualification) {
        this.qualification = qualification;
    }

    public Date getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(Date enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public Date getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(Date graduationTime) {
        this.graduationTime = graduationTime;
    }

    public Integer getuCenterUid() {
        return uCenterUid;
    }

    public void setuCenterUid(Integer uCenterUid) {
        this.uCenterUid = uCenterUid;
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

    public String getCustomPic() {
        return customPic;
    }

    public void setCustomPic(String customPic) {
        this.customPic = customPic;
    }

    public String getWxNick() {
        return wxNick;
    }

    public void setWxNick(String wxNick) {
        this.wxNick = wxNick;
    }

    public String getWxImg() {
        return wxImg;
    }

    public void setWxImg(String wxImg) {
        this.wxImg = wxImg;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getWxUserName() {
        return wxUserName;
    }

    public void setWxUserName(String wxUserName) {
        this.wxUserName = wxUserName;
    }

    public String getWxUnionId() {
        return wxUnionId;
    }

    public void setWxUnionId(String wxUnionId) {
        this.wxUnionId = wxUnionId;
    }

    public String getUrgentName() {
        return urgentName;
    }

    public void setUrgentName(String urgentName) {
        this.urgentName = urgentName;
    }

    public String getUrgentPhone() {
        return urgentPhone;
    }

    public void setUrgentPhone(String urgentPhone) {
        this.urgentPhone = urgentPhone;
    }

    public Integer getHasDeal() {
        return hasDeal;
    }

    public void setHasDeal(Integer hasDeal) {
        this.hasDeal = hasDeal;
    }

    public String getShowMainPhone() {
        return showMainPhone;
    }

    public void setShowMainPhone(String showMainPhone) {
        this.showMainPhone = showMainPhone;
    }

    public ClueInfoVo getClueInfoVo() {
        return clueInfoVo;
    }

    public void setClueInfoVo(ClueInfoVo clueInfoVo) {
        this.clueInfoVo = clueInfoVo;
    }
}