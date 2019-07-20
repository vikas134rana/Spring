package com.springdemo.xmlconfig;

import com.springdemo.Coach;

public class CricketCoach implements Coach {

	private Fortune fortune;
	private String email;
	private String team;

	public Fortune getFortune() {
		return fortune;
	}

	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice batting/bowling and fielding 2 hours each daily";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
