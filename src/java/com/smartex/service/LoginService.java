/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.service;

import com.smartex.dto.LoginDto;

/**
 *
 * @author Nilaksha
 */
public interface LoginService {

    public boolean login(LoginDto loginDto);
}
