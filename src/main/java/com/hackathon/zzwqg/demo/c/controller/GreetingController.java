package com.hackathon.zzwqg.demo.c.controller;


import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;


/**
 * Created by zoltar on 17-5-20.
 */

@RestController
public class GreetingController {

    @Autowired private MetricRegistry metricRegistry;
    private Timer timer;

    @PostConstruct
    public void init(){
        timer = metricRegistry.timer("load");
    }

    @RequestMapping("/")
    public String greeting(){
        Timer.Context context = timer.time();

        // 延时
        for(int i=0 ; i<10000 ; i++){
            String targe = "aaa" + i;
        }

        context.stop();
        return "hello !";
    }
}
