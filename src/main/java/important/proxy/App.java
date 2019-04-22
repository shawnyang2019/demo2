package important.proxy;

public class App {

	public static void main(String[] args) {
		Student s = new Student("w");
		StudentsProxy sp = new StudentsProxy(s);
		sp.giveMoney();
	}
}
