package com.tg.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("boot.msg")
	private  String msg;
	
	@GetMapping("/msg")
    public  String msg(){
        return msg;
    }
	
    @GetMapping("/home")
    public  String home(){
        return "home";
    }
}
