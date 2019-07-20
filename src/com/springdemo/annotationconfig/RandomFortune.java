package com.springdemo.annotationconfig;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortune implements Fortune {

	@Override
	public String getFortune() {

		int size = fortunes.length;
		Random random = new Random();
		int r = random.nextInt(size);
		System.out.println("Random Index: " + r);

		return fortunes[r];
	}

}
