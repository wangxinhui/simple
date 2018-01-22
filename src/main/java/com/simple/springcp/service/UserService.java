package com.simple.springcp.service;

import com.simple.springcp.dao.UserDAO;
import com.simple.springcp.dao.UserDAOImpl;
import com.simple.springcp.model.User;

public class UserService {

    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void save(User user){
        userDAO.save(user);
    }

}
