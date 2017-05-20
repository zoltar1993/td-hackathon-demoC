package com.hackathon.zzwqg.demo.c.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zoltar on 17-5-20.
 */

@RestController
public class GreetingController {

    @RequestMapping("/")
    public String greeting(){
        return "hello !";
    }
}
