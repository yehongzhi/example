package com.yehongzhi.springcloud.provider.controller;

import com.yehongzhi.springcloud.api.ProviderApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ye Hongzhi 公众号：java技术爱好者
 * @name ProviderController
 * @date 2020-10-11 23:37
 **/
@RestController
public class ProviderController implements ProviderApi {

    @Value("${server.port}")
    private String port;

    public String list() {
        List<String> list = new ArrayList<>();
        list.add("java技术爱好者");
        list.add("SpringCloud");
        list.add("没有人比我更懂了");
        try {
            //休眠1.5秒
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list.toString();
    }

    @Override
    public String loadBalancer() {
        return "调用服务端口号为：" + port;
    }


}
