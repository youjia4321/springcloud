package com.youjia.springcloud.pojo;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: ResponseMessage
 * @Create: 22/4/15 01:29
 * @Version: 1.0
 */
public class ResponseMessage {
    private String responseMessage;

    public ResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}