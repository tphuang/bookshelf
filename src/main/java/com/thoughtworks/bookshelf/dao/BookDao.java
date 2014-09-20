package com.thoughtworks.bookshelf.dao;


import com.thoughtworks.bookshelf.model.Book;
import com.thoughtworks.bookshelf.util.DBConnection;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookDao {

    static final String GET_ALL_BOOKS = "select * from BOOK";
    static final String ADD_BOOK = "insert into BOOK (title,imagePath,author,ISBN) values (?,?,?,?)";
    static final String UPDATE_BOOK = "update BOOK set title = ?, imagePath = ?, author = ?, ISBN = ? where id = ?";
    static final String DELETE_BOOK = "delete from BOOK where id = ?";
    static final String GET_BOOK_BY_ISBN = "select * from BOOK where ISBN = ?";
    static final String GET_BOOK_BY_ID = "select * from BOOK where id = ?";

    private Connection connection;
    private PreparedStatement ps;
    private Statement statement;

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
        connection = DBConnection.getConnection();
        List<Book> books = new ArrayList<Book>();
        try {
            statement = connection.createStatement();
            String query = GET_ALL_BOOKS;
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                int id = result.getInt("id");
                String title = result.getString("title");
                String imagePath = result.getString("imagePath");
                String author = result.getString("author");
                String ISBN = result.getString("ISBN");
                Book book = new Book();
                book.setId(id);
                book.setTitle(title);
                book.setImagePath(imagePath);
                book.setAuthor(author);
                book.setISBN(ISBN);
                books.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
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

    public Book findBookById(int bookId) throws SQLException, ClassNotFoundException {
        connection = DBConnection.getConnection();
        Book book = new Book();
        try {
            statement = connection.createStatement();
            String sql = GET_BOOK_BY_ID;
            ps = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, bookId);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                String title = result.getString("title");
                String imagePath = result.getString("imagePath");
                String author = result.getString("author");
                String ISBN = result.getString("ISBN");
                int id = result.getInt("id");

                book.setTitle(title);
                book.setImagePath(imagePath);
                book.setAuthor(author);
                book.setISBN(ISBN);
                book.setId(id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
        return book;
    }

    public int addBook(Book book) throws SQLException, ClassNotFoundException {
        connection = DBConnection.getConnection();//Bean
        int bookId = 0;
        try {
            connection.setAutoCommit(false);
            String sql = ADD_BOOK;
            ps = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getImagePath());
            ps.setString(3, book.getAuthor());
            ps.setString(4, book.getISBN());
            ps.executeUpdate();
            ResultSet keyResultSet = ps.getGeneratedKeys();
            if (keyResultSet.next()) {
                bookId = keyResultSet.getInt(1);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            if (connection != null) {
                connection.rollback();
            }
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
        return bookId;
    }

    public void deleteBookById(int bookId) throws SQLException, ClassNotFoundException {
        connection = DBConnection.getConnection();
        try {
            connection.setAutoCommit(false);
            String sql = DELETE_BOOK;
            ps = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, bookId);
            ps.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            if (connection != null) {
                connection.rollback();
            }
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

    public void updateBook(Book book) throws SQLException, ClassNotFoundException {
        connection = DBConnection.getConnection();
        try {
            connection.setAutoCommit(false);
            String sql = UPDATE_BOOK;
            ps = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getImagePath());
            ps.setString(3, book.getAuthor());
            ps.setString(4, book.getISBN());
            ps.setInt(5, book.getId());

            ps.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            if (connection != null) {
                connection.rollback();
            }
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }


}
