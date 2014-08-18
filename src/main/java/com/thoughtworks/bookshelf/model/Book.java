package com.thoughtworks.bookshelf.model;

public abstract class Book {
    private String ISBN;
    private String name;
    private double price;
    private String author;
    private String location;

    public Book() {
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

    public abstract String display();
}