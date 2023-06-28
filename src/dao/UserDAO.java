package dao;

import domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String ACCOUNT = "root";
    private static final String PSW = "123456";

    private Connection getConn() {
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, ACCOUNT, PSW);
            return conn;
        } catch (Exception ex) {
            System.out.println("不能获取数据库连接！");
            ex.printStackTrace();
            return null;
        }
    }

    public List<User> getUser() {
        try {
            Connection conn = getConn();
            Statement stmt = conn.createStatement();
            String sqlValue = "SELECT * FROM user_infor";
            ResultSet rs = stmt.executeQuery(sqlValue);
            List<User> users = new ArrayList<>();
            while (rs.next()) {
                User user = new User();
                user.setUserName(rs.getString("user_name"));
                user.setPwd(rs.getString("password"));
                users.add(user);
            }
            return users;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
