package com.fiberhome.runooptraining;

public class BitwiseOperationTest {
	public static void main(String[] args) {
		int a = 60; /* 60 = 0011 1100 */
		int b = 13; /* 13 = 0000 1101 */
		int c = 0;
		c = a & b; /* 12 = 0000 1100 */
		System.out.println("a & b = " + c);

		c = a | b; /* 61 = 0011 1101 */
		System.out.println("a | b = " + c);

		c = a ^ b; /* 49 = 0011 0001 */
		System.out.println("a ^ b = " + c);

		c = ~a; /*-61 = 1100 0011 */
		System.out.println("~a = " + c);
		// 注意这个2进制的位是怎么算出来的
		c = a << 2; /* 240 = 1111 0000 */
		System.out.println("a << 2 = " + c);

		c = a >> 2; /* 15 = 1111 */
		System.out.println("a >> 2  = " + c);

		c = a >>> 2; /* 15 = 0000 1111 */
		System.out.println("a >>> 2 = " + c);
	}
}

class LuoJi {
	public static void main(String[] args) {
		int a = 5;// 定义一个变量；
		// 该程序使用到了短路逻辑运算符(&&)，首先判断 a<4 的结果为 false，则 b 的结果必定是 false，
		// 所以不再执行第二个操作 a++<10 的判断，所以 a 的值为 5。
		boolean b = (a < 4) && (a++ < 10);
		System.out.println("使用短路逻辑运算符的结果为" + b);
		System.out.println("a的结果为" + a);
	}
}

class Vehicle {
}

class Car extends Vehicle {
	public static void main(String[] args) {
		// 可以用子类new一个对象赋值给父类，反过来就不行，Car c=new Vehicle()会报错
		Vehicle a = new Car();
		boolean result = a instanceof Car;
		System.out.println(result);
	}
}