package smallfunction.homework;

import java.util.Scanner;

public class StringPractise04 {
	// 给定一个字符串数组，按照字典顺序，进行大小写排序
	public void test04() {
		String[] str = { "nba", "abc", "cba", "zz", "qq", "haha" };
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) < 0) {
					String temp = str[i];//注意与集合框架内容的取值和赋值方式的区别，参考CollectionsPractise
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		// 打印数组的几种方式的方法，方式一，遍历后一个一个打印
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		// 打印数组的几种方式的方法，方式二，连成字符串后打印
		String string = "";
		for (int i = 0; i < str.length; i++) {

			if (i != str.length - 1) {
				string = string.concat(str[i] + ",");
			} else {
				string = string.concat(str[i]);
			}

		}
		System.out.println(string);
	}

	// 一个子串在字符串中出现的次数
	public int test05() {
		String str = "abcqwabcedcxabcuabcjkabcnmbabc";
		String str1 = "abc";
		int index = 0;
		int count = 0;
		while (((index=str.indexOf(str1, index)) != -1)) {
			count++;
			index+=1;
		}

        System.out.println(count);
		return count;

	}

	public String test06(){
		String str="     dagag  ggasg    ";
		int begin=0;
		int end=str.length()-1;//注意end是长度-1而不是长度，注意
		//方法一 for循环
//		for(begin=0;begin<end;begin++){
//			if(str.charAt(begin)!=' '){
//				break;
//			}
//		}
//		for(end=str.length()-1;begin<end;end--){
//			if(str.charAt(end)!=' '){
//				break;
//			}
//		}
		//方法二 while循环
		while(begin<end&& str.charAt(begin)==' '){
			begin++;
		}
		while(begin<end&& str.charAt(end)==' '){
			end--;
		}
		String string2=str.substring(begin,end);
		System.out.println(string2);
		return string2;
	}

	public static void main(String[] args) {
		StringPractise04 stringPercise04 = new StringPractise04();
		stringPercise04.test05();
	}
}
