package com.springdemo.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.Coach;

public class BeanLifeCycleApp {

	public static void main(String[] args) {

		// create spring container using configuration(xml) file
		ApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycleConfig.xml");

		// retrieve bean from spring container
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyFortune());

		// close spring container
		((ClassPathXmlApplicationContext) context).close();

	}

}
