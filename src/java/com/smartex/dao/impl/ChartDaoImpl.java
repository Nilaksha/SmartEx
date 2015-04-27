/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dao.impl;

import com.smartex.dao.BaseJdbcDao;
import com.smartex.dao.ChartDao;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository("chartDao")
public class ChartDaoImpl extends BaseJdbcDao implements ChartDao {

    @Override
    public int recentActivityCount(String productID) {
        
        Object[] objects = new Object[2];
        
        objects[0] = Integer.parseInt(productID);
        objects[1] = "recent";
        
        StringBuilder queryData = new StringBuilder("");
        queryData.append("SELECT COUNT(*) ");
        queryData.append("FROM applicationusage a ");
        queryData.append("WHERE a.productID = ? ");
        queryData.append("AND a.status = ? ");

        int count = getJdbcTemplate().queryForObject(
                        queryData.toString(), objects, Integer.class);

        return count;
    }
    
}
