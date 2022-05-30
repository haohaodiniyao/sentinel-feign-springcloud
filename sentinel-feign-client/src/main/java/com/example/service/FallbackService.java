package com.example.service;

import com.example.agent.FeignAgent;
import org.springframework.stereotype.Component;

//限流或降级的回调类
@Component
public class FallbackService implements FeignAgent {
    @Override
    public String hello() {
        return "系统繁忙，请稍后";
    }
}
