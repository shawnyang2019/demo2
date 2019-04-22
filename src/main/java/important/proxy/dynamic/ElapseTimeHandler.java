package important.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import important.proxy.Student;

public class ElapseTimeHandler implements InvocationHandler {

	private Student target;

	public ElapseTimeHandler(Student target) {
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
