/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.service;

import com.smartex.dto.MoodsDto;
import domain.Mood;
import java.util.List;

/**
 *
 * @author user
 */
public interface MoodService {
    
     public int newMoodUpdatesCount(String productID);
     
     public List<Mood> updateMoods(String productID);
     
     public List<MoodsDto> updateMoodDonut(String productID);
}
