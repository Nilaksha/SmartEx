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

/**
 *
 * @author Nilaksha
 */
@Controller
@RequestMapping("/moods")
public class MoodsController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String moods(ModelMap model) {

        return "moods";
    }
}
