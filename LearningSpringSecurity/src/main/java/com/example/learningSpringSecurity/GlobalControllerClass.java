package com.example.learningSpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("SpringSecurityController")
public class GlobalControllerClass {

    @GetMapping(value = "")
    public String sampleApi(){
        return "Hello Api called";
    }
}
