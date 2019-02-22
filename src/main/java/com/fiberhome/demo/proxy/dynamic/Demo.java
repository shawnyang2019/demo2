package com.fiberhome.demo.proxy.dynamic;

import com.fiberhome.demo.proxy.IPerson;
import com.fiberhome.demo.proxy.Student;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理， 代理对象是动态生成出来的
 */
public class Demo {

    public static void main(String[] args) {
        Student s = new Student("w");
        InvocationHandler handler = new ElapseTimeHandler(s);
        IPerson person = (IPerson) Proxy.newProxyInstance(Demo.class.getClassLoader(), new Class[]{IPerson.class}, handler);
        person.giveMoney();
    }
}
