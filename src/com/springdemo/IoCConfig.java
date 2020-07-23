package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//ayarlarý applicationContext.xml den deðil buradan okuyacak
@Configuration
@ComponentScan("com.springdemo")
public class IoCConfig {
//	xml yerine buradan bean tanýmlýyoruz
	@Bean
	public ICustomerDal database() {
		return new CustomerDalMysql();
	}
	
	@Bean
	public ICustomerService service() {
		return new CustomerManager(database());
	}
}
