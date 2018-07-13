package com.am.es.enums;
/**
 * 是否标识枚举
 */
public enum TrueFalseEnum {
	//true
	TRUE(1,"TRUE"),
	//false
	FALSE(0,"FALSE");
	
	private int value;
	private String desc;
	
	private TrueFalseEnum(int value, String desc) {
		this.value = value;
		this.desc = desc;
	}
	
	public static TrueFalseEnum getByValue(int value) {
		for (TrueFalseEnum ve : values()) {
			if (value == ve.value) {
				return ve;
			}
		}
		return FALSE;
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