package important.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LiuDeHuaProxy2 {
	// new一个目标类的对象
	private Person liudehua = new LiuDeHua();

	// 通过一个方法得到一个目标类的代理类的代理对象,返回一个接口对象
	public Person getProxy(){

         return (Person) Proxy.newProxyInstance(LiuDeHuaProxy2.class.getClassLoader(), liudehua.getClass().getInterfaces(), new InvocationHandler() {
             @Override
             public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                 if (method.getName().equals("sing")) {
                    return method.invoke(liudehua, args);

                 }
                 if (method.getName().equals("dance")) {
                    return method.invoke(liudehua, args);
                 }
                 return null;
             }

         });

}
}
