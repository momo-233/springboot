package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloCtrl {
    //@RequestMapping(value = "hello",method = RequestMethod.GET)
    @ResponseBody
    // @RequestMapping("/hello")
    public String sayHi(){
        return "Hello world!";
    }

    @GetMapping("/first")
    public String goFirst(){
        return "one";
    }

    @GetMapping("/two")
    public String goTwo(){
        return "two";
    }
}
