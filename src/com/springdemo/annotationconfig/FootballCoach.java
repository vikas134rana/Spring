package com.springdemo.annotationconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.springdemo.Coach;

@Component
public class FootballCoach implements Coach {

	private Fortune fortune;

	@Value("${cricket1.team}")
	private String team;

	@Autowired
	public FootballCoach(@Qualifier("doFortune") Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Team: " + team + " Practice dribbling for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

	@PostConstruct
	public void init() {
		System.out.println("Bean Post Construct");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Bean Pre Destroy");
	}

}
