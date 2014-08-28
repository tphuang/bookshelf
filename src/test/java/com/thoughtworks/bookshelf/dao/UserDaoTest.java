package com.thoughtworks.bookshelf.dao;

import com.thoughtworks.bookshelf.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class UserDaoTest {
    private UserDao UserDao;

    @Before
    public void setUp() throws Exception {
        UserDao = new UserDao();
    }

    @Test
    public void shouldSaveUserIntoDataBase() throws Exception {
        //given
        User user = new User();
        user.setUserName("Tom");
        user.setPassWord("123456");
        int beforeAddedSize = UserDao.findAllUsers().size();
        //when
        UserDao.save(user);

        //then
        assertThat(UserDao.findAllUsers().size(), is(beforeAddedSize + 1));
    }

    @Test
    public void shouldFindAllUser() throws Exception {
        List<User> users = new ArrayList<User>();
        users = (List<User>) UserDao.findAllUsers();
    }
}
