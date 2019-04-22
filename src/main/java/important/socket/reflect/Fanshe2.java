package important.socket.reflect;

import com.fiberhome.demo.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Fanshe2 {

	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, NoSuchFieldException, InvocationTargetException {

		Person person = new Person();

		Class clazz = person.getClass();
		System.out.println(clazz.getName());
		System.out.println(person.getClass().getName());
		Class clazz1 = Person.class;
		System.out.println(clazz1.getName());
		try {
			Class clazz2 = Class.forName("com.fiberhome.demo.Person");
			Person person3=(Person)clazz2.newInstance();
            Constructor constructor1=clazz2.getConstructor();

            System.out.println(clazz2.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

            Person person1=(Person)clazz.newInstance();
            Person person2=(Person)clazz1.newInstance();

        Constructor constructor=clazz.getConstructor();
        Constructor constructor1=clazz1.getConstructor();

        Field field=clazz.getDeclaredField("weight");
//        修改person1 的属性值
        field.set(person1,90);
        Method method=clazz.getMethod("setHeight", int.class);
        Object a=method.invoke(person);
        System.out.println(a);
    }
}
