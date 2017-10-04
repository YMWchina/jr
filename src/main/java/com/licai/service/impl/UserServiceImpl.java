package com.licai.service.impl;

import com.licai.dao.UserMapper;
import com.licai.model.User;
import com.licai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> list() {
        return userMapper.list();
    }
}
