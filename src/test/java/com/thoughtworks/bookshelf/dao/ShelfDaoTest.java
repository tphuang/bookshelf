package com.thoughtworks.bookshelf.dao;

import com.thoughtworks.bookshelf.model.Shelf;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:hibernate-test.xml"})
public class ShelfDaoTest {

    @Autowired
    private ShelfDao shelfDao;
    private Shelf shelf;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void shouldGetShelfById() throws Exception {
        //given
        Shelf shelf = shelfDao.createShlef(initShelf());

        //when~
        Shelf queriedShelf = shelfDao.findShelfById(shelf.getId());

        //then
        assertThat(queriedShelf.getCapacity(), is(shelf.getCapacity()));
        assertThat(queriedShelf.getPosition(), is(shelf.getPosition()));
    }

    @Test
    public void shouldGetAllShelves() throws Exception {
        //given
        List<Shelf> shelfs = new ArrayList<Shelf>();

        //when
        shelfs = shelfDao.findAll();

        //then
        assertNotNull(shelfs);
    }

    @Test
    public void shouldAddShelf() throws Exception {
        //given
        Shelf shelf = initShelf();
        int beforeCreatedSize = shelfDao.findAll().size();

        //when
        Shelf ceatedShelf = shelfDao.createShlef(shelf);

        //then
        assertThat(ceatedShelf.getCapacity(), is(shelf.getCapacity()));
        assertThat(ceatedShelf.getPosition(), is(shelf.getPosition()));
        assertThat(shelfDao.findAll().size(), is(beforeCreatedSize + 1));
    }

    @Test
    public void shouldDeleteShelf() throws Exception {
        //given
        Shelf shelf = initShelf();
        shelfDao.createShlef(shelf);

        //when
        shelfDao.deleteShelfById(shelf.getId());

        //then
        assertNull(shelfDao.findShelfById(shelf.getId()));
    }

    @Test
    public void shouldUpdateShelf() throws Exception {
        //given
        Shelf shelf = initShelf();
        shelfDao.createShlef(shelf);
        shelf.setPosition("天府软件园");
        shelf.setCapacity(20);

        //when
        shelfDao.updateShelf(shelf);
        Shelf updatedShelf = shelfDao.findShelfById(shelf.getId());

        //then
        assertThat(updatedShelf.getCapacity(), is(shelf.getCapacity()));
        assertThat(updatedShelf.getPosition(), is(shelf.getPosition()));

    }

    private Shelf initShelf() {
        Shelf shelf = new Shelf();
        shelf.setCapacity(100);
        shelf.setPosition("成都办公室图书馆");
        return shelf;
    }

}
