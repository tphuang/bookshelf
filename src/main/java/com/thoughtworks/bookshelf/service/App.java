package com.thoughtworks.bookshelf.service;

import com.thoughtworks.bookshelf.service.impl.FileServiceImpl;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.List;


public class App
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );

        FileService fileService = new FileServiceImpl();
        List<File> imageFiles = fileService.readFile("/Users/tphuang/Projects/Java/bookshelf/src/main/webapp/images");
        for(File file :imageFiles){
            System.out.println(file.getName() + "\t"+ file.getPath());
        }
        System.out.println(imageFiles);

        System.out.println("It's ok now!");
    }

}