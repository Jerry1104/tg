package com.tg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tg.controller.form.UserForm;
import com.tg.service.ScoreService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {
	//@Slf4j 代替了Logger
	//private static final Logger log = LoggerFactory.getLogger(TestController.class);
  
	@Autowired
	private ScoreService scoreService;
	
	@GetMapping("/sync")
    public  String sync(){
		log.info("======启动=====");
		this.scoreService.addScore();
        return "sync";
    }
    
	@GetMapping("/lombok")
    public  UserForm lombok(){
		UserForm  form=new  UserForm();
		form.setId("123");
		form.setUserId("name");
		return form;
    }
	
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
