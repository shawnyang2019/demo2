package com.fiberhome.runooptraining.emun;

public enum Gender {
	/**
	 * 列出所有枚举实例
	 */
	// 表示枚举类Gender 有两个对象，括号里面是成员变量的属性，对象之间有，隔开，所有对象都枚举完成后
	// 有；结束
	MALE("男", 1), FEMALE("女");

	// 下面是定义成员变量并且输入输出成员变量的属性
	private String name;
	private int code;

	Gender(String name) {
		this.name = name;
	}

	Gender(String name, int code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		// 把gender1指向枚举类里面的成员变量MALE
		Gender gender1 = Gender.MALE;
		// 函数调用成员变量的属性
		System.out.println(gender1.getName());
		Gender gender2 = Gender.MALE;
	}
}