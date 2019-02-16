package com.fiberhome.demo.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * https://www.cnblogs.com/wuyuegb2312/p/3872607.html
 *
 * @author vv
 * @since 2019/2/15
 */
public class JdbcDemo {

    private static Connection getConn() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://192.168.0.110:3306/demo";
        String username = "xww";
        String password = "123456";
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    private static int insert(SysUser user) {
        Connection conn = getConn();
        int i = 0;
        String sql = "INSERT INTO sys_user(id, organization_id, username, PASSWORD, salt, role_ids, locked) " +
         " VALUES(?,?,?,?,?,?,?);";
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, user.getId());
            pstmt.setInt(2, user.getOrganizationId());
            pstmt.setString(3, user.getUsername());
            pstmt.setString(4, user.getPassword());
            pstmt.setString(5, user.getSalt());
            pstmt.setString(6, user.getRoleIds());
            pstmt.setBoolean(7, user.isLocked());
            i = pstmt.executeUpdate();
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
        String sql = "update sys_user set username='" + user.getUsername() + "' where id=" + user.getId() ;
        PreparedStatement pstmt;
        try {
            pstmt =  conn.prepareStatement(sql);
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
            ResultSet rs = pstmt.executeQuery();
            System.out.println("============================");
            //4.处理数据库的返回结果(使用ResultSet类)
            while(rs.next()){
                SysUser user = new SysUser();
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(3));

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
        String sql = "delete from sys_user where username='" + username+ "'";
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
        SysUser user = new SysUser();
        user.setId(2);
        user.setOrganizationId(22);
        user.setUsername("xww111");
        user.setLocked(true);
        user.setSalt("salt111");
        SysUser user1=new SysUser();
        user1.setId(10);
        user1.setOrganizationId(333);
        user1.setUsername("yx");
        user1.setPassword("3117319");
        user1.setSalt("15861667372");
        user1.setRoleIds("Primary");
        user1.setLocked(false);
        SysUser user2=new SysUser();
        user2.setId(12);
        user2.setOrganizationId(333);
        user2.setUsername("ya");
        user2.setPassword("3117103");
        user2.setSalt("15861667372");
        user2.setRoleIds("Primary");
        user2.setLocked(true);
//        insert(user2);
        SysUser user3=new SysUser();
        user3.setId(15);
        user3.setOrganizationId(444);
        user3.setUsername("ding");
        user3.setPassword("3117301");
        user3.setSalt("15861667372");
        user3.setRoleIds("Primary");
        user3.setLocked(true);
//        insert(user3);
        SysUser user4=new SysUser();
        user4.setId(11);
        user4.setOrganizationId(555);
        user4.setUsername("wu");
        user4.setPassword("3117321");
        user4.setSalt("15861667372");
        user4.setRoleIds("Primary");
        user4.setLocked(true);
//        insert(user4);
//        insert(user);

//        update(user);
//        delete("xww111");
//        getAll();

    }

}
