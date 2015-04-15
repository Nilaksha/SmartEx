/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author Nilaksha
 */
public class BaseJdbcDao extends JdbcDaoSupport{
    
    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    
    @PostConstruct
    public void init() {
        this.setDataSource(dataSource);
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }
}
