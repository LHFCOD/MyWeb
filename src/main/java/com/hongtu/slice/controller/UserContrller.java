package com.hongtu.slice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserContrller {
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser() {
        return "/user";
    }
}
