package com.springdemo.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.Coach;

public class ScopeApp {

	public static void main(String[] args) {

		// create spring container using configuration(xml) file
		ApplicationContext context = new ClassPathXmlApplicationContext("scopeConfig.xml");

		// retrieve bean from spring container
		Coach trackCoach1 = context.getBean("trackCoach", Coach.class);
		Coach trackCoach2 = context.getBean("trackCoach", Coach.class);

		Coach baseballCoach1 = context.getBean("baseballCoach", Coach.class);
		Coach baseballCoach2 = context.getBean("baseballCoach", Coach.class);

		// compare object
		System.out.println("Scope Singleton => Both Object Equal: " + (trackCoach1 == trackCoach2));
		System.out.println("Scope Prototype => Both Object Equal: " + (baseballCoach1 == baseballCoach2));

		// close spring container
		((ClassPathXmlApplicationContext) context).close();

	}

}
