package com.jessin.practice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zexin.guo
 * @create 2019-05-19 上午10:42
 **/
@Configuration
@ConditionalOnClass(GirlFriendService.class)
@EnableConfigurationProperties(GirlFriendServiceProperties.class)
public class GirlFriendAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public GirlFriendService girlFriendService() {
        return new GirlFriendServiceImpl();
    }
}
