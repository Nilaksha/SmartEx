/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Nilaksha
 */
@Controller
public class LoginController {
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model) {

        return "login";
    }
    
    @RequestMapping(value = "/dashboard", method = RequestMethod.POST)
    public String login2(@RequestParam("email") String email,
                                       @RequestParam("password") String password) {
        
        if(email.equalsIgnoreCase("nilakshaperera@gmail.com") && password.equalsIgnoreCase("123")){
            return "dashboard";
        }

        return "login";
    }
}