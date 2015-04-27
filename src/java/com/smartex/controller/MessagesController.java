/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.controller;

import com.smartex.service.MessageService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Nilaksha
 */
@Controller
@RequestMapping("/messages")
public class MessagesController {

    @Autowired
    @Qualifier("messageService")
    private MessageService messageService;
    
    @RequestMapping(value = "/inbox", method = RequestMethod.GET)
    public String inbox(ModelMap model) {

        return "inbox";
    }
    
    @RequestMapping(value = "/sent", method = RequestMethod.GET)
    public String sent(ModelMap model) {

        return "sent";
    }
    
    @RequestMapping(value = "/draft", method = RequestMethod.GET)
    public String draft(ModelMap model) {

        return "draft";
    }
    
    @RequestMapping(value = "/trash", method = RequestMethod.GET)
    public String trash(ModelMap model) {

        return "trash";
    }

    @RequestMapping(value = "/newMessageCount", method = RequestMethod.POST)
    @ResponseBody
    public String newMessageCount(@RequestParam("productID") String productID) {

        int count = messageService.newMessageCount(productID);  

        return Integer.toString(count);
    }
    
    @RequestMapping(value = "/lastRepliedTime", method = RequestMethod.POST)
    @ResponseBody
    public String lastRepliedTime(@RequestParam("productID") String productID) {
        
        int count = messageService.lastRepliedTime(productID);  

        return Integer.toString(count);
    }
}
