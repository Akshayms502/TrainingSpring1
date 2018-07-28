package com.spring.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext();
		((AnnotationConfigApplicationContext) context).getEnvironment().setActiveProfiles("production");
		
		
		((AnnotationConfigApplicationContext) context).scan("com.spring.profile");
		
		((AbstractApplicationContext) context).refresh();
		((AbstractApplicationContext) context).close();

	}

}
