package com.test_Spring.service.impl;

import com.test_Spring.dao.UserDao;
import com.test_Spring.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getWay() {
        userDao.getUser();
    }
}
