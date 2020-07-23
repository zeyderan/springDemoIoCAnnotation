package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//ayarlar� applicationContext.xml den de�il buradan okuyacak
@Configuration
@ComponentScan("com.springdemo")
public class IoCConfig {
//	xml yerine buradan bean tan�ml�yoruz
	@Bean
	public ICustomerDal database() {
		return new CustomerDalMysql();
	}
	
	@Bean
	public ICustomerService service() {
		return new CustomerManager(database());
	}
}
