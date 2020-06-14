package com.yupp.mydemo.service.impl;

import com.yupp.mydemo.dao.user.UserDao;
import com.yupp.mydemo.domain.User;
import com.yupp.mydemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }
}
