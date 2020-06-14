package com.yupp.mydemo.user;

import java.util.List;

import com.yupp.mydemo.dao.user.UserDao;
import com.yupp.mydemo.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends SpringTestCase{

    @Autowired
    private UserDao userDao;

    @Test
    public void testGetUserList(){
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }

}
