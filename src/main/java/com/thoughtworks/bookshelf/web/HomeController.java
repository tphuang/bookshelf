package com.thoughtworks.bookshelf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("home")
    public String loadHomePage(Model m) {
        m.addAttribute("name", "Tingpeng");
        return "home";
    }
}
