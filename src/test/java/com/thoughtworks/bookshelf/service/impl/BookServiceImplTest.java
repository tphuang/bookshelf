package com.thoughtworks.bookshelf.service.impl;

import com.thoughtworks.bookshelf.dao.BookDao;
import com.thoughtworks.bookshelf.model.Book;
import com.thoughtworks.bookshelf.service.BookService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;

public class BookServiceImplTest {
    private BookService bookService;
    private BookDao bookDao;

    @Before
    public void setUp() throws Exception {
        bookDao = Mockito.mock(BookDao.class);
        bookService = new BookServiceImpl(bookDao);
    }

//    @Test
//    public void should_add_book() throws Exception {
//        PhysicalBook physicalBook = new PhysicalBook();
//        bookDao.addBook(physicalBook);
//        verify(bookDao, times(1)).addBook(physicalBook);
//    }

    @Test
    public void should_get_book_by_ISBN() throws Exception {
        String isbn = "";
        bookDao.getBookByISBN(isbn);
        verify(bookDao, times(1)).getBookByISBN(isbn);
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

    @Test
    public void shouldFindAllBooks() throws Exception {
        //given
        List<Book> expectedBooks = new ArrayList<Book>();
        Book book1 = new Book("楚墓", "http://img3.douban.com/mpic/s27319625.jpg", "史杰鹏", "9787218093819");
        Book book2 = new Book("楚墓", "http://img3.douban.com/mpic/s27319625.jpg", "史杰鹏", "9787218093819");
        Book book3 = new Book("楚墓", "http://img3.douban.com/mpic/s27319625.jpg", "史杰鹏", "9787218093819");
        expectedBooks.add(book1);
        expectedBooks.add(book2);
        expectedBooks.add(book3);
        when(bookDao.findAllBooks()).thenReturn(expectedBooks);

        //when
        List<Book> actualBooks = bookService.findAllbooks();

        //then
        verify(bookDao).findAllBooks();
        assertThat(actualBooks.size(), is(3));
    }
}