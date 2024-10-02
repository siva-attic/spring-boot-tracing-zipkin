package com.sivalabs.tracingdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DemoController {

    @GetMapping
    public Map<String, String> health() {
        return Map.of("status", "OK");
    }
}
