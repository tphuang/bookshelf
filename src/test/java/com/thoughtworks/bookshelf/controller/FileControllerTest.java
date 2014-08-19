package com.thoughtworks.bookshelf.controller;

import com.thoughtworks.bookshelf.service.FileService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.mockito.Mockito.mock;

public class FileControllerTest {
    private  FileController fileController;
    private Model model;
    private FileService fileService;
    private HttpServletRequest request;
    private HttpServletResponse response;

    @Before
    public void setup() {
        fileService = mock(FileService.class);
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        fileController = new FileController();
        model = new ExtendedModelMap();
    }

    @Test
    public void shouldDownloadFileFromImagesDir() throws Exception {
        //Given
        String filePath = "images/bg1.jpg";

        //When
//        fileController.download(filePath, request, response);

        //Then

    }
}
