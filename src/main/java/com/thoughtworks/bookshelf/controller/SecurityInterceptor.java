package com.thoughtworks.bookshelf.controller;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecurityInterceptor implements HandlerInterceptor {

    private static final String LOGIN_URL = "login";

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
        HttpSession session = req.getSession(true);
        // 判断如果没有取到用户信息，就跳转到登陆页面，提示用户进行登陆
        if (session.getAttribute("userName") == null || "".equals(session.getAttribute("userName").toString())) {
//            res.sendRedirect(LOGIN_URL);
//            System.out.println(session.getAttribute("userName"));
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest req, HttpServletResponse res, Object arg2, ModelAndView arg3) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object arg2, Exception arg3) throws Exception {
    }
}
