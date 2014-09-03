package com.thoughtworks.bookshelf.dao;

import com.thoughtworks.bookshelf.model.Book;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

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
}