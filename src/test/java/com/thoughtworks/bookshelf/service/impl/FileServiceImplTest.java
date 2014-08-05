package com.thoughtworks.bookshelf.service.impl;

import com.thoughtworks.bookshelf.service.FileService;
import org.junit.Test;

import java.io.File;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FileServiceImplTest {
    FileService fileService = new FileServiceImpl() ;

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

}
