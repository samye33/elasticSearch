package com.am.es.model.clue;

import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

@Document(indexName = "custom_contact_info_detail_es", type = "custom_contact_info_detail",refreshInterval = "-1")
public class CustomContactInfoDetailVo implements Serializable {
    private Integer id;

    private Integer customId;

    private Integer customContactsId;

    private Integer contactsTool;

    private String contactsNo;

    private String oldCustomGuid;

    private Date createTime;

    private Integer createBy;

    private Date updateTime;

    private Integer updateBy;

    private Integer userId;

    private String contactNoMd5;

    private String dba;

    private String showContactsNo;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomId() {
        return customId;
    }

    public void setCustomId(Integer customId) {
        this.customId = customId;
    }

    public Integer getCustomContactsId() {
        return customContactsId;
    }

    public void setCustomContactsId(Integer customContactsId) {
        this.customContactsId = customContactsId;
    }

    public Integer getContactsTool() {
        return contactsTool;
    }

    public void setContactsTool(Integer contactsTool) {
        this.contactsTool = contactsTool;
    }

    public String getContactsNo() {
        return contactsNo;
    }

    public void setContactsNo(String contactsNo) {
        this.contactsNo = contactsNo;
    }

    public String getOldCustomGuid() {
        return oldCustomGuid;
    }

    public void setOldCustomGuid(String oldCustomGuid) {
        this.oldCustomGuid = oldCustomGuid;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContactNoMd5() {
        return contactNoMd5;
    }

    public void setContactNoMd5(String contactNoMd5) {
        this.contactNoMd5 = contactNoMd5;
    }

    public String getDba() {
        return dba;
    }

    public void setDba(String dba) {
        this.dba = dba;
    }

    public String getShowContactsNo() {
        return showContactsNo;
    }

    public void setShowContactsNo(String showContactsNo) {
        this.showContactsNo = showContactsNo;
    }
}