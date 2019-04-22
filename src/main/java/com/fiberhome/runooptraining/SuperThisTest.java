package com.fiberhome.runooptraining;

class Animal {
	void eat() {
		// 打印出"animal:aat"
		System.out.println("animal : eat");
	}
}

class Dog extends Animal {
	// void eat() {
	// System.out.println("dog : eat");
	// }

	void eatTest() {
		// this.eat(); // this 调用自己所在类的方法，
		// 另外一个使用this的解释，采用 this 关键字是为了解决实例变量（private String name）
		// 和局部变量（setName(String name)中的name变量）之间发生的同名的冲突。
		// 1 自己所在的类是Dog类，所以调用Dog类的方法
		// 2 调用哪个方法：由于是this.eat(),所以调用的是eat方法，所以打印出来的是"dog:eat"
		// super.eat(); // 当需要在子类中调用父类的被重写方法时，要使用super关键字。
		// 由于在子类中对eat方法进行了重写，那么如果仍要调用父类的方法的话，那么久可以使用super方法进行调用
		// 如果没有进行重写的话，那么由于继承关系，就可以直接用Dog里面的对象调用Animal里面的方法
		// 1 根据继承关系，父类是Animal类
		// 2 同上调用的也是eat方法
		// 重写只是对方法体进行重写，并且不用做出比父类更为严格的控制，用于子类对父类的
		// 重载近似于了重新再编写一个新的函数，只是函数的名称与之前的函数一样，参数列表必须不一样，多用于构造函数的重载

	}
}

class SetFunctionTest {
	int i;
	String string;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		// 调用自己所在类的成员变量
		this.i = i;

	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}

/**
 * 主类的类名必须要与class 的文件名相同
 */
public class SuperThisTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		Dog d = new Dog();
		// d.eatTest();
		d.eat();
		SetFunctionTest setFunctionTest = new SetFunctionTest();
		setFunctionTest.setI(110);
		// System.out.println(setFunctionTest.setI(110));
		// 打印出set方法报错的原因是set方法没有返回值
		// 返回给主方法，所以这里会报错
		// get语句有返回值，所以不会报错
		System.out.println(setFunctionTest.getI());
	}
}
