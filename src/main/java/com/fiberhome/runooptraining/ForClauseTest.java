package com.fiberhome.runooptraining;

/**
 * 最先执行初始化步骤。可以声明一种类型，但可初始化一个或多个循环控制变量，也可以是空语句。
 * 然后，检测布尔表达式的值。如果为 true，循环体被执行。如果为false，循环终止，开始执行循环体后面的语句。
 * 执行一次循环后，更新循环控制变量。
 * 再次检测布尔表达式。循环执行上面的过程。
 * 初始化》》》布尔表达式》》ture 循环体循环，false跳出循环体》》一次循环后i++更新初始值》》检测布尔表达式
 */
public class ForClauseTest {
    public static void main(String args[]) {

        for(int x = 10; x < 20; x = x+1) {
//            注意运算结果是10到19，而不是11到20
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }
    }
}

/**
 * ava5 引入了一种主要用于数组的增强型 for 循环。
 *
 * Java 增强 for 循环语法格式如下:
 * for(声明语句 : 表达式)
 * {
 *    //代码句子
 * }
 * 声明语句：声明新的局部变量，该变量的类型必须和数组元素的类型匹配。其作用域限定在循环语句块，其值与此时数组元素的值相等。
 * 表达式：表达式是要访问的数组名，或者是返回值为数组的方法。
 */

 class Test2 {
    public static void main(String args[]){
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ){
//        用于验证break，break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。
//         break 跳出最里层的循环，并且继续执行该循环下面的语句。注意不要写成（x=30）
//       if(x==30) {
//                break;
//            }

//            用于验证continue,continue 适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。
//             在 for 循环中，continue 语句使程序立即跳转到更新语句。
//             在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。
//                   if(x==30) {
//                continue;
//            }
            System.out.print( x );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }
    }
}