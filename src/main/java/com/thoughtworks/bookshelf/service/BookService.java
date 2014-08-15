package com.thoughtworks.bookshelf.service;


import com.thoughtworks.bookshelf.model.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);

    Book getBookByISBN(String s);

    void modifyBook(Book book);

    List<Book> getAllBooks();

    void deleteBookByISBN(String isbn);

    void deleteAllBooks();
}
