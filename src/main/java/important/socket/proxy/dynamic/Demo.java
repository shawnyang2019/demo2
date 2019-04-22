package important.socket.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.fiberhome.demo.proxy.IPerson;
import important.socket.proxy.Student;

/**
 * 动态代理， 代理对象是动态生成出来的 https://blog.csdn.net/luanlouis/article/details/24589193
 * 经典
 */
public class Demo {

	public static void main(String[] args) {
		// student类是实现IPerson接口的
		Student s = new Student("w");
		// 1 通过反射得到demo类的class类
		Class demoClass = Demo.class;
		// 2 得到class类的类加载器
		ClassLoader classLoader = demoClass.getClassLoader();
		// 3 得到demo类的所有实现接口
//		Class[] interfaces = demoClass.getInterfaces();这个表达式是错的，这个入参是代理类所实现的接口列表
		Class[] interfaces = Student.class.getInterfaces();
		// 4 设置一个来自代理传过来的方法调用请求处理器，处理所有的代理对象上的方法调用
		InvocationHandler handler = new ElapseTimeHandler(s);
		// 5 创建代理对象(类加载器，所要调用的接口类，调用代理handler）
		 IPerson person=(IPerson)Proxy.newProxyInstance(classLoader,interfaces,handler);
		// newProxyInstance里面的参数，代理类的类加载器，
//		IPerson person = (IPerson) Proxy.newProxyInstance(DynamicProxy.class.getClassLoader(), new Class[]{IPerson.class},
//				handler);
		// 通过代理对象可以调用目标方法,通过invoke方法，invoke方法在handler里面，giveMoney()是目标类中的方法，通过代理类进行调用，通过了invoke（）方法
		person.giveMoney();
	}
}
