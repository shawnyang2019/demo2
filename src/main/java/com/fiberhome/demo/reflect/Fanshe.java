package com.fiberhome.demo.reflect;

import com.fiberhome.demo.proxy.Student;

/**
 * 作者：敬业的小码哥 来源：CSDN
 * 原文：https://blog.csdn.net/sinat_38259539/article/details/71799078
 * 版权声明：本文为博主原创文章，转载请附上博文链接！ 获取Class对象的三种方式 1 Object ——> getClass(); 2
 * 任何数据类型（包括基本数据类型）都有一个“静态”的class属性 3 通过Class类的静态方法：forName（String
 * className）(常用)
 *
 */
public class Fanshe {
	public static void main(String[] args) {
		// //第一种方式获取Class对象,根据对象调取getclass函数
		Student stu1 = new Student("yangxuan");// 这一new 产生一个Student对象，一个Class对象。
		// Class stuClass = stu1.getClass();//获取Class对象
		Class stuClass = stu1.getClass();
		// 得到class类之后，调用getName()方法获取对象名称
		System.out.println(stuClass.getName());

		// //第二种方式获取Class对象,根据类名获取class对象
		// Class stuClass2 = Student.class;
		Class stuClass2 = Student.class;
		System.out.println(stuClass == stuClass2);// 判断第一种方式获取的Class对象和第二种方式获取的是否是同一个

		// 第三种方式获取Class对象,根据真实的路径获取class对象
		try {
			// Class stuClass3 =
			// Class.forName("com.fiberhome.demo");//注意此字符串必须是真实路径，就是带包名的类路径，包名.类名
			// 获取权限定名的方法 在类上右键copy reference
			Class stuClass3 = Class.forName("com.fiberhome.demo.proxy.Student");
			System.out.println(stuClass3 == stuClass2);// 判断三种方式是否获取的是同一个Class对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
