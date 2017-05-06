package com.geek.consumer;

import com.geek.api.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Liuqi
 * Date: 2017/5/6.
 */
public class TestConsumerTest {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "dubbo-consumer.xml");
        applicationContext.refresh();
        applicationContext.start();
        System.out.println("--------consumer started");
        TestService testService = (TestService) applicationContext.getBean("testService");
        while (true) {
            String str = testService.sayHello("liuqi");
            System.out.println(str);
            Thread.sleep(2000);
        }
    }
}