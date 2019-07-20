package com.springdemo.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		// create spring container using configuration(xml) file
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// retrieve bean from spring container
		CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);

		// use bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		System.out.println("Email: "+coach.getEmail());
		System.out.println("Team: "+coach.getTeam());

		// close spring container
		((ClassPathXmlApplicationContext) context).close();
	}

}
