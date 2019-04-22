package smallfunction.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Java排序方法sort的使用详解
public class CollectionsPractice {

    //对数组排序
    public void test01(){
        int[] arrays={5,3,8,6,4};
        Arrays.sort(arrays);
        for(Integer a:arrays){
            System.out.println("升序排列后的数组"+a);
        }

    }
    public void test02(){
        List<Integer> list=new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(6);
        list.add(4);
        Collections.sort(list);
        for(Integer i:list){
            System.out.println("升序排列后的数组"+i);
        }
    }
    public void test03(){
        System.out.println("sort的原始方法只能升序排列，如果要降序排列，则需要重写sort方法（内部匿名类）");
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(55);
        list.add(9);
        list.add(0);
        list.add(2);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            //
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for(Integer i:list){
            System.out.println("降序排列后的数组"+i);
        }
    }

    public static void main(String[] args) {
        CollectionsPractice collectionsPractice=new CollectionsPractice();
        collectionsPractice.test01();
        System.out.println("-------------------------------");
        collectionsPractice.test02();
        System.out.println("-------------------------------");
        collectionsPractice.test03();

    }
}
