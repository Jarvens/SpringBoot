package com.kunlun.config.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常 handler
 * Created by kunlun on 2017/3/17.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo<String> errorInfoHandler(HttpServletRequest request, MyException e) {
        ErrorInfo<String> error = new ErrorInfo<>();
        error.setMessage(e.getMessage());
        error.setErrorCode(ErrorInfo.ERROR);
        error.setData("业务异常");
        error.setUrl(request.getRequestURI().toString());
        return error;
    }
}
