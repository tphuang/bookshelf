package com.thoughtworks.bookshelf.controller;

import com.thoughtworks.bookshelf.model.User;
import com.thoughtworks.bookshelf.service.UserService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserControllerTest {
    private UserController userController;
    private UserService userService;
    private ModelMap model;
    private HttpServletRequest request;

    @Before
    public void setUp() throws Exception {
        userService = mock(UserService.class);
        userController = new UserController(userService);
        model = new ExtendedModelMap();
        request = mock(HttpServletRequest.class);
    }

    @Test
    public void shouldReturnCreateUserPage() throws Exception {
        //given
        String expectedPage = "register";

        //when
        String actualPage = userController.createUser(model);

        //then
        assertThat(actualPage, is(expectedPage));
    }

    @Test
    @Ignore
    public void shouldReturnRegisterPage() throws Exception {
        //given
        String expectedPage = "login";
        String userName = "Ting";
        String passWord = "123456";
        User user = new User();
        when(request.getParameter("userName")).thenReturn(userName);
        when(request.getParameter("passWord")).thenReturn(passWord);
        user.setUserName(userName);
        user.setPassWord(passWord);

        //when
        String actualPage = userController.register(request, model);

        //then
        assertThat(actualPage,is(expectedPage));
        verify(userService).save(user);
    }

    @Test
    public void shoulReturnUsersPage() throws Exception {
        //given
        String expectedPage = "users";

        //when
        String actualPage = userController.getAllUsers(model);

        //then
        assertThat(actualPage,is(expectedPage));
        verify(userService).findAllUsers();
    }
}
