/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dao.impl;

import com.smartex.dao.BaseJdbcDao;
import com.smartex.dao.ChartDao;
import com.smartex.dto.MoodsDonutDto;
import com.smartex.dto.MoodsLineDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
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

    @Override
    public List<MoodsLineDto> updateMoodLine(String productID) {

        Object[] objects = new Object[1];

        StringBuilder queryData = new StringBuilder("");
        queryData.append("SELECT Date(a.accessedTime) as date, \n");
        queryData.append("COUNT(*) as visits \n");
        queryData.append("FROM applicationusage a \n");
        queryData.append("WHERE a.productID = ? \n");
        queryData.append("GROUP BY date \n");
        queryData.append("ORDER BY date \n");
        
        
        objects[0] = productID;
        
        RowMapper<MoodsLineDto> mapper = new RowMapper<MoodsLineDto>() {
            public MoodsLineDto mapRow(ResultSet rs, int rowNum) throws SQLException {

                MoodsLineDto moodsDto = new MoodsLineDto();
                moodsDto.setD(rs.getString("date"));
                moodsDto.setVisits(rs.getInt("visits"));

                return moodsDto;
            }
        };

        List<MoodsLineDto> resultsList;
        resultsList = getJdbcTemplate().query(queryData.toString(), objects, mapper);
        return resultsList;
    }
    
}
