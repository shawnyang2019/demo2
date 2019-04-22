package com.fiberhome.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * https://blog.csdn.net/jungle_rao/article/details/81274720
 * https://blog.csdn.net/qq_27853161/article/details/53608880
 * https://blog.csdn.net/u014726937/article/details/52786502 url 的写法
 * https://blog.csdn.net/Heng_Ji/article/details/6838796 url和driver的写法
 * 
 * @author vv
 * @since 2019/2/15
 */
public class JdbcDemo {

	private static Connection getConn() {
		String driver = "com.mysql.jdbc.Driver";
		// demo是数据库的名称，需要在数据库中预先建好表以及表的列属性
		// url username password 也是进入数据库的登录入口信息
		String url = "jdbc:mysql://192.168.0.103:3306/demo";
		String username = "yx";
		String password = "123456";
		Connection conn = null;
		try {
			// JDBC访问数据库第一步：加载驱动，初始化驱动类com.mysql.jdbc.Driver
			Class.forName(driver);
			// JDBC访问数据库第二步：利用DriveManager 的getConnection 建立连接Connection接口，
			// 入参：地址，用户名，密码
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 下面是向数据库中增加数据，注意入参类型
	// 创建PreparedStatement接口，执行SQL语句
	private static int insert(SysUser user) {
		// 和数据库取得连接
		Connection conn = getConn();
		int i = 0;
		// 下面是sql语句，用双引号包括，？是占位符
		// 语句中的字段名一定要与数据库中的一致
		String sql = "INSERT INTO sys_user(id, organizationid, username, PASSWORD, salt, roleids, locked) "
				+ " VALUES(?,?,?,?,?,?,?);";
		// 创建statement
		PreparedStatement pstmt;
		try {
			// 输入sql语句
			pstmt = conn.prepareStatement(sql);
			// 给占位符赋值，参数索引是从1开始的
			pstmt.setInt(1, user.getId());
			pstmt.setInt(2, user.getOrganizationId());
			pstmt.setString(3, user.getUsername());
			pstmt.setString(4, user.getPassword());
			pstmt.setString(5, user.getSalt());
			pstmt.setString(6, user.getRoleIds());
			pstmt.setBoolean(7, user.isLocked());
			// 执行sql语句
			i = pstmt.executeUpdate();
			// 关闭statement和关闭连接
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	private static int update(SysUser user) {
		Connection conn = getConn();
		int i = 0;
		String sql = "update sys_user set username='" + user.getUsername() + "' where id=" + user.getId();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			// 执行sql语句 增删改都是一样的
			i = pstmt.executeUpdate();
			System.out.println("result: " + i);
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	private static Integer getAll() {
		Connection conn = getConn();
		String sql = "select * from sys_user";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			// 结果集，下面的依据是把执行sql的结果放到结果集里面
			ResultSet rs = pstmt.executeQuery();
			System.out.println("============================");
			// 4.处理数据库的返回结果(使用ResultSet类)
			while (rs.next()) {
				SysUser user = new SysUser();
				// 把从结果集中的对应键的值取出来放入赋值给对象user的相应属性，select比增删改多了一个结果集
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(3));
				// 打印出相应的结果
				System.out.println(user.getId());
				System.out.println(user.getUsername());
			}
			System.out.println("============================");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static int delete(String username) {
		Connection conn = getConn();
		int i = 0;
		String sql = "delete from sys_user where username='" + username + "'";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			i = pstmt.executeUpdate();
			System.out.println("resutl: " + i);
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	public static void main(String[] args) {
		// 新建对象并给对象赋值，每一个对象相当于数据库里面的一个数据，赋值相当于给数据中的每一个字段赋值
		SysUser user = new SysUser();
		user.setId(2);
		user.setOrganizationId(22);
		user.setUsername("xww222");
		user.setLocked(true);
		user.setSalt("salt111");
		SysUser user1 = new SysUser();
		user1.setId(10);
		user1.setOrganizationId(333);
		user1.setUsername("yx");
		user1.setPassword("3117319");
		user1.setSalt("15861667372");
		user1.setRoleIds("Primary");
		user1.setLocked(false);
		SysUser user2 = new SysUser();
		user2.setId(12);
		user2.setOrganizationId(333);
		user2.setUsername("ya");
		user2.setPassword("3117103");
		user2.setSalt("15861667372");
		user2.setRoleIds("Primary");
		user2.setLocked(true);
		SysUser user3 = new SysUser();
		user3.setId(15);
		user3.setOrganizationId(444);
		user3.setUsername("ding");
		user3.setPassword("3117301");
		user3.setSalt("15861667372");
		user3.setRoleIds("Primary");
		user3.setLocked(true);
		SysUser user4 = new SysUser();
		user4.setId(11);
		user4.setOrganizationId(555);
		user4.setUsername("wu");
		user4.setPassword("3117321");
		user4.setSalt("15861667372");
		user4.setRoleIds("Primary");
		user4.setLocked(true);
		//// 插入新的数据操作，点击运行一次就好输入一次参数，例如点击两次，则会有两个下面的数据
		// insert(user4);
		// insert(user);
		// insert(user3);
		// insert(user2);
		// insert(user1);
		//// user.setUsername("xww111"); 更新为user.setUsername("xww222");执行下面的语句
		//// 数据库中的数据也同步更新
		// update(user);
		//// 按照用户名delete数据
		// delete("ding");
		getAll();

	}

}
