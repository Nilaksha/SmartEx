/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.service;

import com.smartex.domain.Message;
import java.util.List;

/**
 *
 * @author Nilaksha
 */
public interface MessageService {
    
    public int newMessageCount(String productID);

    public int lastRepliedTime(String productID);
    
    public List<Message> getInboxMessages(String productID);
}
