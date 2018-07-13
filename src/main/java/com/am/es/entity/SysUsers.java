package com.am.es.entity;

import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

@Document(indexName = "projectname", type = "sysUser")
public class SysUsers implements Serializable {
    private Integer id;

    private Integer userId;

    private String workNo;

    private String userName;

    private String passWord;

    private String email;

    private String eName;

    private String trueName;

    private Integer sex;

    private String education;

    private String graduate;

    private Date birthday;

    private String qq;

    private String skype;

    private String mobile;

    private String homeTel;

    private String homeAddr;

    private String officeAddr;

    private String officeName;

    private Integer isleave;

    private String remark;

    private String avatar;

    private Integer accountType;

    private Integer isPublic;

    private String courseTypes;

    private String weChat;

    private String weChatimgUrl;

    private String cardiImgUrl;

    private String videoUrl;

    private Integer createId;

    private Date createTime;

    private Date updateTime;

    private Integer flag;

    private Integer higherLevelId;

    private Integer isUseCallphone;

    private String extNo;

    private String agentNo;

    private String agentJobNo;

    private String agentJobType;

    private String trHotLine;

    private String trAgentNo;

    private String trPwd;

    private String trBindTel;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getGraduate() {
        return graduate;
    }

    public void setGraduate(String graduate) {
        this.graduate = graduate;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    public String getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr;
    }

    public String getOfficeAddr() {
        return officeAddr;
    }

    public void setOfficeAddr(String officeAddr) {
        this.officeAddr = officeAddr;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public Integer getIsleave() {
        return isleave;
    }

    public void setIsleave(Integer isleave) {
        this.isleave = isleave;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public Integer getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    public String getCourseTypes() {
        return courseTypes;
    }

    public void setCourseTypes(String courseTypes) {
        this.courseTypes = courseTypes;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public String getWeChatimgUrl() {
        return weChatimgUrl;
    }

    public void setWeChatimgUrl(String weChatimgUrl) {
        this.weChatimgUrl = weChatimgUrl;
    }

    public String getCardiImgUrl() {
        return cardiImgUrl;
    }

    public void setCardiImgUrl(String cardiImgUrl) {
        this.cardiImgUrl = cardiImgUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
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

    public Integer getHigherLevelId() {
        return higherLevelId;
    }

    public void setHigherLevelId(Integer higherLevelId) {
        this.higherLevelId = higherLevelId;
    }

    public Integer getIsUseCallphone() {
        return isUseCallphone;
    }

    public void setIsUseCallphone(Integer isUseCallphone) {
        this.isUseCallphone = isUseCallphone;
    }

    public String getExtNo() {
        return extNo;
    }

    public void setExtNo(String extNo) {
        this.extNo = extNo;
    }

    public String getAgentNo() {
        return agentNo;
    }

    public void setAgentNo(String agentNo) {
        this.agentNo = agentNo;
    }

    public String getAgentJobNo() {
        return agentJobNo;
    }

    public void setAgentJobNo(String agentJobNo) {
        this.agentJobNo = agentJobNo;
    }

    public String getAgentJobType() {
        return agentJobType;
    }

    public void setAgentJobType(String agentJobType) {
        this.agentJobType = agentJobType;
    }

    public String getTrHotLine() {
        return trHotLine;
    }

    public void setTrHotLine(String trHotLine) {
        this.trHotLine = trHotLine;
    }

    public String getTrAgentNo() {
        return trAgentNo;
    }

    public void setTrAgentNo(String trAgentNo) {
        this.trAgentNo = trAgentNo;
    }

    public String getTrPwd() {
        return trPwd;
    }

    public void setTrPwd(String trPwd) {
        this.trPwd = trPwd;
    }

    public String getTrBindTel() {
        return trBindTel;
    }

    public void setTrBindTel(String trBindTel) {
        this.trBindTel = trBindTel;
    }
}