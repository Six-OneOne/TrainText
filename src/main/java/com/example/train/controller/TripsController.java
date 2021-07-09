package com.example.train.controller;


import com.example.train.Result.Result;
import com.example.train.pojo.Trips;
import com.example.train.service.TripsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 查询车票
 * @author 41688
 * @version 0.1
 * */
@RestController
@CrossOrigin
public class TripsController {
    /**
     *
     */
    @Autowired
    private TripsService tripsService;
    /**
     * 获取查询的车票
     * @author 41688
     * @return
     * */
    @PostMapping("/getAimtrips")
    @ResponseBody
    public Result getAimtrips(@RequestBody Trips trips){
        Result result = tripsService.getAimtrips(trips);
        return result;
    }
    /**
     * 获取所有购买的车票
     * @author 41688
     * @return
     * */
    @PostMapping("/getalltrips")
    @ResponseBody
    public Result getAlltrips(@RequestBody Trips trips){
        Result result = tripsService.getAlltrips(trips);
        return result;
    }
}
