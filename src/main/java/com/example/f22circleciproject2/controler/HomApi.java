package com.example.f22circleciproject2.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/home")
public class HomApi

{
    @GetMapping
    public String home()
    {
        return "Hello, world!";
    }
}