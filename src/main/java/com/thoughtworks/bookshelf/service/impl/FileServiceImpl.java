package com.thoughtworks.bookshelf.service.impl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.springframework.stereotype.Component;
import com.thoughtworks.bookshelf.service.FileService;

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

    public Map<String, Object> getDoubanEntity(String url){
        Client client = ClientBuilder.newClient().register(JacksonJsonProvider.class);// 注册json 支持
        WebTarget target = client.target(url);
        Response response = target.request().get();
        Map<String, Object> entity = response.readEntity(Map.class);
        return entity;
    }

    public void downLoadFile(String downLoadPath, HttpServletResponse response, BufferedInputStream bis, BufferedOutputStream bos) throws IOException {
        try {
            File downLoadFile = new File(downLoadPath);
            long fileLength = downLoadFile.length();
            response.setContentType("application/x-msdownload;");
            response.setHeader("Content-disposition", "attachment; filename="
                    + new String(downLoadFile.getName().getBytes("utf-8"), "ISO8859-1"));
            response.setHeader("Content-Length", String.valueOf(fileLength));
            bis = new BufferedInputStream(new FileInputStream(downLoadPath));
            bos = new BufferedOutputStream(response.getOutputStream());
            byte[] buff = new byte[2048];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bis != null)
                bis.close();
            if (bos != null)
                bos.close();
        }
    }

}
