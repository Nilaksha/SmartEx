/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dao.impl;

import com.smartex.dao.BaseJdbcDao;
import com.smartex.dao.MessageDao;
import com.smartex.domain.Message;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nilaksha
 */
@Repository("messageDao")
public class MessageDaoImpl extends BaseJdbcDao implements MessageDao {

    @Override
    public int newMessageCount(String productID) {

        Object[] objects = new Object[2];

        objects[0] = Integer.parseInt(productID);
        objects[1] = "new";

        StringBuilder queryData = new StringBuilder("");
        queryData.append("SELECT COUNT(*) ");
        queryData.append("FROM messages m ");
        queryData.append("WHERE m.productID = ? ");
        queryData.append("AND m.status = ? ");

        int count = getJdbcTemplate().queryForObject(
                queryData.toString(), objects, Integer.class);

        return count;
    }

    @Override
    public int lastRepliedTime(String productID) {

        Object[] objects = new Object[1];

        objects[0] = Integer.parseInt(productID);

        StringBuilder queryData = new StringBuilder("");
        queryData.append("SELECT MAX(DATE(sentTime)) ");
        queryData.append("FROM sentmessages s ");
        queryData.append("WHERE s.productID = ? ");
        queryData.append("ORDER BY s.sentTime DESC");

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

    @Override
    public List<Message> getInboxMessages(String productID) {

        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd hh:mm aaa");
        Object[] objects = new Object[1];

        objects[0] = Integer.parseInt(productID);

        StringBuilder queryData = new StringBuilder("");
        queryData.append("SELECT * ");
        queryData.append("FROM messages m ");
        queryData.append("WHERE m.productID = ? ");

        RowMapper<Message> mapper = new RowMapper<Message>() {
            public Message mapRow(ResultSet rs, int rowNum) throws SQLException {

                Message message = new Message();
                message.setSubject(rs.getString("msgSubject"));
                message.setBody(rs.getString("msgBody"));
                message.setDate(formatDate.format(rs.getDate("receivedTime")));

                return message;
            }
        };

        List<Message> resultsList;
        resultsList = getJdbcTemplate().query(queryData.toString(), objects, mapper);
        return resultsList;
    }
}
