package com.fiberhome.service.aop;

import org.springframework.stereotype.Service;

//在运用spring的ClassPathXmlApplicationContext进行对象的实例化时，只要加上@service或者@controller的类
//都会自动进行实例化，实例化的对象名字（map里面的ID）自动分配为相应类的首字母小写，如下即为reportServiceImpl）
@Service
public class ReportServiceImpl implements IReportservice {


    @Override
    public boolean report(String string) {
        System.out.println(">>>>>报告成功" + string);
        return true;
    }
}
