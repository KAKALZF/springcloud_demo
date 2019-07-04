package com.kd100.cloudplatform.platformhub.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zefeng_lin
 * @date 2019/7/4 13:59
 */
@FeignClient("some-service")
public interface OrderClient {
    @GetMapping("/some/test")
    String test(@RequestParam("name") String name);
}
