package important.jdbc;

import com.fiberhome.demo.jdbc.SysUser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//1 创建connection连接对象
public class JdbcDemo1 {
	private static Connection getConn() {
		String driver = "com.mysql.jdbc.Driver";
		String username = "yx";
		String password = "123456";
		String url = "192.163.0.103:3306/demo";
		Connection conn = null;
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 向数据库里面执行增删改查操作
	private int insert(SysUser user) {
		// 开通一个连接
		Connection conn = getConn();
		int i = 0;
		String sql = "INSERT INTO sys_user(id,orginazitionId,username,Password,salt,roleids,locked)"
				+ "VALUES (?,?,?,?,?,?,?)";

		// 声明一个发送sql请求到数据库执行，并返回一个结果集的对象
		PreparedStatement preparedStatement;

		try {
			// 1 发送请求,并返回
			preparedStatement = conn.prepareStatement(sql);
			// 2 赋值
			preparedStatement.setInt(1, user.getId());
			preparedStatement.setInt(2, user.getOrganizationId());
			preparedStatement.setString(3, user.getUsername());
			preparedStatement.setString(4, user.getPassword());
			preparedStatement.setString(5, user.getSalt());
			preparedStatement.setString(6, user.getRoleIds());
			preparedStatement.setBoolean(7, user.isLocked());
			// 3 执行
			i = preparedStatement.executeUpdate();
			// 4 关闭
			preparedStatement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 1;
	}

	private static int update(SysUser user) {
		Connection conn = getConn();
		int i = 0;
		String sql = "update sys_user set username=" + user.getUsername() + "where id=" + user.getId();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);

			i = preparedStatement.executeUpdate();

			preparedStatement.close();

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	private static String getALL() {
		Connection conn = getConn();

		String sql = "select * from sys_user";

		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				SysUser user = new SysUser();

				user.setId(resultSet.getInt(1));
				user.setOrganizationId(resultSet.getInt(2));
				user.setUsername((resultSet.getString(3)));

				preparedStatement.close();
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static int delete(String username){
	    Connection conn=getConn();
	    int i=0;

        try {
            String sql="delete from sys_user where username='" + username + "'";
            PreparedStatement preparedStatement=conn.prepareStatement(sql);

            i=preparedStatement.executeUpdate();

            preparedStatement.close();

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return i;
    }

}