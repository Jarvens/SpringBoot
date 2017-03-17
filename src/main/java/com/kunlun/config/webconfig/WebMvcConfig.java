package com.kunlun.config.webconfig;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.kunlun.config.interceptor.LoginIntercepter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;

import java.nio.charset.Charset;
import java.util.ArrayList;
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
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        List<MediaType> mediaTypeList = new ArrayList<>();
        mediaTypeList.add(MediaType.APPLICATION_JSON);
        fastJsonHttpMessageConverter.setSupportedMediaTypes(mediaTypeList);
        fastJsonHttpMessageConverter.setCharset(Charset.forName("UTF-8"));
        converters.add(fastJsonHttpMessageConverter);
        super.configureMessageConverters(converters);
    }

    /**
     * Thymeleaf 模板解析
     **/
    @Bean
    public ThymeleafViewResolver thymeleafViewResolver() {
        ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
        return thymeleafViewResolver;
    }

    /**
     * 拦截器注册
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.loginIntercepter());
        super.addInterceptors(registry);
    }
}
