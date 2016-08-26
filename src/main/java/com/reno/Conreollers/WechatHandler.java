package com.reno.Conreollers;

import com.reno.utils.wechatConn;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Reno on 2016/8/10.
 */
@RestController
@RequestMapping(value = "/wechathandler")
public class WechatHandler {
    @Autowired
    private wechatConn conn;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String connectWithWechat(@RequestParam("echostr") String echostr,
                                    @RequestParam("timestamp") String timestamp,
                                    @RequestParam("nonce") String nonce,
                                    @RequestParam("signature") String signature) {
        if (conn.checkConnection(signature, timestamp, nonce)) {
            return echostr;
        }
        return "";
    }


    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public String getName(HttpServletRequest request) {
        return "reno";
    }


}
