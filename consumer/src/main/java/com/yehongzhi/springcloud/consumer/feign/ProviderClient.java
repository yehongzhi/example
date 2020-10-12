package com.yehongzhi.springcloud.consumer.feign;

import com.yehongzhi.springcloud.api.ProviderApi;
import com.yehongzhi.springcloud.consumer.fallback.ProviderClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author Ye Hongzhi 公众号：java技术爱好者
 * @name ProviderClient
 * @date 2020-10-11 23:46
 **/
@Component
@FeignClient(name = "provider", fallback = ProviderClientFallBack.class)
public interface ProviderClient extends ProviderApi {
}
