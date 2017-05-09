package com.macwu.blog;

import com.macwu.blog.DAO.UserInfoServiceImpl;
import com.macwu.blog.DAO.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Tong on 2017/4/28.
 */

@SpringBootApplication
@ComponentScan
public class WebApp {

    @Autowired
    private static UserInfoServiceImpl userInfoService;

    public static void main(String[] args) {

        UserInfo userInfo = new UserInfo();
        userInfo.setUid(100001);
        userInfo.setEmailAddr("macwu1992@hotmail.com");

        userInfoService.createUser(userInfo);
        SpringApplication.run(WebApp.class);
    }
}
