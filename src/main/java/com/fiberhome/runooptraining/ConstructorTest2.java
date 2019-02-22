package com.fiberhome.runooptraining;

public class ConstructorTest2 {
	public static void main(String[] args) {
		/* 使用构造器创建两个对象 */
		Employee empOne = new Employee("RUNOOB1");
		Employee empTwo = new Employee("RUNOOB2");

		// 调用这两个对象的成员方法
		empOne.empAge(26);
		empOne.empDesignation("高级程序员");
		empOne.empSalary(1000);
		empOne.printEmployee();

		empTwo.empAge(21);
		empTwo.empDesignation("菜鸟程序员");
		empTwo.empSalary(500);
		empTwo.printEmployee();
	}

}

/**
 * Error:(23, 8) java: 类Employee是公共的, 应在名为 Employee.java
 * 的文件中声明,一个class中只能有一个Public 的类，有了一个ConstructorTest的public类，所有下面的类申明会报错
 */
// public class Employee{
class Employee {
	String name;
	int age;
	String designation;
	double salary;

	// Employee 类的构造器，也就是构造函数，基本的构造函数是 public Employee(){}
	public Employee(String name) {
		this.name = name;
	}

	// 设置age的值
	public void empAge(int empAge) {
		// age = empAge;
		this.age = empAge;
	}

	/* 设置designation的值 */
	public void empDesignation(String empDesig) {
		// designation = empDesig;
		this.designation = empDesig;

	}

	/* 设置salary的值 */
	public void empSalary(double empSalary) {
		// salary = empSalary;
		this.salary = empSalary;
	}

	/* 打印信息 */
	public void printEmployee() {
		System.out.println("名字:" + name);
		System.out.println("年龄:" + age);
		System.out.println("职位:" + designation);
		System.out.println("薪水:" + salary);
	}
}