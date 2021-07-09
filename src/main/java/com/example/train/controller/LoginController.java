package com.example.train.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.train.Result.Result;
import com.example.train.pojo.User;
import com.example.train.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * login function
 * @author lyy
 * @version 0.1
 */
@RestController
@CrossOrigin
public class LoginController {
    @Autowired
    private LoginService loginService;

    /**
     * login
     * @param jsonObject
     * @return
     */
    @PostMapping("/login")
    @GetMapping("/login")
    @ResponseBody
    public Result login(@RequestBody JSONObject jsonObject){
        User user = new User();
        String password = jsonObject.getString("password");
        String username = jsonObject.getString("username");
        user.setPassword(password);
        user.setUsername(username);
        Result result = loginService.loginIn(user);
        return result;
    }

    /**
     * update user's password
     * @param
     * @return
     */
    @PostMapping("/updatePassword")
    public Result updateUser(@RequestBody JSONObject jsonObject){
        User userData = new User();
        userData.setUsername(jsonObject.getString("username"));
        userData.setPassword(jsonObject.getString("passwordOld"));
        String newPassword = jsonObject.getString("passwordNew");
        Result result  = loginService.updateUser(userData, newPassword);
        return result;
    }

    /**
     * user regist
     * @param userData
     * @return
     */
    @PostMapping("/regist")
    public Result registUser(@RequestBody User userData){
        return loginService.registUser(userData);
    }
}
