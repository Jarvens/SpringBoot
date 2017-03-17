package com.kunlun.config.exception;

/**
 * 全局异常处理类
 * Created by kunlun on 2017/3/17.
 */
public class ErrorInfo<T> {

    public static final Integer OK = 0;

    //系统异常编码
    public static final Integer ERROR = 500;

    //异常编码
    private Integer errorCode;

    //异常信息
    private String message;

    //导致异常信息请求地址
    private String url;

    //异常内容
    private T data;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
