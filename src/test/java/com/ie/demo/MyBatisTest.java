package com.ie.demo;

import com.fiberhome.dao.UserDao;
import com.fiberhome.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class MyBatisTest {

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

        User u1 = new User();
        u1.setEmail("yx@163.com");
        u1.setUsername("yx");

        User u2 = new User();
        u2.setEmail("yx@163.com");
        u2.setUsername("yx");

        User u3 = new User();
        u3.setEmail("yx@164.com");
        u3.setUsername("yx33");



        int a = userDao.addUser(u1);
        int b = userDao.addUser(u2);
        int c = userDao.addUser(u3);



        List<User> users = userDao.getUserByName("yx");
        System.out.println(users.size());
    }

    @Test
    public void test() {
        System.out.println("+++");
    }

//    @Test
//    public void test2() {
//        Properties properties = new Properties();
//        properties.setProperty("driver", "com.mysql.jdbc.Driver");
//        properties.setProperty("url", "jdbc:mysql://127.0.0.1:3306/shiro");
//        properties.setProperty("username", "xww");
//        properties.setProperty("password", "123456");
//        PooledDataSourceFactory pooledDataSourceFactory = new PooledDataSourceFactory();
//        pooledDataSourceFactory.setProperties(properties);
//        DataSource dataSource = pooledDataSourceFactory.getDataSource();
//        TransactionFactory transactionFactory = new JdbcTransactionFactory();
//        Environment environment = new Environment("development", transactionFactory, dataSource);
//        Configuration configuration = new Configuration(environment);
//        configuration.addMapper(UserMapper.class);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
//        // 每个线程都应该有它自己的 SqlSession 实例，用完必须关闭
//        SqlSession session = sqlSessionFactory.openSession();
//        try {
//            UserMapper mapper = session.getMapper(UserMapper.class);
//            User user = mapper.report(1);
//            System.out.println(user.getUsername());
////            session.selectOne("com.bow.entity.User.report", 1);
//        } finally {
//            session.close();
//        }
//
//    }
}
