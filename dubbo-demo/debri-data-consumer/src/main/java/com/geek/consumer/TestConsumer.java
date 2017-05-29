package com.geek.consumer;

import com.geek.api.TestService;

/**
 * Created by Liuqi
 * Date: 2017/5/6.
 */

public class TestConsumer {
    //在XML中配置注入
    private TestService testService;

    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    public void start() throws InterruptedException {
        /*for (int i = 0; i < Integer.MAX_VALUE; i ++) {
            try {
                String hello = testService.sayHello("world" + i);
                System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] " + hello);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Thread.sleep(2000);
        }*/
        System.out.println("invoke start method");
    }
}
