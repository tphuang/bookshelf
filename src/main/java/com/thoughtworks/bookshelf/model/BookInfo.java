package com.thoughtworks.bookshelf.model;

import java.io.Serializable;

public class BookInfo implements Serializable {

    private static final long serialVersionUID = 2179631010054135058L;
    private String title;
    private String imagePath;

    public BookInfo() {
    }

    public BookInfo(String title, String imagePath) {
        this.title = title;
        this.imagePath = imagePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}