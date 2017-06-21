package com.macwu.blog.DAO;

import com.macwu.blog.DAO.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Tong on 2017/5/6.
 */
@Repository
public class UserInfoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public UserInfo queryByUid(){

        String sql = "select * from blog_user_info WHERE uid = ?";
        UserInfo userInfo = jdbcTemplate.query(() -> {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setObject(1, "1");

                return ps;
            }
        }, new UserInfoMapper()).get(0);

        return userInfo;
    }

    @Transactional(readOnly = true)
    public List<UserInfo> findAll() {
        String sql = "select * from blog_user_info";
        return jdbcTemplate.query(sql, new UserInfoMapper());
    }

    public int insert(UserInfo userInfo){
        String sql = "insert into blog_user_info (uid, user_name, pwd, email_addr, tel_number) values(NULL,?,?,?,?)";

        return jdbcTemplate.update(sql, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {

                ps.setObject(2, userInfo.getUserName());
                ps.setObject(3, userInfo.getPwd());
                ps.setObject(4, userInfo.getEmailAddr());
                ps.setObject(5, userInfo.getTelNum());
            }
        }, new UserInfoMapper());
    }
}
