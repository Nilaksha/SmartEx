/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dao.impl;

import com.smartex.dao.BaseJdbcDao;
import com.smartex.dao.MoodDao;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository("moodDao")
public class MoodDaoImpl extends BaseJdbcDao implements MoodDao{

    @Override
    public int newMoodUpdatesCount(String productID) {
        
        Object[] objects = new Object[2];
        
        objects[0] = Integer.parseInt(productID);
        objects[1] = "new";
        
        StringBuilder queryData = new StringBuilder("");
        queryData.append("SELECT COUNT(*) ");
        queryData.append("FROM moods m ");
        queryData.append("WHERE m.productID = ? ");
        queryData.append("AND m.status = ? ");

        int count = getJdbcTemplate().queryForObject(
                        queryData.toString(), objects, Integer.class);

        return count;
    }
    
}