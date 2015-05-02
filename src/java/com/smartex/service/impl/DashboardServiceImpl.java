/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.service.impl;

import com.smartex.dao.DashboardDao;
import com.smartex.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service("dashboardService")
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    @Qualifier("dashboardDao")
    private DashboardDao dashboardDao;

    @Override
    public String userName(String productID) {
        
        return dashboardDao.userName(productID);
    }
    
}
