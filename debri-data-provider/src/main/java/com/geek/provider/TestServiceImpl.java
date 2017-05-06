package com.geek.provider;

import com.geek.api.TestService;

/**
 * Created by Liuqi
 * Date: 2017/5/5.
 */
public class TestServiceImpl implements TestService {
    public String sayHello(String str) {
        System.out.println("hello " + str);
        return "hello" + str;
    }
}
