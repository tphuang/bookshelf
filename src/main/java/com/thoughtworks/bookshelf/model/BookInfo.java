package com.thoughtworks.bookshelf.model;

import java.io.Serializable;

public class BookInfo implements Serializable {

    private static final long serialVersionUID = 2179631010054135058L;
    private String title;
    private Images images;

    public BookInfo() {
    }

    public BookInfo(String title, Images images) {
        this.title = title;
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }
}