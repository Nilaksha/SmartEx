/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.service.impl;

import com.smartex.dao.LoginDao;
import com.smartex.dto.LoginDto;
import com.smartex.service.LoginService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nilaksha
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    @Qualifier("loginDao")
    private LoginDao loginDao;

    @Override
    public boolean login(LoginDto loginDto) {

        List<LoginDto> results = loginDao.login(loginDto.getEmail());
        if (!results.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
