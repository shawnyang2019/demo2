package com.fiberhome.demo.dispatch;

/**
 * 动态分配的一个例子就是重写
 */
public class DynamicDispatch {
	static abstract class Human {
		public abstract void sayHello() ;
	}

	static class Man extends Human {
		@Override
		public void sayHello() {
			System.out.println("hello, gentleman!");
		}
	}

	static class Woman extends Human {
		@Override
		public void sayHello() {
			System.out.println("hello, lady!");
		}
	}

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        man.sayHello();
        woman.sayHello();
        man = new Woman();
        man.sayHello();
    }

}
