package com.java11.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java11.rest.services.PropertyService;

@Controller
public class ViewController {
    @Autowired
    private PropertyService service;
    //landing page
    @RequestMapping("/")
    public String landingPage(Model model){
        model.addAttribute("currentProperties",service.getAll());
        return "index";
    }
}
