package com.registration.sungwook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index_Controller {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
