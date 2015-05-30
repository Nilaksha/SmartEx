/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartex.util;

/**
 *
 * @author Nilaksha
 */
import com.smartex.controller.LoginController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionValidator extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        String uri = request.getRequestURI();

        if (uri.endsWith(".css") || uri.endsWith(".js") || uri.contains("font")) {
            return true;
        }
        //System.out.println("*********"+handler.getClass());

        
        if (!(((HandlerMethod) handler).getBean() instanceof LoginController)) {
          //  System.out.println("**********");
            if (session == null || session.getAttribute("productID") == null) {
                throw new Exception("Invalid session please login");
            }
        }
        return true;
    }

}
