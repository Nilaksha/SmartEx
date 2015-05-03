/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dao;

import com.smartex.dto.MoodDto;
import com.smartex.dto.MoodsDto;
import java.util.List;

/**
 *
 * @author user
 */
public interface MoodDao {
    
    public int newMoodUpdatesCount(String productID);
    
    public List<MoodDto> updateMoods(String productID);
    
    public List<MoodsDto> updateMoodDonut(String productID);
}
