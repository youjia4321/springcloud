package com.youjia.springcloud.config.properites;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: MutiDataSourceProperties
 * @Create: 22/4/16 14:59
 * @Version: 1.0
 */

@Component
@ConfigurationProperties(prefix = "biz.datasource")
public class MutiDataSourceProperties {

    private String url;

    private String username;

    private String password;

    public void config(DruidDataSource dataSource) {
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
