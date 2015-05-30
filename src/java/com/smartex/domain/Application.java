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
public class Application {
    
    private Integer productID;
    private Integer appID;
    private String name;
    private String type;
    private String status;

    public Application() {
    }

    public Application(Integer productID, Integer appID, String name, String type, String status) {
        this.productID = productID;
        this.appID = appID;
        this.name = name;
        this.type = type;
        this.status = status;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Integer getAppID() {
        return appID;
    }

    public void setAppID(Integer appID) {
        this.appID = appID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }       
}
