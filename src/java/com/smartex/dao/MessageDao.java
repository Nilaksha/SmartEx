/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.dao;

import com.smartex.domain.Message;
import java.util.List;

/**
 *
 * @author Nilaksha
 */
public interface MessageDao {

    public int newMessageCount(String productID);

    public int lastRepliedTime(String productID);

    public List<Message> getInboxMessages(String productID);

    public List<Message> getSentMessages(String productID);

    public List<Message> getDraftMessages(String productID);
    
    public void saveMessage(Message message);
    
    public void sendMessage(Message message);
}
