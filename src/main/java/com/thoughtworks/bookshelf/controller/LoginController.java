package com.thoughtworks.bookshelf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;

@Controller
@SessionAttributes("userName")
public class LoginController {

    public static final String EMPTY_STR = "";

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model, HttpSession session) {
        String userName = (String) session.getAttribute("userName");
        if (userName == null || EMPTY_STR.equals(userName)) {
            return "login";
        }
        return "redirect:/home";
    }

    @RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
    public String loginfailed(ModelMap model) {
        model.addAttribute("error", "true");
        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(ModelMap model, HttpSession session) {
        if (session != null) {
//            session.invalidate();
            session.removeAttribute("userName");
        }
        return "redirect:/login";
    }

    @RequestMapping(value = "login-validation", method = RequestMethod.POST)
    public String loginValidation(HttpServletRequest request, Principal principal, ModelMap model) {
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");

        if (userName.equals("Tingpeng") && passWord.equals("123456")) {

            request.getSession().setAttribute("userName", userName);
            return "redirect:/home";
        }
        return "login";
    }
}
