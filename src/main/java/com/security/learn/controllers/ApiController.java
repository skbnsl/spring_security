package com.security.learn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class ApiController {

    //first end point
    @GetMapping("/route1")
    public String route1(Principal principal){
        return "Protected route1 " + principal.getName();
    }

    //second end point
    @GetMapping("/route2")
    public String route2(Principal principal){
        return "Protected route2 " + principal.getName();
    }

}
