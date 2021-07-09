package com.example.train.service;

import com.example.train.Result.Result;

public interface OrderService {
    /**
     * @param username
     * @return
     * */
    public abstract Result getOrder(String username);

    /**
     *订单改签
     */
    public abstract Result changeOrder(int orderId,int tripsId);

}
