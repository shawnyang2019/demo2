package com.fiberhome.runooptraining;

public class StringTest {
    public static void main(String[] args) {
        String s="www.runoob.com";
        System.out.println(s.charAt(8));

    }
}

/**
 * compareTo() 方法
 * 返回值
 * 返回值是整型,它是先比较对应字符的大小(ASCII码顺序),如果第一个字符和参数的第一个字符不等,结束比较,返回他们之间的差值,如果第一个字符和参数的第一个字符相等,则以第二个字符和参数的第二个字符做比较,以此类推,直至比较的字符或被比较的字符有一方。
 * 如果参数字符串等于此字符串，则返回值 0；
 * 如果此字符串小于字符串参数，则返回一个小于 0 的值；
 * 如果此字符串大于字符串参数，则返回一个大于 0 的值。
 */
class Test10 {

    public static void main(String args[]) {
        String str1 = "Strings";
        String str2 = "Strings";
        String str3 = "Strings123";

//        int result = str1.compareTo( str2 );
        System.out.println(str1.compareTo( str2 ));

//        result = str2.compareTo( str3 );
        System.out.println(str2.compareTo( str3 ));

//        result = str3.compareTo( str1 );
        System.out.println(str3.compareTo( str1 ));
    }
}

class Test11 {

    public static void main(String args[]) {
        String str1 = "STRINGS";
        String str2 = "Strings";
        String str3 = "Strings123";

        int result = str1.compareToIgnoreCase( str2 );
        System.out.println(result);

        result = str2.compareToIgnoreCase( str3 );
        System.out.println(result);

        result = str3.compareToIgnoreCase( str1 );
        System.out.println(result);
    }
}

class Test13 {
    public static void main(String args[]) {
        String s = "菜鸟教程：";
        s = s.concat("www.runoob.com");
        System.out.println(s);
    }
}