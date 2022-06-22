package com.example.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object name = request.getSession().getAttribute("uName");

        String uri = request.getRequestURI();

        if (uri.startsWith("/admin") && name == null) {
            response.sendRedirect("/toLoginPage");
            return false;
        }
        return true;
    }
}
