package com.hue.gittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("hello1")
    public String hello1() {
        return "Hello World1";
    }

    @GetMapping("hello2")
    public String hello2() {
        return "Hello World2";
    }


}
