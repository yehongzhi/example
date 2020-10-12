package com.yehongzhi.springcloud.consumer.controller;

import com.yehongzhi.springcloud.consumer.feign.ProviderClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Ye Hongzhi 公众号：java技术爱好者
 * @name ConsumerController
 * @date 2020-10-11 23:45
 **/
@RestController
public class ConsumerController {

    @Resource
    private ProviderClient providerClient;

    @RequestMapping("/consumer/callProvider")
    public String callProvider() throws Exception {
        long star = System.currentTimeMillis();
        String list = providerClient.list();
        long end = System.currentTimeMillis();
        return "响应结果：" + list + ",耗时：" + (end - star) / 1000 + "秒";
    }

    @RequestMapping("/consumer/callLoadBalancer")
    public String callLoadBalancer() throws Exception {
        return providerClient.loadBalancer();
    }
}
