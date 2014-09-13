package com.thoughtworks.bookshelf.controller;

import com.thoughtworks.bookshelf.service.FileService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import javax.servlet.ServletContext;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

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

}
