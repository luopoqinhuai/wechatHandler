package com.reno.Conreollers.wechat.filmrec;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Reno on 2016/8/11.
 */
@RestController
@RequestMapping(value ="/wechat/filmrec")
public class connectWechat {
    @RequestMapping(value ="/", method = RequestMethod.GET)
        @ResponseBody
        public String initWithWechat(@RequestParam( "signature" )String signature,
                                     @RequestParam( "timestamp" )String timestamp,
                                     @RequestParam( "nonce" )String nonce,
                                     @RequestParam( "echostr" )String echostr){
        return signature;
    }


    @RequestMapping(value ="/", method = RequestMethod.POST)
    @ResponseBody
    public String handlerWechatMessage(){
        return "";
    }





}
