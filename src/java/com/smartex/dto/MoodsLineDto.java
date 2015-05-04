/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dto;

/**
 *
 * @author Nilaksha
 */
public class MoodsLineDto {
    
    String d;
    Integer visits;

    public MoodsLineDto() {
    }

    public MoodsLineDto(String d, Integer visits) {
        this.d = d;
        this.visits = visits;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public Integer getVisits() {
        return visits;
    }

    public void setVisits(Integer visits) {
        this.visits = visits;
    }
}
