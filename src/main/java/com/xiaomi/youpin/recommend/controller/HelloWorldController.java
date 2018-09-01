package com.xiaomi.youpin.recommend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/")
public class HelloWorldController {
    @RequestMapping(value="/user",method = RequestMethod.GET)
    public String getUser(@RequestParam("x") Integer x,@RequestParam("y") Integer y) throws IOException{
        return "x"+x+"y"+y;
    }
}
