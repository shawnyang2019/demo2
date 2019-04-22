package smallfunction.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 对字符串中的字符进行自然顺序排序
 * java中char类型占两个字节，byte类型占一个字节
 */
public class StringPractise02 {
     public void test(){
         Scanner scanner=new Scanner(System.in);
         char[] c=scanner.nextLine().toCharArray();
         Arrays.sort(c);//注意返回是void ，只是把char里面的字符进行了排序
         String str=String.copyValueOf(c);

         System.out.println(str);
     }

    public static void main(String[] args) {
        StringPractise02 stringPractise02 =new StringPractise02();
        stringPractise02.test();
    }
}
