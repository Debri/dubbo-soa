package com.geek.test;

import com.geek.api.TestService;

/**
 * Created by Liuqi
 * Date: 2017/5/5.
 */

/**
 * 实现在debri-data-api模块中定义放入API
 */
public class TestServiceImpl implements TestService {
    public String sayHello(String str) {
        System.out.println("hello " + str);
        return "hello" + str;
    }
}
