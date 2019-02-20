package com.fiberhome.runooptraining;

class Animal {
    void eat() {
//        打印出"animal:aat"
        System.out.println("animal : eat");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("dog : eat");
    }
    void eatTest() {
        this.eat();   // this 调用自己所在类的方法，
        // 1 自己所在的类是Dog类，所以调用Dog类的方法
//         2 调用哪个方法：由于是this.eat(),所以调用的是eat方法，所以打印出来的是"dog:eat"
        super.eat();  // super 调用父类方法
//        1 根据继承关系，父类是Animal类
//        2 同上调用的也是eat方法
    }
}
class SetFunctionTest{
         int i;
         String string;

    public int getI() {
        return i;
    }

    public void setI(int i) {
//        调用自己所在类的成员变量
        this.i = i;

    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
/**
 * 主类的类名必须要与class 的文件名相同
 */
public class SuperThisTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Dog d = new Dog();
        d.eatTest();
        SetFunctionTest setFunctionTest=new SetFunctionTest();
        setFunctionTest.setI(110);
//        System.out.println(setFunctionTest.setI(110));
//        打印出set方法报错的原因是set方法没有返回值
//        返回给主方法，所以这里会报错
//        get语句有返回值，所以不会报错
        System.out.println(setFunctionTest.getI());
    }
}



