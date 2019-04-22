package smallfunction.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * https://blog.csdn.net/yxq8888/article/details/78345343
 */
public class CollectionPractice03 {
	// 编写程序，获取命令行参数中的字符串列表，输出其中重复的字符、不重复的字符以及消除重复以后的字符列表。
	// 提示：根据set里面不能有重复的元素，创建set集合来判定是否有重复值
	public void test01() {
		String str = "abcdeafblmbnopawc";
		System.out.println("原字符串：" + str);
		Set<Character> set1 = new HashSet<>();// 消除重复以后的字符
		Set<Character> set2 = new HashSet<>();// 重复的字符
		Set<Character> set3 = new HashSet<>();// 不重复的字符
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			boolean b = set1.add(chars[i]);
			if (!b) {
				set2.add(chars[i]);
			}
		}
		// set3=set1.removeAll(set2);//set1.removeAll(set2)返回的是boolean 所以这样赋值不对
		set3.addAll(set1);// 把set2的内容赋给set3 其返回的是boolean型 但是执行了赋值操作
		set3.remove(set2);// 其返回的是boolean型 但是执行了删除操作

		for (char c : set1) {
			System.out.print(c);
		}
		System.out.println("\n");
		for (char c : set2) {
			System.out.print(c);
		}
		System.out.println("\n");
		for (char c : set3) {
			System.out.print(c);
		}

	}

	// 使用Scanner从控制台读取一个字符串，统计字符串中每个字符出现的次数，要求使用学习过的知识完成以上要求
	// 实现思路根据Set、List、Map集合的特性完成。
	public void test02() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个字符串");
		char[] chars = scanner.nextLine().toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		// int[] a=new int[chars.length];//不会重来
		// Set<Character> set=new HashSet<>();
		// for(int i=0;i<chars.length;i++){
		// a[i]=0;
		// set.add(chars[i])
		for (char c : chars) {
			if (map.containsKey(c)) {
				Integer value = map.get(c);
				value++;
				map.put(c, value);
			} else
				map.put(c, 1);
		}
		Set<Character> set = map.keySet();// 返回包含Map中所有key的Set,为遍历做准备
		for (Character c : set) {
			System.out.println(c + "所出现的次数为" + map.get(c));
		}
	}

	// 定义一个Employee类,属性:name:String,age:int,salary:double
	// 把若干Employee对象放在List中,排序并遍历输出,排序规则:salary高的在前面,salary相同时age大的在前面,age也相同时按照name升序排列
	// 把若干Employee对象放在Set中并遍历,要求没有重复元素
	// https://blog.csdn.net/yxq8888/article/details/78345343
	public void test03() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Alis", 20, 3000));
		list.add(new Employee("Tom", 22, 3000));
		list.add(new Employee("Jack", 22, 3000));
		list.add(new Employee("Lily", 21, 3500));
		list.add(new Employee("Mike", 20, 2900));
		list.add(new Employee("Bobo", 23, 4000));
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				Employee employeei = list.get(i);
				Employee employeej = list.get(j);
				if (employeei.salary < employeej.salary) {
					list.set(i, employeej);// 我们交换的是对象，而非对象里面的东西，注意保持对象的完整性
					list.set(j, employeei);
				} else if (employeei.salary == employeej.salary) {
					if (employeei.age < employeej.age) {
						list.set(i, employeej);// 我们交换的是对象，而非对象里面的东西，注意保持对象的完整性
						list.set(j, employeei);
					} else if (employeei.age == employeej.age) {
						if (employeei.name.compareTo(employeej.name) > 0) {
							list.set(i, employeej);// 我们交换的是对象，而非对象里面的东西，注意保持对象的完整性
							list.set(j, employeei);
						}
					}
				}
			}
		}
		for (Employee e : list) {
			System.out.println(e);
		}
		Iterator iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public class Employee {
		private String name;
		private int age;
		private double salary;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public Employee(String name, int age, double salary) {
			this.name = name;
			this.age = age;
			this.salary = salary;
		}

		public String toString() {
			return "员工姓名" + this.name + "员工年龄" + this.age + "员工薪资" + this.salary;
		}

	}

	public static void main(String[] args) {
		CollectionPractice03 collectionPractice03 = new CollectionPractice03();
		// collectionPractice03.test01();
		// collectionPractice03.test02();
		collectionPractice03.test03();
	}
}