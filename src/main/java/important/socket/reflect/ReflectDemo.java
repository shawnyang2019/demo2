package important.socket.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.fiberhome.demo.Person;

/**
 * 反射
 */
public class ReflectDemo {

	static class Service {

		public int say() {
			System.out.println("计算数据。。。");
			return 1;
		}

		public static void sayHello() {
			System.out.println("调用静态方法");
		}
	}

	public static void test() throws Exception {
		// 通过类名获取class类
		Class a = Person.class;

		// 通过地址获取class类
		Class<?> personClazz = Class.forName("com.fiberhome.demo.Person");
		System.out.println(personClazz.getName());

		// 使用Class对象创建该类对象，Class替代了Person 类的功能
		// 通过反射创建实例对象
		Person p1 = (Person) personClazz.newInstance();
		// 通过反射方式获取构造方法(实际上也是对象）
		Constructor constructor = personClazz.getConstructor();
		// 通过反射方式获取属性,实际上是获取属性对象，并改变修饰符类型,通过属性名得到属性对象
		Field field = personClazz.getDeclaredField("weight");
		field.setAccessible(true);
		// 修改对象的属性值，如下所示修改p1对象的weight 值
		field.set(p1, 80);
		// 通过反射获取方法，也就是获取方法对象,注意方法名要用双引号
		Method method = personClazz.getMethod("getAge");

		Person p2 = (Person) personClazz.newInstance();
		p2.setAge(120);
		System.out.println(p2.getAge());

		// 构造方法
		Constructor<?>[] cs = personClazz.getConstructors();
		System.out.println(cs.length);

		// 通过反射得到对象的属性，并更换属性值
		Field heightField = personClazz.getDeclaredField("height");
		heightField.setAccessible(true);
		heightField.set(p1, 180);
		System.out.println(p1.getHeight());
	}

	public static void main(String[] args) throws Exception {
		Service objService = new Service();
		Class clazz = Service.class;
		Method method = clazz.getMethod("say");
		// 通过反射调用方法对象后，调用这个方法
		Object a = method.invoke(objService);
		System.out.println(a);

		Method helloMethod = clazz.getMethod("sayHello");
		helloMethod.invoke(null);

		ReflectDemo reflectDemo = new ReflectDemo();
		reflectDemo.test();

		// Class reflectDemeClazz=ReflectDemo.class;
		// Method method1=reflectDemeClazz.getMethod("test");
		// 以上语句为有待研究 invoke方法

	}
}
