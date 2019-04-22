package smallfunction.homework;

import java.util.Scanner;

/**
 * Java的StringAPI的小练习 博客园
 * 	求两个字符串的最大相同子串
 */
public class StringPractise01 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入第一条字符串");
		String str1 = scanner.nextLine();
		System.out.println("输入第二条字符串");
		String str2 = scanner.nextLine();
		Maxstr maxstr = new Maxstr(str1, str2);
		maxstr.strComp();
		System.out.println("最大的子字符串的长度是" + maxstr.strComp());
	}
}

class Maxstr {

	String longer;
	String shorter;

	public Maxstr(String strA, String strB) {
		if (strA.length() > strB.length()) {
			this.longer = strA;
			this.shorter = strB;
		} else {
			this.longer = strB;
			this.shorter = strA;
		}
	}

	String max = "";// 这里一定要进行初始化，不知道什么原因

	public String strComp() {
		for (int i = 0; i < shorter.length() - 1; i++) {
			for (int j = shorter.length() - 1; j > i; j--) {
				if (longer.contains(shorter.substring(i, j))) {
					String temp = shorter.substring(i, j);
					if (temp.length() > max.length()) {
						max = temp;
					}
				}

			}
		}
		return max;
	}

}