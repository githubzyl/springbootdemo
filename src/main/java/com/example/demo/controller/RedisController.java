package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.RedisService;

@RestController
public class RedisController {
	
	@Autowired
	private RedisService redisService;

	@GetMapping("/redis/ping")
	public String ping(){
		return redisService.ping();
	}
	
}
