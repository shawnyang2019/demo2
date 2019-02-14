package com.fiberhome.demo;

/**
 * @author vv
 * @since 2019/2/13
 */
public class Person extends Animal implements Calculator, Englishable {

    public static final String S ="*";
	/**
	 * 成员变量/字段
	 */
	public String name = "";
	/**
	 * 年龄
	 */
	private int age;

	private int height;

	private int weight;

	public Person(){
    }

    public Person(String name){
	    this.name = name;
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
	 * @param a
	 * @param b
	 * @return
	 */

	public long multi(int a, int b){
	    return a*b;
    }
    public long dive(int a, int b){
		return a/b;
	}

	@Override
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}

    @Override
    public String say(String content) {
	    //翻译
        return content;
    }

    @Override
    protected String skin() {
        return "yellow";
    }

}
