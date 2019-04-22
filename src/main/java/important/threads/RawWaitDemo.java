package important.threads;

import com.fiberhome.demo.Person;

public class RawWaitDemo {

	public static void main(String[] args) {
		// new 一个person对象，注意此时有了一个主线程
		Person p = new Person();
		// 重新new了一个新的线程，注意下面的语法格式，下面的语法使用了内部匿名类，在Thread()的括号内定义了一个Runnable类型的内部匿名类的对象，并在大括号内部定义类方法体
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("启动新线程");
					// 注意下面的sleep()方法 1 是static 方法，所以调用需要用到类名.方法名
					// 2 是native方法，其方法体交由本地的C++来执行
					Thread.sleep(3000);
					System.out.println("唤醒所有阻塞在对象P上的线程");
					// 调用对象p的锁，调用锁的好处就是在调用此对象下面的一些属性的时候，阻止其他的调用
					synchronized (p) {
						// 唤醒所有阻塞在对象p上的线程,是一个final 的本地方法
						p.notifyAll();
					}
					// 如果出现中断异常的话，catch此异常信息，并输出栈信息
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			// 给新的线程命名
		}, "thread1");
		// 启动此线程
		// 1 在类中无法调用其他方法，所以如果下面的函数调用如果不放在主方法里面，就会报警
		t.start();
		/**
		 * 多线程的例子：本例中有两个我们比较关注的线程，main 线程和new 的线程thread1， 1 在上面的例子中t.start后
		 * 有以上两个线程都在同时进行 2 具体的执行顺序是按照执行的时间来的，这个时间我们很难去控制，这就是多线程的意思 3 我们可以用sleep
		 * 和wait 方法去避免这些多线程造成的混乱
		 */
		synchronized (p) {
			try {
				System.out.println("主线程阻塞在对象p上");
				// p.wait 表示等待20000ms 期间如果没有指令把这个线程唤醒，那么该线程会自动的往下执行，本例中，有notify
				// 唤醒程序
				p.wait(20000);
				System.out.println("主线程在低于wait时间上被其他语句唤醒");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
