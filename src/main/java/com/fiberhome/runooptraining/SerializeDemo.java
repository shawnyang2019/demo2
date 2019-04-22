package com.fiberhome.runooptraining;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 一个对象可以被表示为一个字节序列，该字节序列包括该对象的数据、
 * 有关对象的类型的信息和存储在对象中数据的类型。
 * 需要序列化的类需要实现Serializable接口，
 */
public class SerializeDemo {
    public static void main(String [] args)
    {
        Employee2 e = new Employee2();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;
        try
        {
            FileOutputStream fileOut =
                    new FileOutputStream("employee.txt");
            //由于输出的是字节流，所以文件中显示的是乱码
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in employee.txt");
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }
}

/**
 * 需要序列化的对象所属的类需要实现Serializable接口，如下所示，请注意，不再需要序列化的对象所在的类
 * 例如要对一串字符进行序列化，那么就是对字符串所属的类String实现序列化接口，而不是对引用该String对象所在的类
 * 序列化就是使需要存储起来或者传输到网络给另外一台计算机使用的对象由字符流转变成字节流，至于输入到文件中，只是我们为了查看其效果而进行了额外
 * 操作，
 */
class Employee2 implements java.io.Serializable
{
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
}
