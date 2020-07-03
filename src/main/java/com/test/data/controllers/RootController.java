package com.test.data.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class RootController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String rootData() {
        System.out.println("this is the moment: " + new Date().toString());
        return "here is the result";
    }

}
