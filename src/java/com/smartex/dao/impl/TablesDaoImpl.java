/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dao.impl;

import com.smartex.dao.BaseJdbcDao;
import com.smartex.dao.TablesDao;
import com.smartex.dto.TableAppUsageDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nilaksha
 */
@Repository("tablesDao")
public class TablesDaoImpl extends BaseJdbcDao implements TablesDao {
    
    SimpleDateFormat formatDate = new SimpleDateFormat("dd MMMMM yyyy");
    SimpleDateFormat formatTime = new SimpleDateFormat("h:mm a");

    @Override
    public List<TableAppUsageDto> updateTableAppUssage(String productID) {

        Object[] objects = new Object[1];

        StringBuilder queryData = new StringBuilder("");
        queryData.append("SELECT a.name, \n");
        queryData.append("au.accessedTime, \n");
        queryData.append("TIMEDIFF(au.closedTime, au.accessedTime) as duration \n");
        queryData.append("FROM applications a, applicationusage au \n");
        queryData.append("WHERE au.productID = ? \n");
        queryData.append("AND au.appID = a.appID \n");
        
        objects[0] = productID;

        RowMapper<TableAppUsageDto> mapper = new RowMapper<TableAppUsageDto>() {
            public TableAppUsageDto mapRow(ResultSet rs, int rowNum) throws SQLException {

                TableAppUsageDto tableAppUsageDto = new TableAppUsageDto();
                tableAppUsageDto.setApplication(rs.getString("name"));
                Date accessedDate = rs.getDate("accessedTime");
                tableAppUsageDto.setDate(formatDate.format(accessedDate));
                tableAppUsageDto.setTime(formatTime.format(accessedDate));
                tableAppUsageDto.setDuration(rs.getString("duration"));

                return tableAppUsageDto;
            }
        };

        List<TableAppUsageDto> resultsList;
        resultsList = getJdbcTemplate().query(queryData.toString(), objects, mapper);
        return resultsList;
    }
    
}
