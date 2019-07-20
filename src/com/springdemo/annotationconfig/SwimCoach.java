package com.springdemo.annotationconfig;

import org.springframework.beans.factory.annotation.Value;

import com.springdemo.Coach;

public class SwimCoach implements Coach {

	private Fortune fortune;
	@Value("${cricket1.team}")
	private String team;

	public SwimCoach(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Team: " + team + " Swimming is good for health";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
