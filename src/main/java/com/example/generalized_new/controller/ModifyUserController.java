package com.example.generalized_new.controller;

import com.alibaba.fastjson.JSONObject;

import com.example.generalized_new.bean.UserBean;
import com.example.generalized_new.service.UserService;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class ModifyUserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Map addUser(@RequestBody UserBean user) {
        Map<String, Object> map = new HashMap<String, Object>();
  /*      if (!user.getPassword().equals(user.getCheckpass()))
        {
            map.put("code", 401);
            map.put("msg", "error!");
            map.put("name", user.getName());
            map.put("loginName", user.getloginName());
            map.put("check", user.getCheckpass());
            map.put("yours", user.getPassword());
            return map;
        }*/

        int flag = userService.addUser(user);
        if (flag == 1) {
            map.put("code", 200);
            map.put("msg", "register successfully!");
        } else {
            map.put("code", 400);
            map.put("msg", "error!");
        }
        return map;
    }

    @PostMapping("/login")
    public String LoginUser(@RequestBody UserBean user) {
        UserBean u = userService.LoginUser(user);
        JSONObject result = new JSONObject();
        if (u != null) {
            result.put("msg", "ok");
            result.put("data", u);
        } else {
            result.put("msg", "error!");
            result.put("data", null);
        }
        return result.toJSONString();
    }
}
