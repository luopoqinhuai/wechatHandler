package com.reno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by Reno on 2016/8/5.
 */
@SpringBootApplication
public class WeChat {
    public static void main(String[] args) {
        SpringApplication app=new SpringApplication(WeChat.class);
        app.run(args);
    }
}






