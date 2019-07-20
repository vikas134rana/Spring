package com.springdemo.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdemo.Coach;
import com.springdemo.Config;

public class JavaConfigApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Coach coach = context.getBean("swimCoach", Coach.class);

		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());

		((AnnotationConfigApplicationContext) context).close();
	}

}
