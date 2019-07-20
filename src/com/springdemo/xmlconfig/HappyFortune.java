package com.springdemo.xmlconfig;

public class HappyFortune implements Fortune {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
