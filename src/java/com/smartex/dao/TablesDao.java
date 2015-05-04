/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dao;

import com.smartex.dto.TableAppUsageDto;
import java.util.List;

/**
 *
 * @author Nilaksha
 */
public interface TablesDao {
    
    public List<TableAppUsageDto> updateTableAppUssage(String productID);
}
