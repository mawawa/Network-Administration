package com.limko.Network.Administration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NetworkAdministrationController {


    //Lecture 1
    @RequestMapping("/")
    public ModelAndView networkAdministration(){
        return new ModelAndView("index.html");
    }

    //Lecture 2
    @RequestMapping("/accountAndSecurityAdministration")
    public ModelAndView accountAndSecurityAdministration(){
        return new ModelAndView("Account and Security Administration and Access Control.html");
    }
}
