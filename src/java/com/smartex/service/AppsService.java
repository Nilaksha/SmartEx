/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.service;

import com.smartex.domain.Application;
import java.util.List;

/**
 *
 * @author Nilaksha
 */
public interface AppsService {
    
    public List<Application> getApps(String productID);
    
    public boolean updateApps(List<Application> apps);

}
