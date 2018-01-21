package com.simple.springcp.dao;

import com.simple.springcp.model.User;

public class UserDAOImpl implements UserDAO{
    @Override
    public void save(User u) {
        System.out.println("a user saved!");
    }
}
