package com.ie.demo.spring;

import com.fiberhome.controller.DemoController;
import com.fiberhome.service.CalculateServiceImpl;
import com.fiberhome.service.DeviceServiceImpl;
import com.fiberhome.service.IAlarmService;
import com.fiberhome.service.aop.ReportServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring功能：
 * 1. IOC Inversion of control  bean容器 控制反转 也叫作依赖注入 Dependency Injection
 * 2. AOP aspect oriented program 面向切面编程
 * Aspect Oriented Programming
 */
public class SpringTest {

    @Test
    public void test1(){
        // 用ClassPathXmlA初始化了一个实例容器,里面放置了配置文件中的所有对象，括号里面是配置文件的名称
//      Context代表公用信息、环境、容器，一般翻译成容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //调用getBean 方法，创建calculate 指定的CalculateServiceImpl类型的对象service
        //前提条件在配置文件applicationContext.xml中配置CalculateServiceImpl类的bean，让getBean方法能在配置文件
        //找到这个类，(CalculateServiceImpl)强制转换为该类类型的意思
        CalculateServiceImpl service = (CalculateServiceImpl) context.getBean("calculate");
        //调用service函数并进行操作
        int a = service.add(1, 2);
        System.out.println(a);

        DeviceServiceImpl deviceService1 = (DeviceServiceImpl) context.getBean("deviceServiceImpl");
//        把DeviceServiceImpl.class类的实例化对象（一般来讲就是deviceServiceImpl），强制转换为DeviceServiceImpl之后赋值给
//        deviceService2
        DeviceServiceImpl deviceService2 = context.getBean(DeviceServiceImpl.class);
        System.out.println(deviceService1.getCpuUsage());
        System.out.println(deviceService2.getCpuUsage());

        ReportServiceImpl reportService=(ReportServiceImpl) context.getBean("reportServiceImpl");
        reportService.report("+++++"+"报告无异常");

//       AOP的使用例子：同样使用ClassPathXmlApplicationContext容器进行类的实例化，此时的类都还没有引用类型变量对其进行引用
//       然后把某一个AlarmService类的实例化对象赋值给alarmService,
//        1 注意此时的alarmService前面的类型名称是IAlarmService, 原因是类AlarmService implement 了接口IAlarmService 相当于
//        该接口是该类的父类，所以可以这样指定
//        2 使用AOP时，系统把将要编译的类型包装成一个代理类型，所以这里是无法把把getBean得到的对象强制转换我AlarmService的
//

        IAlarmService alarmService = context.getBean("alarmServiceImpl", IAlarmService.class);
        boolean result = alarmService.report("温度异常了");
        System.out.println(result);

        DemoController controller = (DemoController)context.getBean("demoController");
        controller.report();
    }

}
