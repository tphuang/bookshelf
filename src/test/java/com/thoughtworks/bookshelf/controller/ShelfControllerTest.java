package com.thoughtworks.bookshelf.controller;

import com.thoughtworks.bookshelf.service.ShelfService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.ModelMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ShelfControllerTest {
    private ShelfController shelfController;
    private ShelfService shelfService;
    private ModelMap model;

    @Before
    public void setUp() throws Exception {
        shelfService = mock(ShelfService.class);
        shelfController = new ShelfController(shelfService);
        model = new ExtendedModelMap();
    }

    @Test
    public void shouldJumpToShelfPage() throws Exception {
        String expectedPage = "shelves/show_shelf";
        long id = 1;
        String actualPage = shelfController.findShelfById(model, id);
        assertThat(actualPage, is(expectedPage));

        verify(shelfService).findShelfById(anyInt());
    }

    @Test
    public void shouldJumpToShelvesPage() throws Exception {
        String expectedPage = "shelves/shelves";
        String actualPage = shelfController.findAllShelves(model);
        assertThat(actualPage, is(expectedPage));

        verify(shelfService).findAllShelves();
    }
}
