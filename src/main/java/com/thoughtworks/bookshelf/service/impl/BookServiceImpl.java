package com.thoughtworks.bookshelf.service.impl;

import com.thoughtworks.bookshelf.dao.BookDao;
import com.thoughtworks.bookshelf.model.Book;
import com.thoughtworks.bookshelf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    public BookDao bookDao;

    @Autowired
    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

//    @Override
//    public void addBook(Book book) {
//        bookDao.addBook(book);
//    }

    @Override
    public Book getBookByISBN(String isbn) {
        return bookDao.getBookByISBN(isbn);
    }

    @Override
    public void modifyBook(Book book) {
        bookDao.modifyBook(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Override
    public void deleteBookByISBN(String isbn) {
        bookDao.deleteBookByISBN(isbn);
    }

    @Override
    public void deleteAllBooks() {
        bookDao.deleteAllBooks();
    }

    @Override
    public List<Book> findAllbooks() throws SQLException, ClassNotFoundException {
        List<Book> books = new ArrayList<Book>();
        books = bookDao.findAllBooks();
        return books;
    }
}
