package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


	public static void main(String[] args) {
		//IoCConfig.class içerisindeki ayarlarý geçerli kýl
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(IoCConfig.class);
		ICustomerDal customerDal = context.getBean("database", ICustomerDal.class);
		
		customerDal.add();

	}
	
	//IoC - Inversion of Control
	//Dependency Injection
}
