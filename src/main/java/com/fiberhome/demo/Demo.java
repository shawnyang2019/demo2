package com.fiberhome.demo;

/**
 * @author vv
 * @since 2019/2/13
 */
public class Demo {

    public static void main(String[] args) {
        Person xww = new Person();
        xww.setHeight(30);
        xww.name = "AAA";
        //setName方法的作用是吧输入的向魏伟这个入参值赋值给当前这个对象的也就是xww.name,也就是xww.name="向魏伟"
        xww.setName("向魏伟");
        System.out.println(xww.getName());
        System.out.println(xww.getHeight());
        System.out.println(xww.name);
        long result = xww.multi(1,2);
        System.out.println(result);
        System.out.println(xww.multi(1,2));

        System.out.println("+++");
        System.out.println(xww);

        xww.setGender(true);
        System.out.println(xww.isGender());
        xww.skin();
        xww.getWeight();
    }

}
