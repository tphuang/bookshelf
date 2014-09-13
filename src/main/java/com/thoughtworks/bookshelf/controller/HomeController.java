package com.thoughtworks.bookshelf.controller;

import com.thoughtworks.bookshelf.model.BookInfo;
import com.thoughtworks.bookshelf.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/")
public class HomeController {
    private FileService fileService;
    private ServletContext context;

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

    @RequestMapping("get-douban-book")
    public String getDoubanBook(Model model) {
        String url = "https://api.douban.com/v2/book/2123092";
        Map<String, Object> bookInfoMap = fileService.getDoubanEntity(url);
        Map<String, String> imagesMap = (Map) bookInfoMap.get("images");

        BookInfo bookInfo = new BookInfo();
        bookInfo.setTitle((String) bookInfoMap.get("title"));
        bookInfo.setImagePath(imagesMap.get("large"));

        model.addAttribute("bookInfo", bookInfo);
        return "douban/douban-book";
    }

    @RequestMapping("get-douban-collections-brief")
    public String getDoubanBriefCollections(Model model) {
        ArrayList<BookInfo> bookInfos = new ArrayList<BookInfo>();
        String url = "https://api.douban.com/v2/book/user/73684180/collections";

        Map<String, Object> doubanCollectionsMap = fileService.getDoubanEntity(url);
        List<Map> collectionsList = (List<Map>) doubanCollectionsMap.get("collections");

        for (int i = 0; i < collectionsList.size(); i++) {
            Map<String, Object> colletionMap = (Map) collectionsList.get(i);
            Map<String, Object> bookInfoMap = (Map<String, Object>) colletionMap.get("book");
            Map<String, String> imagesMap = (Map) bookInfoMap.get("images");
            BookInfo bookInfo = new BookInfo();
            bookInfo.setTitle((String) bookInfoMap.get("title"));
            bookInfo.setImagePath(imagesMap.get("large"));
            bookInfos.add(bookInfo);
        }
        model.addAttribute("bookInfos", bookInfos);

        float maxPageItems = 1;
//        float items = bookInfos.size();
        model.addAttribute("maxPageItems", (int)maxPageItems);
//        model.addAttribute("totalPages", (int)Math.ceil(items/maxPageItems));
        return "douban/douban-collections-brief";
    }

    @RequestMapping("get-douban-collections-full")
    public String getDoubanFullCollections(Model model) {
        ArrayList<BookInfo> bookInfos = new ArrayList<BookInfo>();
        String url = "https://api.douban.com/v2/book/user/73684180/collections";

        Map<String, Object> doubanCollectionsMap = fileService.getDoubanEntity(url);
        List<Map> collectionsList = (List<Map>) doubanCollectionsMap.get("collections");

        for (int i = 0; i < collectionsList.size(); i++) {
            Map<String, Object> colletionMap = (Map) collectionsList.get(i);
            Map<String, Object> bookInfoMap = (Map<String, Object>) colletionMap.get("book");
            Map<String, String> imagesMap = (Map) bookInfoMap.get("images");
            List<String> authorList = (List<String>) bookInfoMap.get("author");

            BookInfo bookInfo = new BookInfo();
            bookInfo.setTitle((String) bookInfoMap.get("title"));
            bookInfo.setImagePath(imagesMap.get("large"));
            bookInfo.setAuthor(authorList.toString());
            bookInfo.setSummary((String) bookInfoMap.get("summary"));
            bookInfo.setAlt((String) bookInfoMap.get("alt"));
            bookInfos.add(bookInfo);
        }
        model.addAttribute("bookInfos", bookInfos);

        return "douban/douban-collections-full";
    }
}
