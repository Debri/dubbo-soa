package com.geek.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by Liuqi
 * Date: 2017/5/7.
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1800)//session超时时间1800秒
public class HttpSessionConfig {
}
