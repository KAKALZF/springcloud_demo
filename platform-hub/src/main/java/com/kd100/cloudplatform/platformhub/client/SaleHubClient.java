package com.kd100.cloudplatform.platformhub.client;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("sale-hub")
public interface SaleHubClient {
}
