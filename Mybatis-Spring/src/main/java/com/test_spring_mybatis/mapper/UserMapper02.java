package com.test_spring_mybatis.mapper;

import com.test_spring_mybatis.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapper02 extends SqlSessionDaoSupport implements UserMapper{
    @Override
    public List<User> seletAllUser() {
        return getSqlSession().getMapper(UserMapper.class).seletAllUser();
    }
}
