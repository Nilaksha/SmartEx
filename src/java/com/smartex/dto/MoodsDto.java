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
public class MoodsDto {
    
    private String label;
    private Integer value;

    public MoodsDto() {
    }

    public MoodsDto(String moodType, Integer count) {
        this.label = moodType;
        this.value = count;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}