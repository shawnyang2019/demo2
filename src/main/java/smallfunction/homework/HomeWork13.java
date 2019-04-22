package smallfunction.homework;

import java.util.Scanner;

/**
 * 验证“鬼谷猜想”：对任意自然数，若是奇数，就对它乘以 3 再加 1；若是
 *
 * 偶数，就对它除以 2，这样得到一个新数，再按上述计算规则进行计算，一直进
 *
 * 行下去，最终必然得到 1。
 */
public class HomeWork13 {

	public void test13() {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int num=0;
		for (;;) {
		    num++;
            System.out.println("生成的数为"+i);
		    if(i==1) break;
			if (i % 2 == 1) {
				i = i * 3 + 1;
				continue;
			}
			if(i % 2 == 0) {
				i = i / 2;
				continue;
			}

		}
        System.out.println("循环的次数为"+num);
	}

    public static void main(String[] args) {
        HomeWork13 homeWork13 = new HomeWork13();
        homeWork13.test13();
    }
}
