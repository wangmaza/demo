package com.example.demo.controller;

import com.example.demo.config.BaseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebResult;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(NullPointerException.class)
    public BaseResult globalException(HttpServletResponse response, NullPointerException ex) {
        log.info("GlobalExceptionHandler...");
        log.info("错误代码：" + response.getStatus());
        BaseResult result = new BaseResult(0, "request error:" + response.getStatus(), "GlobalExceptionHandler:" + ex.getMessage());
        return result;
    }
}