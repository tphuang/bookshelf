package com.thoughtworks.bookshelf.controller;

import com.thoughtworks.bookshelf.model.BookInfo;
import com.thoughtworks.bookshelf.service.FileService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import javax.servlet.ServletContext;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HomeControllerTest {
    private HomeController homeController;
    private Model model;
    private FileService fileService;
    private ServletContext context;

    @Before
    public void setup() {
        fileService = mock(FileService.class);
        context = mock(ServletContext.class);
        homeController = new HomeController(fileService, context);
        model = new ExtendedModelMap();
    }

    @Test
    public void shouldLoadHomePage() throws Exception {
        //given
        List<File> imageFiles = new ArrayList<File>();
        String contextPath = "/Users/bookshelf/webapp" ;
        String expectedPage = "home";
        File file1 = new File("/Users/bookshelf/webapp/images/bg1.jpg");
        File file2 = new File("/Users/bookshelf/webapp/images/bg2.gif");
        imageFiles.add(file1);
        imageFiles.add(file2);

        when(fileService.readFile(anyString())).thenReturn(imageFiles);
        when(context.getRealPath("/")).thenReturn(contextPath);

        //when
        String resultPage = homeController.loadHomePage(model);

        //then
        assertThat((List<File>) model.asMap().get("imageFiles"), is(imageFiles));
        assertThat((String)model.asMap().get("contextPath"), is(contextPath + "/"));
        assertThat(resultPage, is(expectedPage));
    }

    @Test
    public void shouldReturnDoubanBookPage() throws Exception {

        //given
        String expected = "douban_book";
        Map<String, Object> bookInfoMap = new HashMap<String, Object>();
        bookInfoMap.put("title", "小王子");
        Map<String, String> imagesMap = new HashMap<String, String>();
        imagesMap.put("large", "http://xiaowangzi.jpg");
        bookInfoMap.put("images", imagesMap);

        when(fileService.getDoubanEntity(anyString())).thenReturn(bookInfoMap);

        //when
        String result = homeController.getDoubanBook(model);

        //then
        assertThat((String) model.asMap().get("title"), is("小王子"));
        assertThat((String) model.asMap().get("imagePath"), is("http://xiaowangzi.jpg"));
        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnDoubanCollectionsPage() throws Exception {

        //given
        String expected = "douban_book";
        int expectedMaxPageItems = 1;
        HashMap<String, Object> doubanCollectionsMap = new HashMap<String, Object>();
        List<Map> collectionsList = new ArrayList();
        Map<String, Object> colletionMap = new HashMap<String, Object>();
        Map<String, Object> bookInfoMap = new HashMap<String, Object>();
        Map<String, String> imagesMap = new HashMap<String, String>();

        imagesMap.put("large", "http://xiaowangzi.jpg");
        bookInfoMap.put("title", "小王子");
        bookInfoMap.put("images", imagesMap);
        colletionMap.put("book", bookInfoMap);
        collectionsList.add(colletionMap);
        doubanCollectionsMap.put("collections", collectionsList);

        when(fileService.getDoubanEntity(anyString())).thenReturn(doubanCollectionsMap);

        //when
        String result = homeController.getDoubanCollections(model);
        List<BookInfo> bookInfos = (List<BookInfo>) model.asMap().get("bookInfos");
        int resultMaxPageItems = Integer.parseInt(model.asMap().get("maxPageItems").toString());

        //then
        assertThat(bookInfos.get(0).getTitle(), is("小王子"));
        assertThat(bookInfos.get(0).getImagePath(), is("http://xiaowangzi.jpg"));
        assertThat(resultMaxPageItems, is(expectedMaxPageItems));
        assertThat(result, is(expected));
    }
}
