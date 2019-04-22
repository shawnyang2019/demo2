package functiontest;

import com.fiberhome.demo.Person;

public class FunctionTest {
	public static void main(String[] args) {

		test104();

	}

	public static void test101() {
		Integer x = 5;
		byte y1 = x.byteValue();
		Double y2 = x.doubleValue();
		Long y3 = x.longValue();
		// 返回 byte 原生数据类型
		System.out.println("1.1>>>" + y1);

		// 返回 double 原生数据类型
		System.out.println("1.1>>>" + y2);

		// 返回 long 原生数据类型
		System.out.println("1.1>>>" + y3);
	}

	private static void test102() {
		Integer x = 5;
		Long y=6L;
		Long z=5L;
        int y2 = y.compareTo(z);
		int y3 = x.compareTo(6);
		System.out.println("1.2>>>" + y3);
		System.out.println("1.2>>>" + y2);
	}

	private static void test103() {
		Integer x = 5;
		Object x1=5;
		Short y = 5;
		Long z = 555L;
		boolean y3 = z.equals(555);
		boolean y2 = x.equals(5);
		boolean y1 = x1.equals(5);
		System.out.println("1.3>>>" + y3);
		System.out.println("1.3>>>" + y2);
		System.out.println("1.3>>>" + y1);
	}

	private static void test104() {
		// 把目标类型转换为Integer类型（不是int类型）
		Integer x = Integer.valueOf(9);
		// Integer装换为int类型
		int y = x.intValue();
//		System.out.println(y.getClass().getName());
		// 把目标类型转换为Double类型
		int i=50;
		Double c = Double.valueOf(i);
		String f=String.valueOf(i);
		String f2=String.valueOf(i);
		// 把Double类型转换为double类型
		double d = c.doubleValue();
		// 把String类型转换为Float类型
		Float a = Float.valueOf("1111");
		Float a2 = Float.valueOf("1111");
        // 把Float类型转换为float类型
        float b = a.floatValue();
		Integer e = Integer.valueOf("444", 16); // 使用 16 进制
		System.out.println("1.4>>>" + x);
		System.out.println("1.4>>>" + y);
		System.out.println("1.4>>>" + a);
		System.out.println("1.4>>>" + b);
		System.out.println("1.4>>>" + c);
		System.out.println("1.4>>>" + d);
		System.out.println("1.4>>>" + e);
		System.out.println("1.4>>>" + f);
	}
}