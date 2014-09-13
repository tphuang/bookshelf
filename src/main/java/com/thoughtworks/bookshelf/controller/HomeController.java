package com.thoughtworks.bookshelf.controller;

import com.thoughtworks.bookshelf.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.security.Principal;
import java.util.List;


@Controller
@SessionAttributes("userName")
@RequestMapping("/")
public class HomeController {
    private FileService fileService;
    private ServletContext context;
    private static final String EMPTY_STR = "";

    @Autowired
    public HomeController(FileService fileService, ServletContext context) {
        this.fileService = fileService;
        this.context = context;
    }

    @RequestMapping("home")
    public String loadHomePage(Model model) {
        try {
            String imagesPath = context.getRealPath("/images");
            List<File> imageFiles = fileService.readFile(imagesPath);
            model.addAttribute("imageFiles", imageFiles);
            model.addAttribute("contextPath", context.getRealPath("/") + "/");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model, Principal principal) {
        if (null == principal) {
            return "login";
        }
        loadHomePage(model);
        return "home";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(ModelMap model, HttpSession session) {
        String userName = (String) session.getAttribute("userName");
        if (userName == null || EMPTY_STR.equals(userName)) {
            return "login";
        }
        return "redirect:/home";
    }

    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout(ModelMap model, HttpSession session) {
        if (session != null) {
//            session.invalidate();
            session.removeAttribute("userName");
        }
        return "redirect:/login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginValidation(HttpServletRequest request, Principal principal, ModelMap model) {
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");

        if (userName.equals("Tingpeng") && passWord.equals("123456")) {

            request.getSession().setAttribute("userName", userName);
            return "redirect:/home";
        }
        model.addAttribute("error","true");
        return "login";
    }
}
