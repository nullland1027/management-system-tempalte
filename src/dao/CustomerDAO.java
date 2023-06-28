package dao;

import domain.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
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

    public List<Customer> getAllCustomer() {

        try {
            Connection conn = getConn();
            Statement stmt = conn.createStatement();
            String sqlValue = "SELECT * FROM t_customer";
            ResultSet rs = stmt.executeQuery(sqlValue);
            List<Customer> customers = new ArrayList<Customer>();
            while (rs.next()) {
                Customer cus = new Customer();
                cus.setId(rs.getInt("id"));
                cus.setName(rs.getString("name"));
                cus.setGender(rs.getString("gender"));
                cus.setPhone(rs.getString("phone"));
                cus.setEmail(rs.getString("email"));
                cus.setDescription(rs.getString("description"));
                customers.add(cus);
            }
            return customers;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public Customer getCustomerById(int id) {
        try {
            Connection conn = getConn();
            Statement stmt = conn.createStatement();
            String sqlValue = "SELECT * FROM t_customer WHERE id=" + id;
            ResultSet rs = stmt.executeQuery(sqlValue);
            Customer cus = null;
            while (rs.next()) {
                cus = new Customer();
                cus.setId(rs.getInt("id"));
                cus.setName(rs.getString("name"));
                cus.setGender(rs.getString("gender"));
                cus.setPhone(rs.getString("phone"));
                cus.setEmail(rs.getString("email"));
                cus.setDescription(rs.getString("description"));
                break;
            }
            return cus;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public List<Customer> getCustomerByGender(String gender) {

        try {
            Connection conn = getConn();
            Statement stmt = conn.createStatement();
            String sqlValue = "SELECT * FROM t_customer WHERE gender='" + gender + "'";
            ResultSet rs = stmt.executeQuery(sqlValue);
            List<Customer> customers = new ArrayList<Customer>();
            Customer cus = null;
            while (rs.next()) {
                cus = new Customer();
                cus.setId(rs.getInt("id"));
                cus.setName(rs.getString("name"));
                cus.setGender(rs.getString("gender"));
                cus.setPhone(rs.getString("phone"));
                cus.setEmail(rs.getString("email"));
                cus.setDescription(rs.getString("description"));
                customers.add(cus);
            }
            return customers;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }


    public Customer getCustomerByName(String name) {
        try {
            Connection conn = getConn();
            Statement stmt = conn.createStatement();
            String sqlValue = "SELECT * FROM t_customer WHERE name='" + name + "'";
            ResultSet rs = stmt.executeQuery(sqlValue);
            Customer cus = new Customer();
            cus.setId(0);
            cus.setName("查无此人");
            cus.setGender("查无此人");
            cus.setPhone("查无此人");
            cus.setEmail("查无此人");
            cus.setDescription("查无此人");
            while (rs.next()) {
                cus = new Customer();
                cus.setId(rs.getInt("id"));
                cus.setName(rs.getString("name"));
                cus.setGender(rs.getString("gender"));
                cus.setPhone(rs.getString("phone"));
                cus.setEmail(rs.getString("email"));
                cus.setDescription(rs.getString("description"));
                break;
            }
            return cus;
        } catch (SQLException ex) {
            ex.printStackTrace();
            Customer customer = new Customer();
            customer.setId(0);
            customer.setName("查无此人");
            customer.setGender("查无此人");
            customer.setPhone("查无此人");
            customer.setEmail("查无此人");
            customer.setDescription("查无此人");
            return customer;
        }
    }

    public void addCustomer(Customer customer) {

        try {
            Connection conn = getConn();
            Statement stmt = conn.createStatement();
            String sqlValue = "INSERT INTO t_customer (name,gender,phone,email,description) VALUES ('"
                    + customer.getName()
                    + "','"
                    + customer.getGender()
                    + "','"
                    + customer.getPhone()
                    + "','"
                    + customer.getEmail()
                    + "','"
                    + customer.getDescription() + "')";
            stmt.executeUpdate(sqlValue);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateCustomer(Customer customer) {

        try {
            Connection conn = getConn();
            Statement stmt = conn.createStatement();
            String sqlValue = "UPDATE t_customer SET name='" + customer.getName()
                    + "', gender='" + customer.getGender() + "', phone='"
                    + customer.getPhone() + "', email='" + customer.getEmail()
                    + "', description='" + customer.getDescription() + "' WHERE id="
                    + customer.getId();
            stmt.executeUpdate(sqlValue);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteCustomer(int id) {

        try {
            Connection conn = getConn();
            Statement stmt = conn.createStatement();
            String sqlValue = "DELETE FROM t_customer WHERE id=" + id;
            stmt.executeUpdate(sqlValue);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
