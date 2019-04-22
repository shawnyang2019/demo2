package smallfunction.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * https://blog.csdn.net/qq_37067955/article/details/82110891
 */
public class CollectionPractice {

	// 假设顺序列表ArrayList中存储的元素是整型数字1~5，遍历每个元素，将每个元素顺序输出。 [必做题]
	public void test01() {

		List<Integer> list = new ArrayList();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		Iterator iterator = list.listIterator();
		// 迭代器遍历
		// if(iterator.hasNext()){ 是while的循环语句，不是if的条件语句，注意
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// for 循环遍历
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 增强for循环遍历
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

	// 3、运用简单排序在一个列表中存储以下元素：apple,grape,banana,pear
	// • 3.1 返回集合中的最大的和最小的元素
	// • 3.2 将集合进行排序，并将排序后的结果打印在控制台上 [必做题]
	public void test02() {
		List<String> list = new ArrayList();
		list.add("apple");
		list.add("grape");
		list.add("banana");
		list.add("pear");
		String max = "";
		String min = "";
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++)
				if (list.get(i).compareTo(list.get(j)) < 0) {
					String temp = list.get(i);
					// list.get(i) = list.set(i,list.get(j));//赋值操作不能这样写
					list.set(i, list.get(j));
					list.set(j, temp);
				}
		}
		Iterator iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		max = list.get(0);
		min = list.get(3);
		System.out.println("最大值是" + max);
		System.out.println("最小值是" + min);

	}

	// 3、运用冒泡排序在一个列表中存储以下元素：apple,grape,banana,pear
	// • 3.1 返回集合中的最大的和最小的元素
	// • 3.2 将集合进行排序，并将排序后的结果打印在控制台上 [必做题]
	public void test03() {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("grape");
		list.add("banana");
		list.add("pear");
		for (int j = 0; j < list.size() - 1; j++) {
			for (int i = 0; i < list.size() - 1 - j; i++) {
				if (list.get(i).compareTo(list.get(i + 1)) < 0) {
					String temp = list.get(i);
					list.set(i, list.get(i + 1));
					list.set(i + 1, temp);
				}
			}
		}

		System.out.print("排序后的顺序：");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println("集合中最大的元素是" + list.get(0));
		System.out.println("集合中最小的元素是" + list.get(3));
	}

	// 编写一个程序，创建一个 HashMap对象，用于存储银行储户的信息(其中储户的主要信息有储户的ID，姓名和余额)。*****
	// 另外，计算并显示其中某个储户的当前余额。 [选做题]*****
	public void test04() {
		Map<Integer, Object> map = new HashMap();
		BankUser user1 = new BankUser(10, "yangxuan", 94454.00);
		BankUser user2 = new BankUser(20, "xiangweiwei", 944054.00);
		BankUser user3 = new BankUser(30, "zhangxiumei", 9477884.00);
		map.put(1, user1);
		map.put(2, user2);
		map.put(3, user3);
		// 遍历方法一：用keySet方法转化后遍历
		System.out.println("用keySet方法把所有的key值转化后set集合后再进行遍历.通过键用set.get（key）方法得到值");
		Set<Integer> keyset = map.keySet();
		// 可以通过下面的方式进行for遍历，但是set里面的只都是无序的，所有一般都用加强型for循环或者iterator进行遍历
		for (int i = 1; i < keyset.size() + 1; i++) {
			System.out.println("key=" + i + "的对象为" + map.get(i));
		}
		for (Integer key : keyset) {
			System.out.println("key=" + key + "的对象为" + map.get(key));
		}
		Iterator<Integer> iterator = keyset.iterator();
		while (iterator.hasNext()) {
			// System.out.println("key=" + iterator.next() +
			// "的对象为"+map.get(iterator.next()));//这个方法会报异常搞不懂
			System.out.println(map.get(iterator.next()));
		}
		// 用entrySet方法转化后遍历
		System.out.println("调用map.entrySet()方法得到每一个键值对包装后得到的Map.Entry类型的对象Set集合，然后用entry.getKey、entry.getValue()方法得到键和值");
		// 调用map.entrySet()方法得到每一个键值对包装后得到的Map.Entry类型的对象Set集合，然后用entry.getKey、entry.getValue()方法得到键和值
		Set<Map.Entry<Integer, Object>> entrySet = map.entrySet();
		for (int i = 1; i < entrySet.size() + 1; i++) {
			System.out.println("key=" + i + "的对象为" + map.get(i));
		}
		for (Map.Entry<Integer, Object> entry : entrySet) {
			entry.getKey();
			System.out.println("key=" + entry.getKey() + "的对象为" + entry.getValue());
		}
		// 需要进行强制类型装换
		Iterator iterator1 = entrySet.iterator();
		while (iterator1.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator1.next();
			System.out.println("key=" + entry.getKey() + "的对象为" + entry.getValue());//注意是entry.getKey、entry.getValue()方法 而不是entrySet的方法
		}
	}

	class BankUser {
		int id = 0;
		String name;
		Double amount;

		public BankUser(int id, String name, Double amount) {
			this.id = id;
			this.name = name;
			this.amount = amount;
		}

		@Override
		// 重写这个方法的意思是，当答应对象时，特别是自定义的类，答应其对象时是最原始的类名@hashcode形式，所以要重写toString方法
		public String toString() {
			return "储户的Id为" + this.id + ",姓名为" + this.name + "，账号余额为" + this.amount;
		}
	}

	// 从控制台输入若干个单词（输入回车结束）放入集合中，将这些单词排序后（忽略大小写）打印出来。 [选做题]
	public void test05() {
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		System.out.println("输入的单词数量");
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			list.add(scanner.next());// 注意和Arrays数组的赋值方式的区别,参考StringPractise04
			// list.add(scanner.nextLine());//注意这里用nextLine()取不到要求的值是其会吧nextInt（）读取后剩余的字符（回车或者空白）也当成一个字符读取出来，
			// 参考D:\oschina\demo\src\main\java\important\scanner的说明
		}
		System.out.println("排序前的排列情况");
		Iterator iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).compareTo(list.get(j)) < 0) {// 注意和Arrays数组的取值方式的区别，参考StringPractise04
					String temp = list.get(i);
					list.set(i, list.get(j));// 注意和Arrays数组的赋值方式的区别，参考StringPractise04
					// list.get(j)=temp;//不能这样赋值
					list.set(j, temp);// 注意和Arrays数组的赋值方式的区别，参考StringPractise04
				}
			}
		}
		System.out.println("排序后的情况");
		Iterator iterator2 = list.listIterator();// 一次遍历需要返回一个遍历对象
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}

	public static void main(String[] args) {
		CollectionPractice collectionsPractice = new CollectionPractice();
		// collectionsPractice.test02();
		// collectionsPractice.test03();
		collectionsPractice.test04();
		// collectionsPractice.test05();
	}
}
