/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dao.impl;

import com.smartex.dao.AppsDao;
import com.smartex.dao.BaseJdbcDao;
import com.smartex.domain.Application;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nilaksha
 */
@Repository("appsDao")
public class AppsDaoImpl extends BaseJdbcDao implements AppsDao {

    @Override
    public List<Application> getApps(String productID) {
        Object[] objects = new Object[1];

        objects[0] = Integer.parseInt(productID);

        StringBuilder queryData = new StringBuilder("");
        queryData.append("SELECT a.name, \n");
        queryData.append("a.type, \n");
        queryData.append("a.appID, \n");
        queryData.append("ua.status \n");
        queryData.append("FROM applications a, \n");
        queryData.append("userapps ua \n");
        queryData.append("WHERE ua.product_ID = ? \n");
        queryData.append("AND ua.app_ID = a.appID \n");

        RowMapper<Application> mapper = new RowMapper<Application>() {
            public Application mapRow(ResultSet rs, int rowNum) throws SQLException {

                Application application = new Application();
                application.setAppID(rs.getInt("appID"));
                application.setName(rs.getString("name"));
                application.setType(rs.getString("type"));
                application.setStatus(String.valueOf(rs.getBoolean("status")));

                return application;
            }
        };

        List<Application> resultsList;
        resultsList = getJdbcTemplate().query(queryData.toString(), objects, mapper);
        return resultsList;
    }

    @Override
    public boolean updateApps(List<Application> apps) {

        for (Application app : apps) {

            Object[] objects = new Object[3];

            objects[0] = Boolean.parseBoolean(app.getStatus());
            objects[1] = app.getProductID();
            objects[2] = app.getAppID();

            StringBuilder queryData = new StringBuilder("");
            queryData.append("UPDATE userapps \n");
            queryData.append("SET status = ? \n");
            queryData.append("WHERE product_id = ? \n");
            queryData.append("AND app_id = ? \n");

            try {
                getJdbcTemplate().update(queryData.toString(), objects);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

}
