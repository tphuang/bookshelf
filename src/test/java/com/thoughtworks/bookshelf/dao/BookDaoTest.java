package com.thoughtworks.bookshelf.dao;

import com.thoughtworks.bookshelf.model.Book;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:hibernate-test.xml"})
public class BookDaoTest {

    @Autowired
    private BookDao bookDao;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void shouldFindAllBooks() throws Exception {
        //given
        List<Book> books = new ArrayList<Book>();

        //when
        books = (List<Book>) bookDao.findAllBooks();

        //then
        assertNotNull(books);
    }

    @Test
    public void shouldFindBooksbyAuthorName() throws Exception {
        List<Book> books = new ArrayList<Book>();
        String author = "史杰鹏";
        books = bookDao.findBooksByAuthor(author);
    }

    @Test
    public void shouldFindBookById() throws Exception {
        //given
        Book book = initBook();
        int bookId = bookDao.createBook(book);

        //when
        Book queryBook = bookDao.findBookById(bookId);

        //then
        assertThat(queryBook.getTitle(), is(book.getTitle()));
        assertThat(queryBook.getImagePath(), is(book.getImagePath()));
        assertThat(queryBook.getAuthor(), is(book.getAuthor()));
        assertThat(queryBook.getISBN(), is(book.getISBN()));
    }

    @Test
    public void shouldAddBook() throws Exception {
        //given
        Book book = initBook();
        int before = bookDao.findAllBooks().size();

        //when
        int bookId = bookDao.createBook(book);

        //then
        assertThat(bookDao.findAllBooks().size(), is(before + 1));
    }

    @Test
    public void shouldDeleteBook() throws Exception {
        //given
        Book book = initBook();
        int bookId = bookDao.createBook(book);
        int beforeAddedSize = bookDao.findAllBooks().size();

        //when
        bookDao.deleteBookById(bookId);

        //then
        assertThat(bookDao.findAllBooks().size(), is(beforeAddedSize - 1));
    }

    @Test
    public void shouldUpdateBook() throws Exception {
        //given
        Book book = initBook();
        int bookId = bookDao.createBook(book);

        book.setTitle("小王子Updated~");
        book.setAuthor("廷鹏");
        book.setId(bookId);

        int beforeAddedSize = bookDao.findAllBooks().size();

        //when
        bookDao.updateBook(book);
        Book updatedBook = bookDao.findBookById(bookId);

        //then
        assertThat(bookDao.findAllBooks().size(), is(beforeAddedSize));
        assertThat(updatedBook.getTitle(), is(book.getTitle()));
        assertThat(updatedBook.getAuthor(), is(book.getAuthor()));
    }

    private Book initBook() {
        Book book = new Book();
        book.setTitle("小王子");
        book.setImagePath("http://img5.douban.com/lpic/s1237549.jpg");
        book.setAuthor("[法] 圣埃克苏佩里");
        book.setISBN("9787020042494");
        return book;
    }
}