package com.reno.Request;

import com.reno.beans.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;




/**
 * Created by Reno on 2016/8/10.
 */
public class GetSomeThing {

    RestTemplate restTemplate;
    public GetSomeThing(){
        restTemplate=new RestTemplate();
    }

    public User request(String url) {
        ParameterizedTypeReference<User> responseType=new ParameterizedTypeReference<User>() {};
        return restTemplate.exchange(url, HttpMethod.GET, null, responseType).getBody();

    }


}
