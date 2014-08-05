package com.thoughtworks.bookshelf.web;

import com.thoughtworks.bookshelf.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Request;

import javax.servlet.http.HttpServletRequest;
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
    public String loadHomePage(HttpServletRequest request, Model model)  {
        try {
            String contextPath = request.getRealPath("/");
            String imagesPath = contextPath + "/images";
            System.out.println(imagesPath);
            List<File> imageFiles = fileService.readFile(imagesPath);
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
