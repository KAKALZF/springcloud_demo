package com.kd100.cloudplatform.platformhub.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zefeng_lin
 * @date 2019/7/4 13:59
 */
@FeignClient("order-service")
public interface OrderClient {
    @GetMapping("/order/test")
    String test(@RequestParam("name") String name);
}
