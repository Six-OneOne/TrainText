package com.example.train.service;

import com.example.train.Result.Result;
import com.example.train.pojo.Person;

public interface UserService {
    /**
     * 第一次填写个人信息
     * @param username
     * @param person
     * @return
     */
//    public abstract Result insertUserInfo(String username, Person person);

    /**
     * 修改个人信息
     * @param username
     * @param person
     * @return
     */
    public abstract Result updateUserInfo(String username , Person person);


    /**
     * 查询个人信息
     * @param username
     * @return
     */
    public abstract Result getPersonInfo(String username);

}
