package com.reno.Conreollers;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Reno on 2016/8/10.
 */
@RestController
@RequestMapping(value ="/wechat-fack")
public class WechatHandler {
    @RequestMapping(value ="/", method = RequestMethod.GET)
    @ResponseBody public String initWithWechat(){
        return "connect wechat";
    }

    @RequestMapping(value ="/name", method = RequestMethod.GET)
    @ResponseBody public String getName(){
        return "Reno";
    }


    @RequestMapping(value ="/words/{asks}", method = RequestMethod.GET)
    @ResponseBody public String getName2(@PathVariable String asks){
        return asks;
    }
}
