package com.thoughtworks.bookshelf.service.impl;

import com.thoughtworks.bookshelf.service.FileService;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.springframework.stereotype.Component;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class FileServiceImpl implements FileService {

    public List<File> readFile(String filePath) throws IOException {
        List<File> imageFiles = new ArrayList<File>();
        File file = new File(filePath);

        if (!file.isDirectory() && isImageFile(file)) {
            imageFiles.add(file);
        } else if (file.isDirectory()) {
            String[] fileList = file.list();
            for (String tempFile : fileList) {
                readSubDirs(filePath, imageFiles, tempFile);
            }
        }
        return imageFiles;
    }

    private void readSubDirs(String filePath, List<File> imageFiles, String tempFile) throws IOException {
        File dirFile = new File(filePath + "//" + tempFile);
        if (!dirFile.isDirectory() && isImageFile(dirFile)) {
            imageFiles.add(dirFile);
        } else if (dirFile.isDirectory()) {
            imageFiles.addAll(readFile(filePath + "//" + tempFile));
        }
    }

    public boolean isImageFile(File file) {
        String[] images = {".jpg", ".png", ".gif"};
        for (String image : images) {
            if (file.getName().endsWith(image)) return true;
        }
        return false;
    }

    public Map<String, Object> getDoubanBook(String url){
        Client client = ClientBuilder.newClient().register(JacksonJsonProvider.class);// 注册json 支持
        WebTarget target = client.target(url);
        Response response = target.request().get();
        Map<String, Object> bookInfo = response.readEntity(Map.class);
        return bookInfo;
    }

}
