package com.thoughtworks.bookshelf.web;

import com.thoughtworks.bookshelf.service.FileService;
import com.thoughtworks.bookshelf.service.impl.FileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private FileService fileService;

    @Autowired
    private ServletContext context;

    public HomeController() {
        fileService = new FileServiceImpl();
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
        model.addAttribute("name", "Tingpeng");

        return "home";
    }

    @RequestMapping("get-douban-book")
    public String getDoubanBook (Model model) {
        String url = "https://api.douban.com/v2/book/2123092";
        Map<String, Object> bookInfo = fileService.getDoubanBook(url);
        model.addAttribute("title", bookInfo.get("title"));
        Map images = (Map) bookInfo.get("images");
        String imagesPath = (String) images.get("large");
        model.addAttribute("imagePath", imagesPath);

        return "douban_book";
    }
}
