package com.kd100.cloudplatform.platformhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //1
public class SaleHubApplication {
	public static void main(String[] args) {
        SpringApplication.run(SaleHubApplication.class, args);
    }
}
