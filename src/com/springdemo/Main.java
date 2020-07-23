package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


	public static void main(String[] args) {
		//applicationContext.xml içerisindeki ayarlarý geçerli kýl
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerDal customerDal = context.getBean("database", ICustomerDal.class);
		
		customerDal.add();

	}
	
	//IoC - Inversion of Control
	//Dependency Injection
}
