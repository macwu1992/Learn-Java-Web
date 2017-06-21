package com.macwu.blog.controller;

import com.macwu.blog.DAO.UserInfoDao;
import com.macwu.blog.DAO.entity.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tong on 2017/4/28.
 */
@RestController
public class RegisterController {
    private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @Autowired
    private UserInfoDao userInfoDao;

    @RequestMapping("/register")
    public String register(@RequestParam(value = "user_name", required = true) String username,
                           @RequestParam(value = "email_addr", required = true) String emailAddr,
                           @RequestParam(value = "pwd", required = true) String pwd,
                           @RequestParam(value = "tel_name", required = false) String telNum
                           ) {
        UserInfo userInfo = new UserInfo();

        userInfo.setUserName(username);
        userInfo.setEmailAddr(emailAddr);
        userInfo.setPwd(pwd);
        userInfo.setTelNum(telNum);

        // TODO insert userInfo
        int affected = userInfoDao.insert(userInfo);

        if (affected > 0) {
            return "Success";
        }else{
            return "error";
        }
    }
}
