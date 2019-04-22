package com.fiberhome.demo1;

import com.fiberhome.demo.Person;
import com.sun.corba.se.impl.resolver.FileResolverImpl;
import com.sun.xml.internal.fastinfoset.stax.factory.StAXOutputFactory;
import sun.security.util.Length;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;

/**
 * @author vv
 * @since 2019/2/13
 */
public class Person1 extends Person {

    public void test1(){
        this.skin();
    }

    @Override
    public int add(int a, int b) {
        return  a *b;
    }

    public static void main(String[] args) {
        Person p = new Person1();
        int c = p.add(2,6);
        //sout
        System.out.println(c);
        //soutp
        System.out.println("args = [" + args + "]");
        //soutm
        System.out.println("TemplatesTest.main");
        //souv
        System.out.println("p = " + p);
        
        
        String[] str=new String[]{"yangxuan","xiangweiwei","zhangxiumei"};
        //fori
        for (int i = 0; i <str.length; i++) {
            System.out.println(str[i]);
            
        }
        //iter
        for (String s : str) {
            System.out.println(s);
        }
        //itar

        for (int i = 0; i < str.length; i++) {
            String s = str[i];

        }


        List list=new ArrayList<Integer>();
        list.add(111);
        list.add(222);
        list.add(333);
        //list.for
        for (Object o : list) {
            System.out.println(o);
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //list.forr  倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(i);
        }


    }
}
