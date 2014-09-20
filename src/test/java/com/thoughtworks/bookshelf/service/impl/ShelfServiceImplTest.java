package com.thoughtworks.bookshelf.service.impl;

import com.thoughtworks.bookshelf.dao.ShelfDao;
import com.thoughtworks.bookshelf.model.Shelf;
import com.thoughtworks.bookshelf.service.ShelfService;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ShelfServiceImplTest {
    private ShelfService shelfService;
    private ShelfDao shelfDao;

    @Before
    public void setUp() throws Exception {
        shelfDao = mock(ShelfDao.class);
        shelfService = new ShelfServiceImpl(shelfDao);
    }

    @Test
    public void testAddShelf() throws Exception {

    }

    @Test
    public void shouldGetShelfById() throws Exception {
        //given
        Shelf shelf = new Shelf();
        shelf.setId(2);
        shelf.setCapacity(100);
        shelf.setPosition("123");
        long id = shelf.getId();
        when(shelfDao.findShelfById(id)).thenReturn(shelf);

        //when
        Shelf queriedShelf = shelfService.findShelfById(id);

        //then
        assertThat(queriedShelf.getCapacity(),is(shelf.getCapacity()));

    }




}
