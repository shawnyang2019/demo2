package com.ie.demo.spring;

import com.fiberhome.service.AlarmServiceImpl;
import com.fiberhome.service.aop.LogAdvice;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

public class AopTest {

    @Test
    public void test(){
        //基于加载的Spring框架包，调用ProxyFactory方法，创建一个代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        //设定aspect 的Target 的目标值，也就是定位，新建一个所要操作的方法所属的类的对象作为入参给到setTarget方法
        proxyFactory.setTarget(new AlarmServiceImpl());
        //new 一个LogAdvice对象，把这个对象赋值给addAdvice这个方法
        //addAdvice 方法先读取对象的地址返回一个int的地址，然后重载addAdvice方法，是入参值变为
        proxyFactory.addAdvice(new LogAdvice());
        AlarmServiceImpl service = (AlarmServiceImpl) proxyFactory.getProxy();
        System.out.println(service.report("111"));
    }
}
