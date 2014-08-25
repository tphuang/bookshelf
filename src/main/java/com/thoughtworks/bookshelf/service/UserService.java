package com.thoughtworks.bookshelf.service;

import com.thoughtworks.bookshelf.model.User;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by tphuang on 8/25/14.
 */
public interface UserService {
    Connection getConnection()throws ClassNotFoundException, SQLException;
    void save(User user) throws Exception;
//    List<User> findAllUsers() throws Exception;
}
