package com.thoughtworks.bookshelf.dao;

import com.thoughtworks.bookshelf.model.Shelf;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component
@Transactional
public class ShelfDao {

    @Autowired
    private SessionFactory sessionFactory;
    private Session session;

    public Shelf findShelfById(int id) {
        session = sessionFactory.getCurrentSession();
        return (Shelf) session.get(Shelf.class, id);
    }

    public List<Shelf> findAll() {
        session = sessionFactory.getCurrentSession();
        List<Shelf> shelfs = new ArrayList<Shelf>();
        shelfs = session.createCriteria(Shelf.class).list();
        return shelfs;
    }

    public Shelf createShlef(Shelf shelf) {
        session = sessionFactory.getCurrentSession();
        session.save(shelf);
        return  shelf;
    }

    public void deleteShelf(int shelfId) {
        session = sessionFactory.getCurrentSession();
        Shelf shelf = findShelfById(shelfId);
        session.delete(shelf);
    }

    public void updateShelf(Shelf shelf) {
        session = sessionFactory.getCurrentSession();
        session.update(shelf);
    }

}
