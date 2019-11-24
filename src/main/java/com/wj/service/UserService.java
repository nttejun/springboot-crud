package com.wj.service;

import com.wj.domain.User;
import com.wj.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class UserService {

    private Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserMapper userMapper;

    public User getUser(String userAlias) {
        logger.info("+++[getUser] Start...");
        return userMapper.getUser(userAlias);
    }

    public List<User> listUser() {
        logger.info("+++[listUser] Start...");
        return userMapper.listUser();
    }

    public void insertUserInfo(User user){
        logger.info("+++[insertUserInfo] Start...");
        userMapper.insertUserInfo(user);
    }

    public String deleteUser(User user){
        logger.info("+++[deleteUser] Start...");
        logger.info(" -- [Req Parameter] getDeleteUserAlias : "+user.getUserAlias());

        int result = userMapper.deleteUser(user.getUserAlias());

        String resultCode = "0000";
        if(result != 1) {resultCode = "9999";}

        logger.info(" -- [Req Result] deleteUser : "+resultCode);
        return resultCode;
    }

    public String updateUser(User user) {
        logger.info("+++[updateUser] Start...");
        logger.info(" -- [Req Parameter] updateUser : "+user.toString());

        int result = userMapper.updateUser(user);

        String resultCode = "0000";
        if(result != 1) {resultCode = "9999";}

        logger.info(" -- [Req Result] deleteUser : "+resultCode);
        return resultCode;
    }

    public User loginUserMemberCheck(String userid, String password) {
        logger.info("+++[loginUserMemberCheck] Start...");
        logger.info(" -- [Req Parameter] loginUserMemberCheck : "+ userid);
        logger.info(" -- [Req Parameter] loginUserMemberCheck : "+ password);

        Map<String, Object> map = new HashMap<>();
        map.put("userid", userid);
        map.put("password", password);
        return userMapper.loginUserMemberCheck(map);
    }
}
