package smallfunction.homework;

import java.util.Scanner;

/**
 * 编写程序求一元二次方程的根。
 */
public class HomeWork02 {

	public void test02() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入2次方的系数");
		int a = scanner.nextInt();
		System.out.println("输入1次方的系数");
		int b = scanner.nextInt();
		System.out.println("输入常数");
		int c = scanner.nextInt();

		if ((b * b - 4 * a * c) > 0 && (b * b - 4 * a * c) > 0) {
			Double d1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			Double d2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		} else
			System.out.println("方程无解");
	}

	public static void main(String[] args) {

		HomeWork02 homeWork02 = new HomeWork02();
		homeWork02.test02();
	}
}
