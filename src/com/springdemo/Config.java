package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springdemo.annotationconfig.Fortune;
import com.springdemo.annotationconfig.HappyFortune;
import com.springdemo.annotationconfig.SwimCoach;

@Configuration
@ComponentScan("com.springdemo")
@PropertySource("sport.properties")
public class Config {

	@Bean
	public Fortune happyFortune() {
		return new HappyFortune();
	}
	
	@Bean
	public SwimCoach swimCoach() {
		return new SwimCoach(happyFortune());
	}
	
}
