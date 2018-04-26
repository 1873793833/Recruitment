package com.zhaopin.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.zhaopin.model.EnterpriseUser;

public class EnterpriseInterceptor extends HandlerInterceptorAdapter{
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object obj) throws Exception {
        EnterpriseUser user =(EnterpriseUser)request.getSession().getAttribute("enterprise");
        if(user == null){    //未登录
            String uri=request.getContextPath();
            response.sendRedirect(uri+"/enterprise/loginPage");
            return false;
        }else{    //已经登录
            return true;
        }
    }
}
