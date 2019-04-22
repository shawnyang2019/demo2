package smallfunction.homework;

/**
 * 使用循环语句输出下面的图形。
 *
 * #
 * # # #
 * # # # # #
 * # # # # # # #
 * # # # # # # # # #
 */
public class HomeWork12 {

    public void test12(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=2*i-1;j++){
                System.out.print("#");
            }
            System.out.println("\n");
        }
    }

}
