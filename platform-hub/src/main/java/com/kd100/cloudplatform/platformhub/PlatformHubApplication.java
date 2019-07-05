package com.kd100.cloudplatform.platformhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Administrator
 */
@SpringCloudApplication
@EnableEurekaClient
@EnableFeignClients //1
@EnableZuulProxy
public class PlatformHubApplication {
	public static void main(String[] args) {
        SpringApplication.run(PlatformHubApplication.class, args);
    }
}
