package smallfunction.homework;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Scanner;

/**
 * 编写程序，对输入的一个整数，按相反顺序输出该数。例如，输入为 3578，
 */
public class HomeWork08 {
	private void test08() {
		Scanner scanner = new Scanner(System.in);
		//方法1
//		Integer i = scanner.nextInt();
//		String str = String.valueOf(i);
//		StringBuffer stringBuffer = new StringBuffer(str);
//		StringBuffer stringBuffer=new StringBuffer(String.valueOf(scanner.nextInt()));
//		StringBuffer str2 = stringBuffer.reverse();
//		Integer j = Integer.valueOf(str2.toString());
//		System.out.println(j);
//方法2
		char[] c=String.valueOf(scanner.nextInt()).toCharArray();//*******
        String str3="";
		for(int i=c.length-1;i>=0;i--){
		    str3=str3+c[i];
        }
        System.out.println(str3);
	}
	public static void main(String[] args) {

		HomeWork08 homeWork08 = new HomeWork08();
		homeWork08.test08();
	}
}
