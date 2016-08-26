package com.reno;

import com.reno.utils.wechatConn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.WeakCacheKey;


/**
 * Created by Reno on 2016/8/5.
 */
@SpringBootApplication
public class WeChat {
    @Autowired
    private wechatConn conn;
    public static void main(String[] args) {
        SpringApplication app=new SpringApplication(WeChat.class);
        app.run(args);
    }
}







