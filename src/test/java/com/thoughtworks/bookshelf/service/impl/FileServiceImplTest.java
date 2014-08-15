package com.thoughtworks.bookshelf.service.impl;

import com.thoughtworks.bookshelf.service.FileService;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FileServiceImplTest {
    private FileService fileService;

    @Before
    public void setUp() throws Exception {
        fileService = new FileServiceImpl();
    }

    @Test
    public void shouldReturnTrueWhenAskWhetherFileIsImageForAJPGFile() throws Exception {

        boolean imageFile = fileService.isImageFile(new File("test.jpg"));
        assertThat(imageFile, is(true));
    }


    @Test
    public void shouldReturnFalseWhenAskWhetherFileIsImageForATextFileContainsJPG() throws Exception {

        boolean imageFile = fileService.isImageFile(new File("test.jpg.txt"));
        assertThat(imageFile, is(false));
    }

    @Test
    public void shouldGetResponseWhenGetDoubanBook() throws Exception {
        String url= "https://api.douban.com/v2/book/2123092";
        Map<String, Object> bookInfo = fileService.getDoubanEntity(url);
        assertThat((String) bookInfo.get("title"), is("Web开发敏捷之道"));
        Map images = (Map) bookInfo.get("images");
        assertThat(images.size(),is(3));
        assertThat((String)images.get("large"),is("http://img3.douban.com/lpic/s5843032.jpg"));
    }
}
