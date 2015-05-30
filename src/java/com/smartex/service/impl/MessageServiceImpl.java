/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.service.impl;

import com.smartex.dao.MessageDao;
import com.smartex.domain.Message;
import com.smartex.service.MessageService;
import java.util.List;
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

    @Override
    public int lastRepliedTime(String productID) {
        
        return messageDao.lastRepliedTime(productID);
    }

    @Override
    public List<Message> getInboxMessages(String productID) {
        
        return messageDao.getInboxMessages(productID);
    }

    @Override
    public List<Message> getSentMessages(String productID) {

        return messageDao.getSentMessages(productID);
    }

    @Override
    public List<Message> getDraftMessages(String productID) {

        return messageDao.getDraftMessages(productID);
    }

    @Override
    public void saveMessage(Message message) {

        messageDao.saveMessage(message);
    }

    @Override
    public void sendMessage(Message message) {

        messageDao.sendMessage(message);
    }
    
}
