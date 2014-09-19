package com.thoughtworks.bookshelf.dao;

import com.thoughtworks.bookshelf.model.Book;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BookDaoTest {
    private BookDao bookDao;
    private JdbcTemplate jdbcTemplate;
    @Before
    public void setUp() throws Exception {
        bookDao = new BookDao();
//        jdbcTemplate = Mockito.mock(JdbcTemplate.class);
//        bookDao.setJdbcTemplate(jdbcTemplate);
    }
//    @Test
//    public void should_add_book() throws Exception {
//        PhysicalBook physicalBook = new PhysicalBook();
//        physicalBook.setISBN("isbn");
//        physicalBook.setName("spring");
//        physicalBook.setPrice(11.5);
//        physicalBook.setAuthor("lily");
//        physicalBook.setLocation("row one");
//        bookDao.addBook(physicalBook);
//        verify(jdbcTemplate,times(1)).update(Mockito.eq(bookDao.ADD_BOOK),Mockito.eq("isbn"),Mockito.eq("spring"),Mockito.eq(11.5),Mockito.eq("lily"),Mockito.eq("row one"));
//    }

    @Test
    public void shouldFindAllBooks() throws Exception {
        List<Book> books = new ArrayList<Book>();
        books = (List<Book>) bookDao.findAllBooks();

        System.out.println(books.get(0).getTitle());
    }

    @Test
    public void shouldFindBooksbyAuthorName() throws Exception {
        List<Book> books = new ArrayList<Book>();
        String author = "史杰鹏";
        books = bookDao.findBooksByAuthor(author);

        System.out.println(books);
    }

    @Test
    public void shouldFindBookById() throws Exception {
        //given
        Book book = initBook();
        int bookId = bookDao.addBook(book);

        //when
        Book queryBook = bookDao.findBookById(bookId);

        //then
        assertThat(queryBook.getTitle(),is(book.getTitle()));
        assertThat(queryBook.getImagePath(),is(book.getImagePath()));
        assertThat(queryBook.getAuthor(),is(book.getAuthor()));
        assertThat(queryBook.getISBN(),is(book.getISBN()));
    }

    @Test
    @Ignore
    public void shouldAddBook() throws Exception {
        //given
        Book book = initBook();
        int beforeAddedSize = bookDao.findAllBooks().size();
        //when
        int bookId = bookDao.addBook(book);

        //then
        assertThat(bookDao.findAllBooks().size(), is(beforeAddedSize + 1));
    }

    @Test
    public void shouldDeleteBook() throws Exception {
        //given
        Book book = initBook();
        int bookId = bookDao.addBook(book);
        int beforeAddedSize = bookDao.findAllBooks().size();
        //when
        bookDao.deleteBookById(bookId);

        //then
        assertThat(bookDao.findAllBooks().size(), is(beforeAddedSize - 1));
    }

    @Test
    @Ignore
    public void shouldUpdateBook() throws Exception {
        //given
        Book book = initBook();
        int bookId = bookDao.addBook(book);

        book.setTitle("小王子Updated~");
        book.setAuthor("廷鹏");
        book.setId(bookId);

        int beforeAddedSize = bookDao.findAllBooks().size();

        //when
        bookDao.updateBook(book);
        Book updatedBook = bookDao.findBookById(bookId);

        //then
        assertThat(bookDao.findAllBooks().size(), is(beforeAddedSize));
        assertThat(updatedBook.getTitle(),is(book.getTitle()));
        assertThat(updatedBook.getAuthor(),is(book.getAuthor()));
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