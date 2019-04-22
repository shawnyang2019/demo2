package smallfunction.homework;

/**
 * 水仙花数是指一个 n 位数 ( n≥3 )，它的每个位上的数字的 n 次幂之和等
 *
 * 于它本身。（例如：1^3 + 5^3 + 3^3 = 153）。编程求出所有三位的水仙花数。
 */
public class HomeWork17 {
    public void test17(){
        int num=100;
        for(int i=100;i<=999;i++){
            int a=(int)Math.floor(i/100);
            int b=(int)Math.floor((i-100*a)/10);
            int c=i%10;
            if(i==a*a*a+b*b*b+c*c*c){
                System.out.println("水仙花数字是"+i);
            }
        }

    }
    public static void main(String[] args) {
        for(int num=100;num<1000;num++){
            if(isshuixian(num)){
                System.out.println(num);
            }
        }
    }
    //判断一个数是不是水仙花数
    public static boolean isshuixian(int num){
        int b=num/100;
        int s=num%100/10;
        int g=num%10;
        return Math.pow(b, 3)
                +Math.pow(s, 3)
                +Math.pow(g, 3)==num?true:false;
    }
}
