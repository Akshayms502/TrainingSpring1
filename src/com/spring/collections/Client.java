package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
		MyCollection collection=(MyCollection) context.getBean("myCollection");
		
		System.out.println(collection.getQuestionBank());
		System.out.println(collection.getAccountMap());
		System.out.println(collection.getAddressSet());
	}

}
