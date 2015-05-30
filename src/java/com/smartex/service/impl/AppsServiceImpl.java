/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.service.impl;

import com.smartex.dao.AppsDao;
import com.smartex.domain.Application;
import com.smartex.service.AppsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nilaksha
 */
@Service("appsService")
public class AppsServiceImpl implements AppsService {
    
    @Autowired
    @Qualifier("appsDao")
    private AppsDao appsDao;

    @Override
    public List<Application> getApps(String productID) {
        
        return appsDao.getApps(productID);
    }

    @Override
    public boolean updateApps(List<Application> apps) {
        
        return appsDao.updateApps(apps);
    }
}
