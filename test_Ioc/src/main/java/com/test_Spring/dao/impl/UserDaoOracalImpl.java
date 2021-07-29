package com.test_Spring.dao.impl;

import com.test_Spring.dao.UserDao;

public class UserDaoOracalImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("正在使用Oracal实现");
    }
}
