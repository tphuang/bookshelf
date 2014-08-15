package com.thoughtworks.bookshelf.dao;


import com.thoughtworks.bookshelf.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
//@Component
public class BookDao {

    static final String SELECT_ALL_BOOKS = "select * from BOOKS";
    static final String ADD_BOOK = "insert into BOOKS (ISBN,name,price,author,location) values (?,?,?,?,?)";
    static final String UPDATE_BOOK = "update BOOKS set ISBN = ?, name = ?, price = ?, author = ?, location = ?";
    static final String DELETE_BOOK =  "delete from BOOKS where ISBN = ";
    static final String GET_BOOK = "select * from BOOKS where ISBN =";

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addBook(Book book) {
        jdbcTemplate.update(ADD_BOOK, new Object[]{book.getISBN(), book.getName(), book.getPrice(),book.getAuthor(),book.getLocation()});
    }

    public Book getBookByISBN(String isbn) {

        return null;
    }

    public void modifyBook(Book book) {

    }

    public List<Book> getAllBooks() {
        return null;
    }

    public void deleteBookByISBN(String isbn) {

    }

    public void deleteAllBooks() {

    }
}
