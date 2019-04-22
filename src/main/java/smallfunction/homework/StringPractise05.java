package smallfunction.homework;

import java.util.Scanner;

/**
* 下面是回文的一种方法test01方法
* 另外两种方法在下面是网址中进行参考：
 * https://blog.csdn.net/qq_37067955/article/details/81903890    test02方法
 * https://blog.csdn.net/weixin_43147391/article/details/82463793
 *
 */
public class StringPractise05 {

    //有一种数叫回文数，正读和反读都一样，如12321便是一个回文数。编写一个程序，从命令行得到一个整数，判断该数是不是回文数。
    public boolean test01(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个整数");
        String str=scanner.next();
        StringBuffer stringBuffer=new StringBuffer(str);
        String str2=stringBuffer.reverse().toString();
        System.out.println(str.equals(str2.trim()));
        return str.equals(str2.trim());
    }
    public boolean test02(){
        System.out.println("请输入一个数……");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        //      将数字转化成字符串
        String str = String.valueOf(num);
        boolean b = true;

//      从两端向中间遍历字符串，并进行回文数条件判断
        for(int i = 0,j = str.length()-1;i<str.length()/2 ;i++,j--){
            if(str.charAt(i) != str.charAt(j) ){
                b = false;
                break;
            }
        }
        System.out.println(b);
        return b;
    }
    public boolean test03() {
        System.out.println("请输入test03的数……");
        Scanner in = new Scanner(System.in);
        String a = in.next();
        boolean flag = true;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(a.length() - i - 1)) {
                flag = true;
            } else {
                flag = false;
            }
        }
        System.out.println(flag);
        System.out.println();
        return flag;
    }
    public static void main(String[] args) {
        StringPractise05 stringPercise05 = new StringPractise05();
        stringPercise05.test01();
        stringPercise05.test02();
        stringPercise05.test03();
    }
}
