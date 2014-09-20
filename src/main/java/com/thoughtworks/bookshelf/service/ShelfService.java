package com.thoughtworks.bookshelf.service;

import com.thoughtworks.bookshelf.model.Shelf;

import java.util.List;

public interface ShelfService {
    void createShelf(Shelf shelf);
    Shelf findShelfById(int id);
    List<Shelf> findAllShelves();
    void updateShelf(Shelf shelf);
    void deleteShelfById(int id);
}
