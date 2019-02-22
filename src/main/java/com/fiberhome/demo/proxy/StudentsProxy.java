package com.fiberhome.demo.proxy;

/**
 * 静态代理
 */
public class StudentsProxy implements IPerson {

    private Student stu;

    public StudentsProxy(Student stu) {
        this.stu = stu;
    }

    @Override
    public void giveMoney() {
        System.out.println("在执行方法钱，可能需要做的准备工作");
        stu.giveMoney();
    }
}
