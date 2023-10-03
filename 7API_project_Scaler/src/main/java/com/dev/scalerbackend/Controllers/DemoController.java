package com.dev.scalerbackend.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demoMethod(){
        return "Calling Demo Controller!!!";
    }
}
