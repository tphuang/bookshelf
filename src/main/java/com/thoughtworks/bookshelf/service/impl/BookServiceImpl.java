package com.thoughtworks.bookshelf.service.impl;

import com.thoughtworks.bookshelf.dao.BookDao;
import com.thoughtworks.bookshelf.model.Book;
import com.thoughtworks.bookshelf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private Book book;

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

    @Override
    public int addBook(Book book){
        int bookId = bookDao.createBook(book);
        return bookId;
    }

    @Override
    public List<Book> findAllbooks(){
        List<Book> books = new ArrayList<Book>();
        books = bookDao.findAllBooks();
        return books;
    }

    @Override
    public Book findBookById(int bookId){
        book = bookDao.findBookById(bookId);
        return book;
    }

    @Override
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    @Override
    public void deleteBookById(int bookId){
        bookDao.deleteBookById(bookId);
    }
}
