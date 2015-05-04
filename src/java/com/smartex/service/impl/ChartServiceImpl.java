/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.service.impl;

import com.smartex.dao.ChartDao;
import com.smartex.dto.MoodsLineDto;
import com.smartex.service.ChartService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service("chartService")
public class ChartServiceImpl implements ChartService {

    @Autowired
    @Qualifier("chartDao")
    private ChartDao chartDao;
    
    @Override
    public int recentActivityCount(String productID) {
        
        return chartDao.recentActivityCount(productID);
    }

    @Override
    public List<MoodsLineDto> updateMoodLine(String productID) {
        return chartDao.updateMoodLine(productID);
    }
    
}
