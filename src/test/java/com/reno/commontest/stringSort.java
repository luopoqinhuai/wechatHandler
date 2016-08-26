package com.reno.commontest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Reno on 2016/8/26.
 */
public class stringSort {

    @Test
    public void test(){
        String a="123";
        String b="asdad";
        String c="aasdad";
        List<String> strs=new ArrayList<String>();
        strs.add(a);
        strs.add(b);
        strs.add(c);
        Collections.sort(strs);
        for(String st:strs){
            System.out.println(st);
        }
    }
}
