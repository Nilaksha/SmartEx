/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.domain;

/**
 *
 * @author Nilaksha
 */
public class Message {
    
    private Integer productID;
    private String name;
    private String subject;
    private String body;
    private String date;

    public Message() {
    }

    public Message(Integer productID, String name, String subject, String body, String date) {
        this.productID = productID;
        this.name = name;
        this.subject = subject;
        this.body = body;
        this.date = date;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
