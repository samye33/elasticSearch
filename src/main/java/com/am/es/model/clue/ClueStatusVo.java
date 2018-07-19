package com.am.es.model.clue;

import java.io.Serializable;
import java.util.Date;

public class ClueStatusVo implements Serializable {
    private Integer id;

    private Integer clueId;

    private String clueNo;

    private Integer customId;

    private String customNo;

    private Integer clueSource;

    private Integer clueSaleOwner;

    private Integer clueTmkOwner;

    private Integer clueCsOwner;

    private Integer clueSchoolManagerOwner;

    private Integer clueOwnerDeparment;

    private Integer clueOwner;

    private Date clueOwerGetTime;

    private String repeatConsultationChannel;

    private Integer repeatConsultationOwner;

    private Date repeatConsultationTime;

    private String recommender;

    private Date recommendTime;

    private Date createTime;

    private Date updateTime;

    private Integer createBy;

    private Integer updateBy;

    private String idGuid;

    private Integer recommendType;

    private String erpRecommender;

    private String erpClueOwner;

    private String associates;

    private Byte isPrivatePool;

    private Integer clueOwnerCommunicateCount;

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

    public String getClueNo() {
        return clueNo;
    }

    public void setClueNo(String clueNo) {
        this.clueNo = clueNo;
    }

    public Integer getCustomId() {
        return customId;
    }

    public void setCustomId(Integer customId) {
        this.customId = customId;
    }

    public String getCustomNo() {
        return customNo;
    }

    public void setCustomNo(String customNo) {
        this.customNo = customNo;
    }

    public Integer getClueSource() {
        return clueSource;
    }

    public void setClueSource(Integer clueSource) {
        this.clueSource = clueSource;
    }

    public Integer getClueSaleOwner() {
        return clueSaleOwner;
    }

    public void setClueSaleOwner(Integer clueSaleOwner) {
        this.clueSaleOwner = clueSaleOwner;
    }

    public Integer getClueTmkOwner() {
        return clueTmkOwner;
    }

    public void setClueTmkOwner(Integer clueTmkOwner) {
        this.clueTmkOwner = clueTmkOwner;
    }

    public Integer getClueCsOwner() {
        return clueCsOwner;
    }

    public void setClueCsOwner(Integer clueCsOwner) {
        this.clueCsOwner = clueCsOwner;
    }

    public Integer getClueSchoolManagerOwner() {
        return clueSchoolManagerOwner;
    }

    public void setClueSchoolManagerOwner(Integer clueSchoolManagerOwner) {
        this.clueSchoolManagerOwner = clueSchoolManagerOwner;
    }

    public Integer getClueOwnerDeparment() {
        return clueOwnerDeparment;
    }

    public void setClueOwnerDeparment(Integer clueOwnerDeparment) {
        this.clueOwnerDeparment = clueOwnerDeparment;
    }

    public Integer getClueOwner() {
        return clueOwner;
    }

    public void setClueOwner(Integer clueOwner) {
        this.clueOwner = clueOwner;
    }

    public Date getClueOwerGetTime() {
        return clueOwerGetTime;
    }

    public void setClueOwerGetTime(Date clueOwerGetTime) {
        this.clueOwerGetTime = clueOwerGetTime;
    }

    public String getRepeatConsultationChannel() {
        return repeatConsultationChannel;
    }

    public void setRepeatConsultationChannel(String repeatConsultationChannel) {
        this.repeatConsultationChannel = repeatConsultationChannel;
    }

    public Integer getRepeatConsultationOwner() {
        return repeatConsultationOwner;
    }

    public void setRepeatConsultationOwner(Integer repeatConsultationOwner) {
        this.repeatConsultationOwner = repeatConsultationOwner;
    }

    public Date getRepeatConsultationTime() {
        return repeatConsultationTime;
    }

    public void setRepeatConsultationTime(Date repeatConsultationTime) {
        this.repeatConsultationTime = repeatConsultationTime;
    }

    public String getRecommender() {
        return recommender;
    }

    public void setRecommender(String recommender) {
        this.recommender = recommender;
    }

    public Date getRecommendTime() {
        return recommendTime;
    }

    public void setRecommendTime(Date recommendTime) {
        this.recommendTime = recommendTime;
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

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public String getIdGuid() {
        return idGuid;
    }

    public void setIdGuid(String idGuid) {
        this.idGuid = idGuid;
    }

    public Integer getRecommendType() {
        return recommendType;
    }

    public void setRecommendType(Integer recommendType) {
        this.recommendType = recommendType;
    }

    public String getErpRecommender() {
        return erpRecommender;
    }

    public void setErpRecommender(String erpRecommender) {
        this.erpRecommender = erpRecommender;
    }

    public String getErpClueOwner() {
        return erpClueOwner;
    }

    public void setErpClueOwner(String erpClueOwner) {
        this.erpClueOwner = erpClueOwner;
    }

    public String getAssociates() {
        return associates;
    }

    public void setAssociates(String associates) {
        this.associates = associates;
    }

    public Byte getIsPrivatePool() {
        return isPrivatePool;
    }

    public void setIsPrivatePool(Byte isPrivatePool) {
        this.isPrivatePool = isPrivatePool;
    }

    public Integer getClueOwnerCommunicateCount() {
        return clueOwnerCommunicateCount;
    }

    public void setClueOwnerCommunicateCount(Integer clueOwnerCommunicateCount) {
        this.clueOwnerCommunicateCount = clueOwnerCommunicateCount;
    }
}