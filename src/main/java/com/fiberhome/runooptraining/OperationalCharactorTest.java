package com.fiberhome.runooptraining;

public class OperationalCharactorTest {

        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            int c = 25;
            int d = 25;
            System.out.println("a + b = " + (a + b) );
            System.out.println("a - b = " + (a - b) );
            System.out.println("a * b = " + (a * b) );
            System.out.println("b / a = " + (b / a) );
            System.out.println("b % a = " + (b % a) );
            System.out.println("c % a = " + (c % a) );
            System.out.println("a++   = " +  (a++) );
            System.out.println("a--   = " +  (a--) );
            // 查看  d++ 与 ++d 的不同
            System.out.println("d++   = " +  (d++) );
            System.out.println("++d   = " +  (++d) );
        }
    }

class selfAddMinus{
    public static void main(String[] args){
        int a = 5;//定义一个变量；
        int b = 5;
//        2、前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算。
//        3、后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算
        int x = 2*++a;
        int y = 2*b++;
        System.out.println("自增运算符前缀运算后a="+a+",x="+x);
        System.out.println("自增运算符后缀运算后b="+b+",y="+y);
    }
}