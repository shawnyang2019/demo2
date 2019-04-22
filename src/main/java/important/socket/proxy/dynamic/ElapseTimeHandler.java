package important.socket.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import important.socket.proxy.Student;

public class ElapseTimeHandler implements InvocationHandler {

	private Student target;

	public ElapseTimeHandler(Student target) {
		// 要习惯这样的写法，this表示当前类的对象，this.target能够这样表示是因为之前声明，target
		// 是当前类的一个属性，虽然target也是一个对象
		// 所以要习惯这样的写法，多多练习，目前的写法和getter and setter 其实非常类似
		this.target = target;
	}

	/**
	 *
	 * @param proxy 代理对象
	 * @param method 执行的方法
	 * @param args 方法的入参
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long begin = System.currentTimeMillis();
		// 调用真实对象的对应方法
		Object result = method.invoke(target, args);
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
		return result;
	}
}
