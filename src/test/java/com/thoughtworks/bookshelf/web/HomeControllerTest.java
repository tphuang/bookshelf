package com.thoughtworks.bookshelf.web;

import com.thoughtworks.bookshelf.service.FileService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import javax.servlet.ServletContext;
import java.util.HashMap;

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
    public void testLoadHomePage() throws Exception {

    }

    @Test
    public void shouldReturnDoubanBookPage() throws Exception {

        //given
        String expected = "douban_book";
        String url = "https://api.douban.com/v2/book/2123092";
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("title", "小王子");
        HashMap<String, String> imageHashMap = new HashMap<String, String>();
        imageHashMap.put("large", "http://xiaowangzi.jpg");
        hashMap.put("images", imageHashMap);

        when(fileService.getDoubanBook(anyString())).thenReturn(hashMap);

       //when
        String result = homeController.getDoubanBook(model);

        //then
        assertThat((String) model.asMap().get("title"), is("小王子"));
        assertThat((String) model.asMap().get("imagePath"), is("http://xiaowangzi.jpg"));
        assertThat(result, is(expected));
    }
}
