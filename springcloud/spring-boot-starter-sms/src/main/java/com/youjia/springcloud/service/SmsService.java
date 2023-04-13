package com.youjia.springcloud.service;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className SmsService
 * @date 2023/4/13 14:55
 */
public interface SmsService {

    /**
     * 发送短信
     *
     * @param phone        要发送的手机号
     * @param signName     短信签名-在短信控制台中找
     * @param templateCode 短信模板-在短信控制台中找
     * @param data         要发送的内容
     */
    void send(String phone, String signName, String templateCode, String data);


}
