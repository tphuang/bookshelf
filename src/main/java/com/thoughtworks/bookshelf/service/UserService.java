package com.thoughtworks.bookshelf.service;

import com.thoughtworks.bookshelf.model.User;

import java.util.List;

public interface UserService {
    void save(User user) throws Exception;
    List<User> findAllUsers() throws Exception;
}
