package com.springdemo.annotationconfig;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements Fortune {

	@Override
	public String getFortune() {
		return "You will be successfull in life";
	}

}
