/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dao.impl;

import com.smartex.dao.BaseJdbcDao;
import com.smartex.dao.TaskDao;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository("taskDao")
public class TaskDaoImpl extends BaseJdbcDao implements TaskDao {

    @Override
    public int recentTaskCount(String productID) {

        Object[] objects = new Object[2];

        objects[0] = Integer.parseInt(productID);
        objects[1] = "recent";

        StringBuilder queryData = new StringBuilder("");
        queryData.append("SELECT COUNT(*) ");
        queryData.append("FROM tasks t ");
        queryData.append("WHERE t.productID = ? ");
        queryData.append("AND t.status = ? ");

        int count = getJdbcTemplate().queryForObject(
                queryData.toString(), objects, Integer.class);

        return count;
    }

    @Override
    public int lastAddedTaskCount(String productID) {

        Object[] objects = new Object[1];

        objects[0] = Integer.parseInt(productID);

        StringBuilder queryData = new StringBuilder("");
        queryData.append("SELECT COUNT(*) ");
        queryData.append("FROM tasks t ");
        queryData.append("WHERE DATE(t.time) = ");
        queryData.append("(SELECT MAX(DATE(time)) ");
        queryData.append("FROM tasks t ");
        queryData.append("WHERE t.productID = ? ");
        queryData.append("ORDER BY t.time DESC) ");

        int count = getJdbcTemplate().queryForObject(
                queryData.toString(), objects, Integer.class);

        return count;

    }

    @Override
    public int lastAddedTaskTime(String productID) {
        
        Object[] objects = new Object[1];

        objects[0] = Integer.parseInt(productID);

        StringBuilder queryData = new StringBuilder("");
        queryData.append("SELECT MAX(DATE(time)) ");
        queryData.append("FROM tasks t ");
        queryData.append("WHERE t.productID = ? ");
        queryData.append("ORDER BY t.time DESC");

        Date date = getJdbcTemplate().queryForObject(
                queryData.toString(), objects, Date.class);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate;
        try {
            currentDate = dateFormat.parse(dateFormat.format(new Date()));
            long diff = currentDate.getTime() - date.getTime();
            long diffDays = diff / (24 * 60 * 60 * 1000);
            return (int) diffDays;
        } catch (ParseException ex) {
            Logger.getLogger(TaskDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
