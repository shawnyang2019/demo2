package smallfunction.homework;

import java.util.Scanner;

import static java.lang.Character.isLowerCase;

/**
 * 编写程序，输入一个字符，判断它是否为小写字母，如果是，将它转换成大
 */
public class HomeWork03 {

	private void test03() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("shuruyigezhifu");
		Character c = scanner.next().charAt(0);
		if (isLowerCase(c)) {
			c = Character.toUpperCase(c);
		}
		System.out.println(c);
	}
    public static void main(String[] args) {

        HomeWork03 homeWork03 = new HomeWork03();
        homeWork03.test03();
    }
}
