package com.itheima.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectException {
    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){
        System.out.println("程序出问题啦");
        return new Result(666,"服务器异常",null);
    }
}
