package smallfunction.homework;

        import java.util.Scanner;

public class HomeWork07 {

    private void test07() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt(/**/);
        if (i <= 100 && i >= 0) {
            if (i >= 90 && i <= 100) {
                System.out.println("合格");
            } else if (i >= 80 && i < 90) {
                System.out.println("lianghao");
            } else if (i >= 70 && i < 80) {
                System.out.println("zhongdeng");
            } else if (i >= 60 && i < 70) {
                System.out.println("jige");
            } else if (i >= 0 && i < 60) {
                System.out.println("bujige");
            }
        }
        else System.out.println("输入的数据不合格");
    }
          public static void main(String[] args) {

                       HomeWork07 homeWork07 = new HomeWork07();
                       homeWork07.test07();
    }
}
