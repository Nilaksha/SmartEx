/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dao.impl;

import com.smartex.dao.BaseJdbcDao;
import com.smartex.dao.MoodDao;
import com.smartex.dto.MoodDto;
import com.smartex.dto.MoodsDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nilaksha
 */
@Repository("moodDao")
public class MoodDaoImpl extends BaseJdbcDao implements MoodDao {

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

    @Override
    public List<MoodDto> updateMoods(String productID) {

        Object[] objects = new Object[1];

        StringBuilder queryData = new StringBuilder("");
        queryData.append("SELECT m.time, \n");
        queryData.append("m.moodType \n");
        queryData.append("FROM moods m \n");
        queryData.append("WHERE m.productID = ? \n");

        objects[0] = productID;

        RowMapper<MoodDto> mapper = new RowMapper<MoodDto>() {
            public MoodDto mapRow(ResultSet rs, int rowNum) throws SQLException {

                MoodDto moodDto = new MoodDto();
                moodDto.setDate(rs.getDate("time"));
                moodDto.setMood(rs.getString("moodType"));

                return moodDto;
            }
        };

        List<MoodDto> resultsList;
        resultsList = getJdbcTemplate().query(queryData.toString(), objects, mapper);
        return resultsList;
    }

    @Override
    public List<MoodsDto> updateMoodDonut(String productID) {

        Object[] objects = new Object[2];

        StringBuilder queryData = new StringBuilder("");
        queryData.append("SELECT m.moodType, \n");
        queryData.append("COUNT(*) as count \n");
        queryData.append("FROM moods m \n");
        queryData.append("WHERE m.productID = ? \n");
        queryData.append("AND m.status = ? \n");
        queryData.append("GROUP BY m.moodType \n");
        queryData.append("ORDER BY count DESC \n");
        
        
        objects[0] = productID;
        objects[1] = "NEW";
        
        RowMapper<MoodsDto> mapper = new RowMapper<MoodsDto>() {
            public MoodsDto mapRow(ResultSet rs, int rowNum) throws SQLException {

                MoodsDto moodsDto = new MoodsDto();
                moodsDto.setLabel(rs.getString("moodType"));
                moodsDto.setValue(rs.getInt("count"));

                return moodsDto;
            }
        };

        List<MoodsDto> resultsList;
        resultsList = getJdbcTemplate().query(queryData.toString(), objects, mapper);
        return resultsList;
    }

}
