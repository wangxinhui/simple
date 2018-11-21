package com.simple.spring4.chapter11.db.hiberate4;

import java.io.Serializable;

public interface BaseDAO<T> {
    public Serializable save(T o);

    public void delete(T o);



}
