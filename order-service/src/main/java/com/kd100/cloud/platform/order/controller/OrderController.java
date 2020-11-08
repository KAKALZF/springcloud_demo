package com.kd100.cloud.platform.order.controller;

import com.kd100.cloud.platform.order.client.SaleHubClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zefeng_lin
 * @date 2019/7/4 14:06
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Value("${my.message}")
    private String msg;
    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    SaleHubClient saleHubClient;

    @GetMapping("/test")
    public String test(@RequestParam("name") String name) {
//        logger.info("=========" + name);
        saleHubClient.sendMessage(name);
        return "test  some success";
    }
}
