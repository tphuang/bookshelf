package com.thoughtworks.bookshelf.service.impl;

import com.thoughtworks.bookshelf.dao.ShelfDao;
import com.thoughtworks.bookshelf.model.Shelf;
import com.thoughtworks.bookshelf.service.ShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShelfServiceImpl implements ShelfService {

    private ShelfDao shelfDao;

    @Autowired
    public ShelfServiceImpl(ShelfDao shelfDao) {
        this.shelfDao = shelfDao;
    }

    @Override
    public void createShelf(Shelf shelf) {
        shelfDao.createShlef(shelf);
    }

    @Override
    public Shelf findShelfById(int id) {
        Shelf shelf = new Shelf();
        shelf = shelfDao.findShelfById(id);
        return shelf;
    }

    @Override
    public List<Shelf> findAllShelves() {
        List<Shelf> shelfs = new ArrayList<Shelf>();
        shelfs = shelfDao.findAll();
        return shelfs;
    }

    @Override
    public void updateShelf(Shelf shelf) {
        shelfDao.updateShelf(shelf);
    }

    @Override
    public void deleteShelfById(int id) {
        shelfDao.deleteShelfById(id);
    }
}
