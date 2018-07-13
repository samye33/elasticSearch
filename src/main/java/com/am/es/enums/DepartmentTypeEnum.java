package com.am.es.enums;

/**
 * 标识枚举
 */
public enum DepartmentTypeEnum {
	// 实体部门
	TYPE_ACTUAL(1, "ACTUAL"),
	// 虚拟部门
	TYPE_VIRTUAL(2, "VIRTUAL");

	private int value;
	private String desc;

	private DepartmentTypeEnum(int value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	public static DepartmentTypeEnum getByValue(int value) {
		for (DepartmentTypeEnum ve : values()) {
			if (value == ve.value) {
				return ve;
			}
		}
		return TYPE_ACTUAL;
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