package com.fiberhome.runooptraining;

/**
 * ref:url: https://blog.csdn.net/qq_33642117/article/details/51909346
 */
public class ConstructorTest {
    public static void main(String[] args) {

        System.out.println();
//        调用无参构造函数，其实就是等号的左边申明一个Boy对象，等号右边new 一个内存把内存的地址付给b，
//        也可以理解为b指向这个新的对象
        Boy b = new Boy();
//        调用无参构造函数时，系统会自动给对象的属性初始化默认值
        System.out.println("姓名："+b.name+"他的年龄是"+b.age+"他的性别是"+b.gender);
        //       调用有参构造函数，new一个新的对象，同时对对象下面的属性（变量）进行初始化
        Boy b2 = new Boy("jack", 1, "男");
        int a = b2.age+100;
        System.out.println("姓名："+b2.name+"他的年龄是"+a+"他的性别是"+b2.gender);

    }

}

    class Boy {

        String name;
        int age;
        String gender;
        // 构造代码块,给所有对象进行初始化。任何对象都会存在这个属性，而构造有参构造函数时，可以对部分属性进行初始化
        {
            System.out.println("哭。。。");
        }
//2.构造函数与普通函数的区别：
//
//
//（1）. 一般函数是用于定义对象应该具备的功能。而构造函数定义的是，对象在调用功能之前，在建立时，应该具备的一些内容。也就是对象的初始化内容。
//
//（2）. 构造函数是在对象建立时由jvm调用, 给对象初始化。一般函数是对象建立后，当对象调用该功能时才会执行。
//
//（3）. 普通函数可以使用对象多次调用，构造函数就在创建对象时调用。
//
//（4）. 构造函数的函数名要与类名一样，而普通的函数只要符合标识符的命名规则即可。
//
//（5）. 构造函数没有返回值类型。
//
//3.构造函数要注意的细节：
//
//（1）. 当类中没有定义构造函数时，系统会指定给该类加上一个空参数的构造函数。这个是类中默认的构造函数。当类中如果自定义了构造函数，这时默认的构造函数就没有了。
//
//备注：可以通过javap命令验证。
//
//（2）.在一个类中可以定义多个构造函数，以进行不同的初始化。多个构造函数存在于类中，是以重载的形式体现的。
// 因为构造函数的名称都相同。
        Boy() {
            System.out.println("无参构造");
        }

        Boy(String n, int a, String g) {
            name = n;
            age = a;
            gender = g;
            System.out.println("有参构造");
        }

        void run() {
            System.out.println("跑...");
        }

    }



