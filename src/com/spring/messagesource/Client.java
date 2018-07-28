package com.spring.messagesource;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("message-resource.xml");
		
		String enGoodMorning=context.getMessage("goodmorning", new Object[]{},null);
		String frGoodMorning=context.getMessage("goodmorning", new Object[]{},new Locale("FR"));
		System.out.println(enGoodMorning);
		System.out.println(frGoodMorning);
		
		System.out.println("-----------------------------------");
		Helloworld helloWorld=(Helloworld) context.getBean("helloWorld");
		helloWorld.sayHelloWorld();
		helloWorld.sayHelloWorld_fr();

	}

}
