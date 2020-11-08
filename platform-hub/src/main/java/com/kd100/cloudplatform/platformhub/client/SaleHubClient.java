package com.kd100.cloudplatform.platformhub.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("sale-hub")
public interface SaleHubClient {
}
