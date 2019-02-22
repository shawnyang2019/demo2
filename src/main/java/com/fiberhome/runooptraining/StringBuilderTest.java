package com.fiberhome.runooptraining;

public class StringBuilderTest {
    public static void main(String args[]){
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        StringBuilder sBuilder = new StringBuilder("菜鸟教程官网2：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuilder.append(".com");
        System.out.println(sBuffer);
        System.out.println(sBuilder);
        System.out.println(sBuilder.reverse());
        System.out.println( sBuffer.delete(3,6));
//        sBuffer.insert(4,3);
    }
}
