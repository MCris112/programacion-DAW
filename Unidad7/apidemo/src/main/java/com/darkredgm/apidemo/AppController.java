package com.darkredgm.apidemo;

import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(defaultValue = "world" +
            "") String name) {
        return String.format("Hello, World!");
    }
}
