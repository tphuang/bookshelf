package com.thoughtworks.bookshelf.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface FileService {
    List<File> readFile(String filepath) throws FileNotFoundException, IOException;

    boolean isImageFile(File file);
}
