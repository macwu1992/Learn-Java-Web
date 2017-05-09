package com.macwu.blog.DAO;

import com.macwu.blog.DAO.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Tong on 2017/5/6.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int createUser(UserInfo userInfo) {
        String sql = "insert into blog_user_info values(,macwu1992@hotmail.com,,123456);";
        return jdbcTemplate.batchUpdate(sql)[0];

    }

    @Override
    public boolean deleteByPkUser(int pk) {
        return false;
    }

    @Override
    public boolean alterByPkUser(int pk) {
        return false;
    }

    @Override
    public UserInfo queryByPk(int pk) {
        return null;
    }
}
