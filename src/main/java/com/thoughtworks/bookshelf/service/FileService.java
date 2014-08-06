package com.thoughtworks.bookshelf.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface FileService {
    List<File> readFile(String filePath) throws IOException;

    boolean isImageFile(File file);
}
