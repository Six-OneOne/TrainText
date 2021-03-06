package com.example.train.service.impl;


import com.example.train.Result.Result;
import com.example.train.dao.PersonDao;
import com.example.train.dao.UserDao;
import com.example.train.pojo.Person;
import com.example.train.pojo.User;
import com.example.train.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private PersonDao personDao;

//    @Transactional
//    @Override
//    public Result insertUserInfo(String username, Person person) {
//        Result result = new Result();
//        int i = personDao.insertUserInfo(person);
//        result.setMsg("update fail, please update again");
//        result.setStateCode(404);
//        result.setData(false);
//        if (i < 1){
//
//        } else {
//            User user = new User();
//            user.setUsername(username);
//            user.setPersonId(person.getId());
//            int j = userDao.updateUserRegisterInfo(user);
//            if (j == 1){
//                result.setMsg("update success");
//                result.setStateCode(200);
//                result.setData(true);
//            }
//        }
//        return result;
//    }

    @Override
    @Transactional
    public Result updateUserInfo(String username, Person person) {
        User user = userDao.getUserByUsername(username);
        Result result = new Result();
        result.setMsg("update fail, please update again");
        result.setStateCode(404);
        result.setData(false);
        if (user != null ) {
            if( user.getPersonId() > 0) {
                person.setId(user.getPersonId());
                int i = personDao.updateUserInfo(person);
                if (i == 1) {
                    result.setMsg("update success");
                    result.setStateCode(200);
                    result.setData(true);
                }
            } else {
                int i =  personDao.insertUserInfo(person);
                if (i == 1){
                    user.setPersonId(person.getId());
                    int j = userDao.updateUserRegisterInfo(user);
                    if (j == 1){
                        result.setMsg("update success");
                        result.setStateCode(200);
                        result.setData(true);
                    }
                }
            }
        }
        return result;
    }

    @Override
    public Result getPersonInfo(String username) {
        Result result = new Result();
        Person person = personDao.getPersonInfo1(username);
        if (person == null) {
            result.setStateCode(400);
            result.setMsg("?????????????????????????????????????????????");
            result.setData(null);
        } else {
            result.setStateCode(200);
//            result.setStateCode();
            result.setMsg("????????????????????????????????????");
            result.setData(person);
        }
        return result;
    }
}
