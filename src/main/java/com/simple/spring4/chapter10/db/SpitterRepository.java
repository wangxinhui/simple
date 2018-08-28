package com.simple.spring4.chapter10.db;

import com.simple.spring4.chapter10.domain.Spitter;

import java.util.List;

public interface SpitterRepository {
    long count();

    Spitter save(Spitter spitter);

    Spitter findOne(long id);

    Spitter findByUsername(String username);

    List<Spitter> findAll();
}
