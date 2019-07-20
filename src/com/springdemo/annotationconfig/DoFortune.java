package com.springdemo.annotationconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DoFortune implements Fortune {

	@Value("${doFortune}")
	private String fortune;
	
	@Override
	public String getFortune() {
		return fortune;
	}

}
