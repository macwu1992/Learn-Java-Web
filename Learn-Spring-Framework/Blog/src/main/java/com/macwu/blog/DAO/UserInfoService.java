package com.macwu.blog.DAO;

import com.macwu.blog.DAO.entity.UserInfo;

/**
 * Created by Tong on 2017/5/6.
 */
public interface UserInfoService {
    /** 增*/
    public int createUser(UserInfo userInfo);
    /** 删*/
    public boolean deleteByPkUser(int pk);
    /** 改*/
    public boolean alterByPkUser(int pk);
    /** 查*/
    public UserInfo queryByPk(int pk);
}
