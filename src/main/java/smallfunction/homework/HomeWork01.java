package smallfunction.homework;

import com.fiberhome.demo.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class HomeWork01 {

	int[] t = new int[4];

	public void sequence() {
		System.out.println("请输入四个数,并按照从大到小排序");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			t[i] = scanner.nextInt();
			System.out.println(t[i]);
		}
		System.out.println("四个数已经输入完毕,结果如下");
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
		/**
		 * 数组的输出 for语句,按照下面的代码进行排序，输入1,2,3,4,结果是2,1,3,4，原因是for语句中j=i+1，是一个初始条件
		 * 不会参与后续循环，所以在整个循环中，j的值一直都是1，从而导致错误的结果
		 */
		// System.out.println("下面进行排序操作");
		// int i = 0;
		// for (int j = i + 1; i < t.length - 1; i++) {
		// if (t[j] > t[i]) {
		// int temp = t[i];
		// t[i] = t[j];
		// t[j] = temp;
		// }
		// }
		// System.out.println("排序后的结果如下");
		// for (int k = 0; k < t.length; k++) {
		// System.out.println(t[k]);
		// }

		/**
		 * 数组的输出 for语句,按照下面的代码进行排序，输入1,2,3,4,结果是2,3,4,1，原因是for语句中j=i+1，是一个初始条件
		 * 不会参与后续循环，后续加上j=i+1参与循环，但是只是进行了一次遍历，并没有进行完全遍历
		 */
		// System.out.println("下面进行排序操作");
		// int i = 0;
		// for (int j = i + 1; i < t.length - 1; i++,j=i+1) {
		// if (t[j] > t[i]) {
		// int temp = t[i];
		// t[i] = t[j];
		// t[j] = temp;
		// }
		// }
		// System.out.println("排序后的结果如下");
		// for (int k = 0; k < t.length; k++) {
		// System.out.println(t[k]);
		// }
		// }
		/**
		 * 数组的输出 for语句,按照下面的代码进行排序，输入1,2,3,4,结果是4,3,2,1
		 */
		System.out.println("下面进行排序操作");
		for (int i = 0; i < t.length - 1; i++) {
			for (int j = i + 1; j < t.length; j++) {
				if (t[j] > t[i]) {
					int temp = t[i];
					t[i] = t[j];
					t[j] = temp;
				}
			}
		}
		System.out.println("排序后的结果如下");
		for (int i= 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
		scanner.close();
	}

	public static void main(String[] args) {

		HomeWork01 homeWork01 = new HomeWork01();
		homeWork01.sequence();
	}
}

