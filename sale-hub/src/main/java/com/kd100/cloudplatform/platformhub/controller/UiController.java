package com.kd100.cloudplatform.platformhub.controller;

import com.kd100.cloudplatform.platformhub.client.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UiController {

    @Autowired
    public OrderClient orderClient;

    @GetMapping("/test")
    public String sendMessage(String personName) {
        String res = orderClient.test("kaka");
        System.out.println("调用成功");
        return "sale-hub success";
    }

}
