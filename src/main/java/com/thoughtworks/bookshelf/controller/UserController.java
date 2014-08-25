package com.thoughtworks.bookshelf.controller;

import com.thoughtworks.bookshelf.model.User;
import com.thoughtworks.bookshelf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createUser(ModelMap model) {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(HttpServletRequest request, ModelMap model) throws Exception {
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        User user = new User();
        user.setUserName(userName);
        user.setPassWord(passWord);
        userService.save(user);
        model.addAttribute("message","Created an account successfully,  please login!");
        return "login";
    }
}
