package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


	public static void main(String[] args) {
		//applicationContext.xml i�erisindeki ayarlar� ge�erli k�l
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerDal customerDal = context.getBean("database", ICustomerDal.class);
		
		customerDal.add();

	}
	
	//IoC - Inversion of Control
	//Dependency Injection
}
