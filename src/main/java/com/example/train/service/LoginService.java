package com.example.train.service;

import com.example.train.Result.Result;
import com.example.train.pojo.User;

public interface LoginService {
    /**
     * 登录处理
     * @return
     */
    public abstract Result loginIn(User userData);


    /**
     * 更新用户信息
     * @param userData
     * @return
     */
    public abstract Result updateUser(User userData, String  passwordNew);

    /**
     * 注册处理
     * @param userData
     * @return
     */
    public abstract Result registUser(User userData);

}
