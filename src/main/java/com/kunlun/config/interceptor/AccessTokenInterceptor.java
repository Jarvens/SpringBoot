package com.kunlun.config.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * AccessToken  拦截器
 * 权限拦截
 *
 *
 * Created by kunlun on 2017/3/19.
 */
public class AccessTokenInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String accessToken = request.getParameter("token");

        return super.preHandle(request, response, handler);
    }
}
