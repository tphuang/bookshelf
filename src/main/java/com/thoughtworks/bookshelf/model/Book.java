package com.thoughtworks.bookshelf.model;

public class Book {
    private String title;
    private String imagePath;
    private String author;
    private String ISBN;
    private String name;
    private double price;
    private String location;

    public Book() {
    }

    public Book(String title, String imagePath, String author, String ISBN) {
        this.title = title;
        this.imagePath = imagePath;
        this.author = author;
        this.ISBN = ISBN;
    }

    public Book(String ISBN, String name, double price, String author, String location) {
        this.ISBN = ISBN;
        this.name = name;
        this.price = price;
        this.author = author;
        this.location = location;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    public abstract String display();

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
