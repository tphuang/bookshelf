package com.thoughtworks.bookshelf.model;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title", length = 200)
    private String title;
    @Column(name = "imagePath", length = 255)
    private String imagePath;
    @Column(name = "author", length = 100)
    private String author;
    @Column(name = "ISBN", length = 50)
    private String ISBN;
    @Column(name = "price")
    private double price;
    @Column(name = "location", length = 255)
    private String location;

    public Book() {
    }

    public Book(String title, String imagePath, String author, String ISBN) {
        this.title = title;
        this.imagePath = imagePath;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
