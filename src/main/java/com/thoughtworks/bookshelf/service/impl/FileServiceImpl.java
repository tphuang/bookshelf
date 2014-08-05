package com.thoughtworks.bookshelf.service.impl;

import com.thoughtworks.bookshelf.service.FileService;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class FileServiceImpl implements FileService {
    private List<File> imageFiles = new ArrayList<File>();

    public List<File> readFile(String filepath) throws IOException {
        File file = new File(filepath);

        if (file.isDirectory()) {
            String[] filelist = file.list();
            System.out.println(filelist);
            for (int i = 0; i < filelist.length; i++) {
                File dirFile = new File(filepath + "//" + filelist[i]);
                System.out.println(filelist[i]);
                if (!dirFile.isDirectory() && isImageFile(dirFile)) {
                    System.out.println(isImageFile(dirFile));
                    imageFiles.add(dirFile);
                }
            }
        }
        return imageFiles;
    }

    public boolean isImageFile(File file) {
        String[] images = {".jpg", ".png", ".gif"};
        for(int i = 0;i< images.length; i++){
            if (file.getName().endsWith(images[i])) return true ;
        }
        return false;
    }
}
