package com.car.owner.university.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author TaoWei
 * @date 2018/1/9
 */

@Configuration
@ConfigurationProperties(prefix = "com.university")
@PropertySource("classpath:variables.properties")
public class ConfigTestBean {

    private String username;
    private String tips;
    private String all;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
