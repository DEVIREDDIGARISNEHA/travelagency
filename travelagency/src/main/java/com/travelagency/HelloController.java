package com.travelagency;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // idhi important
public class HelloController {

    @GetMapping("/hello")  // idhi kuda important
    public String hello() {
        return "Welcome to Travel Agency ✈️";
    }
}