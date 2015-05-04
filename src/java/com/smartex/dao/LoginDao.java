/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dao;

import com.smartex.dto.LoginDto;
import com.smartex.dto.ProfileDto;
import java.util.List;

/**
 *
 * @author Nilaksha
 */
public interface LoginDao {
    
    public List<LoginDto> login(String email);
    
    public boolean isProductID(String productID);
    
    public boolean saveProfile(ProfileDto profileDto);
}
