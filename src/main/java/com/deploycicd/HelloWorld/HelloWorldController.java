package com.deploycicd.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String getHello() {
        return "Welcome to hello world application . . .";
    }
}
