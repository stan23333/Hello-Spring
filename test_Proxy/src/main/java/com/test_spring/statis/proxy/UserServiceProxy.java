package com.test_spring.statis.proxy;


import com.test_spring.statis.service.UserService;
import com.test_spring.statis.service.impl.UserServiceImpl;

import java.lang.reflect.Method;

public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    public UserServiceImpl getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        userService.add();
        log("add");
    }

    @Override
    public void delete() {
        userService.delete();
        log("delete");
    }

    @Override
    public void update() {
        userService.update();
        log("update");
    }

    @Override
    public void query() {
        userService.query();
        log("query");
    }
    public void log(String msg){
        System.out.println("[Debug] 使用了一个"+msg+"方法");
    }

}
