package com.kd100.cloudplatform.platformhub.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/platformHub")
public class TestController {
    @Value("${my.message}")
    public String msg;
    @GetMapping("/test")
    public String test(String name) {
        System.out.println(name);
        return "test mysel api "+msg;
    }
}
