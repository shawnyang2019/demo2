package com.ie.demo;

import com.fiberhome.dao.UserDao;
import com.fiberhome.dao.EmployeeDao;
import com.fiberhome.entity.Employee;
import com.fiberhome.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class MyBatisTestEmployee {
    @Test
    public void test1() {
        String resource = "mybatis/mybatis-config-test.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession(true);
        UserDao userDao = session.getMapper(UserDao.class);
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);

        Employee e1=new Employee();
        e1.setId(56L);
        e1.setUsername("ding");
        e1.setSalary(10000L);
        Employee e2=new Employee();
        e2.setId(234L);
        e2.setUsername("yang");
        e2.setSalary(20000L);

        Employee e3=new Employee();
        e3.setId(456L);
        e3.setUsername("wu");
        e3.setSalary(30000L);

        Employee e4=new Employee();
        e4.setId(56L);
        e4.setUsername("ding1");
        e4.setSalary(20000L);

        Employee e5=new Employee();
        e5.setId(56L);
        e5.setUsername("li");
        e5.setSalary(30000L);





//        User u1 = new User();
//        u1.setEmail("yx@163.com");
//        u1.setUsername("yx");
//
//        User u2 = new User();
//        u2.setEmail("yx@163.com");
//        u2.setUsername("yx");
//
//        User u3 = new User();
//        u3.setEmail("yx@164.com");
//        u3.setUsername("yx33");



//         employeeDao.addEmployee(e1);
//         employeeDao.addEmployee(e2);
//         employeeDao.addEmployee(e3);


//        System.out.println(employeeDao.deleteEmployee(e3.getId()));
//   System.out.println(employeeDao.getEmployeeByUsername("yang"));
          System.out.println(employeeDao.updateEmployee(e5));




//        List<User> users = userDao.getUserByName("yx");
//        System.out.println(users.size());
    }

    @Test
    public void test() {
        System.out.println("+++");
    }

}
