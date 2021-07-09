package com.example.train.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.train.Result.Result;
import com.example.train.pojo.Person;
import com.example.train.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * login function
 * @author lyy
 * @version 0.1
 */
@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/updateUserInfo")
    public Result updateUserInfo(@RequestBody JSONObject jsonObject){
        Result result = null;
        String username = jsonObject.getString("username");
        String trueName = jsonObject.getString("trueName");
        String idCardNum = jsonObject.getString("idCardNum");
        String phoneNum = jsonObject.getString("phoneNum");
        Integer age = jsonObject.getInteger("age");
        Person person = new Person(trueName, idCardNum, phoneNum, age);
        result = userService.updateUserInfo(username,person);
        return result;
    }

    @PostMapping("/getpersoninfo")
    public Result getPersonInfo(@RequestBody JSONObject jsonObject){
        return userService.getPersonInfo(jsonObject.getString("username"));
    }


}
