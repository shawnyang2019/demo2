package com.fiberhome.runooptraining;

/**
 * 向上转型解释https://blog.csdn.net/ldsh304/article/details/77622245
 * 向上转型会丢失子类的新增方法，同时会保留子类重寫的方法和父類中未被重寫的方法。 向下转型可以得到子类的所有方法（包含父类的方法） 向下转型是在向上转型的基础上完成的
 * 上转型对象不是父类创建的对象，而是子类对象的“简化”状态，它不关心子类新增的功能，只关心子类继承和重写的功能。
 * 当一个类有很多子类时，并且这些子类都重写了父类中的某个方法。
 * 当使用上转型对象在调用这个方法时就可能具有多种形态。因为不同的子类在重写父类的方法时可能产生不同的行为。也就是说，
 * 不同对象的上转型对象调用同一方法可能产生不同的行为。
 * https://blog.csdn.net/lurenjiazhw/article/details/46780343
 * http://www.runoob.com/java/java-override-overload.html
 * http://www.runoob.com/java/java-polymorphism.html
 */
class Animal2 {
	public void move() {
		System.out.println("动物可以移动");
	}

	public void eat() {
		System.out.println("动物可以吃东西");
	}
}

class Dog2 extends Animal2 {
	public void move() {
		System.out.println("狗可以跑和走");
	}

	public void bark() {
		System.out.println("狗可以吠叫");
	}
}

public class Override {
	public static void main(String args[]) {
		Animal2 a = new Animal2(); // Animal 对象
		// 由于Dog2类继承Animal2类，所有声明Dog2类的新对象的时候，可以用Animal2，但是对象b仍然只能调用Dog类的
		// 属性和方法，不能调用其父类的属性和方法
		Animal2 b = new Dog2(); // Dog 对象，一种向上转型
		Dog2 c = (Dog2) b;// 向下转型
		// 尽管b属于Animal类型，但是它运行的是Dog类的move方法。
		// 这是由于在编译阶段，只是检查参数的引用类型。
		// 然而在运行时，Java虚拟机(JVM)指定对象的类型并且运行该对象的方法。
		// 因此在上面的例子中，之所以能编译成功，是因为Animal类中存在move方法，然而运行时，运行的是特定对象的方法。
		// 而b.bark()出现编译错误是因为在编译阶段检查参数的引用类型就无法通过，因为引用类型Animal没有bark方法。
		// 但是b.move()能通过是因为Animal中也有move方法，但是执行方法时，还是执行Dog类的方法
		// 思考以下例子：
		a.move();// 执行 Animal 类的方法
		b.move();// 执行 Dog 类的方法
		b.eat();// 执行 Animal 类的方法
		// b.bark();
	}
}
