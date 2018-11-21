package com.simple.spring4.chapter11.db.hiberate4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class BaseDAOImpl<T> implements BaseDAO<T> {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getCurrentSession(){
       return sessionFactory.getCurrentSession();
    }


    @Override
    public Serializable save(T o) {
        return getCurrentSession().save(o);
    }

    @Override
    public void delete(T o) {

    }
}
