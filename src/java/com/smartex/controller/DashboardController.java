/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.controller;

import com.smartex.service.DashboardService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Nilaksha
 */
@Controller
@RequestMapping("/dashboard")
public class DashboardController {
    
    @Autowired
    @Qualifier("dashboardService")
    private DashboardService dashboardService;

    @RequestMapping(method = RequestMethod.GET)
    public String dashboard(ModelMap model) {

        return "dashboard";
    }
    
    @RequestMapping(value = "userName", method = RequestMethod.POST)
    @ResponseBody
    public String userName(HttpSession session) {
        
        String productID = session.getAttribute("productID").toString();
        String userName = dashboardService.userName(productID);  

        return "  "+ userName;
    }
}
