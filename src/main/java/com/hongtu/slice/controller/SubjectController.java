package com.hongtu.slice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class SubjectController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(ModelMap modelMap){
        List<Map<String,String>> subjectNames=new ArrayList<Map<String, String>>();
        for(int i=0;i<3;i++) {
            Map<String ,String> map=new HashMap<String, String>();
            map.put("subjectName","kemu");
            subjectNames.add(map);
        }
        modelMap.addAttribute("subjectNames", subjectNames);
        return "/index";
    }
}
