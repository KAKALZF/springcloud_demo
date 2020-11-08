package com.kd100.cloud.platform.order.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("sale-hub")
public interface SaleHubClient {
    @GetMapping("/sale/test")
    String sendMessage(@RequestParam("personName") String personName);
}
