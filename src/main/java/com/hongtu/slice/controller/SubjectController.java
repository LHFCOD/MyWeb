package com.hongtu.slice.controller;

import com.hongtu.slice.db.client.DaoFactory;
import com.hongtu.slice.db.client.DbFactory;
import com.hongtu.slice.db.model.generated.Subject;
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
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        List<Map<String, String>> subjectInfo=getSubjectInfo();
        modelMap.addAttribute("subjectInfo", subjectInfo);
        return "/index";
    }

    public List<Map<String, String>> getSubjectInfo() {
        DaoFactory daoFactory = DbFactory.getInstance();
        List<Subject> subjects = daoFactory.getSubjects();
        List<Map<String, String>> subjectInfo = new ArrayList<Map<String, String>>();
        for (Subject subject : subjects) {
            Map<String, String> map = new HashMap<String, String>();
            if (subject.getName() != null && subject.getAddress() != null) {
                map.put("name", subject.getName());
                map.put("path",subject.getAddress());
                subjectInfo.add(map);
            }
        }
        return subjectInfo;
    }
}
