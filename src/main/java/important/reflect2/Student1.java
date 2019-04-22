package important.reflect2;

import com.fiberhome.demo.proxy.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Student1 {

	private int age;
	private String name;

	public Student1(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Student1() {
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println(age);
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) throws Exception {
		Class<?> class1 = Class.forName("important.reflect2.Student1");
		Field[] fields = class1.getDeclaredFields();// 得到类本身的所欲属性
		Method[] methods = class1.getDeclaredMethods(); // 得到类本身的所有方法
		Constructor[] constructors = class1.getConstructors();// 得到类本身的所有构造函数
		for (Field f : fields) {
			System.out.println("---------------------------属性：" + f);
		}
		System.out.println("------------------分割线--------------------");
		for (Method m : methods) {
			System.out.println("---------------------------方法：" + m);
		}
		System.out.println("------------------分割线--------------------");
		for (Constructor c : constructors) {
			System.out.println("---------------------------构造函数：" + c);
		}
		// 调用无参方法
		// 得到Student1类的方法,第一个参数到最后一个参数都是方法对应的参数类型
		Method method = class1.getMethod("reflect1");
		// 调用方法（第一个参数为对象，第二个参数到最后一个参数为方法属性值），由于调用的是无参方法，所以这里的除了第一个参数为，后面的参数都省略了
		method.invoke(class1.newInstance());
		// 调用有参数的方法，注意参数的表达形式，这里需要的是通过反射得到的方法的入参类型
		// 得到某个类的方法
		Method m2 = class1.getMethod("learn", String.class, String.class);
		// 调用方法（第一个参数为对象，第二个参数到最后一个参数为方法属性值），调用的是有参函数,注意参数的表达形式，这里需要的是通过反射得到的方法的入参类型
		m2.invoke(class1.newInstance(), "张三", "商务英语");
		// 调用方法需要两部，第一步通过反射以及方法名称和入参类型得到方法对象；第二部调用方法对象的invoke方法，第一入参是哪个对象下的这个方法，第二入参是实参传递给形参的值
		Field field = class1.getDeclaredField("age");
		field.setAccessible(true);
		Method m3 = class1.getMethod("setAge", int.class);
        Student1 student1=(Student1)class1.newInstance();
		m3.invoke(student1,100);
        System.out.println(student1.getAge());

	}

	public void learn(String name, String bookname) {
		System.out.println(name + "学习了" + bookname);
	}

	public void reflect1() {
		System.out.println("-----------------调用了这个方法-----------");
	}
}
