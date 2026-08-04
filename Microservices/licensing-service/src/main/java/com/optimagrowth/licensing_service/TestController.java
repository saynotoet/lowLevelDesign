package com.optimagrowth.licensing_service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/TestController")
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping(value = "/test")
    public String test() {
        System.out.print("TestController.test() called");
        log.info("TestController.test() called");
        return "Hello World";
    }
}
