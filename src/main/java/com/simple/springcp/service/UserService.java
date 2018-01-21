package com.simple.springcp.service;

import com.simple.springcp.dao.UserDAO;
import com.simple.springcp.dao.UserDAOImpl;
import com.simple.springcp.model.User;

public class UserService {

    private UserDAO userDAO = new UserDAOImpl();

    public void save(User user){
        userDAO.save(user);
    }

}
