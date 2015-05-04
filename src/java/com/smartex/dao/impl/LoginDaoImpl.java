/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dao.impl;

import com.smartex.dao.BaseJdbcDao;
import com.smartex.dao.LoginDao;
import com.smartex.dto.LoginDto;
import com.smartex.dto.ProfileDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
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
        queryData.append("FROM user u \n");
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

    @Override
    public boolean isProductID(String productID) {

        Object[] objects = new Object[1];
        boolean result;

        objects[0] = Integer.parseInt(productID);

        StringBuilder queryData = new StringBuilder("");
        queryData.append("SELECT u.product_id \n");
        queryData.append("FROM user u \n");
        queryData.append("WHERE u.product_id = ? \n");

        try {
            int actualProductID = getJdbcTemplate().queryForObject(
                    queryData.toString(), objects, Integer.class);

            result = (actualProductID != 0);
            return result;

        } catch (EmptyResultDataAccessException e) {
            return false;
        }
    }

    @Override
    public boolean saveProfile(ProfileDto profileDto) {

        Object[] objects = new Object[4];

        objects[0] = profileDto.getProductID();
        objects[1] = profileDto.getUserName();
        objects[2] = profileDto.getEmail();
        objects[3] = profileDto.getPassword();

        StringBuilder queryData = new StringBuilder("");
        queryData.append("INSERT INTO user \n");
        queryData.append("(PRODUCT_ID, USER_NAME, EMAIL, PASSWORD) \n");
        queryData.append("VALUES (?, ?, ?, ?) \n");

        try {
            getJdbcTemplate().update(queryData.toString(), objects);
            return true;
        } catch (DataAccessException e) {
            return false;
        }
    }
}
