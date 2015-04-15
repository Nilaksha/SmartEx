/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.controller;

import com.smartex.dto.LoginDto;
import com.smartex.service.LoginService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/login")
public class LoginController {

    @Autowired
    @Qualifier("loginService")
    private LoginService loginService;

    @RequestMapping(method = RequestMethod.GET)
    public String login(ModelMap model) {

        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String login2(@RequestParam("email") String email,
            @RequestParam("password") String password) {

        LoginDto loginDto = new LoginDto();
        loginDto.setEmail(email);
        loginDto.setPassword(password);

        if (loginService.login(loginDto)) {
            return "dashboard";

        } else {
            return "login";
        }
    }
}
