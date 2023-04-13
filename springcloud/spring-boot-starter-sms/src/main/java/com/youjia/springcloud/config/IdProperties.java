package com.youjia.springcloud.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className IdProperties
 * @date 2023/4/13 15:23
 */

@ConfigurationProperties(prefix = "sue")
public class IdProperties {

    private Long workId;

    public Long getWorkId() {
        return workId;
    }

    public void setWorkId(Long id) {
        this.workId = id;
    }
}
