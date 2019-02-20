package com.fiberhome.runooptraining;

/**
 *  ref：http://www.runoob.com/java/java-modifier-types.html，
 *  静态变量：
 * static 关键字用来声明独立于对象的静态变量，无论一个类实例化
 * 多少对象，它的静态变量只有一份拷贝。 静态变量也被称为类变量。局部变量不能被声明为 static 变量。
 *
 * 静态方法：
 * static 关键字用来声明独立于对象的静态方法。静态方法不能使用类的非静态变量。静态方法从参数列表
 * 得到数据，然后计算这些数据。
 *
 * final 变量：
 * final 表示"最后的、最终的"含义，变量一旦赋值后，不能被重新赋值。被 final 修饰的实例变量必须显式指定初始值。
 * final 修饰符通常和 static 修饰符一起使用来创建类常量。
 */
public class StaticAndConstructorTest {
//    构建private 的静态属性
    private static int numInstances = 0;
//    构建protected 的静态函数
    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    public static void setNumInstances(int numInstances) {
        StaticAndConstructorTest.numInstances = numInstances;
    }

    //  构造函数，对参数进行初始化,构造方法用于初始化一个实例对象，所以static修饰是没有任何意义的;
// 多个线程不会同时创建内存地址相同的同一个对象，所以synchronized修饰没有意义;
// 构造方法不能被子类继承，所以final和abstract修饰没有意义。 构造方法默认没有返回值
    StaticAndConstructorTest() {
        StaticAndConstructorTest.addInstance();
//        this.addInstance();
    }

    public static void main(String[] arguments) {
//        调用静态函数打印出来，特别注意此处是用类名.方法名对静态函数进行调用（首字母是大写的），由于是静态的
//        不涉及到对象，所以并没有new对象这一说，这里要特别注意
        System.out.println("Starting with " +
                StaticAndConstructorTest.getCount() + " instances");
        for (int i = 0; i < 500; ++i){
//            注意下面对new StaticAndConstructorTest()进行创建的过程，这里实际上是
//           StaticAndConstructorTest StaticAndConstructorTest=new StaticAndConstructorTest()
//            这里省略了前半部分，并且要知道new一个对象其实也是对构造函数的调用过程，一般默认的构造
//            函数StaticAndConstructorTest(){} 纯粹的只是new 没有什么额外的其他操作但是如果是自定义的
//            的构造函数，会有其他的一些诸如初始化的操作，需要在new的同时不要忘记了同时也是调用，需要执行
//            该方法的方法体，如下列所示
            new StaticAndConstructorTest();
        }
        System.out.println("Created " +
                StaticAndConstructorTest.getCount() + " instances");
    }
}
