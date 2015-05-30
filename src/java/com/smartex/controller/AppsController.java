/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.controller;

import com.smartex.domain.Application;
import com.smartex.service.AppsService;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Nilaksha
 */
@Controller
@RequestMapping("/apps")
public class AppsController {

    @Autowired
    @Qualifier("appsService")
    private AppsService appsService;

    @RequestMapping(method = RequestMethod.GET)
    public String apps(ModelMap model) {

        return "apps";
    }

    @RequestMapping(value = "/getApps", method = RequestMethod.POST)
    @ResponseBody
    public List<Application> getApps(HttpSession session) {

        String productID = session.getAttribute("productID").toString();
        List<Application> applications = new ArrayList<>();
        applications = appsService.getApps(productID);

        return applications;
    }
    
    @RequestMapping(value = "/updateApps", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    public boolean updateApps(HttpSession session, @RequestBody List<Application> apps) {

        String productID = session.getAttribute("productID").toString();
        
        for(Application app: apps){
            
            app.setProductID(Integer.parseInt(productID));
        }
             
        return appsService.updateApps(apps);
    }
}
