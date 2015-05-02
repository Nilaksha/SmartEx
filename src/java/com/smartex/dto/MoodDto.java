/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dto;

import java.util.Date;

/**
 *
 * @author Nilaksha
 */
public class MoodDto {
    
    Integer productID;
    Date date;
    String mood;
    
    public MoodDto(){
    }

    public MoodDto(Integer productID, Date date, String mood) {
        this.productID = productID;
        this.date = date;
        this.mood = mood;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }
}