package com.springdemo.xmlconfig;

import com.springdemo.Coach;

public class BaseballCoach implements Coach {

	private Fortune fortune;

	public BaseballCoach() {
	}
	
	public BaseballCoach(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice batting for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
