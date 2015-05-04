/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.controller;

import com.smartex.dto.TableAppUsageDto;
import com.smartex.service.TablesService;
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
@RequestMapping("/tables")
public class TablesController {
    
    @Autowired
    @Qualifier("tablesService")
    private TablesService tablesService;
 
    @RequestMapping(method = RequestMethod.GET)
    public String tables(ModelMap model) {

        return "tables";
    }
    
    @RequestMapping(value = "/updateTableAppUsage", method = RequestMethod.POST)
    @ResponseBody
    public List<TableAppUsageDto> updateTableAppUsage(HttpSession session) {
        
        String productID = session.getAttribute("productID").toString();
        List<TableAppUsageDto> tableAppUsageDtos;
        tableAppUsageDtos = tablesService.updateTableAppUssage(productID);
        
        return tableAppUsageDtos;
    }
}
