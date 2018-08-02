package com.am.es.model;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Data
@Document(indexName = "clue_query_response_es", type = "clue_query_response",refreshInterval = "-1")
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


}
