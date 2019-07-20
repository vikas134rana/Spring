package com.springdemo.xmlconfig;

import com.springdemo.Coach;

public class TrackCoach implements Coach {

	private Fortune fortune;

	public TrackCoach() {
	}

	public TrackCoach(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Take 5 round of the ground";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}
	
	public void myInitStuff() {
		System.out.println("TrackCoach: performing myInitStuff");
	}
	
	public void myCleanUpStuff() {
		System.out.println("TrackCoach: performing myCleanUpStuff");
	}

}
