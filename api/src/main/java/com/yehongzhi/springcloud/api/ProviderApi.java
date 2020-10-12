package com.yehongzhi.springcloud.api;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ye Hongzhi 公众号：java技术爱好者
 * @name ProviderApi
 * @date 2020-10-12 00:54
 **/
public interface ProviderApi {

    @RequestMapping("/provider/list")
    String list();

    @RequestMapping("/provider/loadBalancer")
    String loadBalancer();
}
