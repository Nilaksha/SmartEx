/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dao.impl;

import com.smartex.dao.BaseJdbcDao;
import com.smartex.dao.DashboardDao;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository("dashboardDao")
public class DashboardDaoImpl extends BaseJdbcDao implements DashboardDao {

    @Override
    public String userName(String productID) {
        
        Object[] objects = new Object[1];

        objects[0] = Integer.parseInt(productID);

        StringBuilder queryData = new StringBuilder("");
        queryData.append("SELECT u.user_name ");
        queryData.append("FROM user u ");
        queryData.append("WHERE u.product_id = ? ");

        String userName = getJdbcTemplate().queryForObject(
                queryData.toString(), objects, String.class);

        return userName;
    }

}
