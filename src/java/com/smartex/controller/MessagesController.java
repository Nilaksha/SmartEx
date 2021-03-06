/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.controller;

import com.smartex.domain.Message;
import com.smartex.service.MessageService;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Nilaksha
 */
@Controller
@RequestMapping("/messages")
public class MessagesController {

    @Autowired
    @Qualifier("messageService")
    private MessageService messageService;

    @RequestMapping(method = RequestMethod.GET)
    public String messages(ModelMap model) {

        return "messages";
    }

    @RequestMapping(value = "/inbox", method = RequestMethod.POST)
    @ResponseBody
    public List<Message> getInboxMessages(HttpSession session) {
        
        String productID = session.getAttribute("productID").toString();
        List<Message> messages = new ArrayList<>();
        messages = messageService.getInboxMessages(productID);

        return messages;
    }

    @RequestMapping(value = "/sent", method = RequestMethod.POST)
    @ResponseBody
    public List<Message> getSentMessages(HttpSession session) {

        String productID = session.getAttribute("productID").toString();
        List<Message> messages = new ArrayList<>();
        messages = messageService.getSentMessages(productID);

        return messages;
    }

    @RequestMapping(value = "/draft", method = RequestMethod.POST)
    @ResponseBody
    public List<Message> getDraftMessages(HttpSession session) {

        String productID = session.getAttribute("productID").toString();
        List<Message> messages = new ArrayList<>();
        messages = messageService.getDraftMessages(productID);

        return messages;
    }

    @RequestMapping(value = "/newMessageCount", method = RequestMethod.POST)
    @ResponseBody
    public String newMessageCount(HttpSession session) {

        String productID = session.getAttribute("productID").toString();
        int count = messageService.newMessageCount(productID);

        return Integer.toString(count);
    }

    @RequestMapping(value = "/lastRepliedTime", method = RequestMethod.POST)
    @ResponseBody
    public String lastRepliedTime(HttpSession session) {

        String productID = session.getAttribute("productID").toString();
        int count = messageService.lastRepliedTime(productID);

        return Integer.toString(count);
    }
    
    @RequestMapping(value = "/saveMessage", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    public boolean saveMessage(HttpSession session, @RequestBody Message message){
    
        String productID = session.getAttribute("productID").toString();
        message.setProductID(Integer.parseInt(productID));
        messageService.saveMessage(message);
        
        return true;
    }
    
    @RequestMapping(value = "/sendMessage", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    public boolean sendMessage(HttpSession session, @RequestBody Message message){
    
        String productID = session.getAttribute("productID").toString();
        message.setProductID(Integer.parseInt(productID)); 
        messageService.sendMessage(message);
        
        return true;
    }
}
