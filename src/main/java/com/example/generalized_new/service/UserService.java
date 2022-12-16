package com.example.generalized_new.service;
import com.example.generalized_new.bean.UserBean;

public interface UserService {
    int  addUser(UserBean user);             /**新增用户*/
    UserBean LoginUser(UserBean user);    /**用户登录核对*/
}
