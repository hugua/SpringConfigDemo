package com.chen.controller;

import com.chen.service.DemoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by cvter on 2017/6/28.
 */
@RestController
public class Index {

    @Resource
     DemoService demoService;

    @GetMapping("/")
    public String index(){
        return "hello " + demoService.hello();
    }
}
