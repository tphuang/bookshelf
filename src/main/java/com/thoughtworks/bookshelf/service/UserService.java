package com.thoughtworks.bookshelf.service;

import com.thoughtworks.bookshelf.model.User;

/**
 * Created by tphuang on 8/25/14.
 */
public interface UserService {
    void save(User user) throws Exception;
//    List<User> findAllUsers() throws Exception;
}
