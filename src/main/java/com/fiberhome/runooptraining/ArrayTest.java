package com.fiberhome.runooptraining;

public class ArrayTest {
	public static void main(String[] args) {
		double[] myList = { 5.6, 4.5, 3.3, 13.2, 4.0, 34.33, 34.0, 45.45, 99.993, 11123 };// 等价于下面的方法
		// double[] myList=new double[]
		// {5.6,4.5,3.3,13.2,4.0,34.33,34.0,45.45,99.993,11123};//等价于下面的赋值
		// 数组大小
		// int size = 10;
		// // 定义数组
		// double[] myList = new double[size];
		// myList[0] = 5.6;
		// myList[1] = 4.5;
		// myList[2] = 3.3;
		// myList[3] = 13.2;
		// myList[4] = 4.0;
		// myList[5] = 34.33;
		// myList[6] = 34.0;
		// myList[7] = 45.45;
		// myList[8] = 99.993;
		// myList[9] = 11123;
		// // 计算所有元素的总和
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
			// i+=myList[i];
			// System.out.println("总和为： " + i);
		}
		System.out.println("总和为： " + total);
	}
}

class TestArray {
	public static void main(String[] args) {
		double[] myList = { 5.9, 2.9, 3.4, 3.5 };
		// 打印所有数组元素
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + " ");
		}
		// 注意加强型for语句的使用联系
		for (double x : myList) {
			System.out.println(x);
		}
		// 计算所有元素的总和
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.println("Total is " + total);
		total = 0;
		for (double i : myList) {
			total += i;
		}
		System.out.println("Total is " + total);
		// 查找最大元素
		double max = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max)
				max = myList[i];
		}
		System.out.println("Max is " + max);
		max = myList[0];
		for (double x : myList) {
			if (x > max)
				max = x;
		}
		System.out.println("Max is " + max);
	}
}