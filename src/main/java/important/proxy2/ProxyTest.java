package important.proxy2;

public class ProxyTest {
	public static void main(String[] args) {
		// new 一个proxy对象，注意这里不是代理对象
		LiuDeHuaProxy proxy = new LiuDeHuaProxy();
		// 调用proxy的getProxy方法吧返回的代理对象赋值给目标对象的引用
		Person p = proxy.getProxy();
		// 调用代理对象的sing方法，由下面的调用可以很清楚的看到，由于LiuDeHua类实现了Person类
		// 调用Person类的实例p下面的的方法时，没有像普通调用一样直接调用实现类的方法，而是通过代理类的invoke方法去简介调用实现类的方法(入参都是一样）
		String retValue = p.sing("冰雨");
		System.out.println(retValue);
		// 调用代理对象的dance方法
		String value = p.dance("江南style");
		System.out.println(value);
	}
}
