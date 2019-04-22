package smallfunction.homework;

import java.util.HashSet;
import java.util.Random;

public class CollectionPractice04 {
	// 生成10个1到20之间的不重复的随机数
	// https://blog.csdn.net/u011541946/article/details/80229778
	public void test01() {
		// 1.创建Random对象
		Random r = new Random();
		// 2.创建HashSet对象
		HashSet<Integer> hs = new HashSet<>(); // 注意是包装类不是int
		// 3.判断并添加元素
		while (hs.size() < 10) {// 考虑这里是10而不是11的原因
			// 4.通过Random中随机方法nextInt()获取1到20范围内随机数
			hs.add(r.nextInt(20) + 1); // 如果不加1，随机范围是0到19
		}

		// 5.遍历HashSet
		for (Integer integer : hs) {
			System.out.println(integer);
		}
	}

	public static void main(String[] args) {
		CollectionPractice04 collectionPractice04 = new CollectionPractice04();
		collectionPractice04.test01();
	}
}
