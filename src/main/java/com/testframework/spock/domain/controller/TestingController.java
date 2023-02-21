package com.testframework.spock.domain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test-method")
public class TestingController {

    @GetMapping
    public String getMethod() {
        return "Hello";
    }

    @PostMapping
    public Map<String, String> postMethod() {
        return new HashMap<>(){{
           put("post", "1");
           put("get", "1");
        }};
    }

}
