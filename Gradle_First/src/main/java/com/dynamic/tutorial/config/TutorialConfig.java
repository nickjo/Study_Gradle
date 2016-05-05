package com.dynamic.tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dynamic.tutorial.IndexController;

@Configuration
public class TutorialConfig {

	@Bean
	public IndexController indexController(){
		return new IndexController();
	}
}
