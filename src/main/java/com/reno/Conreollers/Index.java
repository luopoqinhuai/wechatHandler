package com.reno.Conreollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Reno on 2016/8/9.
 */
@Controller
public class Index {
    @RequestMapping(value ="/", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "hello world";
    }
}
