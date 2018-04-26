package com.zhaopin.interceptors;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.zhaopin.model.Admin;

public class AdminInterceptor extends HandlerInterceptorAdapter {
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object obj) throws Exception {
       	Admin admin =(Admin)request.getSession().getAttribute("admin");
        if(admin == null){    //未登录
            String uri=request.getContextPath();
            response.sendRedirect(uri+"/admin/loginPage");
            return false;
        }else{    //已经登录
            return true;
        }
    }
}
