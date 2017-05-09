package com.macwu.blog;

import com.macwu.blog.DAO.UserInfoServiceImpl;
import com.macwu.blog.DAO.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Tong on 2017/5/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class UserInfoServiceImplTest {

    @Autowired
    @Qualifier("UserInfoService")
    private UserInfoServiceImpl userInfoService;

    @Test
    public void createUser() throws Exception {
        UserInfo userInfo = new UserInfo();
        userInfo.setUid(100001);
        userInfo.setEmailAddr("macwu1992@hotmail.com");

        userInfoService.createUser(userInfo);
    }

    @Test
    public void deleteByPkUser() throws Exception {
    }

    @Test
    public void alterByPkUser() throws Exception {
    }

    @Test
    public void queryByPk() throws Exception {
    }

}