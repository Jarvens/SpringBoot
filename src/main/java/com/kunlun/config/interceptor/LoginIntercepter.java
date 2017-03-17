package com.kunlun.config.interceptor;

import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;

/**
 * 登录拦截器
 * Created by kunlun on 2017/3/17.
 */
public class LoginIntercepter extends HandlerInterceptorAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginIntercepter.class);

    private static final String LOGINPATH = "/login";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //设置跨域请求
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE");
        response.setHeader("Access-Control-Allow-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "X-Requested-With,Cache-Control,Content-Type");
        String requestUrl = request.getRequestURI();
        if (requestUrl.startsWith(LOGINPATH)) {
            return true;
        }
        HttpSession session = request.getSession();
        Object user = session.getAttribute("LOGIN");
        if (user != null) {
            return true;
        }
        response.sendRedirect(request.getContextPath() + LOGINPATH);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        LOGGER.info("在执行Controller之后但是未进行页面渲染调用......>");
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        LOGGER.info("在请求执行完成之后,也就是在页面进行渲染完成后调用......>");
        super.afterCompletion(request, response, handler, ex);
    }
}
