package com.rakesh.developer.spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationConfig {
    @RequestMapping("/hello")
    public String getMapping(){
        return "Hello word";
    }
}
