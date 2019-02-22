package com.fiberhome.demo.reflect;

import com.fiberhome.demo.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 反射
 */
public class ReflectDemo {

    public static void main(String[] args) throws Exception {
        Class a = ReflectDemo.class;

        // 加载指定类
        Class<?> personClazz = Class.forName("com.fiberhome.demo.Person");
        System.out.println(personClazz.getName());

        //使用Class对象创建该类对象：
        Person p1 = (Person) personClazz.newInstance();
        p1.setAge(120);

        // 构造方法
        Constructor<?>[] cs = personClazz.getConstructors();
        System.out.println(cs.length);

        // 反射给private属性复制
        Field heightField = personClazz.getDeclaredField("height");
        heightField.setAccessible(true);
        heightField.set(p1, 180);
        System.out.println(p1.getHeight());
    }
}
