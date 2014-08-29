package com.thoughtworks.bookshelf.dao;

import com.thoughtworks.bookshelf.model.User;
import com.thoughtworks.bookshelf.util.DBConnection;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDao {
    private Connection connection;

    public void save(User user) throws SQLException, ClassNotFoundException {
        connection = DBConnection.getConnection();
        try {
            // 禁用自动提交
            connection.setAutoCommit(false);
            String sql = "insert into user(userName, password) values(?,?)";
            PreparedStatement ps = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getPassWord());
            ps.executeUpdate();//此处不能传入sql，传入sql后sql语句中就不能用占位符，PrepareStatement是继承Statement
            //如果传入sql则执行的是Statement的方法.
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            if (connection != null) {
                //事务回滚
                connection.rollback();
            }
        } finally {
            if (connection != null) {
                // 关闭连接
                connection.close();
            }
        }
    }

    public List<User> findAllUsers() throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getConnection();
        List<User> users = new ArrayList<User>();
        try {
            Statement sql_statement = conn.createStatement();
            String query = "select * from user";
            ResultSet result = sql_statement.executeQuery(query);

            while (result.next()) {
                String userName = result.getString("userName");
                String passWord = result.getString("passWord");
                User user = new User();
                user.setUserName(userName);
                user.setPassWord(passWord);
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return users;
    }
}
