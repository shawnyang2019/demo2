package com.fiberhome.demo;

/**
 * @author vv
 * @since 2019/2/13
 */

public class Person extends Animal implements Calculator, Englishable {
	public static final String S = "*";
	/**
	 * 成员变量/字段
	 */
	public String name = "aaa";

	/**
	 * 年龄
	 */
	private int age;

	private int height;

	private int weight;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	@Override
	public void testOverride() {
		System.out.println("Person");
	}

	/**
	 * 获取姓名
	 *
	 * @return 名字String
	 */
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getHeight() {
		return height;
	}

	int getWeight() {
		return weight;
	}

	/**
	 * 设置名称
	 *
	 * @param n 名称
	 */
	public void setName(String n) {
		// 表示把输入值赋值给当前这个变量.name
		this.name = n;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public final void setHeight(int height) {
		this.height = height;
	}

	public void setHeight(int height, int a) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}



	/**
	 * 访问权限 返回类型 方法名称(入参类型 入参值, ...)
	 *
	 * @param a
	 * @param b
	 * @return
	 */

	public long multi(int a, int b) {
		return a * b;
	}

	public long dive(int a, int b) {
		return a / b;
	}

	@Override
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	@Override
	public String say(String content) {
		// 翻译
		return content;
	}

	@Override
	protected String skin() {
		return "yellow";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Person person = (Person) o;

		if (age != person.age)
			return false;
		if (height != person.height)
			return false;
		if (weight != person.weight)
			return false;
		return name != null ? name.equals(person.name) : person.name == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + age;
		result = 31 * result + height;
		result = 31 * result + weight;
		return result;
	}

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我被回收了");
    }
}
