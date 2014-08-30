package com.thoughtworks.bookshelf.model;

import java.io.Serializable;

public class BookInfo implements Serializable {

    private static final long serialVersionUID = 2179631010054135058L;
    private String title;
    private String imagePath;
    private String author;
    private String summary;
    private String alt;

    public BookInfo() {
    }

    public BookInfo(String title, String imagePath, String author, String summary, String alt) {
        this.title = title;
        this.imagePath = imagePath;
        this.author = author;
        this.summary = summary;
        this.alt = alt;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
}