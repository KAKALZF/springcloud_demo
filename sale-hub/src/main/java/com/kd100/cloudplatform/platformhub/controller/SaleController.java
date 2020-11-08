package com.kd100.cloudplatform.platformhub.controller;

import com.kd100.cloudplatform.platformhub.client.OrderClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sale")

public class SaleController {

    @Autowired
    public OrderClient orderClient;
    Logger logger = LoggerFactory.getLogger(SaleController.class);

    @GetMapping("/test")
    public String sendMessage(String personName) {
//        String res = orderClient.test("kaka");
        System.out.println("调用成功");
        logger.info("==========" + personName);
        return "sale-hub success";
    }

}
