package important.scanner;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://blog.csdn.net/Megustas_JJC/article/details/68960433 Java中Scanner用法总结
 * https://blog.csdn.net/gao_zhennan/article/details/80562548
 * https://blog.csdn.net/Rex_WUST/article/details/88424076
 * https://blog.csdn.net/weixin_30363263/article/details/79700588
 */
public class NextTest {
	public static void main(String[] args) {
		NextTest nextTest = new NextTest();
		// nextTest.test01();
		nextTest.test02();
		// nextTest.test03();
		// nextTest.test05();
		// nextTest.test06();
	}

	public void test01() {
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个字符串：");
		s1 = sc.nextLine();
		System.out.println("请输入第二个字符串：");
		s2 = sc.next();
		System.out.println("输入的字符串是：" + s1 + " " + s2);
		sc.close();
	}

	public void test02() {
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个字符串：");
		s1 = sc.next();
		// 1、一定要读取到有效字符后才可以结束输入。
		// 2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
		// 3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
		// next() 不能得到带有空格的字符串。如果输入hello world 会输出hello
		// https://blog.csdn.net/weixin_30363263/article/details/79700588
		System.out.println("输入的字符串是：" + s1);
		System.out.println("请输入第二个字符串：");
		s2 = sc.nextLine();// nextLine()自动读取了被next()去掉的Enter作为他的结束符，所以没办法给s2从键盘输入值。
		// 由上面可以看出，nextLine()方法具有以下特点：
		// 1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符；
		// 2、可以获得空白，都会读入，空格等均会被识别；
		System.out.println("输入的字符串是：" + s1 + " " + s2);
		sc.close();
	}

	public void test03() {
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个字符串：");
		s1 = sc.nextLine();
		sc.nextLine();// 后加一个nextLine()语句，将被next()去掉的Enter结束符过滤掉。
		System.out.println("请输入第二个字符串：");
		s2 = sc.nextLine();
		System.out.println("输入的字符串是：" + s1 + " " + s2);
		sc.close();
	}

	public void test04() {
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个字符串：");
		s1 = sc.nextLine();// 也可以直接使用nextLine（）读取所有的内容加Enter结束符
		System.out.println("请输入第二个字符串：");
		s2 = sc.nextLine();
		System.out.println("输入的字符串是：" + s1 + " " + s2);
		sc.close();
	}

	// 使用Scanner 和while 循环输入一组数
	public void test05() {
		Scanner in = new Scanner(System.in);
		// 一个while就是一个测试用例
		while (in.hasNext()) {
			// while(!in.hasNext("#"))//使用该语句可以跳出循环，参考test06
			int n = in.nextInt(); // 该测试用例后续接收的参数个数
			long[] array = new long[n];
			String[] arrayStr = new String[n];
			for (int i = 0; i < n; i++) {
				arrayStr[i] = in.next();
			}
			for (int i = 0; i < n; i++) {
				array[i] = in.nextLong();// 取下一个元素转换成long类型
			}
			System.out.println(Arrays.toString(arrayStr) + " " + Arrays.toString(array));// 这里的toString方法是调用Arrays的类方法，Arrays中对toString进行了重写，所以会输出我们需要内容
			System.out.println(arrayStr.toString() + " " + array.toString());// 这里的toString方法是继承Object类方法，所以输出的是类名加hashcode形式，
			System.out.println(arrayStr + " " + array);// 实际print方法会自动调用toString方法，如果该方法没有被重写的话就是Object类的方法，和上一条实际是一样的
		}
		System.out.println("执行完毕");// 由于while没有停止条件，一直阻塞在输入界面等待继续输入，所以这个语句永远无法执行，解决方法查看test06（）
		// https://blog.csdn.net/gao_zhennan/article/details/80562548
		in.close();
	}

	public void test06() {
		Scanner in = new Scanner(System.in);
		// 一个while就是一个测试用例
		while (!in.hasNext("#")) {
			int n = in.nextInt(); // 该测试用例后续接收的参数个数
			long[] array = new long[n];
			String[] arrayStr = new String[n];
			for (int i = 0; i < n; i++) {
				array[i] = in.nextLong();// 取下一个元素转换成long类型
			}
			for (int i = 0; i < n; i++) {
				arrayStr[i] = in.next();
			}
			System.out.println(Arrays.toString(arrayStr) + " " + Arrays.toString(array));// 这里的toString方法是调用Arrays的类方法，Arrays中对toString进行了重写，所以会输出我们需要内容
			System.out.println(arrayStr.toString() + " " + array.toString());// 这里的toString方法是继承Object类方法，所以输出的是类名加hashcode形式，
			System.out.println(arrayStr + " " + array);// 实际print方法会自动调用toString方法，如果该方法没有被重写的话就是Object类的方法，和上一条实际是一样的
		}
		System.out.println("执行完毕");// 注意结束条件“#”和所要输入的字符串“#”的区别
		in.close();
	}

}
