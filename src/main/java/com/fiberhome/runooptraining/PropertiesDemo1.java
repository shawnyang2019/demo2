package com.fiberhome.runooptraining;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;


/*
 * 这里的集合必须是Properties
 * public void load(Reader reader) : 把文件中的数据读取到集合中
 * public void store(Writer writer, String comments) ： 把集合中的数据存储到文件
 *
 * 作用实现游戏进度的保存于加载
 */

/**
 * 1 new 1个Properties对象
 * 2 调用上面类的中的setProperty函数赋值
 * 3
 */
public class PropertiesDemo1 {
    public static void main(String[] args) throws IOException {
        // myLoad();  // 将数据加载到集合中，load加载
        myStore();    // 将集合中的数据存储到文件中， store写入
    }

    private static void myStore() throws IOException {
        // 创建集合对象,setProperty ( String key, String value) ，调用 Hashtable 的方法 put 。
        // 只不过是将put(k KEY,V value) 通过显式的指定为String 类型保证了只可以接受String类型的参数，
        // 在实际开发时，我们也经常需要使用这种方法，来包装一个父类的方法。
        Properties prop = new Properties();
        prop.load(new FileInputStream("D:\\oschina\\demo\\src\\main\\resources\\jdbc.properties"));
        String username = prop.getProperty("username");
        System.out.println(username);


        prop.setProperty("jav", "1");
        prop.setProperty("c++", "2");
        prop.setProperty("jvm", "3");
        System.out.println(prop.getProperty("jav"));
        System.out.println(prop.getProperty("c++"));
        System.out.println(prop.getProperty("c++"));

        // public void store(Writer writer, String comments) ： 把集合中的数据存储到文件
        Writer w = new FileWriter("name.txt");
        prop.store(w, null);
        w.close();//这个语句有什么作用？ 删除write流
    }

    private static void myLoad() throws IOException {
        // 创建集合对象
        Properties prop = new Properties();

        // public void load(Reader reader) : 把文件中的数据读取到集合中
        // 而且这个文件必须是键值对的形式!此处有格式要求
        Reader r = new FileReader("a.txt");
        prop.load(r);
        r.close();

        System.out.println(prop);
    }
}

