package com.springdemo.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springdemo.Coach;

@Component("myTennisCoach")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortune")
	private Fortune fortune;

	/*- @Autowired
	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}*/

	/*
	 * @Autowired public void initialize(Fortune fortune) { this.fortune = fortune;
	 * }
	 */

	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
