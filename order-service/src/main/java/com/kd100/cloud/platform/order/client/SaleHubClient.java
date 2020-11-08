package com.kd100.cloud.platform.order.client;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("sale-hub")
public interface SaleHubClient {
}
