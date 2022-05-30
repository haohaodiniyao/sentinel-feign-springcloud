package com.example.agent;

import com.example.service.FallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "sentinel-feign-provider",fallback = FallbackService.class)
public interface FeignAgent {

    @GetMapping("/hello")
    String hello();
}
