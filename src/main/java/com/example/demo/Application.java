package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = "com.example.demo.controller,com.example.demo.service,com.example.demo.service,com.example.demo.config")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
