package com.am.es.enums;

public enum HttpStatusCode {
	// 成功
	CODE_SUCCESS("200", "SUCCESS"),
	// 服务器成功处理了请求，但没有返回任何内容
	CODE_NO_CONTENT("204", "NO_CONTENT"),
	// 服务器不理解请求的语法
	CODE_ERROR_REQUEST("400", "ERROR_REQUEST"),
	// 请求要求身份验证
	CODE_UNAUTHORIZED("401", "UNAUTHORIZED"),
	// 服务器拒绝请求
	CODE_FORBIDDEN("403", "FORBIDDEN"),
	// 服务器内部错误
	CODE_SERVER_INTERNAL_ERROR("500", "SERVER_INTERNAL_ERROR"),

	//未登录
	CODE_USER_NOT_LOGIN("1000000","未登录"),
	//业务错误: 名称重复
	CODE_BUSINESS_NAME_DUPLICATE("1000010","名称不能重复"),
	//业务错误: 数据不存在
	CODE_BUSINESS_VALUE_IS_NOT_EXIST("1000011","数据不存在"),
	//业务错误：数据已存在
	CODE_BUSINESS_VALUE_IS_EXIST("1000013","数据已存在"),
	//业务错误：数据存在关联关系
	CODE_BUSINESS_RELATIONSHIP_IS_EXIST("1000014","存在关联关系"),

	//参数不能为null
	CODE_PARAM_NOT_NULL("1000012","不能为空!");

	private String value;
	private String desc;

	private HttpStatusCode(String value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	public static HttpStatusCode getByValue(String value) {
		for (HttpStatusCode ve : values()) {
			if (value == ve.value) {
				return ve;
			}
		}
		return CODE_SUCCESS;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}