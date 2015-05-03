/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.service.impl;

import com.smartex.dao.MoodDao;
import com.smartex.dto.MoodDto;
import com.smartex.dto.MoodsDto;
import com.smartex.service.MoodService;
import domain.Mood;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nilaksha
 */
@Service("moodService")
public class MoodServiceImpl implements MoodService {

    @Autowired
    @Qualifier("moodDao")
    private MoodDao moodDao;
    
    SimpleDateFormat formatDate = new SimpleDateFormat("dd MMMMM yyyy");
    SimpleDateFormat formatTime = new SimpleDateFormat("h:mm a");
    
    @Override
    public int newMoodUpdatesCount(String productID) {
        return moodDao.newMoodUpdatesCount(productID);
    }

    @Override
    public List<Mood> updateMoods(String productID) {
        
        List<MoodDto> moodDtos = moodDao.updateMoods(productID);
        List<Mood> moods = new ArrayList<>();
        
        for(MoodDto moodDto : moodDtos){
            
            Mood mood = new Mood();
            
            mood.setDate(formatDate.format(moodDto.getDate()));
            mood.setTime(formatTime.format(moodDto.getDate()));
            mood.setMood(moodDto.getMood());
            
            moods.add(mood);
        }
        return moods;
    }

    @Override
    public List<MoodsDto> updateMoodDonut(String productID) {
        
        return moodDao.updateMoodDonut(productID);
    }
    
}
