package smallfunction.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.某中学有若干学生(学生对象放在一个List中)，每个学生有一个姓名属性(String)、班级名称属性(String)和考试成绩属性(double)
 * 某次考试结束后，每个学生都获得了一个考试成绩。遍历list集合，并把学生对象的属性打印出来。
 * https://blog.csdn.net/yxq8888/article/details/78345343
 */
public class CollectionPractice02 {

    List<Object> list=new ArrayList<>();
    public void test01(){
        list.add(new Student("yangxuan","class1",89.9));
        list.add(new Student("xiangweiwei","class2",79.9));
        list.add(new Student("zhangxiumei","class3",69.9));

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
       CollectionPractice02 collectionPractice02=new CollectionPractice02();
       collectionPractice02.test01();
    }
}

class Student{
//    public String name;//为了安全性，一般不把属性设置为public
////    public String clsss;
////    public double chengji;

    private String name;
    private String clsss;
    private double chengji;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClsss() {
        return clsss;
    }

    public void setClsss(String clsss) {
        this.clsss = clsss;
    }

    public double getChengji() {
        return chengji;
    }

    public void setChengji(double chengji) {
        this.chengji = chengji;
    }


    public Student(String string,String string1,Double d){
        this.name=string;
        this.clsss=string1;
        this.chengji=d;
    }

    public String toString(){
        return "姓名：" + this.name + ", 班级：" + this.clsss + ", 成绩：" + this.chengji;
    }
}

