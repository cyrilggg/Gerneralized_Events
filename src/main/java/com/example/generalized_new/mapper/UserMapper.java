package com.example.generalized_new.mapper;
import com.example.generalized_new.bean.UserBean;

public interface UserMapper {
    int insertUser(UserBean user);
    UserBean loginUser(UserBean user);
}
