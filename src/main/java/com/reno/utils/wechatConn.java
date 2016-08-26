package com.reno.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Reno on 2016/8/26.
 */

@Component
public class wechatConn {
    @Value("${wechat.token}")
    private  String mToken;

    public  boolean checkConnection(String signature,String ...  msg){
        //System.out.println("signature is "+signature);
        //System.out.println("timestamp is "+msg[0]);
        //System.out.println("nonce is "+msg[1]);

        List<String> strs=new ArrayList<String>();
        for(String s:msg){
            strs.add(s);
        }
        strs.add(mToken);
        Collections.sort(strs);
        StringBuilder sb=new StringBuilder();
        for(String st:strs){
            sb.append(st);
        }
        boolean result=false;
        try {
            String sha1_res=SHA1(sb.toString());
            //System.out.println("sha1_res  "+sha1_res);
            result=sha1_res.equals(signature);
        } catch (DigestException e) {
            e.printStackTrace();
        }
        //System.out.println(result);
        return result;
    }


    public  String SHA1(String decrypt) throws DigestException {
        try {
            //指定sha1算法
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.update(decrypt.getBytes());
            //获取字节数组
            byte messageDigest[] = digest.digest();
            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            // 字节数组转换为 十六进制 数
            for (int i = 0; i < messageDigest.length; i++) {
                String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

}
