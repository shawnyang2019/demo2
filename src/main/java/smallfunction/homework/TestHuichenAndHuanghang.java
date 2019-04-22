package smallfunction.homework;

import java.sql.SQLOutput;

public class TestHuichenAndHuanghang {
	// https://blog.csdn.net/weixin_38481963/article/details/84783315
	public static void main(String[] args) {
		System.out.println("\\r回车的作用:光标移动到本行的最前面，回车符后面的内容覆盖之前的内容");
		System.out.println("aaaaaaa\rbbbb");
		System.out.println("\\n换行的作用：光标移到下一行");
		System.out.println("aaaaaaa\nbbbb");
		System.out.println("\\t制表符的作用:每4个字符进行补足");
		System.out.println("aaaaaaa\tbbb\tc\tdd\te");
        System.out.println("\\r\\n是两个符号的叠加");
		System.out.println("aaaaaaa\r\nbbb");
		System.out.println("aaaaaaa\rcccccc\nbbb");
        System.out.println("\\n\\r是两个符号的叠加");
        System.out.println("aaaaaaa\n\rbbb");
        System.out.println("aaaaaaa\nccccc\rbbb");
	}
}
