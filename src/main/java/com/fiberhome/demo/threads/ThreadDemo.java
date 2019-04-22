package com.fiberhome.demo.threads;

import java.io.IOException;

/**
 * @author vv
 * @since 2019/2/13
 */
public class ThreadDemo {

	public static void main(String[] args) {
		ThreadDemo demo = new ThreadDemo();
		demo.test();
	}

	public void test() {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				while (true) {
					System.out.println("+++");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		};
		Thread t1 = new Thread(task);
		t1.start();
		System.out.println("main");

		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void test2() {
		// 子类的对象声明为接口，向上转型，体现了面向接口编程的思想
		Runnable task = new PrintTask();
		// 新建一个线程
		Thread t1 = new Thread(task);
		// 启动这个线程
		t1.start();
		System.out.println("main");

		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
