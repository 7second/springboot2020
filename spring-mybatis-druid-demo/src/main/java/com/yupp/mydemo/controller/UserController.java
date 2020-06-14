package com.yupp.mydemo.controller;

import com.yupp.mydemo.domain.User;
import com.yupp.mydemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String getUserList() {
        List<User> userList = userService.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        return "index";
    }
}
