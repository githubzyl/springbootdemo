package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.quartz.CustomSchedulerFactoryBean;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = "com.example.demo.controller,com.example.demo.service,com.example.demo.service,com.example.demo.config,com.example.demo.quartz.job")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CustomSchedulerFactoryBean getCustomSchedulerFactoryBean() {
		return new CustomSchedulerFactoryBean();
	}

}
