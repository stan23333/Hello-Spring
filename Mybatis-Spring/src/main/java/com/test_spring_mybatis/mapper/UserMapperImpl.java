package com.test_spring_mybatis.mapper;

import com.test_spring_mybatis.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }


    @Override
    public List<User> seletAllUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.seletAllUser();
    }
}
