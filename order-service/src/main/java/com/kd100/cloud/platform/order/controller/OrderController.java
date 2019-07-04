package com.kd100.cloud.platform.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zefeng_lin
 * @date 2019/7/4 14:06
 */
@RestController
@RequestMapping("/some")
public class OrderController {
    @GetMapping("/test")
    public String test(@RequestParam("name") String name) {
        System.out.println(name);
        return "test  some success";
    }
}
