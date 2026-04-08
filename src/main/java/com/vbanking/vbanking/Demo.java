package com.vbanking.vbanking;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class Demo{

    @GetMapping("/app")
    public String demo(){
        return "App is Running";
    }

    @GetMapping("/checkBalance")
    public void checkBalance(){
        System.out.println("25000 rupees only");
    }
}