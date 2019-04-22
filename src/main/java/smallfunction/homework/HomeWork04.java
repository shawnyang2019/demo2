package smallfunction.homework;

import java.util.Scanner;

/**
 * 输入 3 个正数，判断能否构成一个三角形。
 */
public class HomeWork04 {

	/**
	 * https://blog.csdn.net/zyr4712008/article/details/20697573 关于局部变量在循环里的生存法则
	 * 在循环体和条件语句中定义的变量只能在循环体和条件语句中使用
	 */
	//
	private void test04() {
		Scanner scanner = new Scanner(System.in);
		// if (scanner.nextDouble() > 0) {//这表示要从键盘输入一次
		// d1 = scanner.nextDouble();//这表示又要从键盘输入一次，不符合我们的设想，用下面的方式
		Double d1 = scanner.nextDouble();
		Double d2 = scanner.nextDouble();
		Double d3 = scanner.nextDouble();

		if (d1 > 0 && d2 > 0 & d2 > 0) {
			if ((d1 + d2) > d3 && (d1 + d3) > d2 && (d2 + d3) > d1) {
				System.out.println("能够构成一个三角形");
			} else
				System.out.println("不能构成一个三角形");
		} else
			System.out.println("输入的是必须都是正数");
	}

	public static void main(String[] args) {

		HomeWork04 homeWork04 = new HomeWork04();
		homeWork04.test04();
	}
}
