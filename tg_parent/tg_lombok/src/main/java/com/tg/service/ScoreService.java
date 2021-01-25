package com.tg.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class ScoreService {
	
	/**
	 * 异步处理在方法上加 @Async
	 */
	@Async
	public void addScore() {
		log.info("======调用异步=====");
		try {
			Thread.sleep(1000*5);
			log.info("======调用异步处理=====");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
