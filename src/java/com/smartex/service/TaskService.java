/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.service;

/**
 *
 * @author user
 */
public interface TaskService {

    public int recentTaskCount(String productID);

    public int lastAddedTaskCount(String productID);

    public int lastAddedTaskTime(String productID);
}
