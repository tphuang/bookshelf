package com.thoughtworks.bookshelf.service;


import com.thoughtworks.bookshelf.model.Book;

import java.util.List;

public interface BookService {
    int addBook(Book book);

    List<Book> findAllbooks();

    Book findBookById(int bookId);

    void updateBook(Book book);

    void deleteBookById(int bookId);

}
