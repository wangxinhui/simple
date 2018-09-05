package com.simple.spring4.chapter11.db;

import com.simple.spring4.chapter11.domain.Spittle;

import java.util.List;

/**
 * @Author: by simple on 2018/9/3.
 */
public interface SpittleRepository {
    long count();

    List<Spittle> findRecent();

    List<Spittle> findRecent(int count);

    Spittle findOne(long id);

    Spittle save(Spittle spittle);

    List<Spittle> findBySpitterId(long spitterId);

    void delete(long id);
}
