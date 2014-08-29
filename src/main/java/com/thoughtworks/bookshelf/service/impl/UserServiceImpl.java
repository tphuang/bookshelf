package com.thoughtworks.bookshelf.service.impl;


import com.thoughtworks.bookshelf.dao.UserDao;
import com.thoughtworks.bookshelf.model.User;
import com.thoughtworks.bookshelf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(User user) throws Exception {
        userDao.save(user);
    }

    public List<User> findAllUsers() throws Exception {
        List<User> users = new ArrayList<User>();
        users = userDao.findAllUsers();
        return users;
    }

}
