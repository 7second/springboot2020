package com.yupp.mydemo.dao.user.impl;

import com.yupp.mydemo.dao.user.BaseDAO;
import com.yupp.mydemo.dao.user.UserDao;
import com.yupp.mydemo.dao.user.mapper.UserMapper;
import com.yupp.mydemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl extends BaseDAO implements UserDao {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {

        return userMapper.getUserList();
    }

    public List<User> getUserList2() {
        return getSqlSession().selectList(UserMapper.class.getName() + ".getUserList2");
    }
}
