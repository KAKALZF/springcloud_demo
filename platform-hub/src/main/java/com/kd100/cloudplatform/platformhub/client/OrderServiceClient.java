package com.kd100.cloudplatform.platformhub.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("order-service")
public interface OrderServiceClient {
    @GetMapping("/order/test")
    void orderTest(@RequestParam("name") String name);
}
