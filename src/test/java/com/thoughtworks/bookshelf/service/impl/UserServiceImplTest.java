package com.thoughtworks.bookshelf.service.impl;

import com.thoughtworks.bookshelf.dao.UserDao;
import com.thoughtworks.bookshelf.model.User;
import com.thoughtworks.bookshelf.service.UserService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserServiceImplTest {
    private UserDao userDao;
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        userService = new UserServiceImpl();
        userDao = mock(UserDao.class);
    }

    @Test
    @Ignore
    public void shouldSaveUser() throws Exception {
        //given
        User user = new User();
        user.setUserName("Tom");
        user.setPassWord("123456");
        int beforeAddedSize = userService.findAllUsers().size();
        //when
        userService.save(user);

        //then
        assertThat(userService.findAllUsers().size(), is(beforeAddedSize + 1));
    }

    @Test
    @Ignore
    public void shouldFindAllUser() throws Exception {
        //given
        List<User> ExpectedUsers = new ArrayList<User>();
        User user1 = new User("Tingpeng1", "123456");
        User user2 = new User("Tingpeng2", "123456");
        User user3 = new User("Tingpeng3", "123456");
        ExpectedUsers.add(user1);
        ExpectedUsers.add(user2);
        ExpectedUsers.add(user3);
        when(userDao.findAllUsers()).thenReturn(ExpectedUsers);

        //when
        List<User> ActualUsers = userService.findAllUsers();

        //then
        verify(userDao).findAllUsers();
        assertThat(ActualUsers.size(), is(3));
    }


}
