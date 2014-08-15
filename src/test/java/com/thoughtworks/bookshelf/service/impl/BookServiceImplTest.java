package com.thoughtworks.bookshelf.service.impl;

import com.thoughtworks.bookshelf.dao.BookDao;
import com.thoughtworks.bookshelf.model.PhysicalBook;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BookServiceImplTest {
    private BookServiceImpl bookServiceImpl;
    private BookDao bookDao;

    @Before
    public void setUp() throws Exception {

        bookDao = Mockito.mock(BookDao.class);
        bookServiceImpl = new BookServiceImpl();
        bookServiceImpl.setBookDao(bookDao);
    }

    @Test
    public void should_add_book() throws Exception {
        PhysicalBook physicalBook = new PhysicalBook();
        bookDao.addBook(physicalBook);
        verify(bookDao,times(1)).addBook(physicalBook);
    }

    @Test
    public void should_get_book_by_ISBN() throws Exception {
        String isbn = "";
        bookDao.getBookByISBN(isbn);
        verify(bookDao,times(1)).getBookByISBN(isbn);
    }

    @Test
    public void testModifyBook() throws Exception {

    }

    @Test
    public void testGetAllBooks() throws Exception {

    }

    @Test
    public void testDeleteBookByISBN() throws Exception {

    }

    @Test
    public void testDeleteAllBooks() throws Exception {

    }
}