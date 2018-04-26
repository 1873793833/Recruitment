package com.zhaopin.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.zhaopin.model.IndividualUser;

public class IndividualInterceptor extends HandlerInterceptorAdapter{
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object obj) throws Exception {
		IndividualUser user =(IndividualUser)request.getSession().getAttribute("individual");
        if(user == null){    //未登录
            String uri=request.getContextPath();
            response.sendRedirect(uri+"/individual/loginPage");
            return false;
        }else{    //已经登录
            return true;
        }
    }
}
