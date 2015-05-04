/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.controller;

import com.smartex.dto.LoginDto;
import com.smartex.dto.ProfileDto;
import com.smartex.service.LoginService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
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
public class LoginController {

    @Autowired
    @Qualifier("loginService")
    private LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model) {

        return "login";
    }

    @RequestMapping(value = "/dashboard", method = RequestMethod.POST)
    public String login2(HttpSession session, @RequestParam("email") String email,
            @RequestParam("password") String password) {

        LoginDto loginDto = new LoginDto();
        loginDto.setEmail(email);
        loginDto.setPassword(password);

        loginDto = loginService.login(loginDto);
        if (loginDto.getProductID() != null) {
            
            if (password.matches(loginDto.getPassword())) {
                session.setAttribute("productID", loginDto.getProductID());
                return "dashboard";
            }
        }
        return "login";

    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request) {

        request.getSession().invalidate();
        return "login";
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(HttpServletRequest request) {

        return "register";
    }
    
    @RequestMapping(value = "/registerSave", method = RequestMethod.POST)
    @ResponseBody
    public String registerSave(HttpSession session, 
                             @RequestParam("userName") String userName,
                             @RequestParam("email") String email,
                             @RequestParam("password") String password,
                             @RequestParam("productID") String productID) {

        ProfileDto profileDto = new ProfileDto(userName, email, password, productID);
        ProfileDto profile = loginService.register(profileDto);
        
        if(profile.isStatus()){
            session.setAttribute("productID", profileDto.getProductID());
        }
        
        return String.valueOf(profile.isStatus());
    }
}
