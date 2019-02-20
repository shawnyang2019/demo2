package com.fiberhome.runooptraining;



import java.util.ArrayList;
import java.util.List;

/**
 * reference url:https://blog.csdn.net/johnson_moon/article/details/54094655
 * Java编程中，当对象作为参数传递给方法时候，是按引用传递的，但是有的人会说这实质上是按值传递的。
 * 其实两者说的都不错，只是理解的方式不一样罢了，二者的原理其实是一样的。
 * 在Java中，引用类型的变量非常类似于C/C++的指针。引用类型指向一个对象，指向对象的变量是引用变量。
 * 这些变量在声明时被指定为一个特定的类型，比如 Employee、Puppy 等。变量一旦声明后，类型就不能被改变了。
 * 对象、数组都是引用数据类型。所有引用类型的默认值都是null。一个引用变量可以用来引用任何与之兼容的类型。
 * 例子：Site site = new Site("Runoob")。
 */

public class ValuePassReferencePass {
    public static void main(String... args) {
        // 集合对象，列表[a, b, c]
        List<String> testParam = new ArrayList<String>();
//        java.util.list 包里面已经存在的add 方法，list 赋值为[a,b,c],并打印出来
        testParam.add("a");
        testParam.add("b");
        testParam.add("c");
        System.out.println("Old: " + testParam.toString() + "\r\n");

        // 引用(地址)传值，把地址有实参传递给了形参，并直接修改testParam指向对象的值
        change(testParam);
        System.out.println("Change1: " + testParam.toString() + "\r\n");

        testParam.add("a");

        // 引用(地址)传值，把地址有实参传递给了形参,修改指向对象之后再将地址返回
        testParam = change2(testParam);
        System.out.println("Change2: " + testParam.toString() + "\r\n");

        // 集合对象变为[b, c, d, e]
        testParam.add("d");
        testParam.add("e");

        // 引用(地址)传值，方法内部new新集合对象并将地址赋给方法局部参数，
        // 并不改变testParam的值，testParam仍然指向原地址
        sort(testParam);
        System.out.println("sort1: " + testParam.toString() + "\r\n");
        // 引用(地址)传值，方法内部new新集合对象并将地址赋给方法局部参数，
        // 并将新地址返回，再赋值给testParam，因此testParam指向的对象发生改变
        testParam = sort2(testParam);
        System.out.println("sort2: " + testParam.toString() + "\r\n");
    }

//    地址由实参传给了形参，change函数改变形参所引用的对象的，有[a,b,c,d] 改为[b,c,d]
    public static void change(List<String> param) {
        if (param.contains("a"))
            param.remove("a");
    }

    public static List<String> change2(List<String> param) {
        if (param.contains("a"))
            param.remove("a");
        return param;
    }

//    引用（地址）传值，有实参testparam传递给了param，他们指向同一对象，但是由于该方法new 了新的对象，最后把
//    新的引用类型变量newparam 应用传值给了param， 此时param和newparam指向同一新的对象，而testparameter还是
//    指向原先的对象
//    总结：想要在被调用方法中不修改参数指向的对象，可以通过new一个新的对象来实现
    public static void sort(List<String> param) {
        List<String> newParam = new ArrayList<String>();
        for (int i = param.size() - 1; i >= 0; i--) {
            newParam.add(param.get(i));
        }
        param = newParam;
    }
    //    引用（地址）传值，有实参testparam传递给了param，他们指向同一对象，但是由于该方法new 了新的对象，最后返回
    // newparameter 的引用（地址）给了testparam，此时testparamete和newparam指向同一新的对象，而param还是
//    指向原先的对象
//    如果想要new一个新的对象并使main方法该对象变成这个新的对象，就要将其作为返回值返回并赋值给旧对象变量了。
    public static List<String> sort2(List<String> param) {
        List<String> newParam = new ArrayList<String>();
        for (int i = param.size() - 1; i >= 0; i--) {
            newParam.add(param.get(i));
        }
        return newParam;
    }
}
