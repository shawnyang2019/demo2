package important.socket.proxy.dynamic;


import com.fiberhome.demo.proxy.IPerson;
import important.socket.proxy.Student;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Demo2 {
    public static void main(String[] args) {


    Student p=new Student("yangxuan");

    Class clazz=Demo2.class;

    ClassLoader classLoader=clazz.getClassLoader();

//    Class[] interfaces= p.getClass().getInterfaces();替代语句
    Class[] interfaces= Student.class.getInterfaces();

    InvocationHandler invocationHandler=new ElapseTimeHandler(p);

    IPerson person=(IPerson)Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);

    person.giveMoney();

    }

}
