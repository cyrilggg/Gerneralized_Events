package com.example.generalized_new.serviceImpl;

import com.example.generalized_new.bean.UserBean;
import com.example.generalized_new.service.UserService;
import com.example.generalized_new.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.lang.*;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(UserBean user) {
        int flag = userMapper.insertUser(user);
        return flag;
    }

    public UserBean LoginUser(UserBean user) {
      return userMapper.loginUser(user);
    }

}
