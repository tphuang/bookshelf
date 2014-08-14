package com.thoughtworks.bookshelf.web;

import com.thoughtworks.bookshelf.service.FileService;
import com.thoughtworks.bookshelf.service.impl.FileServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HomeControllerTest {
    private HomeController homeController;
    private Model model;
    private FileService fileService;

    @Before
    public void setup() {
        homeController = new HomeController();
        model = new ExtendedModelMap();
        fileService = Mockito.mock(FileServiceImpl.class);
    }

    @Test
    public void testLoadHomePage() throws Exception {

    }

    @Test
    public void shouldReturnDoubanBookPage() throws Exception {
        String result = homeController.getDoubanBook(model);
        String expected = "douban_book";
        String url = "https://api.douban.com/v2/book/2123092";
//        verify(fileService,times(1)).getDoubanBook(url);
        assertThat(result,is(expected));
    }
}
