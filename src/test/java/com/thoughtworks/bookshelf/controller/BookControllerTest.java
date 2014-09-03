package com.thoughtworks.bookshelf.controller;

import com.thoughtworks.bookshelf.service.BookService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.ModelMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
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
        String expectedPage = "books";

        //when
        String actualPage = bookController.getAllBooks(model);

        //then
        assertThat(actualPage,is(expectedPage));
        verify(bookService).findAllbooks();
    }


}
