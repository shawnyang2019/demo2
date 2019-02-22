package com.fiberhome.runooptraining;

/**
 * 基础类与包装类的转换
 * 基础类转换为包装类
 *     int i =5;
 *     Integer j= i//自动装箱
 *     Integer j=new Integer(i);手动装箱
 * 包装类转换为基础了
 *     Integer j=new Integer(5)
 *     int i=j//自动拆箱
 *     int i= j.intValue();
 *
 */
public class NumberAndMath {
    public static void main(String[] args) {
        // java.lang.Math 常用
        Integer i=5; //自动装箱，相当于int i =5;Integer j=new Integer(i);
// xxxValue() 方法用于将 Number 对象转换为 xxx 数据类型的值并返回。
//        System.out.println(((Integer) 5).byteValue()); // 5 调用强制类型转换(byte)value
        System.out.println(i.byteValue());
        System.out.println(i.doubleValue());
        System.out.println(i.floatValue());
        System.out.println(i.shortValue());
        System.out.println(i.longValue());

// compareTo() 方法用于将 Number 对象与方法的参数进行比较。可用于比较 Byte, Long, Integer等。
//        返回值
//        如果指定的数与参数相等返回0。
//        如果指定的数小于参数返回 -1。
//        如果指定的数大于参数返回 1。
        System.out.println(i.compareTo(7)); // -1 调用>,=关系运算
        System.out.println(i.compareTo(5)); // 0 调用>,=关系运算
        System.out.println(i.compareTo(3)); // 1 调用>,=关系运算

// equals() 方法用于判断 Number 对象与方法的参数值是否相等。
//        返回值
//        如 Number 对象不为 Null，且与方法的参数类型与数值都相等返回 True，否则返回 False。
        Integer y = 10;
        Integer z =5;
        Short a = 5;
        System.out.println(i.equals((Integer) 5)); // true 调用instanceof判断数据类型,再调用==
        System.out.println(i.equals(y));
        System.out.println(i.equals(z));
        System.out.println(i.equals(a));

// valueOf() 方法用于返回给定参数的原生 Number 对象值，参数可以是原生数据类型, String等。
//        返回值
//        Integer valueOf(int i)：返回一个表示指定的 int 值的 Integer 实例。
//        Integer valueOf(String s):返回保存指定的 String 的值的 Integer 对象。
//        Integer valueOf(String s, int radix): 返回一个 Integer 对象，该对象中保存
//        了用第二个参数提供的基数进行解析时从指定的 String 中提取的值。
        System.out.println(Integer.valueOf(5)); // 5 调用对应的构造方法 new Integer(i)

// toString() 方法用于返回以一个字符串表示的 Number 对象值。
//toString(): 返回表示 Integer 值的 String 对象。
//toString(int i): 返回表示指定 int 的 String 对象。
        System.out.println(Integer.toString(12)); // 12 调用String类型的构造方法 new String(buf, true)

//用于将字符串参数作为有符号的十进制整数进行解析。
//如果方法有两个参数， 使用第二个参数指定的基数，将字符串参数解析为有符号的整数。
// parseInt() 方法用于将字符串参数作为有符号的十进制整数进行解析。
        System.out.println(Integer.parseInt("5")); // 5

// abs() 返回参数的绝对值。参数可以是 int, float, long, double, short, byte类型。
        System.out.println(Math.abs(-5.4)); // 5.4 调用 (a <= 0.0D) ? 0.0D - a : a;

// ceil() 方法可对一个数进行上舍入，返回值大于或等于给定的参数。
        System.out.println(Math.ceil(5.4)); // 6.0

// floor() 方法可对一个数进行下舍入，返回给定参数最大的整数，该整数小于或等给定的参数。
        System.out.println(Math.floor(5.6)); // 5.0

// rint() 方法返回最接近参数的整数值。
        System.out.println(Math.rint(5.5)); // 6.0

// round() 方法返回一个最接近的int、long型值。
        System.out.println(Math.round(5.5)); // 6

// min() 方法用于返回两个参数中的最小值。
        System.out.println(Math.min(5.5, 6)); // 5.5 调用 (a <= b) ? a : b

// max() 方法用于返回两个参数中的最大值。
        System.out.println(Math.max(5.5, 6)); // 6.0 调用 (a >= b) ? a : b;

// exp() 方法用于返回自然数底数e的参数次方。
        System.out.println(Math.exp(5)); // 148.4131591025766

// log() 方法用于返回参数的自然数底数的对数值。
        System.out.println(Math.log(5)); // 1.6094379124341003

// pow() 方法用于返回第一个参数的第二个参数次方。
        System.out.println(Math.pow(2, 2)); // 4.0

// sqrt() 方法用于返回参数的算术平方根。
        System.out.println(Math.sqrt(4)); // 2.0

        double degrees = 45.0;
        // toRadians() 方法用于将角度转换为弧度。
        double radians = Math.toRadians(degrees); // 0.7853981633974483 调用 angdeg / 180.0 * PI

        // sin() 方法用于返回指定double类型参数的正弦值。
        double sin = Math.sin(radians);
        System.out.format("%.1f 度的正弦值为 %.4f%n", degrees, sin); // 45.0 度的正弦值为 0.7071

        // cos() 方法用于返回指定double类型参数的余弦值。
        double cos = Math.cos(radians);
        System.out.format("%.1f 度的余弦值为 %.4f%n", degrees, cos); // 45.0 度的余弦值为 0.7071

        // tan() 方法用于返回指定double类型参数的正切值。
        double tan = Math.tan(radians);
        System.out.format("%.1f 度的正切值是 %.4f%n", degrees, tan); // 45.0 度的正切值是 1.0000

        // asin() 方法用于返回指定double类型参数的反正弦值。
        double asin = Math.asin(sin);
// toDegrees() 方法用于将参数转化为角度。
        System.out.format("%.4f 的反正弦值为 %.4f 度 %n", sin, Math.toDegrees(asin)); // 0.7071 的反正弦值为 45.0000 度

        // acos() 方法用于返回指定double类型参数的反余弦值。
        double acos = Math.acos(cos);
        System.out.format("%.4f 的反余弦值为 %.4f 度 %n", cos, Math.toDegrees(acos)); // 0.7071 的反余弦值为 45.0000 度

        // atan() 方法用于返回指定double类型参数的反正切值。
        double atan = Math.atan(tan);
        System.out.format("%.4f 的反正切值 %.4f 度 %n", tan, Math.toDegrees(atan)); // 1.0000 的反正切值 45.0000 度

// atan2() 方法用于将矩形坐标 (x, y) 转换成极坐标 (r, theta)，返回所得角 theta。该方法通过计算 y/x 的反正切值来计算相角 theta，范围为从 -pi 到 pi。
        System.out.println(Math.atan2(1, 1));

// random() 方法用于返回一个随机数，随机数范围为 0.0 =< Math.random < 1.0。
        System.out.println(Math.random());

// 参考: http://www.runoob.com/java/java-number.html
// 中文api: http://www.runoob.com/manual/jdk1.6/java/lang/Math.html
// 官方api: https://docs.oracle.com/javase/8/docs/api/
    }

}
