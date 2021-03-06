/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.controller;

import com.smartex.service.TaskService;
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
@RequestMapping("/tasks")
public class TasksController {
    
    @Autowired
    @Qualifier("taskService")
    private TaskService taskService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String tasks(ModelMap model) {

        return "tasks";
    }
    
    @RequestMapping(value = "/recentTaskCount", method = RequestMethod.POST)
    @ResponseBody
    public String recentMessageCount(HttpSession session) {
        
        String productID = session.getAttribute("productID").toString();
        int count = taskService.recentTaskCount(productID);  

        return Integer.toString(count);
    }
    
    @RequestMapping(value = "/lastAddedTaskCount", method = RequestMethod.POST)
    @ResponseBody
    public String lastAddedTaskCount(HttpSession session) {
        
        String productID = session.getAttribute("productID").toString();
        int count = taskService.lastAddedTaskCount(productID);  

        return " "+ Integer.toString(count)+ " Tasks added";
    }
    
    @RequestMapping(value = "/lastAddedTaskTime", method = RequestMethod.POST)
    @ResponseBody
    public String lastAddedTaskTime(HttpSession session) {
        
        String productID = session.getAttribute("productID").toString();
        int count = taskService.lastAddedTaskTime(productID);  

        return Integer.toString(count);
    }
}
