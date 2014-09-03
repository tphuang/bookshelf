package com.thoughtworks.bookshelf.dao;


import com.thoughtworks.bookshelf.model.Book;
import com.thoughtworks.bookshelf.util.DBConnection;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookDao {

    static final String SELECT_ALL_BOOKS = "select * from BOOK";
    static final String ADD_BOOK = "insert into BOOKS (title,imagePath,author,ISBN) values (?,?,?,?)";
    static final String UPDATE_BOOK = "update BOOKS set title = ?, imagePath = ?, author = ?, ISBN = ?";
    static final String DELETE_BOOK = "delete from BOOKS where ISBN = ";
    static final String GET_BOOK = "select * from BOOKS where ISBN =";

//    @Autowired
//    public JdbcTemplate jdbcTemplate;
//
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public void addBook(Book book) {
//        jdbcTemplate.update(ADD_BOOK, new Object[]{book.getISBN(), book.getName(), book.getPrice(), book.getAuthor(), book.getLocation()});
//    }

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

    public List<Book> findAllBooks() throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getConnection();
        List<Book> books = new ArrayList<Book>();
        try {
            Statement sql_statement = conn.createStatement();
            String query = "select * from book";
            ResultSet result = sql_statement.executeQuery(query);

            while (result.next()) {
                String title = result.getString("title");
                String imagePath = result.getString("imagePath");
                String author = result.getString("author");
                String ISBN = result.getString("ISBN");
                Book book = new Book();
                book.setTitle(title);
                book.setImagePath(imagePath);
                book.setAuthor(author);
                book.setISBN(ISBN);
                books.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return books;
    }

    public List<Book> findBooksByAuthor(String authorName) throws SQLException, ClassNotFoundException {
        List<Book> books = new ArrayList<Book>();
        List<Book> allBooks = findAllBooks();

        for (Book book : allBooks) {
            if (authorName.equals(book.getAuthor())) {
                books.add(book);
            }
        }
        return books;
    }

}
