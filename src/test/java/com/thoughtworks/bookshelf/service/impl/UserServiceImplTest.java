package com.thoughtworks.bookshelf.service.impl;

import com.thoughtworks.bookshelf.dao.UserDao;
import com.thoughtworks.bookshelf.model.User;
import com.thoughtworks.bookshelf.service.UserService;
import com.thoughtworks.bookshelf.util.UserInfoEmptyException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;

public class UserServiceImplTest {
    private UserDao userDao;
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        userDao = mock(UserDao.class);
        userService = new UserServiceImpl(userDao);
    }

    @Test
    public void shouldSaveUser() throws Exception {
        //given
        int beforeSavedSize = userService.findAllUsers().size();

        User user = new User("Mike","123456");
        List<User> users = new ArrayList<User>();
        users.add(user);
        when(userDao.findAllUsers()).thenReturn(users);

        //when
        userService.saveUser(user);

        //then
        verify(userDao).save(user);
        assertThat(userService.findAllUsers().size(), is(beforeSavedSize + 1));
    }

    @Test(expected = UserInfoEmptyException.class)
    public void shouldThrowUserInfoEmptyExceptionWhenUserNameIsBlank() throws Exception {
        //given
        User user = new User("     ","123456");
        List<User> users = new ArrayList<User>();
        users.add(user);

        //when
        userService.saveUser(user);
    }

    @Test(expected = UserInfoEmptyException.class)
    public void shouldThrowUserInfoEmptyExceptionWhenUserInfoEmpty() throws Exception {
        //given
        User user = new User("","");
        List<User> users = new ArrayList<User>();
        users.add(user);

        //when
        userService.saveUser(user);
    }

    @Test
    public void shouldFindAllUser() throws Exception {
        //given
        List<User> expectedUsers = new ArrayList<User>();
        User user1 = new User("Tingpeng1", "123456");
        User user2 = new User("Tingpeng2", "123456");
        User user3 = new User("Tingpeng3", "123456");
        expectedUsers.add(user1);
        expectedUsers.add(user2);
        expectedUsers.add(user3);
        when(userDao.findAllUsers()).thenReturn(expectedUsers);

        //when
        List<User> actualUsers = userService.findAllUsers();

        //then
        verify(userDao).findAllUsers();
        assertThat(actualUsers.size(), is(3));
    }


}
