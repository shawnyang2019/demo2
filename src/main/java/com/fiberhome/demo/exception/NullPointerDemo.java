package com.fiberhome.demo.exception;

import com.fiberhome.demo.Person;

public class NullPointerDemo {

    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(30);

        Person p1 = null;
        p1.setAge(30);
    }
}
