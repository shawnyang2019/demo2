package com.fiberhome.demo.utiltraining;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author vv
 * @since 2019/2/15
 */
public class UilTraining {
    public static void main(String[] args) {
//        arrayTraining ();
          setTraining();
//        mapTraining();
    }

    /**
     *
     */
    private static void arrayTraining() {
        //新建一个arraylist对象并且把这个对象赋值给al
        ArrayList<java.io.Serializable> al = new ArrayList<java.io.Serializable>();
        //增加数组元素,注意两种add方法的区别，第一种是直接添加元素，索引号从0往后一次排布，带索引号的的
        //add方法是在现有list中加入新的元素，进行第一个带索引的add操作时，索引已经增大了一位，所以第二次
        //带索引的操作时，索引号的范围由9扩大为了10，进行注意两个add索引为什么只能是3和10，能小吗？能大吗？
        al.add(1);
        al.add(1);
        al.add(2);
        al.add(3, "ddd");
        al.add(3);
        al.add(4);
        al.add(5);
        al.add("AAA");
        al.add("BBB");
        al.add("BBB");
        al.add(10, "ddd");
        /*
         * 数组长度test
         */
        System.out.println(al.size());
        int size = al.size();
        System.out.println(size);
        /*
         * 获取list内的某一个元素
         */
        System.out.println(al.get(3));
        System.out.println(al.get(5));
        System.out.println(al.get(6));
        /*
         * 遍历数组,数组取值只能通过遍历来取值，能不能去除特定的某个值？在只知道该值的大致区间的情况下，怎么取？
         */
        /*
         * 遍历方法1--常规方法for循环
         */
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        /*
         * 遍历方法2--增强型for循环，声明元素的类型必须和list里面的类型一致，所以下面语句用int i 会报错，所以要用Object 类型（根据
         * list的元素类型定）注意O要大写，打印出来的也是这个局部变量
         */
        for (Object i : al) {
            System.out.println(i);
        }
        /*
         * 更改list中的某个元素
         */
        al.set(1, 2);
        al.set(2, 3);
        for (Object i : al) {
            System.out.println(i);
        }
        /*
         *数组删除某个元素,注意做remove操作时，进行第一个remove后，索引减少1；索引第二个remove删掉的
         * 是3 而不是ddd, 如果按照元素进行删除的话，会从上往下查找并删除见到的第一个目标元素，如下面删除
         * 的是第一个ddd，如果要删除第二个ddd，可以用索引删除法
         */
        al.remove(2);
        al.remove(3);
        al.remove("ddd");
        al.remove(7);
        System.out.println(al.size());
        for (Object i : al) {
            System.out.println(i);
        }

    }


    private static void setTraining() {
        /*
         *为什么只能new一个hashset 而无法new一个set， add后集合里面的顺序是随机排列的吗？
         */
        Set<java.io.Serializable> set1 = new HashSet<java.io.Serializable>();
        set1.add(1);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        System.out.println(set1);
        System.out.println(set1.size());
        System.out.println(">>>"+set1.toArray());
        Set set2 = new HashSet();
        set2.add("aaa");
        set2.add("aaa");
        set2.add("bbb");
        set2.add("ccc");
        System.out.println(set2);
        System.out.println(set2.size());
        System.out.println(set2.toArray());
        set1.addAll(set2);
        System.out.println(set1);
//        set2.clear();
        System.out.println(set2);
        System.out.println(set1);
        System.out.println(set1.contains("aaa"));
        System.out.println(set1.contains("ddd"));
        System.out.println(set2.contains(""));
        System.out.println(set2.contains("0"));
        if (set1.contains("aaa")) {
            System.out.println("good");
        }
        if (set1.containsAll(set2)) {
            System.out.println("good");
        }
        System.out.println(set2.equals("aaa"));
        System.out.println(set1.hashCode());
        System.out.println(set2.hashCode());
        System.out.println(set1.isEmpty());
        System.out.println(set2.isEmpty());
        System.out.println(set1.iterator());
        System.out.println(set2.iterator());
        set1.remove(1);
        System.out.println(set1);
//        set1.removeAll(set2);
//        System.out.println(set1);
        set1.retainAll(set2);
        System.out.println(set1);
    }

    public static void mapTraining() {
        Map map=new HashMap();
        /**
         * map集合里面的元素是无序的吗？print出来的顺序感觉和put进去的数不一样
         */
        map.put(1,1);
        map.put(1,2);
        map.put(2,1);
        map.put(3,1);
        map.put("a","b");
        map.put("a","c");
        map.put("b","b");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.get("a"));
        System.out.println(map.get("1"));
        System.out.println(map.get(1));
        System.out.println(map.remove("a"));
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map);
        System.out.println(map.size());
//        map.clear();
//        System.out.println(map);
//        System.out.println(map.size());

    }


    public void test3(){
        List<Integer> a = new ArrayList<>();
        a.add(1);
    }
}