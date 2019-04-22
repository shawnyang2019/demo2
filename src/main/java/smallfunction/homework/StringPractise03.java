package smallfunction.homework;

import java.util.Arrays;

/**
 * 23 9 -4 18 100 7 要求这串数字按照从小到大排序并生成一个数值有序的字符串,要注意这一串数字中存在着数字
 */
public class StringPractise03 {

	String str = "23 9 -4 18 100 7";

	public void test3() {
		char[] c = new char[100];
		str.getChars(0, str.length() - 1, c, 0);
		Arrays.sort(c);
		String str1 = String.copyValueOf(c);
		System.out.println(str1.trim());
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		String str2 = String.copyValueOf(chars);
		System.out.println(str2.trim());// -0011234789和结果有出入,这里吧每个字符都当成了一个，所有要先进行截断参见test4（）
	}

	public void test4() {
		String[] str1 = str.split(" ");
		int[] a = new int[str1.length];
		for (int i = 0; i < str1.length; i++) {
			a[i] = Integer.parseInt(str1[i]);
		}
		Arrays.sort(a);
		// 方法一 append 方法可以连接任意类型
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < a.length; i++) {
			if (i != a.length - 1)
				stringBuffer = stringBuffer.append(a[i] + " ");
			else
				stringBuffer = stringBuffer.append(a[i]);
		}
		System.out.println(stringBuffer);
		// 方法二 concat 方法只能连接String类型
		String str = "";
		for (int i = 0; i < a.length; i++) {
			if (i != a.length - 1)
				str = str.concat(Integer.toString(a[i]) + " ");
			else
				str = str.concat(Integer.toString(a[i]));
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		StringPractise03 stringPercise03 = new StringPractise03();
		// stringPercise03.test3();
		stringPercise03.test4();
	}
}
