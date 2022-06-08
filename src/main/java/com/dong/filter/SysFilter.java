package com.dong.filter;


import com.dong.pojo.User;
import com.dong.util.Constants;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class SysFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request =  (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;

        //过滤器，从session中获取用户
        User user = (User)request.getSession().getAttribute(Constants.USER_SESSION);
        if(user == null) {//已经被移除或者注销了，或者未登录
            response.sendRedirect(request.getContextPath()+"C:\\Users\\86130\\IdeaProjects\\untitled4\\untitled4\\javaweb-02-maven\\untitled\\javaweb-03-maven\\suiku\\src\\main\\webapp\\jsp\\Syserror.jsp");
        }else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}