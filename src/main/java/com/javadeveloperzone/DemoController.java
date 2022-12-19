package com.javadeveloperzone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping(value = "/")
    public String landing(){
        return "I Love you Eunji ^_____^";
    }
    
    @RequestMapping(value = "hello")
    public String hello(){
        return "뚜기야 사랑해 ^_____^";
    }
}
