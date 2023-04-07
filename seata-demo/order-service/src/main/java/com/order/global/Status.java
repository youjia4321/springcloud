package com.order.global;

import lombok.Getter;

/**
 * @Author: gongsl
 * @Date: 2021-11-14 18:08
 */
public enum Status {

    SUCCESS("0", "success"),
    ERROR("1", "error");

    @Getter
    private String code;

    @Getter
    private String msg;

    Status(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
