/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.controller;

import com.smartex.service.MessageService;
import com.smartex.util.Response;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Nilaksha
 */
@Controller
@RequestMapping("/message")
public class MessageController {

    @Autowired
    @Qualifier("messageService")
    private MessageService messageService;

    @RequestMapping(value = "/newMessageCount", method = RequestMethod.POST)
    @ResponseBody
    public String newMessageCount(@RequestParam("productID") String productID) {

        Response<Map<String, String>> response = new Response<>();
        Map<String, String> countData = new HashMap<>();
        
        int count = messageService.newMessageCount(productID);  

        return Integer.toString(count);
    }
}