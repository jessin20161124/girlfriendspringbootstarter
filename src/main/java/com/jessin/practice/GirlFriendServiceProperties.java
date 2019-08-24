package com.jessin.practice;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zexin.guo
 * @create 2019-05-19 上午10:37
 **/
@ConfigurationProperties("spring.girlfriend")
public class GirlFriendServiceProperties {
    private String message = "nice to meet you!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
