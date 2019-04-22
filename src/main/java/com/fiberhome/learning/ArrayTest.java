package com.fiberhome.learning;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array = new int[1000000];
//        Array list = new ArrayList();
        double sum = 0;
        Long time1 = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            sum += array[i % 10];
        }
        Long time2 = System.currentTimeMillis();
        System.out.println("数组求和所花费时间：" + (time2 - time1) + "毫秒");
        Long time3 = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
//            sum += list.get(i % 10);
        }
        Long time4 = System.currentTimeMillis();
        System.out.println("List求和所花费时间：" + (time4 - time3) + "毫秒");
    }
}