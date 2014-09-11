package com.thoughtworks.bookshelf.service;


import com.thoughtworks.bookshelf.model.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookService {
    int addBook(Book book) throws SQLException, ClassNotFoundException;

    List<Book> findAllbooks() throws SQLException, ClassNotFoundException;

    Book findBookById(int bookId) throws SQLException, ClassNotFoundException;

    void updateBook(Book book) throws SQLException, ClassNotFoundException;

    void deleteBookById(int bookId) throws SQLException, ClassNotFoundException;

}
