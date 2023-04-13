package com.youjia.springcloud.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className SmsProperties
 * @date 2023/4/13 14:54
 */

@ConfigurationProperties(prefix = "spboot.sms")
public class SmsProperties {

    private String accessKeyId;//短信发送接口的账户

    private String accesskeySecret;//短信发送接口的凭证

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccesskeySecret() {
        return accesskeySecret;
    }

    public void setAccesskeySecret(String accesskeySecret) {
        this.accesskeySecret = accesskeySecret;
    }

}
