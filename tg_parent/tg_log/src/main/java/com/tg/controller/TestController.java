package com.tg.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	private static final Logger log = LoggerFactory.getLogger(TestController.class);
  
    @GetMapping("/home")
    public  String home(){
        return "home";
    }
    
    /**
     *	 默认日志级别 info
     */
    @GetMapping("/log")
    public void log() {
    	log.trace("---trace-------");
    	log.debug("----debug-------");
    	log.error("----error-------");
    	log.info("------info-----");
    	log.warn("------warn-----");
    }
    
    
}
