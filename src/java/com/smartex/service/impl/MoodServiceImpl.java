/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.service.impl;

import com.smartex.dao.MoodDao;
import com.smartex.service.MoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service("moodService")
public class MoodServiceImpl implements MoodService {

    @Autowired
    @Qualifier("moodDao")
    private MoodDao moodDao;
    
    @Override
    public int newMoodUpdatesCount(String productID) {
        return moodDao.newMoodUpdatesCount(productID);
    }
    
}
