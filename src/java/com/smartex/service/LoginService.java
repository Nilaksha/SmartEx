/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.service;

import com.smartex.dto.LoginDto;
import com.smartex.dto.ProfileDto;

/**
 *
 * @author Nilaksha
 */
public interface LoginService {

    public LoginDto login(LoginDto loginDto);
    
    public ProfileDto register(ProfileDto profileDto);
}
