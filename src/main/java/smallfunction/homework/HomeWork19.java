package smallfunction.homework;

/**
 *  古典问题：有一对兔子，从出生后第 3 个月起每个月都生一对兔子，小兔
 *
 * 子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数
 *
 * 为多少？
 */
public class HomeWork19 {
     public void test19(){
         int num=2;
         for(int i=1;i<=12;i++){
             if (i%3==0){
                 num=num*2;
             }
             System.out.println("第"+i+"个月有"+num+"只兔子");
         }
     }
}
