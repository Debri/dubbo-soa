package com.soa.web.controller;

import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Liuqi
 * Date: 2017/5/28.
 */
@RestController
public class TestController {
    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String TestController() {
        System.out.println("test ok");
        return "OK";
    }


}
