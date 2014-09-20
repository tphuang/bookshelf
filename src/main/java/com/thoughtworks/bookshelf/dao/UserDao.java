package com.thoughtworks.bookshelf.dao;

import com.thoughtworks.bookshelf.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component
@Transactional
public class UserDao {
    @Autowired
    private SessionFactory sessionFactory;
    private Session session;

    public List<User> findAllUsers() {
        session = sessionFactory.getCurrentSession();
        List<User> users = new ArrayList<User>();
        users = session.createCriteria(User.class).list();
        return users;
    }

    public void createUsers(User user) {
        session = sessionFactory.getCurrentSession();
        session.save(user);
    }
}
