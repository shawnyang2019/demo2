package important.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Java 的控制台输入由 System.in 完成。
 *
 * 为了获得一个绑定到控制台的字符流，你可以把 System.in 包装在一个 BufferedReader 对象中来创建一个字符流。
 *
 * 下面是创建 BufferedReader 的基本语法：
 *
 * BufferedReader 对象创建后，我们便可以使用 read() 方法从控制台读取一个字符，或者用 readLine() 方法读取一个字符串。
 */
public class BufferedRead {

    public static void main(String[] args) throws IOException {
        //注意是不是BufferedReader 也不是BufferReader
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        //bufferedReader.read()返回值是int型 所以要把返回值强制装换为char型
        char c;
        do {
            c=(char)bufferedReader.read();
            System.out.println(c);
        }while(c!='q');
        String d;
        System.out.println("Enter lines of text.");
        do{
            d=bufferedReader.readLine();
            System.out.println(d);
//            注意字符的单引号和字符串的双引号
        } while(!d.equals("yangxuan"));
//            char c=(char)bufferedReader.read();
//            System.out.println(c);
//        }while(c!='q');
//        为什么这句代码不行，需要好好想想

          bufferedReader.close();

    }

}
