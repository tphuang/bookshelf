package com.thoughtworks.bookshelf.web;

import com.thoughtworks.bookshelf.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private FileService fileService;

    @Autowired
    private ServletContext context;

    @RequestMapping("home")
    public String loadHomePage(Model model) {
        try {
            String imagesPath = context.getRealPath("/images");
            System.out.println("****" + imagesPath);
            List<File> imageFiles = fileService.readFile(imagesPath);
            model.addAttribute("imageFiles", imageFiles);
            model.addAttribute("contextPath", context.getRealPath("/") + "/");
        } catch (IOException e) {
            e.printStackTrace();
        }
        model.addAttribute("name", "Tingpeng");

        return "home";
    }
}
