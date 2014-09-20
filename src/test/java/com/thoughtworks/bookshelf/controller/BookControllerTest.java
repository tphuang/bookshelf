package com.thoughtworks.bookshelf.controller;

import com.thoughtworks.bookshelf.model.Book;
import com.thoughtworks.bookshelf.service.BookService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.ModelMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookControllerTest {
    private BookService bookService;
    private BookController bookController;
    private ModelMap model;

    @Before
    public void setUp() throws Exception {
        bookService = mock(BookService.class);
        bookController = new BookController(bookService);
        model = new ExtendedModelMap();

    }

    @Test
    public void shouldReturnBooksPage() throws Exception {

        //given
        String expectedPage = "books/books";

        //when
        String actualPage = bookController.getAllBooks(model);

        //then
        assertThat(actualPage, is(expectedPage));
        verify(bookService).findAllbooks();
    }

    @Test
    public void shouldAddBookAndRedirectToBooksPage() throws Exception {
        //given
        String expectedPage = "redirect:/books";
        Book book = addedBook();

        //when
        String actualPage = bookController.addBook(book, model);

        //then
        assertThat(actualPage, is(expectedPage));
        verify(bookService).addBook(any(Book.class));
    }

    @Test
    public void shouldDeleteBookAndRedirectToBooksPage() throws Exception {
        //given
        String expectedPage = "redirect:/books";
        Book book = addedBook();

        //when
        String actualPage = bookController.deleteBook(book.getId(), model);

        //then
        assertThat(actualPage, is(expectedPage));
        verify(bookService).deleteBookById(book.getId());
    }

    @Test
    public void shouldUpdateBookAndRedirectToBooksPage() throws Exception {
        //given
        String expectedPage = "redirect:/books";
        Book book = addedBook();

        book.setAuthor("Tingpeng");

        //when
        String actualPage = bookController.updateBook(book);

        //then
        assertThat(actualPage, is(expectedPage));
        verify(bookService).updateBook(any(Book.class));
    }

    private Book addedBook() {
        Book book = new Book();
        book.setTitle("小王子");
        book.setImagePath("http://img5.douban.com/lpic/s1237549.jpg");
        book.setAuthor("[法] 圣埃克苏佩里");
        book.setISBN("9787020042494");
        book.setId(11);
        return book;
    }


}
