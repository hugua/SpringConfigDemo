package com.chen.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by cvter on 2017/6/28.
 */
@Service
public class DemoService {
    @Value("${name}")
    private String name;

    public String hello(){
        return  name;
    }
}
