package com.ie.demo.spring;

import com.fiberhome.controller.DemoController;
import com.fiberhome.service.AlarmServiceImpl;
import com.fiberhome.service.CalculateServiceImpl;
import com.fiberhome.service.DeviceServiceImpl;
import com.fiberhome.service.IAlarmService;
import com.fiberhome.service.aop.ReportServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring功能： 1. IOC Inversion of control bean容器 控制反转 也叫作依赖注入 Dependency
 * Injection 2. AOP aspect oriented program 面向切面编程 Aspect Oriented Programming
 *
 */
public class SpringIOCAndAOPTest {

	@Test
	public void test1() {
		// 用ClassPathXmlA初始化了一个实例容器,里面放置了配置文件中的所有对象，
		// 括号里面是配置文件的名称，使程序与配置文件关联起来
		// Context代表公用信息、环境、容器，一般翻译成容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 调用getBean 方法，创建calculate 指定的CalculateServiceImpl类型的对象service
		// 前提条件在配置文件applicationContext.xml中配置CalculateServiceImpl类的bean，让getBean方法能在配置文件
		// 找到这个类，(CalculateServiceImpl)强制转换为该类类型的意思
		// 这样就实现了调用（也就是依赖）通过注入的方法得到，也就是依赖注入
		// 或者控制由调用类控制被调用类装换为由第三方同时控制调用类和非调用类，也就是控制反转
		// 实现了松耦合，以后对类的实现进行修改的时候，只要更改XML配置文件就行
		/**
		 * IOC测试
		 * 实现IOC的两种方式 方式1 普通注入 1 在applicationContext 配置文件中
		 * 使用bean标签声明会用到的bean注入 2 用getBean进行对象的创建并注入 优点：标签声明中的
		 * id可以取任意值，只要保证getBean中的函数一致就行 缺点：比较繁琐 方式2 自动注入 1 在applicationContext
		 * 配置文件中开启扫描功能 2 把需要在配置文件中bean声明的类前加@service 优点：简便
		 * 确定：在使用getBean函数时，name默认是以类的第一个字母小写为id，也就是调用name
		 */
		CalculateServiceImpl service = (CalculateServiceImpl) context.getBean("calculateServiceImpl");
		// 调用service函数并进行操作
		int a = service.add(1, 2);
		System.out.println(a);

		DeviceServiceImpl deviceService1 = (DeviceServiceImpl) context.getBean("deviceServiceImpl");
		DeviceServiceImpl deviceService2 = context.getBean(DeviceServiceImpl.class);
		System.out.println(deviceService1.getCpuUsage());
		System.out.println(deviceService2.getCpuUsage());
		// 虽然在XML配置文件中并没有具体的ReportServiceImpl的bean，但是由于在ReportServiceImpl上面加了@service，
		// 就可以自动进行扫描并创建对象

		ReportServiceImpl reportService = (ReportServiceImpl) context.getBean("reportServiceImpl");
		reportService.report("报告无异常");
		/**
		 * AOP测试
		 */
		// AOP的使用例子：同样使用ClassPathXmlApplicationContext构建context对象，调用context里面的getBean方法进行所需类的实例化（取代了传统的new方法）
		// 然后把某一个AlarmService类的实例化对象赋值给alarmService,
		// 1 注意此时的alarmService前面的类型名称是IAlarmService, 原因是类AlarmService
		// implement了接口IAlarmService 相当于该接口是该类的父类，所以可以这样指定，相当于向上转型。
		// 2 使用AOP时，系统把将要编译的类型包装成一个代理类型，所以这里是无法把getBean得到的对象强制转换为AlarmService
		// 类,这句话有待考证
		// 在执行alarmService对象，由于在配置文件中配置了增强，所以会执行前置增强，在执行了目标对象后，会执行后置增强
		// 注意前置增强或者后置增强的方法所在的类也需要用IOC进行注入
		IAlarmService alarmService = (IAlarmService) context.getBean("alarmServiceImpl");
		boolean result = alarmService.report("温度异常了");
		System.out.println(result);
		/**
		 * 在DemoController关联IAlarmService类的情况下的AOP和autowired测试
		 */
		DemoController controller = (DemoController) context.getBean("demoController");
		// 该方法实现的前提条件
		// 1 DemoController和AlarmServiceImpl都通过@service 在配置文件中bean了一个实例（对象）
		// 2 DemoController如果要调用AlarmServiceImpl的对象的里面的方法的话，那么
		// 一是:DemoController声明了被调用的类的属性(变量）private IAlarmService alarmService;
		// 二是：在上面的属性上标注@autowired，那么AlarmServiceImpl类在xml文件实例化的对象（对象名一定要是和上面声明的
		// 一样，也就是alarmService）会自动被声明的引用类型变量所引用，也就是相当于private IAlarmService
		// alarmService=new AlarmServiceImpl(),只不过这都是由第三方容器spring进行从而降低耦合性
		// 由于Controller类中有private IAlarmService alarmService，通过@autowired
		controller.report();
	}

}
