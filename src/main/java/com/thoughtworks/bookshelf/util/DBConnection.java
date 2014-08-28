package com.thoughtworks.bookshelf.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private final static String DB_DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private final static String DB_URL = "jdbc:mysql://127.0.0.1:3306/bookshelf";
    private final static String DB_USERNAME = "root";
    private final static String DB_PASSWORD = "";

    public static Connection getConnection() throws ClassNotFoundException,
            SQLException {
        Connection connection = null;
//         加载MySQL的JDBC的驱动
        Class.forName(DB_DRIVER_CLASS);
        connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        return connection;
    }
}
