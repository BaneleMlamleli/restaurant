package com.restaurant.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Value("${welcome.message}")
    private String welcomeMessage;
    @GetMapping("/")
    String index(){
        return welcomeMessage;
    }
}
