package com.geek.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Created by Liuqi
 * Date: 2017/5/5.
 */
public class TestServiceImplTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dubbo.xml");
        applicationContext.refresh();
        applicationContext.start();
        System.out.println("start service");
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            String str = scanner.nextLine();
            while (!str.equals("stop")) {
                System.out.println("service continue");
                str = scanner.nextLine();
            }
            System.out.println("are you sure stop services?");
            str = scanner.nextLine();
            if (!str.equals("y")) {
                System.out.println("service continue");
                continue;
            }
            flag = false;
        }
        System.out.println("service stopped");
        scanner.close();
        applicationContext.destroy();
    }
}