package com.fiberhome.demo1;

import com.fiberhome.demo.Person;

/**
 * @author vv
 * @since 2019/2/13
 */
public class Person1 extends Person {

    public void test1(){
        this.skin();
    }

    @Override
    public int add(int a, int b) {
        return  a *b;
    }

    public static void main(String[] args) {
        Person p = new Person1();
        int c = p.add(2,6);
        System.out.println(c);
    }
}
