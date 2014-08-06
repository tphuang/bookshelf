package com.thoughtworks.bookshelf.service.impl;

import com.thoughtworks.bookshelf.service.FileService;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class FileServiceImpl implements FileService {

    public List<File> readFile(String filepath) throws IOException {
        List<File> imageFiles = new ArrayList<File>();
        File file = new File(filepath);

        if (!file.isDirectory() && isImageFile(file)){
              imageFiles.add(file);
        }else if (file.isDirectory()) {
            String[] filelist = file.list();
            for (int i = 0; i < filelist.length; i++) {
                File dirFile = new File(filepath + "//" + filelist[i]);
                if (!dirFile.isDirectory() && isImageFile(dirFile)) {
                    imageFiles.add(dirFile);
                }else if(dirFile.isDirectory()){
                    imageFiles.addAll(readFile(filepath + "//" + filelist[i]));
                }//else if
            }// for
        }// else if (file.isDirectory())
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
