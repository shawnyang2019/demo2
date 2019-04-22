package important.threads;

import com.fiberhome.demo.Person;

public class RawWaitDemo1 {
	public static void main(String[] args) {
		Person p = new Person();
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("线程已经被阻塞");
					Thread.sleep(3000);
					System.out.println("对象p上的所有线程已经被唤醒");
					synchronized (p) {
						p.notifyAll();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});
		t.start();

		synchronized (p) {
			try {
				System.out.println("主线程阻塞在对象p上");
				p.wait(10000);
				System.out.println("主线程在低于wait的时间上被唤醒");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
