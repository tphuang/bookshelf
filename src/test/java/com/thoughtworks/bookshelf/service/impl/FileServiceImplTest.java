package com.thoughtworks.bookshelf.service.impl;

import com.thoughtworks.bookshelf.service.FileService;
import org.junit.Before;
import org.junit.Test;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;


public class FileServiceImplTest {
    private FileService fileService;
    private HttpServletResponse response;
    private BufferedInputStream bis;
    private BufferedOutputStream bos;

    @Before
    public void setUp() throws Exception {
        fileService = new FileServiceImpl();
        response = mock(HttpServletResponse.class);
        bis = mock(BufferedInputStream.class);
        bos = mock(BufferedOutputStream.class);
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
    public void shouldGetJsonEntityWhenGetDoubanBook() throws Exception {
        String url= "https://api.douban.com/v2/book/2123092";
        Map<String, Object> bookInfo = fileService.getDoubanEntity(url);
        assertThat((String) bookInfo.get("title"), is("Web开发敏捷之道"));
        Map images = (Map) bookInfo.get("images");
        assertThat(images.size(),is(3));
        assertThat((String)images.get("large"),is("http://img3.douban.com/lpic/s5843032.jpg"));
    }

    @Test
    public void shouldDownLoadFileWhenFilePathValid() throws Exception {
        String downLoadPath = "/Users/tphuang/Projects/Java/bookshelf/src/main/webapp/images/bg1.jpg";

//        fileService.downLoadFile(downLoadPath,response,bis,bos);

    }
}
