package com.thoughtworks.bookshelf.web;

import com.thoughtworks.bookshelf.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private FileService fileService;

    @RequestMapping("home")
    public String loadHomePage(Model model)  {
        try {
            List<File> imageFiles = fileService.readFile("/Users/tphuang/Projects/Java/bookshelf/src/main/webapp/images");
            model.addAttribute("imageFiles", imageFiles);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        model.addAttribute("name", "Tingpeng");

        return "home";
    }
}
