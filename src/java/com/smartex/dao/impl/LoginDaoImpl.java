/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dao.impl;

import com.smartex.dao.BaseJdbcDao;
import com.smartex.dao.LoginDao;
import com.smartex.dto.LoginDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nilaksha
 */
@Repository("loginDao")
public class LoginDaoImpl extends BaseJdbcDao implements LoginDao {

    @Override
    public List<LoginDto> login(String email) {

        Object[] objects = new Object[1];

        objects[0] = email;

        StringBuilder queryData = new StringBuilder("");
        queryData.append("SELECT u.product_id, \n");
        queryData.append("u.email, \n");
        queryData.append("u.password \n");
        queryData.append("FROM users u \n");
        queryData.append("WHERE u.email = ? \n");

        RowMapper<LoginDto> mapper = new RowMapper<LoginDto>() {
            @Override
            public LoginDto mapRow(ResultSet rs, int rowNum) throws SQLException {

                LoginDto loginDto = new LoginDto();
                loginDto.setProductID(rs.getInt("product_id"));
                loginDto.setEmail(rs.getString("email"));
                loginDto.setPassword(rs.getString("password"));

                return loginDto;
            }
        };

        List<LoginDto> loginDto;
        loginDto = getJdbcTemplate().query(queryData.toString(), objects, mapper);
        return loginDto;
    }
}