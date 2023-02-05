package com.javadeveloperzone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping(value = "/")
    public String landing(){
        return "Raymetrics website preparing...";
    }
    
    @RequestMapping(value = "hello")
    public String hello(){
        return "Raymetrics website preparing...";
    }
}
