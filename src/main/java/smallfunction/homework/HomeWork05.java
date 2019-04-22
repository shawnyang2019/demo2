package smallfunction.homework;

import java.util.Scanner;

/**
 * 编写程序，对输入的年、月、日，给出该天是该年的第多少天？
 */
public class HomeWork05 {
    // 方法调用必须在另一个方法里面，不允许直接在类中调用方法
    // Scanner scanner=New Scanner(System.in);
    int day = 0;

    private void test05() {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        if (y > 0 && m > 0 && m < 13 && d > 0 && d < 32) {
            switch (m) {// 思考为什么要倒序求和
                case 12:
                    day += 30;
                case 11:
                    day += 31;
                case 10:
                    day += 30;
                case 9:
                    day += 31;
                case 8:
                    day += 31;
                case 7:
                    day += 30;
                case 6:
                    day += 31;
                case 5:
                    day += 30;
                case 4:
                    day += 31;
                case 3:
                    if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                        day += 29;
                    } else
                        day += 28;
                case 2:
                    day += 31;
                case 1:
                    day += d;
            }
            System.out.println("当前是第" + day + "天");
        }
    else System.out.println("输入的数据有误");
}

	public static void main(String[] args) {

        HomeWork05 homeWork05 = new HomeWork05();
        homeWork05.test05();
    }
}
