package com.order.global;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: gongsl
 * @Date: 2021-11-14 18:04
 */
@Data
@NoArgsConstructor
public class Response<T> implements Serializable {

    private String code;

    private String msg;

    private T data;

    public Response(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Response(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
