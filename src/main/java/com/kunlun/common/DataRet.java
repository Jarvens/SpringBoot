package com.kunlun.common;

import java.io.Serializable;

/**
 *
 *
 * Created by kunlun on 2017/3/17.
 */
public class DataRet<T> implements Serializable {

    private static final long serialVersionUID = 7913676418715973680L;
    //错误编码
    private String errorCode;

    //消息
    private String message;

    //返回信息体
    private T body;

    public DataRet() {

    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public DataRet(String errorCode, String message, T body) {
        this.errorCode = errorCode;
        this.message = message;
        this.body = body;
    }
}
