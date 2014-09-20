package com.thoughtworks.bookshelf.dao;

import com.thoughtworks.bookshelf.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:hibernate-test.xml"})
public class UserDaoTest {
    @Autowired
    private UserDao UserDao;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void shouldFindAllUser() throws Exception {
        //given
        List<User> users = new ArrayList<User>();

        //when
        users = (List<User>) UserDao.findAllUsers();

        //then
        assertNotNull(users);
    }

    @Test
    public void shouldSaveUserIntoDataBase() throws Exception {
        //given
        User user = new User();
        user.setUserName("Tom");
        user.setPassWord("123456");
        int beforeAddedSize = UserDao.findAllUsers().size();

        //when
        UserDao.createUsers(user);

        //then
        assertThat(UserDao.findAllUsers().size(), is(beforeAddedSize + 1));
    }


}
