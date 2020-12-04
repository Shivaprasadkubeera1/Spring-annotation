package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component("ballcoach")
public class BallCoach implements Coach{

	@Override
	public void display() {
		System.out.println("Hey negdi, go away!");
	}

}
