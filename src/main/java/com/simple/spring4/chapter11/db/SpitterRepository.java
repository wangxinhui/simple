package com.simple.spring4.chapter11.db;

import com.simple.spring4.chapter11.domain.Spitter;

import java.util.List;

/**
 * @Author: by simple on 2018/9/3.
 */
public interface SpitterRepository {
    long count();

    Spitter save(Spitter spitter);

    Spitter findOne(long id);

    Spitter findByUsername(String username);

    List<Spitter> findAll();

}
