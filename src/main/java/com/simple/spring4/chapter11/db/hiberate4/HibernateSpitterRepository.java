package com.simple.spring4.chapter11.db.hiberate4;

import com.simple.spring4.chapter11.db.SpitterRepository;
import com.simple.spring4.chapter11.domain.Spitter;

import java.util.List;

/**
 * @Author: by simple on 2018/9/3.
 */
public class HibernateSpitterRepository implements SpitterRepository{




    @Override
    public long count() {
        return 0;
    }

    @Override
    public Spitter save(Spitter spitter) {
        return null;
    }

    @Override
    public Spitter findOne(long id) {
        return null;
    }

    @Override
    public Spitter findByUsername(String username) {
        return null;
    }

    @Override
    public List<Spitter> findAll() {
        return null;
    }
}
