package com.jessin.practice;

import javax.annotation.Resource;

/**
 * @author zexin.guo
 * @create 2019-05-19 上午10:40
 **/
public class GirlFriendServiceImpl implements GirlFriendService {

    @Resource
    private GirlFriendServiceProperties girlFriendServiceProperties;

    @Override
    public void say() {
        System.out.println(girlFriendServiceProperties.getMessage());
    }
}
