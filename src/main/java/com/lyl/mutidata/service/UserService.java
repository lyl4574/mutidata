package com.lyl.mutidata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyl.mutidata.mapper.UserMapper;
import com.lyl.mutidata.model.User;


/**
 * Created by zhou on 2017/1/3.
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(Integer id) {
        User user = userMapper.findById(id);
        return user;
    }

    public User findByName(String name) {
        User user = userMapper.findByName(name);
        return user;
    }

}
