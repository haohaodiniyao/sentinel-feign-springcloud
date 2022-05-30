package com.example.controller;

import com.example.agent.FeignAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private FeignAgent feignAgent;

    @GetMapping("hello")
    public String hello(){
        return feignAgent.hello();
    }
}
