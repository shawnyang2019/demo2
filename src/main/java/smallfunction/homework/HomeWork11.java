package smallfunction.homework;

/**
 * 百钱买百鸡
 */
public class HomeWork11 {
    public void test11(){
        int num=0;
        for(int i=0;i<=20;i++){
            for(int j=0;j<=33;j++){
                for(int k=0;k<=100-i-j;k++){
                   if(i % 3==0 && 5*i+j*3+k/3 == 100&& i+j+k ==100){
                       System.out.println("公鸡"+i+"只母鸡"+j+"只小鸡"+k+"只");
                       num++;
                    }
                }
            }
        }
        System.out.println("买法一共有"+num+"种");
    }

//    public static void main(String[] args) {
//        /* 、编写程序解决“百钱买百鸡”问题。
//         * 公鸡五钱一只，母鸡三钱一只，
//         * 小鸡 一钱三只，
//         * 现有百钱欲买百鸡，共有多少种买法？ */
//        for(int g=0;g<=20;g++){
//            for(int m=0;m<=33;m++){
//                for(int x=0;x<=100-g-m;x++){
//                    if(x % 3==0 && 5*g+m*3+x/3 == 100 && g+m+x ==100){
//                        System.out.println("公鸡"+g+"只母鸡"+m+"只小鸡"+x+"只");
//                    }
//                }
//            }
//        }
//    }
}
