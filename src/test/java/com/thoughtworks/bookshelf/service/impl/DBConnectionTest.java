package com.thoughtworks.bookshelf.service.impl;

import com.thoughtworks.bookshelf.util.DBConnection;
import org.junit.After;
import org.junit.Before;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class DBConnectionTest {
    private Connection connection;

    @Before
    public void setUp() throws Exception {
        connection = DBConnection.getConnection();
    }

    @After
    public void tearDown() throws Exception {
        connection.rollback();
        connection.close();
    }

    protected Connection getConnection() throws SQLException, ClassNotFoundException {
        return DBConnection.getConnection();
    }

}
