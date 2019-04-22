package com.fiberhome.runooptraining;

public class QiangZhiZhuanHuan {

    public static void main(String[] args) {
        double i=2.8;
        int b= (int) i;

        System.out.println(b);
        double c=(int)2.8/2.0;
//        int d=(int)2.8/2.0; 这个语句会报类型错误，所以这个语句是先执行强制类型，而不是先执行除法
//        double d=(int)(2.8/2.0);
    }
}
