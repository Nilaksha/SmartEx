/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.controller;

import com.smartex.dto.MoodsDonutDto;
import com.smartex.dto.MoodsLineDto;
import com.smartex.service.ChartService;
import java.util.List;
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
@RequestMapping("/charts")
public class ChartsController {
    
    @Autowired
    @Qualifier("chartService")
    private ChartService chartService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String charts(ModelMap model) {

        return "charts";
    }
    
    @RequestMapping(value = "/recentActivityCount", method = RequestMethod.POST)
    @ResponseBody
    public String newMessageCount(HttpSession session) {
        
        String productID = session.getAttribute("productID").toString();
        int count = chartService.recentActivityCount(productID);  

        return Integer.toString(count);
    }
    
    @RequestMapping(value = "/updateLine", method = RequestMethod.POST)
    @ResponseBody
    public List<MoodsLineDto> updateLine(HttpSession session) {
        
        String productID = session.getAttribute("productID").toString();
        List<MoodsLineDto> moods;
        moods = chartService.updateMoodLine(productID);
        
        return moods;
    }
}
