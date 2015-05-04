/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.service.impl;

import com.smartex.dao.TablesDao;
import com.smartex.dto.TableAppUsageDto;
import com.smartex.service.TablesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nilaksha
 */
@Service("tablesService")
public class TablesServiceImpl implements TablesService{
    
    @Autowired
    @Qualifier("tablesDao")
    private TablesDao tablesDao;

    @Override
    public List<TableAppUsageDto> updateTableAppUssage(String productID) {
        
        return tablesDao.updateTableAppUssage(productID);
    }
    
}
