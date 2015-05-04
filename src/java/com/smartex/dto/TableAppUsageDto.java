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
public class TableAppUsageDto {
    
    String application;
    String date;
    String time;
    String duration;

    public TableAppUsageDto() {
    }

    public TableAppUsageDto(String application, Date accessedDate, String duration) {
        this.application = application;
        this.duration = duration;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }    
}
