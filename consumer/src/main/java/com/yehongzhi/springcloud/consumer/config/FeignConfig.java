package com.yehongzhi.springcloud.consumer.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ye Hongzhi 公众号：java技术爱好者
 * @name FeignConfig
 * @date 2020-10-12 22:24
 **/
@Configuration
public class FeignConfig {
    /**
     * NONE：默认的，不显示任何日志Client
     * BASIC：仅记录请求方法、URL、响应状态码及执行时间
     * HEADERS：出了BASIC中定义的信息之外，还有请求和响应的头信息
     * FULL：除了HEADERS中定义的信息之外，还有请求和响应的正文及元素
     */
    @Bean
    public Logger.Level feginLoggerLevel() {
        return Logger.Level.FULL;
    }
}
