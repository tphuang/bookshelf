package com.thoughtworks.bookshelf.service;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface FileService {
    List<File> readFile(String filePath) throws IOException;

    boolean isImageFile(File file);
    Map<String, Object> getDoubanEntity(String url);
    void downLoadFile(String downLoadPath, HttpServletResponse response, BufferedInputStream bis, BufferedOutputStream bos) throws IOException;
}
