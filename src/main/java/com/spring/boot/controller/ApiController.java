package com.spring.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/spring/v1")
public class ApiController {
    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    @GetMapping(value = "/getMessage")
    @ResponseBody
    public Object getMessage() {
        return "Hello Spring Boot Application !!!";
    }
}
