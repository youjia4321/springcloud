package com.youjia.springcloud.service.impl;

import com.youjia.springcloud.service.SmsService;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className SmsServiceImpl
 * @date 2023/4/13 14:56
 */
public class SmsServiceImpl implements SmsService {

    private String accessKeyId; //访问ID、即帐号
    private String accessKeySecret; //访问凭证，即密码

    public SmsServiceImpl(String accessKeyId, String accessKeySecret) {
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
    }

    @Override
    public void send(String phone, String signName,     String templateCode, String data) {
        System.out.println("接入短信系统，accessKeyId=" + accessKeyId + ",accessKeySecret=" + accessKeySecret);
        System.out.println("短信发送，phone=" + phone + ",signName=" + signName + ",templateCode=" + templateCode + ",data=" + data);
    }
}
