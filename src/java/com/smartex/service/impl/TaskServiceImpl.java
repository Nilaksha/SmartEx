/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.service.impl;

import com.smartex.dao.TaskDao;
import com.smartex.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service("taskService")
public class TaskServiceImpl implements TaskService{
    
    @Autowired
    @Qualifier("taskDao")
    private TaskDao taskDao;

    @Override
    public int recentTaskCount(String productID) {
        
        return taskDao.recentTaskCount(productID);
    }

    @Override
    public int lastAddedTaskCount(String productID) {
        
        return taskDao.lastAddedTaskCount(productID);
    }

    @Override
    public int lastAddedTaskTime(String productID) {
        
        return taskDao.lastAddedTaskTime(productID);
    }
    
}
