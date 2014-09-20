package com.thoughtworks.bookshelf.dao;


import com.thoughtworks.bookshelf.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component
@Transactional
public class BookDao {

    @Autowired
    private SessionFactory sessionFactory;
    private Session session;

    public List<Book> findAllBooks(){
        session = sessionFactory.getCurrentSession();
        List<Book> books = new ArrayList<Book>();
        books = session.createCriteria(Book.class).list();
        return books;
    }

    public List<Book> findBooksByAuthor(String authorName) {
        List<Book> books = new ArrayList<Book>();
        List<Book> allBooks = findAllBooks();

        for (Book book : allBooks) {
            if (authorName.equals(book.getAuthor())) {
                books.add(book);
            }
        }
        return books;
    }

    public Book findBookById(int id){
        session = sessionFactory.getCurrentSession();
        return (Book) session.get(Book.class, id);
    }

    public int createBook(Book book)  {
        session = sessionFactory.getCurrentSession();
        session.save(book);
        return book.getId();
    }

    public void deleteBookById(int bookId) {
        session = sessionFactory.getCurrentSession();
        Book book = findBookById(bookId);
        session.delete(book);
    }

    public void updateBook(Book book) {
        session = sessionFactory.getCurrentSession();
        session.update(book);
    }
}
