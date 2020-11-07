package com.kd100.cloudplatform.platformhub.controller;

import com.kd100.cloudplatform.platformhub.client.OrderServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/platformHub")
public class TestController {
    Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    OrderServiceClient orderServiceClient;
    @Value("${my.message}")
    public String msg;

    @GetMapping("/test")
    public String test(String name) {
        System.out.println(name);
        logger.info("=================" + name);
        orderServiceClient.orderTest(name);
        return "test mysel api " + msg + ":" + name;
    }
}
