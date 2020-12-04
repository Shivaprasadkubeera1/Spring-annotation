package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Coach coach = (Coach) context.getBean("ballcoach");
		coach.display();
		System.out.println("Hey you have executed spring annotation");
	}
}
