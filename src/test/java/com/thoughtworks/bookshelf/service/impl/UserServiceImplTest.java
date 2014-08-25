package com.thoughtworks.bookshelf.service.impl;

import com.thoughtworks.bookshelf.model.User;
import com.thoughtworks.bookshelf.service.UserService;
import org.junit.Before;
import org.junit.Test;

public class UserServiceImplTest {
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        userService = new UserServiceImpl();
    }

    @Test
    public void testGetConnection() throws Exception {

    }

    @Test
    public void shouldSaveUserIntoDataBase() throws Exception {

        User user = new User();
        user.setUserName("Tom");
        user.setPassWord("123456");
        userService.save(user);
    }

//    @Test
//    public void shouldFindAllUser() throws Exception {
//        List<User> users = new ArrayList<User>();
//        users = (ArrayList<User>) userService.findAllUsers();
//    }
}
