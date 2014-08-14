package com.thoughtworks.bookshelf.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface FileService {
    List<File> readFile(String filePath) throws IOException;

    boolean isImageFile(File file);
    Map<String, Object> getDoubanBook(String url);
}
