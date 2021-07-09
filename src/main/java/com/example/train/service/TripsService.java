package com.example.train.service;

import com.example.train.Result.Result;
import com.example.train.pojo.Trips;

public interface TripsService {
    /**
     * 查询所有车票信息
     * @param trips
     * @return
     * */
    public abstract Result getAlltrips(Trips trips);
    /**
     *查询目标车票信息
     * @param trips
     * @return
     * */
    public abstract Result getAimtrips(Trips trips);


    /**
     * 购买车票
     * @param username
     * @param carInfoId
     * @param carNum
     * @return
     */
    public abstract Result buyTicket(String username, int carInfoId, String carNum);

    /**
     * 退票
     * @param personId
     * @param carNum
     * @param reachTime
     * @param startTime
     * @return
     */
    public abstract Result ticketRetund(int personId ,String carNum, String startTime, String reachTime);

    /**
     * 付钱
     * @param orderId
     * @return
     */
    public abstract Result payMoney(int orderId);


}
