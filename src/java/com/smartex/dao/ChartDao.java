/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dao;

import com.smartex.dto.MoodsLineDto;
import java.util.List;

/**
 *
 * @author user
 */
public interface ChartDao {
    
    public int recentActivityCount(String productID);
    
    public List<MoodsLineDto> updateMoodLine(String productID);
}
