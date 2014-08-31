package com.thoughtworks.bookshelf.service.impl;


import com.thoughtworks.bookshelf.dao.UserDao;
import com.thoughtworks.bookshelf.model.User;
import com.thoughtworks.bookshelf.service.UserService;
import com.thoughtworks.bookshelf.util.UserInfoEmptyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(User user) throws UserInfoEmptyException, SQLException, ClassNotFoundException {
        if (user == null || "".equals(user.getUserName()) || "".equals(user.getPassWord()) ){
            throw new UserInfoEmptyException("userName or passWord should not be empty!");
        }else {
            userDao.save(user);
        }
    }

    public List<User> findAllUsers() throws SQLException, ClassNotFoundException {
        List<User> users = new ArrayList<User>();
        users = userDao.findAllUsers();
        return users;
    }

}
