/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.service.impl;

import com.smartex.dao.MessageDao;
import com.smartex.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nilaksha
 */
@Service("messageService")
public class MessageServiceImpl implements MessageService {

    @Autowired
    @Qualifier("messageDao")
    private MessageDao messageDao;
    
    @Override
    public int newMessageCount(String productID) {
        
        return messageDao.newMessageCount(productID);
    }
    
}
