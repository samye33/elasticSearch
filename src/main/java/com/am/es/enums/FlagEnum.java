package com.am.es.enums;
/**
 * 标识枚举
 */
public enum FlagEnum {
	//有效
	FLAG_VALID(1,"VALID"),
	//无效
	FLAG_INVALID(0,"INVALID"),
	//删除
	FLAG_DELETE(-1,"DELETE");
	
	private int value;
	private String desc;
	
	private FlagEnum(int value, String desc) {
		this.value = value;
		this.desc = desc;
	}
	
	public static FlagEnum getByValue(int value) {
		for (FlagEnum ve : values()) {
			if (value == ve.value) {
				return ve;
			}
		}
		return FLAG_VALID;
	}

	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}