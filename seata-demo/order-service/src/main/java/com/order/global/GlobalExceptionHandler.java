package com.order.global;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: gongsl
 * @Date: 2021-11-14 18:05
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public Response handlerAllException(Exception e) {
        log.error("系统内部异常", e);
        Status code = Status.ERROR;
        return new Response(code.getCode(), code.getMsg(), e.getMessage());
    }
}
