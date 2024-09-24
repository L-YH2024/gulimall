package com.atguigu.gulimall.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class MyController {
    @GetMapping("get")
    public String get(){
        return "66666666666";
    }
}
