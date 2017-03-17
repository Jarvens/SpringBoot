package com.kunlun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by kunlun on 2017/3/17.
 */
//配置声明
@Configuration
//开启MVC模式
@EnableWebMvc
//包扫描
@ComponentScan()
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    /**
     * 登录拦截器
     *
     * @return
     */
    @Bean
    public LoginIntercepter loginIntercepter() {
        return new LoginIntercepter();
    }

    /**
     * JSON转换
     *
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        super.addViewControllers(registry);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.loginIntercepter());
        super.addInterceptors(registry);
    }
}
