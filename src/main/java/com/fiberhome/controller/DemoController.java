package com.fiberhome.controller;

import com.fiberhome.service.AlarmServiceImpl;
import com.fiberhome.service.IAlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {

	/**
	 * 默认根据类找指定对象 通过@Qualifier(value="alarmServiceImpl")根据名称查找对象
	 */
	// 通过@controller（controller层）或者@service（service层）实例的对象，通过下面的自动
	// 注入@Autowired注释在spring容器里面找类UserService所实例化的对象并且注入到userService里面去
	@Autowired
	// 如果有多个对象具有相同的名称，如果通过controller（value)来进行实例化的话，那会存在对象名称相同
	// 那么就配合用Qualifier用值（一般是对象名字改成首字母小写即可）
	// @Qualifier(value = "alarmServiceImpl")
	private IAlarmService alarmService;

	public void report() {
		alarmService.report("controller");
	}

}
