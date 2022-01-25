package com.youjia.springcloud.api;

/**
 * @author Galileo
 * @ClassName IErrorCode
 * @Description 封装API的错误码
 * @Date 2020/5/6 21:24
 * @Version 1.0
 **/
public interface IErrorCode {
    long getCode();

    String getMessage();
}
