package com.thoughtworks.bookshelf.dao;

import com.thoughtworks.bookshelf.model.PhysicalBook;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BookDaoTest {
    private BookDao bookDao;
    private JdbcTemplate jdbcTemplate;
    @Before
    public void setUp() throws Exception {
        bookDao = new BookDao();
        jdbcTemplate = Mockito.mock(JdbcTemplate.class);
        bookDao.setJdbcTemplate(jdbcTemplate);
    }
    @Test
    public void should_add_book() throws Exception {
        PhysicalBook physicalBook = new PhysicalBook();
        physicalBook.setISBN("isbn");
        physicalBook.setName("spring");
        physicalBook.setPrice(11.5);
        physicalBook.setAuthor("lily");
        physicalBook.setLocation("row one");
        bookDao.addBook(physicalBook);
        verify(jdbcTemplate,times(1)).update(Mockito.eq(bookDao.ADD_BOOK),Mockito.eq("isbn"),Mockito.eq("spring"),Mockito.eq(11.5),Mockito.eq("lily"),Mockito.eq("row one"));
    }
}