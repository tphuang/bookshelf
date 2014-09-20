package com.thoughtworks.bookshelf.controller;

import com.thoughtworks.bookshelf.model.User;
import com.thoughtworks.bookshelf.service.UserService;
import com.thoughtworks.bookshelf.util.UserInfoEmptyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/user/new", method = RequestMethod.GET)
    public String loadAddUserPage(ModelMap model) {
        return "users/new_user";
    }

    @RequestMapping(value = "/user/create", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user, ModelMap model) throws Exception {
        try {
            userService.saveUser(user);
        } catch (UserInfoEmptyException e) {
            model.addAttribute("errorMessage", "userName or passWord should not be empty!");
            return "users/new_user";
        }
        model.addAttribute("successMessage", "Created successfully, please login!");
        return "login";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getAllUsers(ModelMap model) throws Exception {
        model.addAttribute("users", userService.findAllUsers());
        return "users/users";
    }
}
