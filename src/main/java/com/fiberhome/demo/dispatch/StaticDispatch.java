package com.fiberhome.demo.dispatch;

/**
 * 根据静态类型来定位方法执行版本的动作叫静态分派，比如重载
 */
public class StaticDispatch {

    static abstract class Human{

    }

    static class Man extends Human {

    }

    static class Woman extends Human {

    }

    public void sayHello(Human guy){
        System.out.println("hello, guy!");
    }

    public void sayHello(Man guy){
        System.out.println("hello, gentleman!");
    }

    public void sayHello(Woman guy){
        System.out.println("hello, lady!");
    }

    public static void main(String[] args) {
        Human a = new Man();
        Human woman = new Woman();
        StaticDispatch sd = new StaticDispatch();
        sd.sayHello(a);
        sd.sayHello(woman);
    }

}
