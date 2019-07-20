package com.springdemo.xmlconfig;

import com.springdemo.Coach;

public class WrestlingCoach implements Coach {

	private Fortune fortune;
	
	public WrestlingCoach() {
	}

	public WrestlingCoach(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Wrestle 2 hours daily";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
