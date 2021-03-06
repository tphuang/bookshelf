package com.thoughtworks.bookshelf.controller;

import com.thoughtworks.bookshelf.model.User;
import com.thoughtworks.bookshelf.service.UserService;
import com.thoughtworks.bookshelf.util.UserInfoEmptyException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.ModelMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;

public class UserControllerTest {
    private UserController userController;
    private UserService userService;
    private ModelMap model;

    @Before
    public void setUp() throws Exception {
        userService = mock(UserService.class);
        userController = new UserController(userService);
        model = new ExtendedModelMap();
    }

    @Test
    public void shouldReturnCreateUserPage() throws Exception {
        //given
        String expectedPage = "users/new_user";

        //when
        String actualPage = userController.loadAddUserPage(model);

        //then
        assertThat(actualPage, is(expectedPage));
    }

    @Test
    public void shouldReturnRegisterPage() throws Exception {
        //given
        String expectedPage = "login";
        User user = new User("Ting", "123456");

        //when
        String actualPage = userController.addUser(user, model);

        //then
        assertThat(actualPage,is(expectedPage));
        verify(userService).saveUser(any(User.class));
    }

    @Test
    public void shouldThrowUserInfoEmptyWhenUserInfoIsEmpty() throws Exception {
        //given
        String expectedPage = "users/new_user";
        String errorMessage = "userName or passWord should not be empty!";
        User user = new User("", "");
        Mockito.doThrow(new UserInfoEmptyException()).when(userService).saveUser(any(User.class));

        //when
        String actualPage = userController.addUser(user, model);

        //then
        assertThat(actualPage, is(expectedPage));
        assertThat((String) model.get("errorMessage"), is(errorMessage));
    }

    @Test
    public void shouldReturnUsersPage() throws Exception {
        //given
        String expectedPage = "users/users";

        //when
        String actualPage = userController.getAllUsers(model);

        //then
        assertThat(actualPage,is(expectedPage));
        verify(userService).findAllUsers();
    }
}
