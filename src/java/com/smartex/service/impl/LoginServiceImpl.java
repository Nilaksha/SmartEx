/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.service.impl;

import com.smartex.dao.LoginDao;
import com.smartex.dto.LoginDto;
import com.smartex.dto.ProfileDto;
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
    public LoginDto login(LoginDto loginDto) {

        List<LoginDto> results = loginDao.login(loginDto.getEmail());
        LoginDto succesLoginDto = new LoginDto();

        if (!results.isEmpty()) {

            succesLoginDto = results.get(0);
        }
        return succesLoginDto;
    }

    @Override
    public ProfileDto register(ProfileDto profileDto) {

        if (loginDao.isProductID(profileDto.getProductID())) {
            profileDto.setStatus(false);
            return profileDto;
        } else {
            if (loginDao.saveProfile(profileDto)) {
                profileDto.setStatus(true);
                return profileDto;
            } else {
                profileDto.setStatus(false);
                return profileDto;
            }
        }
    }
}
